package com.ai.assistance.operit.core.input

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.ai.assistance.operit.util.AppLogger

/**
 * 输入法广播接收器
 *
 * 接收来自Shizuku的输入请求：
 * - ACTION_INPUT_TEXT: 输入文本
 * - ACTION_CLEAR_TEXT: 清空文本
 */
class InputMethodReceiver : BroadcastReceiver() {
    companion object {
        private const val TAG = "InputMethodReceiver"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        context ?: return
        intent ?: return

        val action = intent.action
        val requestId = intent.getStringExtra(OperitInputMethodService.EXTRA_REQUEST_ID) ?: ""
        AppLogger.d(TAG, "Received broadcast: $action")

        when (action) {
            OperitInputMethodService.ACTION_INPUT_TEXT -> {
                val text = intent.getStringExtra(OperitInputMethodService.EXTRA_TEXT) ?: ""
                val imeService = OperitInputMethodService.getInstance()
                val success =
                    imeService?.commitText(text) ?: run {
                        AppLogger.w(TAG, "IME service not available for input")
                        false
                    }
                OperitInputMethodService.emitCommandResult(
                    OperitInputMethodService.ImeCommandResult(
                        requestId = requestId,
                        action = action,
                        success = success,
                        error = if (success) null else "commitText failed"
                    )
                )
            }
            OperitInputMethodService.ACTION_CLEAR_TEXT -> {
                val imeService = OperitInputMethodService.getInstance()
                val success =
                    imeService?.clearText() ?: run {
                        AppLogger.w(TAG, "IME service not available for clear")
                        false
                    }
                OperitInputMethodService.emitCommandResult(
                    OperitInputMethodService.ImeCommandResult(
                        requestId = requestId,
                        action = action,
                        success = success,
                        error = if (success) null else "clearText failed"
                    )
                )
            }
        }
    }
}
