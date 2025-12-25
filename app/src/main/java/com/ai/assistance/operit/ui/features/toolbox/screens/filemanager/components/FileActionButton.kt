package com.ai.assistance.operit.ui.features.toolbox.screens.filemanager.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * 文件操作按钮组件，显示一个带有图标和文本的按钮
 * 
 * @param icon 按钮图标
 * @param text 按钮文本
 * @param onClick 点击回调函数
 */
@Composable
fun FileActionButton(icon: ImageVector, text: String, onClick: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxWidth().clickable(onClick = onClick),
        color = MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
        tonalElevation = AppSizes.elevationSmall / 2
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(vertical = AppSpacing.small, horizontal = AppSpacing.medium),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 图标背景
            Surface(
                modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp),
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                color = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = text,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(AppSpacing.small + 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.width(AppSpacing.medium))

            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
} 