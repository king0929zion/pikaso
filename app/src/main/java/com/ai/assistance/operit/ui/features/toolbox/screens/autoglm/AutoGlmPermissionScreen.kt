package com.ai.assistance.operit.ui.features.toolbox.screens.autoglm

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.R
import com.ai.assistance.operit.ui.components.CustomScaffold
import com.ai.assistance.operit.util.ShizukuUtils

/**
 * AutoGLM 权限配置页面
 * 帮助用户正确配置 AutoGLM 所需的所有权限
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AutoGlmPermissionScreen(
    onNavigateBack: () -> Unit
) {
    val context = LocalContext.current

    // 权限状态
    val permissions = remember {
        listOf(
            PermissionItem(
                name = context.getString(R.string.permission_accessibility),
                description = context.getString(R.string.permission_accessibility_desc),
                icon = Icons.Default.TouchApp,
                color = Color(0xFF2196F3),
                isGranted = ShizukuUtils.isAccessibilityServiceEnabled(context),
                action = {
                    context.startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
                }
            ),
            PermissionItem(
                name = context.getString(R.string.permission_shizuku),
                description = context.getString(R.string.permission_shizuku_desc),
                icon = Icons.Default.AdminPanelSettings,
                color = Color(0xFF9C27B0),
                isGranted = ShizukuUtils.isShizukuAvailable(),
                action = {
                    try {
                        context.startActivity(Intent("dev.rikka.shizuku.actionREQUEST_PERMISSION"))
                    } catch (e: Exception) {
                        try {
                            context.startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                                data = Uri.parse("package:dev.rikkashizuku")
                            })
                        } catch (e2: Exception) {
                            // Shizuku not installed
                        }
                    }
                }
            ),
            PermissionItem(
                name = context.getString(R.string.permission_overlay),
                description = context.getString(R.string.permission_overlay_desc),
                icon = Icons.Default.Layers,
                color = Color(0xFF4CAF50),
                isGranted = Settings.canDrawOverlays(context),
                action = {
                    context.startActivity(Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION).apply {
                        data = Uri.parse("package:${context.packageName}")
                    })
                }
            ),
            PermissionItem(
                name = context.getString(R.string.permission_storage),
                description = context.getString(R.string.permission_storage_desc),
                icon = Icons.Default.Storage,
                color = Color(0xFFFF9800),
                isGranted = checkStoragePermission(context),
                action = {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                        context.startActivity(Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION).apply {
                            data = Uri.parse("package:${context.packageName}")
                        })
                    } else {
                        context.startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                            data = Uri.parse("package:${context.packageName}")
                        })
                    }
                }
            ),
            PermissionItem(
                name = context.getString(R.string.permission_notification),
                description = context.getString(R.string.permission_notification_desc),
                icon = Icons.Default.Notifications,
                color = Color(0xFFE91E63),
                isGranted = true, // Notification permission on Android 13+
                action = {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                        context.startActivity(Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS).apply {
                            data = Uri.parse("package:${context.packageName}")
                        })
                    }
                }
            )
        )
    }

    var grantedCount by remember { mutableStateOf(permissions.count { it.isGranted }) }
    var expandedIndex by remember { mutableStateOf(-1) }

    CustomScaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Header
            item {
                Column {
                    Text(
                        text = stringResource(R.string.autoglm_permission_title),
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = stringResource(R.string.autoglm_permission_subtitle),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Progress indicator
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "${grantedCount}/${permissions.size}",
                                style = MaterialTheme.typography.headlineMedium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                            Text(
                                text = stringResource(R.string.permissions_granted),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f)
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            LinearProgressIndicator(
                                progress = { grantedCount.toFloat() / permissions.size },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp)),
                                color = MaterialTheme.colorScheme.primary,
                                trackColor = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.2f)
                            )
                        }
                    }
                }
            }

            // Permission items
            itemsIndexed(permissions) { index, permission ->
                PermissionCard(
                    permission = permission,
                    isExpanded = expandedIndex == index,
                    onToggle = {
                        expandedIndex = if (expandedIndex == index) -1 else index
                    },
                    onRequestPermission = {
                        permission.action()
                    }
                )
            }

            // Quick actions
            item {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = stringResource(R.string.quick_actions),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium
                )
            }

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Open all settings
                    OutlinedButton(
                        onClick = {
                            context.startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                                data = Uri.parse("package:${context.packageName}")
                            })
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.Default.Settings, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(stringResource(R.string.app_settings))
                    }

                    // Check Shizuku
                    OutlinedButton(
                        onClick = {
                            try {
                                context.startActivity(Intent("dev.rikka.shizuku.actionREQUEST_PERMISSION"))
                            } catch (e: Exception) {
                                // Shizuku not installed
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.Default.AdminPanelSettings, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(stringResource(R.string.shizuku_settings))
                    }
                }
            }

            // Bottom spacer
            item {
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }

    // Check permissions periodically
    LaunchedEffect(Unit) {
        while (true) {
            kotlinx.coroutines.delay(2000)
            grantedCount = permissions.count { it.isGranted }
        }
    }
}

@Composable
fun PermissionCard(
    permission: PermissionItem,
    isExpanded: Boolean,
    onToggle: () -> Unit,
    onRequestPermission: () -> Unit
) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onToggle() },
        shape = RoundedCornerShape(16.dp)
    ) {
        Column {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Icon
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .background(permission.color.copy(alpha = 0.1f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = permission.icon,
                        contentDescription = null,
                        tint = permission.color,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = permission.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = if (permission.isGranted) {
                            context.getString(R.string.permission_granted)
                        } else {
                            context.getString(R.string.permission_not_granted)
                        },
                        style = MaterialTheme.typography.bodySmall,
                        color = if (permission.isGranted) {
                            Color(0xFF4CAF50)
                        } else {
                            MaterialTheme.colorScheme.error
                        }
                    )
                }

                // Status icon
                Icon(
                    imageVector = if (permission.isGranted) Icons.Default.CheckCircle else Icons.Default.Cancel,
                    contentDescription = null,
                    tint = if (permission.isGranted) Color(0xFF4CAF50) else MaterialTheme.colorScheme.error,
                    modifier = Modifier.size(24.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Icon(
                    imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            // Expanded content
            AnimatedVisibility(
                visible = isExpanded,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(bottom = 16.dp)
                ) {
                    HorizontalDivider()
                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = permission.description,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    if (!permission.isGranted) {
                        Spacer(modifier = Modifier.height(16.dp))

                        Button(
                            onClick = onRequestPermission,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Icon(Icons.Default.Security, contentDescription = null)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(stringResource(R.string.grant_permission))
                        }
                    }
                }
            }
        }
    }
}

private fun checkStoragePermission(context: Context): Boolean {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        context.checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) ==
                android.content.pm.PackageManager.PERMISSION_GRANTED
    } else {
        context.checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) ==
                android.content.pm.PackageManager.PERMISSION_GRANTED &&
                context.checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                android.content.pm.PackageManager.PERMISSION_GRANTED
    }
}

data class PermissionItem(
    val name: String,
    val description: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector,
    val color: Color,
    val isGranted: Boolean,
    val action: () -> Unit
)
