package com.ai.assistance.operit.core.input

import android.content.Context
import android.content.Intent
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.delay
import rikka.shizuku.Shizuku
import java.nio.charset.StandardCharsets

/**
 * 输入法管理器
 *
 * 负责通过Shizuku切换输入法：
 * 1. 检测当前输入法
 * 2. 切换到Operit输入法
 * 3. 输入文本
 * 4. 恢复原输入法
 */
object InputMethodManager {
    private const val TAG = "InputMethodManager"

    // Operit输入法的IME ID
    private const val OPERIT_IME_ID = "com.ai.assistance.operit/.core.input.OperitInputMethodService"

    /**
     * 检测并切换到Operit输入法
     * @return 原输入法的IME ID，用于后续恢复
     */
    suspend fun switchToOperitIME(context: Context): String? {
        AppLogger.d(TAG, "Switching to Operit IME")

        // 获取当前输入法
        val currentIME = getCurrentIME(context)
        AppLogger.d(TAG, "Current IME: $currentIME")

        // 如果已经是Operit输入法，不需要切换
        if (currentIME == OPERIT_IME_ID) {
            AppLogger.d(TAG, "Already using Operit IME")
            return currentIME
        }

        // 切换到Operit输入法
        val success = setIME(context, OPERIT_IME_ID)
        if (success) {
            AppLogger.d(TAG, "Switched to Operit IME successfully")
            return currentIME
        } else {
            AppLogger.e(TAG, "Failed to switch to Operit IME")
            return null
        }
    }

    /**
     * 恢复原输入法
     */
    suspend fun restoreIME(context: Context, originalIME: String?): Boolean {
        if (originalIME == null) {
            AppLogger.w(TAG, "No original IME to restore")
            return false
        }

        AppLogger.d(TAG, "Restoring IME: $originalIME")
        return setIME(context, originalIME)
    }

    /**
     * 获取当前输入法
     */
    suspend fun getCurrentIME(context: Context): String? {
        if (Shizuku.pingBinder() == null) {
            AppLogger.e(TAG, "Shizuku is not available")
            return null
        }

        return try {
            val command = "settings get secure default_input_method"
            val result = executeCommand(context, command)
            result?.trim()?.takeIf { it.isNotEmpty() }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get current IME", e)
            null
        }
    }

    /**
     * 设置输入法
     */
    private suspend fun setIME(context: Context, imeId: String): Boolean {
        if (Shizuku.pingBinder() == null) {
            AppLogger.e(TAG, "Shizuku is not available")
            return false
        }

        return try {
            val command = "ime set $imeId"
            executeCommand(context, command)
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to set IME: $imeId", e)
            false
        }
    }

    /**
     * 通过Shizuku执行shell命令
     */
    private suspend fun executeCommand(context: Context, command: String): String? {
        return try {
            val process = Shizuku.exec(arrayOf("sh", "-c", command))

            // 等待命令执行
            process.waitFor()

            // 读取输出
            val available = process.inputStream.available()
            if (available > 0) {
                val bytes = ByteArray(available)
                process.inputStream.read(bytes)
                String(bytes, StandardCharsets.UTF_8)
            } else {
                // 尝试从errorStream读取
                val errorAvailable = process.errorStream.available()
                if (errorAvailable > 0) {
                    val bytes = ByteArray(errorAvailable)
                    process.errorStream.read(bytes)
                    String(bytes, StandardCharsets.UTF_8)
                } else {
                    null
                }
            }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to execute command: $command", e)
            null
        }
    }

    /**
     * 检查Operit输入法是否已启用
     */
    suspend fun isOperitIMEEnabled(context: Context): Boolean {
        if (Shizuku.pingBinder() == null) {
            return false
        }

        return try {
            val command = "ime list -s"
            val result = executeCommand(context, command)
            result?.contains(OPERIT_IME_ID) == true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to check IME enabled", e)
            false
        }
    }

    /**
     * 启用Operit输入法
     */
    suspend fun enableOperitIME(context: Context): Boolean {
        if (Shizuku.pingBinder() == null) {
            AppLogger.e(TAG, "Shizuku is not available")
            return false
        }

        return try {
            val command = "ime enable $OPERIT_IME_ID"
            executeCommand(context, command)
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to enable Operit IME", e)
            false
        }
    }

    /**
     * 输入文本 - 通过切换输入法实现
     * 1. 切换到Operit输入法
     * 2. 发送广播输入文本
     * 3. 恢复原输入法
     */
    suspend fun inputText(context: Context, text: String): Boolean {
        // 切换到Operit输入法
        val originalIME = switchToOperitIME(context)
        if (originalIME == null) {
            AppLogger.e(TAG, "Failed to switch to Operit IME for input")
            return false
        }

        try {
            // 等待输入法切换生效
            delay(300)

            // 发送广播输入文本
            val intent = Intent(OperitInputMethodService.ACTION_INPUT_TEXT).apply {
                putExtra(OperitInputMethodService.EXTRA_TEXT, text)
                setPackage(context.packageName)
            }
            context.sendBroadcast(intent)
            AppLogger.d(TAG, "Sent input broadcast: $text")

            // 等待输入完成
            delay(200)

            return true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to input text", e)
            return false
        } finally {
            // 恢复原输入法
            delay(100)
            restoreIME(context, originalIME)
        }
    }

    /**
     * 清空输入框
     */
    suspend fun clearText(context: Context): Boolean {
        // 切换到Operit输入法
        val originalIME = switchToOperitIME(context)
        if (originalIME == null) {
            return false
        }

        try {
            delay(300)

            // 发送广播清空文本
            val intent = Intent(OperitInputMethodService.ACTION_CLEAR_TEXT).apply {
                setPackage(context.packageName)
            }
            context.sendBroadcast(intent)

            delay(200)

            return true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to clear text", e)
            return false
        } finally {
            delay(100)
            restoreIME(context, originalIME)
        }
    }
}
