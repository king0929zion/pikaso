package com.ai.assistance.operit.core.input

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.provider.Settings
import android.view.inputmethod.InputMethodInfo
import android.view.inputmethod.InputMethodManager as AndroidInputMethodManager
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import moe.shizuku.server.IShizukuService
import rikka.shizuku.Shizuku
import java.util.UUID

/**
 * 输入法管理器
 *
 * 负责通过Shizuku切换输入法：
 * 1. 检测当前输入法
 * 2. 切换到Operit输入法进行文本输入
 * 3. 输入完成后自动恢复原输入法
 * 4. 支持无障碍服务作为备选方案
 */
object InputMethodManager {
    private const val TAG = "InputMethodManager"

    // Operit输入法的IME ID
    private const val OPERIT_IME_ID = "com.ai.assistance.operit/.core.input.OperitInputMethodService"

    // 当前保存的原输入法
    @Volatile
    private var previousInputMethodId: String? = null

    // 输入会话状态
    @Volatile
    private var isInInputSession = false

    // Shizuku连接状态
    private val _isShizukuAvailable = MutableStateFlow(false)
    val isShizukuAvailable: StateFlow<Boolean> = _isShizukuAvailable.asStateFlow()

    /**
     * 检测Shizuku是否可用
     */
    fun checkShizukuAvailability(): Boolean {
        return try {
            val serviceRunning = Shizuku.pingBinder()
            val permissionGranted = Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
            val available = serviceRunning && permissionGranted
            _isShizukuAvailable.value = available
            available
        } catch (e: Exception) {
            AppLogger.e(TAG, "Error checking Shizuku availability", e)
            _isShizukuAvailable.value = false
            false
        }
    }

    /**
     * 检测Operit输入法是否已启用
     */
    suspend fun isOperitIMEEnabled(context: Context): Boolean {
        return try {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as AndroidInputMethodManager
            val inputMethodList = imm.enabledInputMethodList
            inputMethodList.any { it.id == OPERIT_IME_ID }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to check if Operit IME is enabled", e)
            false
        }
    }

    /**
     * 获取当前输入法ID
     */
    suspend fun getCurrentInputMethodId(context: Context): String? {
        return try {
            Settings.Secure.getString(context.contentResolver, Settings.Secure.DEFAULT_INPUT_METHOD)
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get current input method", e)
            null
        }
    }

    /**
     * 保存当前输入法并准备切换到Operit输入法
     * @return 原输入法ID，如果已经是Operit输入法则返回null
     */
    suspend fun saveCurrentInputMethod(context: Context): String? {
        val currentId = getCurrentInputMethodId(context) ?: return null

        if (currentId == OPERIT_IME_ID) {
            AppLogger.d(TAG, "Already using Operit IME, no need to save")
            return null
        }

        previousInputMethodId = currentId
        AppLogger.d(TAG, "Saved previous input method: $currentId")
        return currentId
    }

    /**
     * 切换到Operit输入法
     * @param previousMethodId 原输入法ID（用于恢复），如果为null则不保存当前状态
     * @return 是否成功切换
     */
    suspend fun switchToOperitIME(context: Context, previousMethodId: String? = null): Boolean {
        AppLogger.d(TAG, "Switching to Operit IME")

        // 如果没有传入原输入法ID，尝试获取当前输入法
        val originalId = previousMethodId ?: saveCurrentInputMethod(context)
        if (originalId == null && previousMethodId != null) {
            // 如果传入的previousMethodId为null但previousMethodId参数不为null，说明已经使用Operit
            return true
        }

        // 如果已经是Operit输入法，直接返回
        val currentId = getCurrentInputMethodId(context)
        if (currentId == OPERIT_IME_ID) {
            AppLogger.d(TAG, "Already using Operit IME")
            isInInputSession = true
            return true
        }

        // 通过Shizuku切换输入法
        val success = setInputMethod(OPERIT_IME_ID)
        if (success) {
            isInInputSession = true
            AppLogger.d(TAG, "Successfully switched to Operit IME")
            delay(100) // 等待输入法切换完成
        } else {
            AppLogger.e(TAG, "Failed to switch to Operit IME")
        }
        return success
    }

    /**
     * 恢复原输入法
     */
    suspend fun restorePreviousInputMethod(context: Context): Boolean {
        val originalId = previousInputMethodId ?: return false

        return try {
            val success = setInputMethod(originalId)
            if (success) {
                previousInputMethodId = null
                isInInputSession = false
                AppLogger.d(TAG, "Successfully restored input method: $originalId")
            }
            success
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to restore input method", e)
            false
        }
    }

    /**
     * 通过Shizuku执行输入法切换
     */
    private suspend fun setInputMethod(imeId: String): Boolean {
        if (!checkShizukuAvailability()) {
            AppLogger.e(TAG, "Shizuku is not available")
            return false
        }

        return try {
            withContext(Dispatchers.IO) { executeShizukuCommand("ime set $imeId") }
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to set input method: $imeId", e)
            false
        }
    }

    /**
     * 通过Shizuku执行shell命令
     */
    private suspend fun executeShizukuCommand(command: String): Boolean {
        val service = getShizukuService()
        if (service == null) {
            AppLogger.e(TAG, "Shizuku service not available")
            return false
        }

        return try {
            val process = service.newProcess(
                arrayOf("sh", "-c", command),
                null,
                null
            )

            // 等待进程结束
            var exitCode = -1
            try {
                val exitCodeField = process::class.java.getMethod("waitFor")
                exitCode = exitCodeField.invoke(process) as Int
            } catch (e: Exception) {
                AppLogger.e(TAG, "Error waiting for process", e)
            }

            exitCode == 0
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to execute command: $command", e)
            false
        }
    }

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
     * 输入文本 - 完整的输入流程
     * 1. 切换到Operit输入法
     * 2. 发送广播输入文本
     * 3. 恢复原输入法
     */
    suspend fun inputText(context: Context, text: String): Boolean {
        // 检查是否已在输入会话中
        if (isInInputSession) {
            AppLogger.d(TAG, "Already in input session, sending text directly")
            return sendTextToInputMethod(context, text)
        }

        return try {
            // 保存并切换到Operit输入法
            val originalIME = saveCurrentInputMethod(context)
            val switched = switchToOperitIME(context, originalIME)

            if (!switched) {
                AppLogger.e(TAG, "Failed to switch to Operit IME")
                return false
            }

            // 发送文本
            delay(150) // 留出时间让输入法与输入框建立连接
            val success = sendTextToInputMethod(context, text)

            // 恢复原输入法
            delay(100)
            restorePreviousInputMethod(context)

            success
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to input text", e)
            // 尝试恢复输入法
            restorePreviousInputMethod(context)
            false
        }
    }

    /**
     * 发送文本到Operit输入法
     */
    private suspend fun sendTextToInputMethod(context: Context, text: String): Boolean {
        return sendImeCommand(
            context = context,
            action = OperitInputMethodService.ACTION_INPUT_TEXT,
            extras = mapOf(OperitInputMethodService.EXTRA_TEXT to text)
        )
    }

    /**
     * 清空输入框
     */
    suspend fun clearText(context: Context): Boolean {
        if (isInInputSession) {
            return sendClearTextCommand(context)
        }

        return try {
            val originalIME = saveCurrentInputMethod(context)
            val switched = switchToOperitIME(context, originalIME)

            if (!switched) {
                return false
            }

            delay(150)
            val success = sendClearTextCommand(context)

            delay(100)
            restorePreviousInputMethod(context)

            success
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to clear text", e)
            restorePreviousInputMethod(context)
            false
        }
    }

    /**
     * 发送清空文本命令
     */
    private suspend fun sendClearTextCommand(context: Context): Boolean {
        return sendImeCommand(
            context = context,
            action = OperitInputMethodService.ACTION_CLEAR_TEXT,
            extras = emptyMap()
        )
    }

    private suspend fun sendImeCommand(
        context: Context,
        action: String,
        extras: Map<String, String>
    ): Boolean {
        return try {
            val requestId = UUID.randomUUID().toString()
            val intent = Intent(action).apply {
                putExtra(OperitInputMethodService.EXTRA_REQUEST_ID, requestId)
                extras.forEach { (key, value) -> putExtra(key, value) }
                setPackage("com.ai.assistance.operit")
            }
            AppLogger.d(TAG, "Sending IME command: $action, requestId=$requestId")
            context.sendBroadcast(intent)

            val result =
                withTimeoutOrNull(1200) {
                    OperitInputMethodService.commandResults
                        .filter { it.requestId == requestId && it.action == action }
                        .first()
                }
            if (result == null) {
                AppLogger.w(TAG, "IME command timeout: $action, requestId=$requestId")
                return false
            }

            if (!result.success) {
                AppLogger.w(
                    TAG,
                    "IME command failed: $action, requestId=$requestId, error=${result.error}"
                )
            }
            result.success
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to send IME command: $action", e)
            false
        }
    }

    /**
     * 获取已启用的输入法列表
     */
    suspend fun getEnabledInputMethods(context: Context): List<InputMethodInfo> {
        return try {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as AndroidInputMethodManager
            imm.enabledInputMethodList
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get enabled input methods", e)
            emptyList()
        }
    }

    /**
     * 检查是否需要用户手动启用Operit输入法
     */
    suspend fun needsManualIMEEnable(context: Context): Boolean {
        if (!checkShizukuAvailability()) {
            return false
        }

        return try {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as AndroidInputMethodManager
            val inputMethodList = imm.inputMethodList
            val operitIME = inputMethodList.find { it.id == OPERIT_IME_ID }
            operitIME == null || !imm.enabledInputMethodList.contains(operitIME)
        } catch (e: Exception) {
            AppLogger.e(TAG, "Error checking if Operit IME needs enable", e)
            false
        }
    }

    /**
     * 获取错误消息（当Shizuku或输入法不可用时）
     */
    fun getErrorMessage(context: Context): String {
        return when {
            !Shizuku.pingBinder() -> {
                "Shizuku服务未运行。请先启动Shizuku应用并授予权限。"
            }
            else -> {
                "无法切换输入法。请确保Operit输入法已在系统设置中启用。"
            }
        }
    }
}
