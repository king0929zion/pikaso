package com.ai.assistance.operit.ui.features.chat.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.ai.assistance.operit.ui.theme.AppSizes
import androidx.compose.ui.unit.dp

/**
 * Simplified send/voice button for chat input
 *
 * @param isProcessing - If true, shows cancel button
 * @param canSend - If true and not processing, shows send button
 * @param isOverTokenLimit - Changes color when token limit exceeded
 * @param onClick - Callback when button is clicked
 */
@Composable
fun SendButton(
    isProcessing: Boolean = false,
    canSend: Boolean = false,
    isOverTokenLimit: Boolean = false,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    val backgroundColor = when {
        isProcessing -> MaterialTheme.colorScheme.error
        canSend && isOverTokenLimit -> MaterialTheme.colorScheme.secondary
        canSend -> MaterialTheme.colorScheme.primary
        else -> MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
    }

    val iconTint = when {
        isProcessing -> MaterialTheme.colorScheme.onError
        canSend && isOverTokenLimit -> MaterialTheme.colorScheme.onSecondary
        else -> MaterialTheme.colorScheme.onPrimary
    }

    val icon = when {
        isProcessing -> Icons.Default.Close
        else -> Icons.Default.ArrowUpward
    }

    Box(
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(backgroundColor)
            .clickable(
                enabled = isEnabled,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = when {
                isProcessing -> "Cancel"
                else -> "Send"
            },
            tint = iconTint,
            modifier = Modifier.size(AppSizes.iconMedium)
        )
    }
}
