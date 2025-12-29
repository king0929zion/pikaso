package com.ai.assistance.operit.ui.features.toolbox.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ai.assistance.operit.R

@Composable
fun ToolboxScreen(
    navController: NavController,
    onProcessLimitRemoverSelected: () -> Unit,
    onHtmlPackagerSelected: () -> Unit,
    onAutoGlmOneClickSelected: () -> Unit,
    onAutoGlmToolSelected: () -> Unit,
    onToolPermissionsSelected: () -> Unit = {},
    onNavigateToChat: () -> Unit = {}
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                // Bottom padding to avoid overlap with bottom nav bar
                .padding(bottom = 100.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // Header: Operit (h1)
            Text(
                text = "Operit",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontFamily = FontFamily.Serif,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = (-0.5).sp
                ),
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 16.dp, bottom = 24.dp)
            )

            // Subheader: 工具箱 (h2)
            Text(
                text = stringResource(R.string.toolbox),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .padding(start = 8.dp)
                    .padding(bottom = 12.dp)
            )

            // 1. AutoGLM 执行器 (Primary)
            HomeCard(
                title = stringResource(R.string.tool_autoglm_tool),
                description = stringResource(R.string.tool_autoglm_tool_desc),
                icon = Icons.Rounded.SmartToy,
                onClick = onAutoGlmToolSelected,
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                iconBackgroundColor = Color.White.copy(alpha = 0.4f),
                showArrow = true
            )

            // 2. 一键配置 (Accent)
            HomeCard(
                title = stringResource(R.string.tool_autoglm_one_click),
                description = stringResource(R.string.tool_autoglm_one_click_desc),
                icon = Icons.Rounded.Tune,
                onClick = onAutoGlmOneClickSelected,
                containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                iconBackgroundColor = Color.White.copy(alpha = 0.4f)
            )

            // 3. 解除进程限制 (Default)
            HomeCard(
                title = stringResource(R.string.tool_process_limit_remover),
                description = stringResource(R.string.tool_process_limit_remover_desc),
                icon = Icons.Rounded.NoEncryption,
                onClick = onProcessLimitRemoverSelected,
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                iconBackgroundColor = MaterialTheme.colorScheme.background
            )

            // 4. 网页转 APK (Default)
            HomeCard(
                title = stringResource(R.string.tool_html_packager),
                description = stringResource(R.string.tool_html_packager_desc),
                icon = Icons.Rounded.Android,
                onClick = onHtmlPackagerSelected,
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                iconBackgroundColor = MaterialTheme.colorScheme.background
            )
        }

        // FAB
        FloatingActionButton(
            onClick = onNavigateToChat,
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(bottom = 100.dp, end = 16.dp)
                .size(56.dp)
        ) {
            Icon(Icons.Rounded.Chat, contentDescription = "Chat")
        }
    }
}

@Composable
fun HomeCard(
    title: String,
    description: String,
    icon: ImageVector,
    onClick: () -> Unit,
    containerColor: Color,
    contentColor: Color,
    iconBackgroundColor: Color,
    showArrow: Boolean = false
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(targetValue = if (isPressed) 0.98f else 1f, label = "scale")

    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(28.dp),
        interactionSource = interactionSource,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .scale(scale)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                // Icon Box
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .background(iconBackgroundColor, RoundedCornerShape(16.dp))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = contentColor
                    )
                }

                if (showArrow) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowForward,
                        contentDescription = null,
                        modifier = Modifier.padding(top = 12.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge.copy(
                    fontFamily = FontFamily.Serif,
                    fontSize = 20.sp
                ),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 14.sp,
                    lineHeight = 20.sp // 1.4 * 14
                ),
                color = contentColor.copy(alpha = 0.8f)
            )
        }
    }
}
