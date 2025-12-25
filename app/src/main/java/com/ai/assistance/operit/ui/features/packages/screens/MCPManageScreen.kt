package com.ai.assistance.operit.ui.features.packages.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.R
import com.ai.assistance.operit.ui.components.CustomScaffold

/**
 * MCP管理屏幕（简化版）
 * GitHub市场功能已移除
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MCPManageScreen(
    onNavigateBack: () -> Unit,
    onNavigateToEdit: (((Any) -> Unit)?)? = null,
    onNavigateToPublish: () -> Unit = {},
    viewModel: Any? = null
) {
    CustomScaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.screen_title_mcp_manage)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = "GitHub Market 功能已移除",
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "本地MCP部署功能已被移除。\n现在只支持远程MCP插件（HTTP/SSE连接）。",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}
