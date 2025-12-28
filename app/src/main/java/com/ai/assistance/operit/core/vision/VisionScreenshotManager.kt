package com.ai.assistance.operit.core.vision

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import rikka.shizuku.Shizuku
import rikka.shizuku.ShizukuRemoteProcess
import java.io.ByteArrayOutputStream
import java.io.File

/**
 * 纯视觉截图管理器
 *
 * 不依赖无障碍服务，完全通过ADB命令捕获屏幕截图
 * 模拟Open-AutoGLM的实现方式
 */
object VisionScreenshotManager {
    private const val TAG = "VisionScreenshotManager"

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
        return try {
            val process: ShizukuRemoteProcess = Shizuku.newProcess(
                arrayOf("sh", "-c", "screencap -p")
            )

            // 等待命令执行完成
            process.waitFor()

            // 读取输出
            val available = process.inputStream.available()
            if (available > 0) {
                val bytes = ByteArray(available)
                process.inputStream.read(bytes)
                // Android的screencap -p输出的是PNG格式，但可能需要处理\r\n转换为\n
                bytes
            } else {
                AppLogger.e(TAG, "screencap command produced no output")
                null
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
        if (Shizuku.pingBinder() == null) {
            return null
        }

        return try {
            val process: ShizukuRemoteProcess = Shizuku.newProcess(
                arrayOf("sh", "-c", "wm size")
            )

            process.waitFor()

            val available = process.inputStream.available()
            if (available > 0) {
                val bytes = ByteArray(available)
                process.inputStream.read(bytes)
                val output = String(bytes, Charsets.UTF_8).trim()
                // 输出格式: "Physical size: 1080x2400"
                val regex = Regex("""(\d+)x(\d+)""")
                val match = regex.find(output)
                if (match != null) {
                    val width = match.groupValues[1].toInt()
                    val height = match.groupValues[2].toInt()
                    Pair(width, height)
                } else {
                    null
                }
            } else {
                null
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get screen size", e)
            null
        }
    }
}
