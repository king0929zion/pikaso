package com.ai.assistance.operit.core.input

import android.content.Context
import android.inputmethodservice.InputMethodService
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodManager
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

        @Volatile
        private var instance: OperitInputMethodService? = null

        // 保存之前的输入法ID
        private var previousInputMethodId: String? = null

        fun getCurrentInputConnection(): InputConnection? {
            return instance?.currentInputConnection
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
                    imm.showInputMethodPickerWithTitle(prevId)
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

                    imm.showInputMethodPickerWithTitle(defaultId)
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

    private var currentInputConnection: InputConnection? = null
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
        currentInputConnection = currentInputConnection
        isInputActive = true
    }

    override fun onFinishInput() {
        super.onFinishInput()
        AppLogger.d(TAG, "onFinishInput")
        currentInputConnection = null
        isInputActive = false
    }

    override fun onDestroy() {
        super.onDestroy()
        AppLogger.d(TAG, "onDestroy")
        instance = null
    }

    override fun onHideWindow(hidingReasons: Int) {
        super.onHideWindow(hidingReasons)
        AppLogger.d(TAG, "onHideWindow: reasons=$hidingReasons")
        // 当输入法窗口隐藏时，标记输入结束
        isInputActive = false
    }

    override fun onShowWindow(shown: Boolean) {
        super.onShowWindow(shown)
        AppLogger.d(TAG, "onShowWindow: shown=$shown")
    }

    /**
     * 检查输入法是否处于活动状态
     */
    fun isInputActive(): Boolean = isInputActive

    /**
     * 提交文本到当前输入框
     */
    fun commitText(text: String): Boolean {
        val ic = currentInputConnection ?: run {
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
        val ic = currentInputConnection ?: return false
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
        val ic = currentInputConnection ?: return false
        return try {
            // 选中文本并删除
            val extractedText = ic.getExtractedText(0, Int.MAX_VALUE)
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
     * 获取当前输入框的文本
     */
    fun getCurrentText(): String? {
        val ic = currentInputConnection ?: return null
        return try {
            ic.getExtractedText(0, Int.MAX_VALUE)?.text?.toString()
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to get current text", e)
            null
        }
    }

    /**
     * 删除指定数量的字符
     */
    fun deleteCharacters(count: Int): Boolean {
        val ic = currentInputConnection ?: return false
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

    /**
     * 模拟按下回车键
     */
    fun pressEnterKey(): Boolean {
        val ic = currentInputConnection ?: return false
        return try {
            ic.performEditorAction(EditorInfo.IME_ACTION_DONE)
            AppLogger.d(TAG, "Pressed enter key")
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to press enter key", e)
            false
        }
    }

    /**
     * 执行输入完成操作并切换回原输入法
     */
    fun finishInputAndSwitchBack(context: Context): Boolean {
        val result = pressEnterKey()
        // 切换回原输入法
        switchToDefaultInputMethod(context)
        return result
    }
}
