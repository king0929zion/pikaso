package com.ai.assistance.operit.ui.features.toolbox.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Folder
import androidx.compose.material.icons.rounded.Security
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
import com.ai.assistance.operit.ui.components.CustomScaffold
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

// Tool categories
enum class ToolCategory {
    ALL,
    FILE_MANAGEMENT,
    DEVELOPMENT,
    SYSTEM;

    fun getDisplayName(context: android.content.Context): String {
        return when (this) {
            ALL -> context.getString(R.string.tool_category_all)
            FILE_MANAGEMENT -> context.getString(R.string.tool_category_file_management)
            DEVELOPMENT -> context.getString(R.string.tool_category_development)
            SYSTEM -> context.getString(R.string.tool_category_system)
        }
    }
}

data class Tool(
    val name: String,
    val icon: ImageVector,
    val description: String,
    val category: ToolCategory,
    val onClick: () -> Unit
)

/**
 * Simplified Toolbox Screen
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolboxScreen(
        navController: NavController,
        onFileManagerSelected: () -> Unit,
        onAppPermissionsSelected: () -> Unit,
        onUIDebuggerSelected: () -> Unit,
        onFFmpegToolboxSelected: () -> Unit,
        onShellExecutorSelected: () -> Unit,
        onLogcatSelected: () -> Unit,
        onTextToSpeechSelected: () -> Unit,
        onSpeechToTextSelected: () -> Unit,
        onToolTesterSelected: () -> Unit,
        onAgreementSelected: () -> Unit,
        onDefaultAssistantGuideSelected: () -> Unit,
        onProcessLimitRemoverSelected: () -> Unit,
        onHtmlPackagerSelected: () -> Unit,
        onAutoGlmOneClickSelected: () -> Unit,
        onAutoGlmToolSelected: () -> Unit
) {
    var selectedCategory by remember { mutableStateOf(ToolCategory.ALL) }
    val context = LocalContext.current

    val tools = listOf(
        Tool(
            name = context.getString(R.string.tool_file_manager),
            icon = Icons.Rounded.Folder,
            description = context.getString(R.string.tool_file_manager_desc),
            category = ToolCategory.FILE_MANAGEMENT,
            onClick = onFileManagerSelected
        ),
        Tool(
            name = context.getString(R.string.tool_permission_manager),
            icon = Icons.Rounded.Security,
            description = context.getString(R.string.tool_permission_manager_desc),
            category = ToolCategory.SYSTEM,
            onClick = onAppPermissionsSelected
        ),
        Tool(
            name = context.getString(R.string.tool_ui_debugger),
            icon = Icons.Default.DeviceHub,
            description = context.getString(R.string.tool_ui_debugger_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onUIDebuggerSelected
        ),
        Tool(
            name = context.getString(R.string.tool_ffmpeg_toolbox),
            icon = Icons.Default.VideoSettings,
            description = context.getString(R.string.tool_ffmpeg_toolbox_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onFFmpegToolboxSelected
        ),
        Tool(
            name = context.getString(R.string.tool_shell_executor),
            icon = Icons.Default.Code,
            description = context.getString(R.string.tool_shell_executor_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onShellExecutorSelected
        ),
        Tool(
            name = context.getString(R.string.tool_log_viewer),
            icon = Icons.Default.DataObject,
            description = context.getString(R.string.tool_log_viewer_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onLogcatSelected
        ),
        Tool(
            name = context.getString(R.string.tool_tts),
            icon = Icons.Default.RecordVoiceOver,
            description = context.getString(R.string.tool_tts_desc),
            category = ToolCategory.SYSTEM,
            onClick = onTextToSpeechSelected
        ),
        Tool(
            name = context.getString(R.string.tool_speech_recognition),
            icon = Icons.Default.Mic,
            description = context.getString(R.string.tool_speech_recognition_desc),
            category = ToolCategory.SYSTEM,
            onClick = onSpeechToTextSelected
        ),
        Tool(
            name = context.getString(R.string.tool_test_center),
            icon = Icons.Default.Build,
            description = context.getString(R.string.tool_test_center_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onToolTesterSelected
        ),
        Tool(
            name = context.getString(R.string.tool_process_limit_remover),
            icon = Icons.Default.LockOpen,
            description = context.getString(R.string.tool_process_limit_remover_desc),
            category = ToolCategory.SYSTEM,
            onClick = onProcessLimitRemoverSelected
        ),
        Tool(
            name = context.getString(R.string.tool_html_packager),
            icon = Icons.Default.Html,
            description = context.getString(R.string.tool_html_packager_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onHtmlPackagerSelected
        ),
        Tool(
            name = context.getString(R.string.tool_autoglm_one_click),
            icon = Icons.Default.AutoMode,
            description = context.getString(R.string.tool_autoglm_one_click_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onAutoGlmOneClickSelected
        ),
        Tool(
            name = context.getString(R.string.tool_autoglm_tool),
            icon = Icons.Default.AutoMode,
            description = context.getString(R.string.tool_autoglm_tool_desc),
            category = ToolCategory.DEVELOPMENT,
            onClick = onAutoGlmToolSelected
        )
    )

    val filteredTools = if (selectedCategory == ToolCategory.ALL) {
        tools
    } else {
        tools.filter { it.category == selectedCategory }
    }

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

        // Category selector
        CategoryFilterRow(
            selectedCategory = selectedCategory,
            onCategorySelected = { selectedCategory = it }
        )

        // Tools grid
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 100.dp),
            contentPadding = PaddingValues(AppSpacing.medium),
            horizontalArrangement = Arrangement.spacedBy(AppSpacing.small),
            verticalArrangement = Arrangement.spacedBy(AppSpacing.small),
            modifier = Modifier.weight(1f)
        ) {
            items(filteredTools) { tool ->
                ToolCard(tool = tool)
            }
        }
    }
}

@Composable
private fun CategoryFilterRow(
    selectedCategory: ToolCategory,
    onCategorySelected: (ToolCategory) -> Unit
) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = AppSpacing.medium)
            .horizontalScroll(androidx.compose.foundation.rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(AppSpacing.nano)
    ) {
        ToolCategory.values().forEach { category ->
            FilterChip(
                selected = selectedCategory == category,
                onClick = { onCategorySelected(category) },
                label = { Text(category.getDisplayName(context)) },
                modifier = Modifier.height(AppSizes.buttonMinHeightSmall)
            )
        }
    }
}

@Composable
fun ToolCard(tool: Tool) {
    Card(
        onClick = tool.onClick,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 100.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
    ) {
        Column(
            modifier = Modifier
                .padding(AppSpacing.small),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(AppSpacing.nano)
        ) {
            Icon(
                imageVector = tool.icon,
                contentDescription = tool.name,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(AppSizes.iconLarge)
            )

            Text(
                text = tool.name,
                style = MaterialTheme.typography.bodySmall,
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

// Tool screen wrappers
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FileManagerToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            com.ai.assistance.operit.ui.features.toolbox.screens.filemanager.FileManagerScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppPermissionsToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            com.ai.assistance.operit.ui.features.toolbox.screens.apppermissions.AppPermissionsScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UIDebuggerToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            com.ai.assistance.operit.ui.features.toolbox.screens.uidebugger.UIDebuggerScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FFmpegToolboxToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            com.ai.assistance.operit.ui.features.toolbox.screens.ffmpegtoolbox.FFmpegToolboxScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShellExecutorToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            com.ai.assistance.operit.ui.features.toolbox.screens.shellexecutor.ShellExecutorScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogcatToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            com.ai.assistance.operit.ui.features.toolbox.screens.logcat.LogcatScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolTesterToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            com.ai.assistance.operit.ui.features.toolbox.screens.tooltester.ToolTesterScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultAssistantGuideToolScreen(navController: NavController) {
    com.ai.assistance.operit.ui.features.toolbox.screens.defaultassistant.DefaultAssistantGuideScreen(navController)
}
