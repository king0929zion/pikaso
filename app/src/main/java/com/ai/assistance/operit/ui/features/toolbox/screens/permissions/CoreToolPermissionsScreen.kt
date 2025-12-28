package com.ai.assistance.operit.ui.features.toolbox.screens.permissions

import android.Manifest
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.OpenInNew
import androidx.compose.material.icons.filled.Security
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.core.content.getSystemService
import com.ai.assistance.operit.R
import com.ai.assistance.operit.core.accessibility.OperitAccessibilityService
import com.ai.assistance.operit.core.input.InputMethodManager
import com.ai.assistance.operit.core.tools.system.ShizukuAuthorizer
import com.ai.assistance.operit.core.tools.system.ShizukuInstaller
import com.ai.assistance.operit.ui.components.PageContainer
import com.ai.assistance.operit.ui.theme.AppSpacing
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoreToolPermissionsScreen() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var shizukuInstalled by remember { mutableStateOf(false) }
    var shizukuRunning by remember { mutableStateOf(false) }
    var shizukuGranted by remember { mutableStateOf(false) }
    var accessibilityEnabled by remember { mutableStateOf(false) }
    var overlayGranted by remember { mutableStateOf(false) }
    var notificationGranted by remember { mutableStateOf(false) }
    var operitImeEnabled by remember { mutableStateOf(false) }

    fun refreshStates() {
        shizukuInstalled = ShizukuAuthorizer.isShizukuInstalled(context)
        shizukuRunning = ShizukuAuthorizer.isShizukuServiceRunning()
        shizukuGranted = ShizukuAuthorizer.hasShizukuPermission()
        accessibilityEnabled = OperitAccessibilityService.isAccessibilityServiceEnabled()
        overlayGranted = Settings.canDrawOverlays(context)
        notificationGranted =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) ==
                    PackageManager.PERMISSION_GRANTED
            } else {
                NotificationManagerCompat.from(context).areNotificationsEnabled()
            }
        scope.launch { operitImeEnabled = InputMethodManager.isOperitIMEEnabled(context) }
    }

    val notificationPermissionLauncher =
        rememberLauncherForActivityResult(
            contract = ActivityResultContracts.RequestPermission(),
            onResult = { refreshStates() }
        )

    LaunchedEffect(Unit) { refreshStates() }

    DisposableEffect(Unit) {
        val listener = { refreshStates() }
        ShizukuAuthorizer.addStateChangeListener(listener)
        onDispose { ShizukuAuthorizer.removeStateChangeListener(listener) }
    }

    PageContainer {
        OutlinedCard(shape = MaterialTheme.shapes.large) {
            Column(modifier = Modifier.fillMaxWidth().padding(AppSpacing.cardPadding)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Security,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.padding(start = AppSpacing.small))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(R.string.core_permissions_title),
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.height(AppSpacing.nano))
                        Text(
                            text = stringResource(R.string.core_permissions_subtitle),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    FilledTonalButton(onClick = { refreshStates() }) {
                        Text(text = stringResource(R.string.core_permissions_refresh))
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(AppSpacing.groupSpacing))

        PermissionCard(
            title = stringResource(R.string.tool_process_limit_remover),
            description = stringResource(R.string.core_permissions_process_limit_desc),
            items =
                listOf(
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_shizuku_installed),
                        ok = shizukuInstalled
                    ),
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_shizuku_running),
                        ok = shizukuRunning
                    ),
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_shizuku_granted),
                        ok = shizukuGranted
                    )
                ),
            primaryAction =
                PermissionAction(
                    label =
                        if (!shizukuInstalled) {
                            stringResource(R.string.core_permissions_install_shizuku)
                        } else {
                            stringResource(R.string.core_permissions_open_shizuku)
                        },
                    icon = Icons.Default.OpenInNew,
                    onClick = {
                        if (!shizukuInstalled) {
                            ShizukuInstaller.installBundledShizuku(context)
                        } else {
                            context.packageManager
                                .getLaunchIntentForPackage("moe.shizuku.privileged.api")
                                ?.let { context.startActivity(it) }
                        }
                    }
                ),
            secondaryAction =
                PermissionAction(
                    label = stringResource(R.string.core_permissions_request_shizuku),
                    icon = Icons.Default.Security,
                    enabled = shizukuInstalled && shizukuRunning && !shizukuGranted,
                    onClick = { ShizukuAuthorizer.requestShizukuPermission { refreshStates() } }
                )
        )

        Spacer(modifier = Modifier.height(AppSpacing.groupSpacing))

        PermissionCard(
            title = stringResource(R.string.tool_autoglm_tool),
            description = stringResource(R.string.core_permissions_autoglm_executor_desc),
            items =
                listOf(
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_accessibility),
                        ok = accessibilityEnabled
                    ),
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_overlay),
                        ok = overlayGranted
                    ),
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_notifications),
                        ok = notificationGranted
                    )
                ),
            primaryAction =
                PermissionAction(
                    label = stringResource(R.string.core_permissions_open_accessibility_settings),
                    icon = Icons.Default.OpenInNew,
                    onClick = { context.startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)) }
                ),
            secondaryAction =
                PermissionAction(
                    label = stringResource(R.string.core_permissions_open_overlay_settings),
                    icon = Icons.Default.OpenInNew,
                    onClick = {
                        context.startActivity(
                            Intent(
                                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                                Uri.parse("package:${context.packageName}")
                            )
                        )
                    }
                )
        )

        Spacer(modifier = Modifier.height(AppSpacing.groupSpacing))

        PermissionCard(
            title = stringResource(R.string.tool_autoglm_one_click),
            description = stringResource(R.string.core_permissions_autoglm_config_desc),
            items =
                listOf(
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_shizuku_granted),
                        ok = shizukuGranted
                    ),
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_operit_ime_enabled),
                        ok = operitImeEnabled
                    )
                ),
            primaryAction =
                PermissionAction(
                    label = stringResource(R.string.core_permissions_open_ime_settings),
                    icon = Icons.Default.OpenInNew,
                    onClick = { context.startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)) }
                ),
            secondaryAction =
                PermissionAction(
                    label = stringResource(R.string.core_permissions_copy_shizuku_start_cmd),
                    icon = Icons.Default.ContentCopy,
                    enabled = shizukuInstalled && !shizukuRunning,
                    onClick = {
                        val clipboard = context.getSystemService<ClipboardManager>()
                        clipboard?.setPrimaryClip(
                            ClipData.newPlainText(
                                "shizuku_start",
                                "adb shell sh /sdcard/Android/data/moe.shizuku.privileged.api/start.sh"
                            )
                        )
                    }
                )
        )

        Spacer(modifier = Modifier.height(AppSpacing.groupSpacing))

        PermissionCard(
            title = stringResource(R.string.tool_html_packager),
            description = stringResource(R.string.core_permissions_html_packager_desc),
            items =
                listOf(
                    PermissionItemState(
                        title = stringResource(R.string.core_permissions_notifications),
                        ok = notificationGranted
                    )
                ),
            primaryAction =
                PermissionAction(
                    label =
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU && !notificationGranted) {
                            stringResource(R.string.core_permissions_request_notifications)
                        } else {
                            stringResource(R.string.core_permissions_open_app_settings)
                        },
                    icon = Icons.Default.OpenInNew,
                    onClick = {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU && !notificationGranted) {
                            notificationPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
                        } else {
                            context.startActivity(
                                Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                                    data = Uri.parse("package:${context.packageName}")
                                }
                            )
                        }
                    }
                ),
            secondaryAction = null
        )
    }
}

private data class PermissionItemState(
    val title: String,
    val ok: Boolean
)

private data class PermissionAction(
    val label: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector,
    val enabled: Boolean = true,
    val onClick: () -> Unit
)

@Composable
private fun PermissionCard(
    title: String,
    description: String,
    items: List<PermissionItemState>,
    primaryAction: PermissionAction,
    secondaryAction: PermissionAction?
) {
    OutlinedCard(
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.outlinedCardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(modifier = Modifier.fillMaxWidth().padding(AppSpacing.cardPadding)) {
            Text(text = title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(AppSpacing.nano))
            Text(text = description, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)

            Spacer(modifier = Modifier.height(AppSpacing.medium))

            Column(verticalArrangement = Arrangement.spacedBy(AppSpacing.small)) {
                items.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = if (item.ok) Icons.Default.CheckCircle else Icons.Default.Error,
                            contentDescription = null,
                            tint =
                                if (item.ok) MaterialTheme.colorScheme.primary
                                else MaterialTheme.colorScheme.error
                        )
                        Spacer(modifier = Modifier.padding(start = AppSpacing.small))
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text =
                                if (item.ok) stringResource(R.string.core_permissions_status_ok)
                                else stringResource(R.string.core_permissions_status_missing),
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(AppSpacing.mediumLarge))

            Row(horizontalArrangement = Arrangement.spacedBy(AppSpacing.small), modifier = Modifier.fillMaxWidth()) {
                Button(
                    onClick = primaryAction.onClick,
                    enabled = primaryAction.enabled,
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(imageVector = primaryAction.icon, contentDescription = null, modifier = Modifier.padding(end = 8.dp))
                    Text(text = primaryAction.label, maxLines = 1)
                }
                if (secondaryAction != null) {
                    OutlinedButton(
                        onClick = secondaryAction.onClick,
                        enabled = secondaryAction.enabled,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(imageVector = secondaryAction.icon, contentDescription = null, modifier = Modifier.padding(end = 8.dp))
                        Text(text = secondaryAction.label, maxLines = 1)
                    }
                }
            }
        }
    }
}
