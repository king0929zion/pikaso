package com.ai.assistance.operit.core.input

import android.inputmethodservice.InputMethodService
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import com.ai.assistance.operit.util.AppLogger

/**
 * Operit 内置输入法服务
 *
 * 功能：
 * - 通过Shizuku切换到此输入法进行文本输入
 * - 接收来自Shizuku的输入请求并提交文本
 * - 输入完成后自动切换回原输入法
 *
 * 使用方式：
 * 1. 用户需要在系统设置中启用此输入法
 * 2. 每次需要输入时，通过Shizuku切换到此输入法
 * 3. 通过广播接收要输入的文本
 * 4. 输入完成后自动恢复原输入法
 */
class OperitInputMethodService : InputMethodService() {

    companion object {
        private const val TAG = "OperitIME"
        const val ACTION_INPUT_TEXT = "com.ai.assistance.operit.INPUT_TEXT"
        const val ACTION_CLEAR_TEXT = "com.ai.assistance.operit.CLEAR_TEXT"
        const val EXTRA_TEXT = "text"

        @Volatile
        private var instance: OperitInputMethodService? = null

        fun getCurrentInputConnection(): InputConnection? {
            return instance?.currentInputConnection
        }
    }

    private var currentInputConnection: InputConnection? = null
    private var keyboardView: KeyboardView? = null
    private var keyboard: Keyboard? = null

    override fun onCreateInputView(): View {
        AppLogger.d(TAG, "onCreateInputView: Creating keyboard view")
        instance = this

        // 创建一个简单的键盘视图（不可见，仅用于接收输入）
        keyboardView = object : KeyboardView(this) {
            init {
                visibility = View.INVISIBLE
            }
        }

        return keyboardView!!
    }

    override fun onStartInputView(info: EditorInfo, restarting: Boolean) {
        super.onStartInputView(info, restarting)
        AppLogger.d(TAG, "onStartInputView: info=$info, restarting=$restarting")
        currentInputConnection = currentInputConnection
    }

    override fun onFinishInput() {
        super.onFinishInput()
        AppLogger.d(TAG, "onFinishInput")
        currentInputConnection = null
        instance = null
    }

    override fun onDestroy() {
        super.onDestroy()
        AppLogger.d(TAG, "onDestroy")
        instance = null
    }

    /**
     * 提交文本到当前输入框
     */
    fun commitText(text: String): Boolean {
        val ic = currentInputConnection ?: return false
        return try {
            ic.commitText(text, 1)
            AppLogger.d(TAG, "Committed text: $text")
            true
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to commit text", e)
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
}
