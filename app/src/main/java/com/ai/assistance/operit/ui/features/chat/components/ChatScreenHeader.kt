package com.ai.assistance.operit.ui.features.chat.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.data.model.ChatHistory
import com.ai.assistance.operit.ui.features.chat.viewmodel.ChatViewModel
import com.ai.assistance.operit.ui.theme.AppSpacing

@Composable
fun ChatScreenHeader(
    modifier: Modifier = Modifier,
    actualViewModel: ChatViewModel,
    showChatHistorySelector: Boolean,
    chatHistories: List<ChatHistory>,
    currentChatId: String,
    chatHeaderTransparent: Boolean,
    chatHeaderHistoryIconColor: Int?,
    chatHeaderPipIconColor: Int?,
    onCharacterSwitcherClick: () -> Unit,
    onModelSelectorClick: () -> Unit = {}
) {
    val modelName by actualViewModel.modelName.collectAsState()

    Surface(
        modifier = modifier.fillMaxWidth().height(64.dp),
        color =
            if (chatHeaderTransparent) Color.Transparent
            else MaterialTheme.colorScheme.background,
        tonalElevation = 0.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = AppSpacing.medium),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.size(48.dp), contentAlignment = Alignment.CenterStart) {
                HeaderIconButton(
                    icon = Icons.Default.Menu,
                    contentDescription = "Menu",
                    onClick = { actualViewModel.toggleChatHistorySelector() }
                )
            }

            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                Row(
                    modifier =
                        Modifier.clip(RoundedCornerShape(8.dp))
                            .clickable(onClick = onModelSelectorClick)
                            .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = modelName.ifBlank { "GPT-4o" },
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Icon(
                        imageVector = Icons.Default.ExpandMore,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.outline,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Box(modifier = Modifier.size(48.dp), contentAlignment = Alignment.CenterEnd) {
                HeaderIconButton(
                    icon = Icons.Default.AddComment,
                    contentDescription = "New chat",
                    onClick = {
                        actualViewModel.createNewChat()
                        actualViewModel.showChatHistorySelector(false)
                    }
                )
            }
        }
    }
}

@Composable
private fun HeaderIconButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    contentDescription: String,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = Modifier.size(40.dp),
        colors =
            IconButtonDefaults.iconButtonColors(
                containerColor = Color.Transparent,
                contentColor = MaterialTheme.colorScheme.onBackground
            )
    ) {
        Surface(
            modifier = Modifier.size(40.dp),
            shape = CircleShape,
            color = Color.Transparent
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(imageVector = icon, contentDescription = contentDescription)
            }
        }
    }
}
