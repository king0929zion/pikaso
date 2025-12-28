package com.ai.assistance.operit.core.vision

import android.content.Context
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import rikka.shizuku.Shizuku
import rikka.shizuku.ShizukuRemoteProcess
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

/**
 * 纯视觉操作执行器
 *
 * 基于Open-AutoGLM的实现方式，通过ADB命令执行各种设备操作
 * 不依赖无障碍服务，完全依赖视觉模型定位元素
 */
object VisionActionExecutor {
    private const val TAG = "VisionActionExecutor"

    /**
     * 点击操作
     * @param x X坐标（像素）
     * @param y Y坐标（像素）
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun tap(context: Context, x: Int, y: Int, delayMs: Long = 300): Boolean {
        AppLogger.d(TAG, "Tap: ($x, $y)")
        return executeCommand(context, "input tap $x $y", delayMs)
    }

    /**
     * 双击操作
     * @param x X坐标（像素）
     * @param y Y坐标（像素）
     * @param intervalMs 两次点击间隔（毫秒）
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun doubleTap(
        context: Context,
        x: Int,
        y: Int,
        intervalMs: Long = 100,
        delayMs: Long = 300
    ): Boolean {
        AppLogger.d(TAG, "Double tap: ($x, $y)")
        return executeCommand(context, "input tap $x $y", intervalMs) &&
                executeCommand(context, "input tap $x $y", delayMs)
    }

    /**
     * 长按操作
     * @param x X坐标（像素）
     * @param y Y坐标（像素）
     * @param durationMs 按压时长（毫秒）
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun longPress(
        context: Context,
        x: Int,
        y: Int,
        durationMs: Long = 2000,
        delayMs: Long = 300
    ): Boolean {
        AppLogger.d(TAG, "Long press: ($x, $y) for ${durationMs}ms")
        // 长按通过swipe实现，起点和终点相同
        return executeCommand(context, "input swipe $x $y $x $y $durationMs", delayMs)
    }

    /**
     * 滑动操作
     * @param startX 起点X坐标
     * @param startY 起点Y坐标
     * @param endX 终点X坐标
     * @param endY 终点Y坐标
     * @param durationMs 滑动时长（毫秒），null则自动计算
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun swipe(
        context: Context,
        startX: Int,
        startY: Int,
        endX: Int,
        endY: Int,
        durationMs: Long? = null,
        delayMs: Long = 300
    ): Boolean {
        // 自动计算滑动时长（基于距离）
        val actualDuration = durationMs ?: calculateSwipeDuration(startX, startY, endX, endY)
        AppLogger.d(TAG, "Swipe: ($startX, $startY) -> ($endX, $endY) in ${actualDuration}ms")
        return executeCommand(context, "input swipe $startX $startY $endX $endY $actualDuration", delayMs)
    }

    /**
     * 返回键
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun pressBack(context: Context, delayMs: Long = 300): Boolean {
        AppLogger.d(TAG, "Press back")
        return executeCommand(context, "input keyevent 4", delayMs)
    }

    /**
     * Home键
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun pressHome(context: Context, delayMs: Long = 300): Boolean {
        AppLogger.d(TAG, "Press home")
        return executeCommand(context, "input keyevent 3", delayMs)
    }

    /**
     * 最近任务键
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun pressRecent(context: Context, delayMs: Long = 300): Boolean {
        AppLogger.d(TAG, "Press recent")
        return executeCommand(context, "input keyevent 187", delayMs)
    }

    /**
     * 输入文本
     * @param text 要输入的文本
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun inputText(context: Context, text: String, delayMs: Long = 300): Boolean {
        // 转义特殊字符
        val escapedText = text.replace(" ", "%s")
                .replace("&", "\\&")
        AppLogger.d(TAG, "Input text: $text")
        return executeCommand(context, "input text $escapedText", delayMs)
    }

    /**
     * 清空输入框（全选+删除）
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun clearText(context: Context, delayMs: Long = 100): Boolean {
        AppLogger.d(TAG, "Clear text")
        // Ctrl+left + Ctrl+delete 可以清空
        return executeCommand(context, "input keyevent 113", 0) && // Ctrl
                executeCommand(context, "input keyevent 16", delayMs) // left
    }

    /**
     * 启动应用
     * @param packageName 应用包名
     * @param delayMs 操作后延迟（毫秒）
     */
    suspend fun launchApp(context: Context, packageName: String, delayMs: Long = 1000): Boolean {
        AppLogger.d(TAG, "Launch app: $packageName")
        return executeCommand(context, "monkey -p $packageName -c android.intent.category.LAUNCHER 1", delayMs)
    }

    /**
     * 获取当前焦点窗口的包名
     * @return 包名或null
     */
    suspend fun getCurrentPackage(context: Context): String? {
        return try {
            val process: ShizukuRemoteProcess = Shizuku.newProcess(
                arrayOf("sh", "-c", "dumpsys window | grep mCurrentFocus")
            )

            process.waitFor()

            val available = process.inputStream.available()
            if (available > 0) {
                val bytes = ByteArray(available)
                process.inputStream.read(bytes)
                val output = String(bytes, Charsets.UTF_8).trim()
                // 输出格式: "mCurrentFocus=Window{... u0 com.example.app/com.example.MainActivity}"
                val regex = Regex("""[a-z]+\.[a-z]+\.[a-z]+\/""")
                val match = regex.find(output)
                if (match != null) {
                    match.value.dropLast(2) // 去掉 "/\""
                } else {
                    null
                }
            } else {
                null
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get current package", e)
            null
        }
    }

    /**
     * 通过Shizuku执行ADB命令
     * @param context Context
     * @param command 要执行的命令
     * @param delayMs 命令后延迟（毫秒）
     * @return 是否成功
     */
    private suspend fun executeCommand(context: Context, command: String, delayMs: Long = 0): Boolean {
        if (Shizuku.pingBinder() == null) {
            AppLogger.e(TAG, "Shizuku is not available")
            return false
        }

        return try {
            withContext(Dispatchers.IO) {
                val process: ShizukuRemoteProcess = Shizuku.newProcess(
                    arrayOf("sh", "-c", command)
                )

                // 等待命令执行
                process.waitFor()

                // 如果有延迟，等待指定时间
                if (delayMs > 0) {
                    kotlinx.coroutines.delay(delayMs)
                }

                true
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to execute command: $command", e)
            false
        }
    }

    /**
     * 根据滑动距离自动计算滑动时长
     * 模拟Open-AutoGLM的实现方式
     */
    private fun calculateSwipeDuration(x1: Int, y1: Int, x2: Int, y2: Int): Long {
        val distanceSquared = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)
        val duration = (distanceSquared / 1000).toLong()
        return max(300, min(duration, 2000)) // 限制在300-2000ms之间
    }

    /**
     * 检查是否有执行权限
     */
    fun hasPermission(): Boolean {
        return Shizuku.pingBinder() != null
    }
}
