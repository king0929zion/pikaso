package com.ai.assistance.operit.ui.features.permission.screens

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ai.assistance.operit.R
import com.ai.assistance.operit.core.tools.system.AndroidPermissionLevel
import com.ai.assistance.operit.ui.features.permission.viewmodel.PermissionGuideViewModel
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * Minimalist Permission Guide Screen
 *
 * A clean, card-based permission request screen with simplified navigation.
 */
@Composable
fun PermissionGuideScreen(
    viewModel: PermissionGuideViewModel = viewModel(),
    onComplete: () -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsState()

    // Initialize
    LaunchedEffect(Unit) {
        viewModel.checkPermissions(context)
    }

    // Storage permission launcher (Android 10 and below)
    val storagePermissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
            val readGranted = permissions[Manifest.permission.READ_EXTERNAL_STORAGE] ?: false
            val writeGranted = permissions[Manifest.permission.WRITE_EXTERNAL_STORAGE] ?: false
            if (readGranted && writeGranted) {
                viewModel.checkPermissions(context)
            }
        }
    }

    // Location permission launcher
    val locationPermissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val fineGranted = permissions[Manifest.permission.ACCESS_FINE_LOCATION] ?: false
        val coarseGranted = permissions[Manifest.permission.ACCESS_COARSE_LOCATION] ?: false
        if (fineGranted || coarseGranted) {
            viewModel.updateLocationPermission(true)
        }
    }

    // Handle completion
    LaunchedEffect(uiState.isCompleted) {
        if (uiState.isCompleted) {
            onComplete()
        }
    }

    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text(stringResource(R.string.permission_guide_welcome)) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(AppSpacing.medium),
            verticalArrangement = Arrangement.spacedBy(AppSpacing.medium)
        ) {
            // Header
            HeaderSection()

            // Basic Permissions Card
            PermissionCard(
                title = stringResource(R.string.permission_guide_basic_title),
                items = listOf(
                    PermissionItem(
                        title = stringResource(R.string.permission_guide_storage_title),
                        description = stringResource(R.string.permission_guide_storage_desc),
                        icon = Icons.Default.CheckCircle,
                        isGranted = uiState.hasStoragePermission,
                        onClick = {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                                val intent = Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION).apply {
                                    data = Uri.parse("package:${context.packageName}")
                                }
                                context.startActivity(intent)
                            } else {
                                storagePermissionLauncher.launch(
                                    arrayOf(
                                        Manifest.permission.READ_EXTERNAL_STORAGE,
                                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                                    )
                                )
                            }
                        }
                    ),
                    PermissionItem(
                        title = stringResource(R.string.permission_guide_overlay_title),
                        description = stringResource(R.string.permission_guide_overlay_desc),
                        icon = Icons.Default.CheckCircle,
                        isGranted = uiState.hasOverlayPermission,
                        onClick = {
                            val intent = Intent(
                                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                                Uri.parse("package:${context.packageName}")
                            )
                            context.startActivity(intent)
                        }
                    ),
                    PermissionItem(
                        title = stringResource(R.string.permission_guide_battery_title),
                        description = stringResource(R.string.permission_guide_battery_desc),
                        icon = Icons.Default.CheckCircle,
                        isGranted = uiState.hasBatteryOptimizationExemption,
                        onClick = {
                            val intent = Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS).apply {
                                data = Uri.parse("package:${context.packageName}")
                            }
                            context.startActivity(intent)
                        }
                    ),
                    PermissionItem(
                        title = stringResource(R.string.permission_guide_location_title),
                        description = stringResource(R.string.permission_guide_location_desc),
                        icon = Icons.Default.CheckCircle,
                        isGranted = uiState.hasLocationPermission,
                        onClick = {
                            locationPermissionLauncher.launch(
                                arrayOf(
                                    Manifest.permission.ACCESS_FINE_LOCATION,
                                    Manifest.permission.ACCESS_COARSE_LOCATION
                                )
                            )
                        }
                    )
                ),
                onRefresh = { viewModel.checkPermissions(context) }
            )

            // Permission Level Card
            PermissionLevelCard(
                selectedLevel = uiState.selectedPermissionLevel,
                onLevelSelected = { level -> viewModel.selectPermissionLevel(level) }
            )

            // Complete Button
            val allGranted = uiState.allBasicPermissionsGranted
            val hasSelectedLevel = uiState.selectedPermissionLevel != null

            Button(
                onClick = { viewModel.savePermissionLevel() },
                enabled = hasSelectedLevel,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
            ) {
                Text(
                    text = if (allGranted && hasSelectedLevel) {
                        stringResource(R.string.permission_guide_complete)
                    } else {
                        "完成设置"
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium
                )
            }

            // Hint text
            if (!allGranted) {
                Text(
                    text = "部分权限未授予可能影响功能使用",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
private fun HeaderSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(AppSpacing.nano)
    ) {
        Text(
            text = "设置权限",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "授予必要权限以获得最佳体验",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Composable
private fun PermissionCard(
    title: String,
    items: List<PermissionItem>,
    onRefresh: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(AppSpacing.medium),
            verticalArrangement = Arrangement.spacedBy(AppSpacing.small)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium
            )

            HorizontalDivider(
                modifier = Modifier.padding(vertical = AppSpacing.nano),
                color = MaterialTheme.colorScheme.outlineVariant
            )

            items.forEach { item ->
                PermissionRow(
                    title = item.title,
                    description = item.description,
                    icon = item.icon,
                    isGranted = item.isGranted,
                    onClick = item.onClick
                )
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = AppSpacing.nano),
                    color = MaterialTheme.colorScheme.outlineVariant
                )
            }

            // Refresh button
            TextButton(
                onClick = onRefresh,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(Modifier.width(AppSpacing.nano))
                Text("检查权限状态")
            }
        }
    }
}

@Composable
private fun PermissionRow(
    title: String,
    description: String,
    icon: ImageVector,
    isGranted: Boolean,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(AppSizes.cornerRadiusSmall))
            .clickable(onClick = onClick)
            .background(
                if (isGranted)
                    MaterialTheme.colorScheme.primaryContainer
                else
                    MaterialTheme.colorScheme.surface
            )
            .padding(AppSpacing.small),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                color = if (isGranted)
                    MaterialTheme.colorScheme.onPrimaryContainer
                else
                    MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = if (isGranted)
                    MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f)
                else
                    MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Icon(
            imageVector = if (isGranted) Icons.Default.Check else Icons.Default.Close,
            contentDescription = null,
            tint = if (isGranted)
                MaterialTheme.colorScheme.primary
            else
                MaterialTheme.colorScheme.error,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Composable
private fun PermissionLevelCard(
    selectedLevel: AndroidPermissionLevel?,
    onLevelSelected: (AndroidPermissionLevel) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(AppSpacing.medium),
            verticalArrangement = Arrangement.spacedBy(AppSpacing.small)
        ) {
            Text(
                text = stringResource(R.string.permission_guide_level_title),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium
            )

            HorizontalDivider(
                color = MaterialTheme.colorScheme.outlineVariant
            )

            AndroidPermissionLevel.values().forEach { level ->
                PermissionLevelRow(
                    title = when (level) {
                        AndroidPermissionLevel.STANDARD -> stringResource(R.string.permission_guide_standard_title)
                        AndroidPermissionLevel.ACCESSIBILITY -> stringResource(R.string.permission_guide_accessibility_title)
                        AndroidPermissionLevel.DEBUGGER -> stringResource(R.string.permission_guide_debugger_title)
                        AndroidPermissionLevel.ROOT -> stringResource(R.string.permission_guide_root_title)
                    },
                    description = when (level) {
                        AndroidPermissionLevel.STANDARD -> stringResource(R.string.permission_guide_standard_desc)
                        AndroidPermissionLevel.ACCESSIBILITY -> stringResource(R.string.permission_guide_accessibility_desc)
                        AndroidPermissionLevel.DEBUGGER -> stringResource(R.string.permission_guide_debugger_desc)
                        AndroidPermissionLevel.ROOT -> stringResource(R.string.permission_guide_root_desc)
                    },
                    isSelected = selectedLevel == level,
                    onClick = { onLevelSelected(level) }
                )
                HorizontalDivider(
                    color = MaterialTheme.colorScheme.outlineVariant
                )
            }
        }
    }
}

@Composable
private fun PermissionLevelRow(
    title: String,
    description: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(AppSizes.cornerRadiusSmall))
            .clickable(onClick = onClick)
            .background(
                if (isSelected)
                    MaterialTheme.colorScheme.primaryContainer
                else
                    MaterialTheme.colorScheme.surface
            )
            .padding(AppSpacing.small),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(20.dp)
                .background(
                    if (isSelected)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.outlineVariant,
                    shape = RoundedCornerShape(4.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            if (isSelected) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.size(14.dp)
                )
            }
        }

        Spacer(Modifier.width(AppSpacing.small))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                color = if (isSelected)
                    MaterialTheme.colorScheme.onPrimaryContainer
                else
                    MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = if (isSelected)
                    MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f)
                else
                    MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

private data class PermissionItem(
    val title: String,
    val description: String,
    val icon: ImageVector,
    val isGranted: Boolean,
    val onClick: () -> Unit
)
