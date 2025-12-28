package com.ai.assistance.operit.core.vision

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.ParcelFileDescriptor
import android.util.Base64
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import moe.shizuku.server.IShizukuService
import rikka.shizuku.Shizuku
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileInputStream

/**
 * 纯视觉截图管理器
 *
 * 不依赖无障碍服务，完全通过ADB命令捕获屏幕截图
 * 模拟Open-AutoGLM的实现方式
 */
object VisionScreenshotManager {
    private const val TAG = "VisionScreenshotManager"

    /**
     * 获取Shizuku服务
     */
    private fun getShizukuService(): IShizukuService? {
        return try {
            val binder = Shizuku.getBinder() ?: return null
            if (!binder.isBinderAlive) return null
            IShizukuService.Stub.asInterface(binder)
        } catch (e: Exception) {
            AppLogger.e(TAG, "Error getting Shizuku service", e)
            null
        }
    }

    /**
     * 截图格式
     */
    enum class Format {
        PNG,
        JPEG,
        BASE64_PNG
    }

    /**
     * 捕获屏幕截图
     * @param context Context
     * @param format 输出格式
     * @return 截图的Bitmap或null
     */
    suspend fun captureScreenshot(context: Context, format: Format = Format.PNG): Bitmap? {
        if (Shizuku.pingBinder() == null) {
            AppLogger.e(TAG, "Shizuku is not available")
            return null
        }

        return try {
            withContext(Dispatchers.IO) {
                // 使用screencap命令截图
                val imageData = executeScreenshotCommand(context)
                if (imageData != null) {
                    BitmapFactory.decodeByteArray(imageData, 0, imageData.size)
                } else {
                    null
                }
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to capture screenshot", e)
            null
        }
    }

    /**
     * 捕获屏幕截图并保存到文件
     * @param context Context
     * @param outputFile 输出文件
     * @return 是否成功
     */
    suspend fun captureScreenshotToFile(context: Context, outputFile: File): Boolean {
        val bitmap = captureScreenshot(context) ?: return false

        return try {
            withContext(Dispatchers.IO) {
                outputFile.parentFile?.mkdirs()
                outputFile.outputStream().use { out ->
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
                }
            }
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to save screenshot to file", e)
            false
        } finally {
            bitmap.recycle()
        }
    }

    /**
     * 捕获屏幕截图并返回Base64编码
     * @param context Context
     * @return Base64编码的PNG截图
     */
    suspend fun captureScreenshotBase64(context: Context): String? {
        val bitmap = captureScreenshot(context) ?: return null

        return try {
            withContext(Dispatchers.IO) {
                val stream = ByteArrayOutputStream()
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
                val bytes = stream.toByteArray()
                Base64.encodeToString(bytes, Base64.NO_WRAP)
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to encode screenshot to base64", e)
            null
        } finally {
            bitmap.recycle()
        }
    }

    /**
     * 通过ADB执行screencap命令
     * @param context Context
     * @return PNG图片数据
     */
    private suspend fun executeScreenshotCommand(context: Context): ByteArray? {
        val service = getShizukuService()
        if (service == null) {
            AppLogger.e(TAG, "Shizuku service not available")
            return null
        }

        return try {
            withContext(Dispatchers.IO) {
                val commandArgs = arrayOf("sh", "-c", "screencap -p")
                val process = service.newProcess(commandArgs, null, null)
                    ?: return@withContext null

                // 使用反射访问流
                val processClass = process::class.java
                val inputStream = processClass.getMethod("getInputStream")
                    .invoke(process) as? ParcelFileDescriptor

                // 读取输出
                val output = inputStream?.let {
                    FileInputStream(it.fileDescriptor).use { stream ->
                        stream.readBytes()
                    }
                }

                // 等待进程结束
                processClass.getMethod("waitFor").invoke(process) as Int

                if (output != null && output.isNotEmpty()) {
                    output
                } else {
                    AppLogger.e(TAG, "screencap command produced no output")
                    null
                }
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to execute screencap command", e)
            null
        }
    }

    /**
     * 检查是否有截图权限
     * 实际上通过Shizuku的ADB命令不需要额外权限
     */
    fun hasPermission(): Boolean {
        return Shizuku.pingBinder() != null
    }

    /**
     * 获取屏幕尺寸
     * @param context Context
     * @return Pair<width, height> 或 null
     */
    suspend fun getScreenSize(context: Context): Pair<Int, Int>? {
        val service = getShizukuService()
        if (service == null) {
            return null
        }

        return try {
            withContext(Dispatchers.IO) {
                val commandArgs = arrayOf("sh", "-c", "wm size")
                val process = service.newProcess(commandArgs, null, null)
                    ?: return@withContext null

                // 使用反射访问流
                val processClass = process::class.java
                val inputStream = processClass.getMethod("getInputStream")
                    .invoke(process) as? ParcelFileDescriptor

                // 读取输出
                val output = inputStream?.let {
                    FileInputStream(it.fileDescriptor).use { stream ->
                        stream.bufferedReader().use { it.readText() }
                    }
                }

                // 等待进程结束
                processClass.getMethod("waitFor").invoke(process) as Int

                output?.trim()?.let { parseScreenSize(it) }
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get screen size", e)
            null
        }
    }

    /**
     * 从wm size输出中解析屏幕尺寸
     */
    private fun parseScreenSize(output: String): Pair<Int, Int>? {
        // 输出格式: "Physical size: 1080x2400"
        val regex = Regex("""(\d+)x(\d+)""")
        val match = regex.find(output)
        return if (match != null) {
            val width = match.groupValues[1].toInt()
            val height = match.groupValues[2].toInt()
            Pair(width, height)
        } else {
            null
        }
    }
}
