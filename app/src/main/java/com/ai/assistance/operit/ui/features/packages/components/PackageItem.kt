package com.ai.assistance.operit.ui.features.packages.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Extension
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

@Composable
fun PackageItem(
        name: String,
        description: String,
        isImported: Boolean,
        onClick: () -> Unit,
        onToggleImport: (Boolean) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable(onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                        )
        ) {
                Row(
            modifier = Modifier.fillMaxWidth().padding(AppSpacing.extraSmall),
            verticalAlignment = Alignment.CenterVertically
                ) {
            // 图标
                                        Icon(
                                                imageVector = Icons.Default.Extension,
                                                contentDescription = null,
                modifier = Modifier.size(AppSizes.iconNormal),
                                                tint = MaterialTheme.colorScheme.primary
                                        )

            Spacer(modifier = Modifier.width(AppSpacing.extraSmall))

            // 文本内容 - 添加右侧边距防止撞到开关
                        Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = AppSpacing.extraSmall)
                        ) {
                                Text(
                                        text = name,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                        text = description,
                                        style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                                )
                        }

            // 开关
                        Switch(
                                checked = isImported,
                                onCheckedChange = onToggleImport,
                modifier = Modifier.size(width = AppSizes.iconNormal - AppSpacing.nano, height = AppSizes.buttonMinHeightSmall - AppSpacing.large),
                colors = SwitchDefaults.colors(
                    checkedThumbColor = MaterialTheme.colorScheme.primary,
                    checkedTrackColor = MaterialTheme.colorScheme.primaryContainer,
                    uncheckedThumbColor = MaterialTheme.colorScheme.outline,
                    uncheckedTrackColor = MaterialTheme.colorScheme.surfaceVariant
                                        )
                        )
                }
        }
}
