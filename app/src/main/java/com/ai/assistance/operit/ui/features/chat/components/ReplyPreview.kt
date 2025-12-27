package com.ai.assistance.operit.ui.features.chat.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Reply
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.R
import com.ai.assistance.operit.data.model.ChatMessage
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
import androidx.compose.ui.res.stringResource

/**
 * Reply preview banner showing which message is being replied to
 */
@Composable
fun ReplyPreview(
    replyToMessage: ChatMessage,
    onClearReply: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = AppSpacing.medium, vertical = AppSpacing.nano),
        color = MaterialTheme.colorScheme.surfaceVariant,
        shape = androidx.compose.foundation.shape.RoundedCornerShape(AppSizes.cornerRadiusMedium)
    ) {
        Row(
            modifier = Modifier
                .padding(AppSpacing.small)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.Reply,
                contentDescription = stringResource(R.string.reply_message),
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(AppSizes.iconSmall)
            )

            Spacer(width = AppSpacing.extraSmall)

            val previewText = replyToMessage.content
                .replace(Regex("<[^>]*>"), "") // Remove XML tags
                .trim()
                .let { if (it.length > 50) it.take(50) + "..." else it }

            Text(
                text = "${stringResource(R.string.reply_message)}: $previewText",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f)
            )

            IconButton(
                onClick = onClearReply,
                modifier = Modifier.size(AppSizes.buttonMinHeightSmall)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = stringResource(R.string.cancel_reply),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(AppSizes.iconSmall)
                )
            }
        }
    }
}

@Composable
private fun Spacer(width: androidx.compose.ui.unit.Dp) {
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.width(width))
}
