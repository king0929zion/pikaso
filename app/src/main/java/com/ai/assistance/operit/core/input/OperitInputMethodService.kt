package com.ai.assistance.operit.core.input

import android.content.Context
import android.inputmethodservice.InputMethodService
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodManager
import android.view.inputmethod.ExtractedText
import android.view.inputmethod.ExtractedTextRequest
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import com.ai.assistance.operit.util.AppLogger

/**
 * Operit 内置输入法服务
 *
 * 功能：
 * - 通过无障碍服务或Shizuku切换到此输入法进行文本输入
 * - 接收要输入的文本并提交到当前输入框
 * - 输入完成后自动切换回原输入法
 *
 * 使用方式：
 * 1. 用户需要在系统设置中启用此输入法
 * 2. 每次需要输入时，切换到此输入法
 * 3. 调用 commitText() 方法输入文本
 * 4. 调用 restorePreviousInputMethod() 恢复原输入法
 */
class OperitInputMethodService : InputMethodService() {

    companion object {
        private const val TAG = "OperitIME"
        const val ACTION_INPUT_TEXT = "com.ai.assistance.operit.INPUT_TEXT"
        const val ACTION_CLEAR_TEXT = "com.ai.assistance.operit.CLEAR_TEXT"
        const val EXTRA_TEXT = "text"
        const val EXTRA_REQUEST_ID = "request_id"

        data class ImeCommandResult(
            val requestId: String,
            val action: String,
            val success: Boolean,
            val error: String? = null
        )

        @Volatile
        private var instance: OperitInputMethodService? = null

        // 保存之前的输入法ID
        private var previousInputMethodId: String? = null

        private val _commandResults =
            MutableSharedFlow<ImeCommandResult>(
                replay = 0,
                extraBufferCapacity = 16,
                onBufferOverflow = BufferOverflow.DROP_OLDEST
            )
        val commandResults: SharedFlow<ImeCommandResult> = _commandResults.asSharedFlow()

        internal fun emitCommandResult(result: ImeCommandResult) {
            _commandResults.tryEmit(result)
        }

        fun getCurrentInputConnection(): InputConnection? {
            return instance?.activeInputConnection
        }

        fun getInstance(): OperitInputMethodService? = instance

        /**
         * 保存当前输入法并切换到此输入法
         */
        fun saveCurrentInputMethod(context: Context, inputMethodId: String) {
            previousInputMethodId = inputMethodId
            AppLogger.d(TAG, "Saved previous input method: $inputMethodId")
        }

        /**
         * 恢复之前的输入法
         */
        fun restorePreviousInputMethod(context: Context): Boolean {
            return try {
                val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                previousInputMethodId?.let { prevId ->
                    // 尝试使用 switchInputMethod 方法
                    try {
                        val method = InputMethodManager::class.java.getMethod(
                            "switchInputMethod",
                            String::class.java
                        )
                        method.invoke(imm, prevId)
                    } catch (e: Exception) {
                        AppLogger.e(TAG, "Failed to restore input method", e)
                        return false
                    }
                    AppLogger.d(TAG, "Restored previous input method: $prevId")
                    previousInputMethodId = null
                    true
                } ?: run {
                    AppLogger.w(TAG, "No previous input method to restore")
                    false
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to restore previous input method", e)
                false
            }
        }

        /**
         * 切换到系统默认输入法
         */
        fun switchToDefaultInputMethod(context: Context): Boolean {
            return try {
                val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                // 获取所有启用的输入法
                val inputMethodList = imm.enabledInputMethodList
                if (inputMethodList.isNotEmpty()) {
                    // 选择第一个非 Operit 的输入法
                    val defaultId = inputMethodList.firstOrNull {
                        !it.id.contains("operit", ignoreCase = true)
                    }?.id ?: inputMethodList.first().id

                    // 尝试使用 switchInputMethod
                    try {
                        val method = InputMethodManager::class.java.getMethod(
                            "switchInputMethod",
                            String::class.java
                        )
                        method.invoke(imm, defaultId)
                    } catch (e: Exception) {
                        AppLogger.e(TAG, "Failed to switch input method", e)
                        return false
                    }
                    AppLogger.d(TAG, "Switched to default input method: $defaultId")
                    true
                } else {
                    false
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to switch to default input method", e)
                false
            }
        }
    }

    private var activeInputConnection: InputConnection? = null
    private var keyboardView: KeyboardView? = null
    private var keyboard: Keyboard? = null
    private var isInputActive = false

    override fun onCreateInputView(): View {
        AppLogger.d(TAG, "onCreateInputView: Creating input view")
        instance = this

        // 创建一个简单的键盘视图（不可见，仅用于接收输入）
        keyboardView = object : KeyboardView(this, null) {
            init {
                visibility = View.INVISIBLE
                isFocusable = false
            }
        }

        return keyboardView!!
    }

    override fun onStartInputView(info: EditorInfo, restarting: Boolean) {
        super.onStartInputView(info, restarting)
        AppLogger.d(TAG, "onStartInputView: restarting=$restarting, package=${info.packageName}")
        activeInputConnection = currentInputConnection
        isInputActive = true
    }

    override fun onFinishInput() {
        super.onFinishInput()
        AppLogger.d(TAG, "onFinishInput")
        activeInputConnection = null
        isInputActive = false
    }

    override fun onDestroy() {
        super.onDestroy()
        AppLogger.d(TAG, "onDestroy")
        instance = null
    }

    /**
     * 检查输入法是否处于活动状态
     */
    fun isInputActive(): Boolean = isInputActive

    /**
     * 提交文本到当前输入框
     */
    fun commitText(text: String): Boolean {
        val ic = activeInputConnection ?: run {
            AppLogger.w(TAG, "No input connection available")
            return false
        }
        return try {
            ic.commitText(text, 1)
            AppLogger.d(TAG, "Committed text: ${text.take(50)}${if (text.length > 50) "..." else ""}")
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to commit text", e)
            false
        }
    }

    /**
     * 提交多行文本
     */
    fun commitMultilineText(text: String): Boolean {
        val ic = activeInputConnection ?: return false
        return try {
            // 逐行提交，保留换行
            val lines = text.split("\n")
            lines.forEachIndexed { index, line ->
                ic.commitText(line, 1)
                if (index < lines.lastIndex) {
                    ic.commitText("\n", 1)
                }
            }
            AppLogger.d(TAG, "Committed multiline text with ${lines.size} lines")
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to commit multiline text", e)
            false
        }
    }

    /**
     * 清空当前输入框
     */
    fun clearText(): Boolean {
        val ic = activeInputConnection ?: return false
        return try {
            // 选中文本并删除
            val request = ExtractedTextRequest()
            val extractedText = getExtractedText(ic, request)
            if (extractedText != null && extractedText.text.isNotEmpty()) {
                ic.setComposingText("", 1)
                ic.commitText("", 1)
            }
            AppLogger.d(TAG, "Cleared text")
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to clear text", e)
            false
        }
    }

    /**
     * 获取ExtractedText的兼容方法
     */
    @Suppress("DEPRECATION")
    private fun getExtractedText(ic: InputConnection, request: ExtractedTextRequest): ExtractedText? {
        return try {
            // flags: 0 for normal, or INPUT_CONNECTION_GET_EXTRACTED_TEXT_MONITOR
            ic.getExtractedText(request, 0)
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get extracted text", e)
            null
        }
    }

    /**
     * 获取当前输入框的文本
     */
    fun getCurrentText(): String? {
        val ic = activeInputConnection ?: return null
        return try {
            val request = ExtractedTextRequest()
            getExtractedText(ic, request)?.text?.toString()
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get current text", e)
            null
        }
    }

    /**
     * 删除指定数量的字符
     */
    fun deleteCharacters(count: Int): Boolean {
        val ic = activeInputConnection ?: return false
        return try {
            repeat(count) {
                ic.deleteSurroundingText(1, 0)
            }
            AppLogger.d(TAG, "Deleted $count characters")
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to delete characters", e)
            false
        }
    }
}
