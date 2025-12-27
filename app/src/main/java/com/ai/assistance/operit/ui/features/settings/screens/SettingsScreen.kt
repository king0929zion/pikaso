package com.ai.assistance.operit.ui.features.settings.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.R
import com.ai.assistance.operit.data.preferences.UserPreferencesManager
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * Simplified Settings Screen
 *
 * Consolidated from 5 groups with 17 items to 4 groups with 12 items.
 * Cleaner organization and fewer navigation levels.
 */
@Composable
fun SettingsScreen(
        onNavigateToUserPreferences: () -> Unit,
        navigateToToolPermissions: () -> Unit,
        navigateToModelConfig: () -> Unit,
        navigateToThemeSettings: () -> Unit,
        navigateToGlobalDisplaySettings: () -> Unit,
        navigateToModelPrompts: () -> Unit,
        navigateToFunctionalConfig: () -> Unit,
        navigateToChatHistorySettings: () -> Unit,
        navigateToChatBackupSettings: () -> Unit,
        navigateToLanguageSettings: () -> Unit,
        navigateToSpeechServicesSettings: () -> Unit,
        navigateToCustomHeadersSettings: () -> Unit,
        navigateToPersonaCardGeneration: () -> Unit,
        navigateToWaifuModeSettings: () -> Unit,
        navigateToTokenUsageStatistics: () -> Unit,
        navigateToContextSummarySettings: () -> Unit,
        navigateToLayoutAdjustmentSettings: () -> Unit
) {
        val context = LocalContext.current
        val userPreferences = remember { UserPreferencesManager.getInstance(context) }
        val hasBackgroundImage by userPreferences.useBackgroundImage.collectAsState(initial = false)

        val cardColor = if (hasBackgroundImage) {
                MaterialTheme.colorScheme.surface
        } else {
                MaterialTheme.colorScheme.surfaceVariant
        }

        val scrollState = rememberScrollState()

        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .padding(AppSpacing.medium)
                        .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(AppSpacing.medium)
        ) {
                // 个性化与显示
                SettingsGroup(
                        title = "界面设置",
                        icon = Icons.Default.Palette,
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_user_preferences),
                                subtitle = "用户配置文件",
                                icon = Icons.Default.Face,
                                onClick = onNavigateToUserPreferences
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_theme_appearance),
                                subtitle = "主题和外观",
                                icon = Icons.Default.DarkMode,
                                onClick = navigateToThemeSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.language_settings),
                                subtitle = "语言和地区",
                                icon = Icons.Default.Language,
                                onClick = navigateToLanguageSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_global_display),
                                subtitle = "显示设置",
                                icon = Icons.Default.Visibility,
                                onClick = navigateToGlobalDisplaySettings
                        )
                }

                // AI模型配置
                SettingsGroup(
                        title = "AI设置",
                        icon = Icons.Default.Psychology,
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_model_parameters),
                                subtitle = "模型参数配置",
                                icon = Icons.Default.Tune,
                                onClick = navigateToModelConfig
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_functional_model),
                                subtitle = "功能模型设置",
                                icon = Icons.Default.Settings,
                                onClick = navigateToFunctionalConfig
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_speech_services),
                                subtitle = "语音服务",
                                icon = Icons.Default.RecordVoiceOver,
                                onClick = navigateToSpeechServicesSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_prompt_title),
                                subtitle = "系统提示词",
                                icon = Icons.Default.ChatBubble,
                                onClick = navigateToModelPrompts
                        )
                }

                // 高级功能
                SettingsGroup(
                        title = "高级功能",
                        icon = Icons.Default.Extension,
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_custom_headers),
                                subtitle = "自定义请求头",
                                icon = Icons.Default.AddModerator,
                                onClick = navigateToCustomHeadersSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_section_context_summary),
                                subtitle = "上下文总结",
                                icon = Icons.Default.Summarize,
                                onClick = navigateToContextSummarySettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.persona_card_generation),
                                subtitle = "人设卡生成",
                                icon = Icons.Default.Badge,
                                onClick = navigateToPersonaCardGeneration
                        )
                }

                // 数据与安全
                SettingsGroup(
                        title = "数据与安全",
                        icon = Icons.Default.Security,
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_tool_permissions),
                                subtitle = "工具权限管理",
                                icon = Icons.Default.AdminPanelSettings,
                                onClick = navigateToToolPermissions
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_chat_history_management),
                                subtitle = "聊天历史管理",
                                icon = Icons.Default.History,
                                onClick = navigateToChatHistorySettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_data_backup),
                                subtitle = "数据备份",
                                icon = Icons.Default.CloudUpload,
                                onClick = navigateToChatBackupSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_token_usage_stats),
                                subtitle = "Token使用统计",
                                icon = Icons.Default.Analytics,
                                onClick = navigateToTokenUsageStatistics
                        )
                }
        }
}

@Composable
private fun SettingsGroup(
        title: String,
        icon: ImageVector,
        cardColor: androidx.compose.ui.graphics.Color,
        content: @Composable ColumnScope.() -> Unit
) {
        Column(verticalArrangement = Arrangement.spacedBy(AppSpacing.nano)) {
                // Group header
                Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = AppSpacing.extraSmall)
                ) {
                        Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(AppSizes.iconNormal)
                        )
                        Spacer(Modifier.width(AppSpacing.nano))
                        Text(
                                text = title,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.primary
                        )
                }

                // Settings card
                Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = cardColor),
                        shape = androidx.compose.foundation.shape.RoundedCornerShape(AppSizes.cornerRadiusMedium)
                ) {
                        Column(
                                modifier = Modifier.padding(AppSpacing.extraSmall),
                                verticalArrangement = Arrangement.spacedBy(AppSpacing.nano),
                                content = content
                        )
                }
        }
}

@Composable
private fun SettingsItem(
        title: String,
        subtitle: String,
        icon: ImageVector,
        onClick: () -> Unit
) {
        Surface(
                onClick = onClick,
                modifier = Modifier.fillMaxWidth(),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(AppSizes.cornerRadiusSmall),
                color = androidx.compose.ui.graphics.Color.Transparent
        ) {
                Row(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(AppSpacing.small),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                        Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(AppSizes.iconNormal)
                        )

                        Spacer(Modifier.width(AppSpacing.small))

                        Column(modifier = Modifier.weight(1f)) {
                                Text(
                                        text = title,
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Medium
                                )
                                Text(
                                        text = subtitle,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                        }

                        Icon(
                                imageVector = Icons.Default.ChevronRight,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                                modifier = Modifier.size(AppSizes.iconSmall)
                        )
                }
        }
}
