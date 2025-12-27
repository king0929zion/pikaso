package com.ai.assistance.operit.ui.features.chat.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ai.assistance.operit.R
import com.ai.assistance.operit.data.model.InputProcessingState
import com.ai.assistance.operit.ui.common.animations.SimpleAnimatedVisibility
import com.ai.assistance.operit.ui.theme.AppSpacing
import androidx.compose.ui.platform.LocalContext

/**
 * Visual indicator for input processing state
 */
@Composable
fun InputProcessingIndicator(
    inputState: InputProcessingState
) {
    val context = LocalContext.current
    val shouldShow = inputState !is InputProcessingState.Idle &&
                     inputState !is InputProcessingState.Completed

    SimpleAnimatedVisibility(visible = shouldShow) {
        val (progressColor, message) = when (inputState) {
            is InputProcessingState.Connecting ->
                MaterialTheme.colorScheme.tertiary to inputState.message
            is InputProcessingState.ExecutingTool ->
                MaterialTheme.colorScheme.secondary to context.getString(R.string.executing_tool, inputState.toolName)
            is InputProcessingState.Processing ->
                MaterialTheme.colorScheme.primary to inputState.message
            is InputProcessingState.ProcessingToolResult ->
                MaterialTheme.colorScheme.tertiary.copy(alpha = 0.8f) to
                    context.getString(R.string.processing_tool_result, inputState.toolName)
            is InputProcessingState.Summarizing ->
                MaterialTheme.colorScheme.tertiary to inputState.message
            is InputProcessingState.Receiving ->
                MaterialTheme.colorScheme.secondary to inputState.message
            else ->
                MaterialTheme.colorScheme.primary to ""
        }

        val progressValue = when (inputState) {
            is InputProcessingState.Processing -> 0.3f
            is InputProcessingState.Connecting -> 0.6f
            is InputProcessingState.Summarizing -> 0.9f
            else -> 1f
        }

        SimpleLinearProgressIndicator(
            progress = progressValue,
            modifier = Modifier.fillMaxWidth(),
            color = progressColor
        )

        if (message.isNotBlank()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = AppSpacing.medium, vertical = AppSpacing.nano)
            ) {
                Text(
                    text = message,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}
