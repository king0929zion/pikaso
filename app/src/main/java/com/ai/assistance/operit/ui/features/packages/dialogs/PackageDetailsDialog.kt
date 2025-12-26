package com.ai.assistance.operit.ui.features.packages.dialogs

import com.ai.assistance.operit.util.AppLogger
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.ai.assistance.operit.R
import com.ai.assistance.operit.core.tools.PackageTool
import com.ai.assistance.operit.core.tools.packTool.PackageManager
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

@Composable
fun PackageDetailsDialog(
        packageName: String,
        packageDescription: String,
        packageManager: PackageManager,
        onRunScript: (PackageTool) -> Unit,
        onDismiss: () -> Unit,
        onPackageDeleted: () -> Unit
) {
    var showDeleteConfirmDialog by remember { mutableStateOf(false) }

    val toolPackage = remember(packageName) {
        try {
            packageManager.getAvailablePackages()[packageName]
        } catch (e: Exception) {
            AppLogger.e("PackageDetailsDialog", "Failed to load package details", e)
            null
        }
    }

    if (showDeleteConfirmDialog) {
        AlertDialog(
                onDismissRequest = { showDeleteConfirmDialog = false },
                title = { Text("确认删除") },
                text = { Text("确定要删除包 \"${packageName}\" 吗？此操作无法撤销。") },
                confirmButton = {
                    Button(
                            onClick = {
                                AppLogger.d("PackageDetailsDialog", "Delete button clicked for package: $packageName")
                                val deleted = packageManager.deletePackage(packageName)
                                AppLogger.d("PackageDetailsDialog", "packageManager.deletePackage returned: $deleted")
                                if (deleted) {
                                    AppLogger.d("PackageDetailsDialog", "Deletion successful, closing dialog and calling onPackageDeleted.")
                                    showDeleteConfirmDialog = false
                                    onPackageDeleted()
                                } else {
                                    AppLogger.e("PackageDetailsDialog", "Deletion failed. Closing confirm diaAppLogger.")
                                    showDeleteConfirmDialog = false
                                }
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                    ) {
                        Text("删除")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDeleteConfirmDialog = false }) {
                        Text("取消")
                    }
                }
        )
    }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            modifier = Modifier.fillMaxWidth().heightIn(max = AppSizes.floatingMaxWidth + AppSizes.messageBubbleMaxWidth + AppSizes.messageBubbleMaxWidth + AppSizes.floatingMaxWidth),
            shape = RoundedCornerShape(AppSizes.cornerRadiusLarge),
            color = MaterialTheme.colorScheme.surface
        ) {
            Column(modifier = Modifier.fillMaxWidth().padding(AppSizes.floatingBallSize + AppSpacing.nano)) {
                // 紧凑的标题栏
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Extension,
                        contentDescription = null,
                        modifier = Modifier.size(AppSizes.buttonMinHeightSmall - AppSpacing.small),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(AppSpacing.extraSmall))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = packageName,
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                color = if (toolPackage?.isBuiltIn == true)
                                    MaterialTheme.colorScheme.primaryContainer
                                else
                                    MaterialTheme.colorScheme.secondaryContainer,
                                shape = RoundedCornerShape(AppSizes.none)
                            ) {
                                Text(
                                    text = if (toolPackage?.isBuiltIn == true) stringResource(R.string.builtin) else stringResource(R.string.external),
                                    style = MaterialTheme.typography.labelSmall,
                                    color = if (toolPackage?.isBuiltIn == true)
                                        MaterialTheme.colorScheme.onPrimaryContainer
                                    else
                                        MaterialTheme.colorScheme.onSecondaryContainer,
                                    modifier = Modifier.padding(horizontal = AppSpacing.nano, vertical = AppSizes.none)
                                )
                            }
                        }
                    }
                }

                // 包描述
                if (packageDescription.isNotBlank()) {
                    Spacer(modifier = Modifier.height(AppSpacing.extraSmall))
                    Text(
                        text = packageDescription,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Spacer(modifier = Modifier.height(AppSpacing.medium))

                // 工具列表
                Text(
                    text = "工具列表",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(AppSpacing.extraSmall))

                // 工具内容
                Box(modifier = Modifier.weight(1f)) {
                    when {
                        toolPackage?.tools == null || toolPackage.tools.isEmpty() -> {
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                                )
                            ) {
                                Column(
                                    modifier = Modifier.padding(AppSpacing.medium),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Icon(
                                        Icons.Default.Apps,
                                        contentDescription = null,
                                        modifier = Modifier.size(AppSizes.avatarMedium),
                                        tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                                    )
                                    Spacer(modifier = Modifier.height(AppSpacing.extraSmall))
                                    Text(
                                        text = "暂无可用工具",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }
                        else -> {
                            LazyColumn(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.spacedBy(AppSpacing.nano)
                            ) {
                                items(items = toolPackage.tools, key = { tool -> tool.name }) { tool ->
                                    ToolCard(
                                        tool = tool,
                                        onExecute = { onRunScript(tool) }
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(AppSpacing.medium))

                // 操作按钮
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(AppSpacing.extraSmall, Alignment.End)
                ) {
                    if (toolPackage != null && !toolPackage.isBuiltIn) {
                        OutlinedButton(
                            onClick = { showDeleteConfirmDialog = true },
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = MaterialTheme.colorScheme.error
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = null,
                                modifier = Modifier.size(AppSpacing.extraSmall + AppSpacing.nano)
                            )
                            Spacer(modifier = Modifier.width(AppSizes.none))
                            Text("删除")
                        }
                    }
                    
                    FilledTonalButton(onClick = onDismiss) {
                        Text("关闭")
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ToolCard(
    tool: PackageTool,
    onExecute: (PackageTool) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
        )
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(AppSpacing.extraSmall)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(AppSizes.iconNormal),
                    tint = MaterialTheme.colorScheme.primary
                )

                Spacer(modifier = Modifier.width(AppSpacing.extraSmall))
                
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = tool.name,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = tool.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                
                FilledTonalButton(
                    onClick = { onExecute(tool) },
                    modifier = Modifier.height(AppSizes.buttonMinHeightSmall - AppSpacing.extraSmall),
                    contentPadding = PaddingValues(horizontal = AppSpacing.extraSmall)
                ) {
                    Text(
                        text = "运行",
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
            
            // 参数信息
            if (tool.parameters.isNotEmpty()) {
                Spacer(modifier = Modifier.height(AppSpacing.extraSmall))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(AppSizes.none),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.Settings,
                        contentDescription = null,
                        modifier = Modifier.size(AppSizes.iconSmall),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
                    )
                    tool.parameters.take(3).forEach { param ->
                        Surface(
                            color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f),
                            shape = RoundedCornerShape(AppSizes.none)
                        ) {
                            Text(
                                text = param.name,
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSecondaryContainer,
                                modifier = Modifier.padding(horizontal = AppSpacing.nano, vertical = AppSizes.none)
                            )
                        }
                    }
                    if (tool.parameters.size > 3) {
                        Text(
                            text = "+${tool.parameters.size - 3}",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
                        )
                    }
                }
            }
        }
    }
}
