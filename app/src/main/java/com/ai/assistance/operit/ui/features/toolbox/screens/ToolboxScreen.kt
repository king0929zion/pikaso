package com.ai.assistance.operit.ui.features.toolbox.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ai.assistance.operit.R
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

data class Tool(
    val name: String,
    val icon: ImageVector,
    val description: String,
    val onClick: () -> Unit
)

/**
 * Simplified Toolbox Screen - 只保留核心工具
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolboxScreen(
    navController: NavController,
    onProcessLimitRemoverSelected: () -> Unit,
    onHtmlPackagerSelected: () -> Unit,
    onAutoGlmOneClickSelected: () -> Unit,
    onAutoGlmToolSelected: () -> Unit
) {
    val context = LocalContext.current

    val tools = listOf(
        Tool(
            name = context.getString(R.string.tool_process_limit_remover),
            icon = Icons.Default.LockOpen,
            description = context.getString(R.string.tool_process_limit_remover_desc),
            onClick = onProcessLimitRemoverSelected
        ),
        Tool(
            name = context.getString(R.string.tool_html_packager),
            icon = Icons.Default.Html,
            description = context.getString(R.string.tool_html_packager_desc),
            onClick = onHtmlPackagerSelected
        ),
        Tool(
            name = context.getString(R.string.tool_autoglm_one_click),
            icon = Icons.Default.AutoMode,
            description = context.getString(R.string.tool_autoglm_one_click_desc),
            onClick = onAutoGlmOneClickSelected
        ),
        Tool(
            name = context.getString(R.string.tool_autoglm_tool),
            icon = Icons.Default.Settings,
            description = context.getString(R.string.tool_autoglm_tool_desc),
            onClick = onAutoGlmToolSelected
        )
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Header
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(AppSpacing.medium)
        ) {
            Text(
                text = context.getString(R.string.toolbox),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = context.getString(R.string.toolbox_description),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Spacer(modifier = Modifier.height(AppSpacing.small))

        // Tools grid
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 150.dp),
            contentPadding = PaddingValues(AppSpacing.medium),
            horizontalArrangement = Arrangement.spacedBy(AppSpacing.medium),
            verticalArrangement = Arrangement.spacedBy(AppSpacing.medium),
            modifier = Modifier.weight(1f)
        ) {
            items(tools) { tool ->
                ToolCard(tool = tool)
            }
        }
    }
}

@Composable
fun ToolCard(tool: Tool) {
    Card(
        onClick = tool.onClick,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 120.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
    ) {
        Column(
            modifier = Modifier
                .padding(AppSpacing.medium),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(AppSpacing.small)
        ) {
            Icon(
                imageVector = tool.icon,
                contentDescription = tool.name,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(AppSizes.iconLarge)
            )

            Text(
                text = tool.name,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                maxLines = 1
            )

            Text(
                text = tool.description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 2
            )
        }
    }
}
