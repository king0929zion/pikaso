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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

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
        navigateToLayoutAdjustmentSettings: () -> Unit,
        navigateToPermissionGuide: () -> Unit = {}
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
                        .padding(horizontal = 16.dp)
                        // Bottom padding to avoid overlap with bottom nav bar
                        .padding(bottom = 100.dp)
                        .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
                // Header: Settings (h1)
                Text(
                        text = stringResource(R.string.settings),
                        style = MaterialTheme.typography.headlineLarge.copy(
                                fontFamily = FontFamily.Serif,
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Normal,
                                letterSpacing = (-0.5).sp
                        ),
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 16.dp)
                )

                // 个性化与显示
                SettingsGroup(
                        title = "界面设置",
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_user_preferences),
                                subtitle = "用户配置文件",
                                onClick = onNavigateToUserPreferences
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_theme_appearance),
                                subtitle = "主题和外观",
                                onClick = navigateToThemeSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.language_settings),
                                subtitle = "语言和地区",
                                onClick = navigateToLanguageSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_global_display),
                                subtitle = "显示设置",
                                onClick = navigateToGlobalDisplaySettings
                        )
                }

                // AI模型配置
                SettingsGroup(
                        title = "AI设置",
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_model_parameters),
                                subtitle = "模型参数配置",
                                onClick = navigateToModelConfig
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_functional_model),
                                subtitle = "功能模型设置",
                                onClick = navigateToFunctionalConfig
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_speech_services),
                                subtitle = "语音服务",
                                onClick = navigateToSpeechServicesSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_prompt_title),
                                subtitle = "系统提示词",
                                onClick = navigateToModelPrompts
                        )
                }

                // 高级功能
                SettingsGroup(
                        title = "高级功能",
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_custom_headers),
                                subtitle = "自定义请求头",
                                onClick = navigateToCustomHeadersSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_section_context_summary),
                                subtitle = "上下文总结",
                                onClick = navigateToContextSummarySettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.persona_card_generation),
                                subtitle = "人设卡生成",
                                onClick = navigateToPersonaCardGeneration
                        )
                }

                // 数据与安全
                SettingsGroup(
                        title = "数据与安全",
                        cardColor = cardColor
                ) {
                        SettingsItem(
                                title = stringResource(R.string.settings_tool_permissions),
                                subtitle = "工具权限管理",
                                onClick = navigateToToolPermissions
                        )
                        SettingsItem(
                                title = "权限配置",
                                subtitle = "应用权限级别设置",
                                onClick = navigateToPermissionGuide
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_chat_history_management),
                                subtitle = "聊天历史管理",
                                onClick = navigateToChatHistorySettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_data_backup),
                                subtitle = "数据备份",
                                onClick = navigateToChatBackupSettings
                        )
                        SettingsItem(
                                title = stringResource(R.string.settings_token_usage_stats),
                                subtitle = "Token使用统计",
                                onClick = navigateToTokenUsageStatistics
                        )
                }
        }
}

@Composable
private fun SettingsGroup(
        title: String,
        cardColor: androidx.compose.ui.graphics.Color,
        content: @Composable ColumnScope.() -> Unit
) {
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                // Group header
                Text(
                        text = title,
                        style = MaterialTheme.typography.titleLarge.copy(
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier.padding(start = 8.dp)
                )

                // Settings card
                Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = cardColor),
                        shape = RoundedCornerShape(28.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
                ) {
                        Column(
                                modifier = Modifier.padding(vertical = 8.dp),
                                content = content
                        )
                }
        }
}

@Composable
private fun SettingsItem(
        title: String,
        subtitle: String,
        onClick: () -> Unit
) {
        Surface(
                onClick = onClick,
                modifier = Modifier.fillMaxWidth(),
                color = androidx.compose.ui.graphics.Color.Transparent
        ) {
                Row(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp, vertical = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                        Column(modifier = Modifier.weight(1f)) {
                                Text(
                                        text = title,
                                        style = MaterialTheme.typography.bodyLarge.copy(
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Medium
                                        ),
                                        modifier = Modifier.padding(bottom = 2.dp)
                                )
                                Text(
                                        text = subtitle,
                                        style = MaterialTheme.typography.bodyMedium.copy(
                                                fontSize = 13.sp,
                                                color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                )
                        }

                        Icon(
                                imageVector = Icons.Default.ChevronRight,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                                modifier = Modifier.size(24.dp)
                        )
                }
                
                // Add divider except for last item? 
                // Prototype has dividers: border-bottom: 1px solid rgba(0,0,0,0.05);
                HorizontalDivider(
                    modifier = Modifier.padding(start = 24.dp), 
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.05f)
                )
        }
}
