package com.ai.assistance.operit.ui.features.workflow.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Link
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
import androidx.compose.ui.window.Dialog

/**
 * 节点操作菜单对话框
 * 长按节点时显示，提供编辑和连接选项
 */
@Composable
fun NodeActionMenuDialog(
    nodeName: String,
    onEdit: () -> Unit,
    onConnect: () -> Unit,
    onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(AppSpacing.medium),
            elevation = CardDefaults.cardElevation(defaultElevation = AppSizes.elevationSmall + 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(AppSpacing.medium)
            ) {
                Text(
                    text = nodeName,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = AppSpacing.medium)
                )

                // 编辑按钮
                TextButton(
                    onClick = {
                        onDismiss()
                        onEdit()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = null,
                        modifier = Modifier.size(AppSizes.iconNormal)
                    )
                    Spacer(modifier = Modifier.width(AppSpacing.extraSmall))
                    Text("编辑节点")
                }

                // 连接按钮
                TextButton(
                    onClick = {
                        onDismiss()
                        onConnect()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Link,
                        contentDescription = null,
                        modifier = Modifier.size(AppSizes.iconNormal)
                    )
                    Spacer(modifier = Modifier.width(AppSpacing.extraSmall))
                    Text("创建连接")
                }
                
                // 取消按钮
                TextButton(
                    onClick = onDismiss,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("取消")
                }
            }
        }
    }
}

