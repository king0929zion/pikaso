package com.ai.assistance.operit.ui.features.toolbox.screens.autoglm

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ai.assistance.operit.R
import com.ai.assistance.operit.ui.theme.AppColors
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * AutoGLM Tool Screen - Anthropic-inspired design
 *
 * Features:
 * - Clean, minimalist interface
 * - Warm color palette
 * - Smooth animations
 * - Clear task input and execution flow
 */
@Composable
fun AutoGlmToolScreen(
    viewModel: AutoGlmViewModel = viewModel(factory = AutoGlmViewModelFactory(LocalContext.current))
) {
    val uiState by viewModel.uiState.collectAsState()

    AutoGlmToolContent(
        uiState = uiState,
        onTaskChange = viewModel::setTask,
        onExecute = viewModel::executeTask,
        onCancel = viewModel::cancelTask,
        onClearTask = viewModel::clearTask
    )
}

@Composable
private fun AutoGlmToolContent(
    uiState: AutoGlmUiState,
    onTaskChange: (String) -> Unit,
    onExecute: (String) -> Unit,
    onCancel: () -> Unit,
    onClearTask: () -> Unit
) {
    val logScrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(AppSpacing.screenPadding)
    ) {
        // Header Section
        Text(
            text = stringResource(R.string.autoglm_title),
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(AppSpacing.small))

        Text(
            text = stringResource(R.string.autoglm_description),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(AppSpacing.large))

        // Task Input Section
        TaskInputSection(
            task = uiState.task,
            onTaskChange = onTaskChange,
            onClear = onClearTask,
            isLoading = uiState.isLoading
        )

        Spacer(modifier = Modifier.height(AppSpacing.medium))

        // Action Button
        ActionButton(
            isLoading = uiState.isLoading,
            hasTask = uiState.task.isNotBlank(),
            onExecute = { onExecute(uiState.task) },
            onCancel = onCancel
        )

        Spacer(modifier = Modifier.height(AppSpacing.large))

        // Status Section
        if (uiState.isLoading || uiState.status != null) {
            StatusSection(
                status = uiState.status,
                isLoading = uiState.isLoading,
                progress = uiState.progress
            )

            Spacer(modifier = Modifier.height(AppSpacing.medium))
        }

        // Execution Log Section
        ExecutionLogSection(
            log = uiState.log,
            logScrollState = logScrollState,
            isExpanded = uiState.isLogExpanded
        )
    }
}

@Composable
private fun TaskInputSection(
    task: String,
    onTaskChange: (String) -> Unit,
    onClear: () -> Unit,
    isLoading: Boolean
) {
    OutlinedTextField(
        value = task,
        onValueChange = onTaskChange,
        label = { Text(stringResource(R.string.task_input_label)) },
        placeholder = { Text(stringResource(R.string.task_input_placeholder)) },
        modifier = Modifier.fillMaxWidth(),
        minLines = 3,
        maxLines = 6,
        enabled = !isLoading,
        trailingIcon = {
            if (task.isNotEmpty()) {
                IconButton(onClick = onClear, enabled = !isLoading) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = stringResource(R.string.clear_task),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        },
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            unfocusedBorderColor = MaterialTheme.colorScheme.outline,
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface
        )
    )
}

@Composable
private fun ActionButton(
    isLoading: Boolean,
    hasTask: Boolean,
    onExecute: () -> Unit,
    onCancel: () -> Unit
) {
    Button(
        onClick = {
            if (isLoading) {
                onCancel()
            } else {
                onExecute()
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(AppSizes.buttonMinHeight),
        enabled = hasTask || isLoading,
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isLoading) {
                MaterialTheme.colorScheme.error
            } else {
                MaterialTheme.colorScheme.primary
            },
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            disabledContentColor = MaterialTheme.colorScheme.onSurfaceVariant
        )
    ) {
        Icon(
            imageVector = if (isLoading) Icons.Default.Close else Icons.Default.PlayArrow,
            contentDescription = null,
            modifier = Modifier.size(AppSizes.iconNormal)
        )
        Spacer(modifier = Modifier.width(AppSpacing.small))
        Text(
            text = if (isLoading) {
                stringResource(R.string.cancel_execution)
            } else {
                stringResource(R.string.execute_task)
            },
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@Composable
private fun StatusSection(
    status: String?,
    isLoading: Boolean,
    progress: Int
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(AppSpacing.medium)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(AppSizes.iconNormal),
                        strokeWidth = 2.dp,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(AppSpacing.small))
                }

                AnimatedContent(
                    targetState = status ?: stringResource(R.string.preparing),
                    transitionSpec = {
                        fadeIn() togetherWith fadeOut()
                    },
                    label = "status"
                ) { statusText ->
                    Text(
                        text = statusText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            if (progress > 0 && progress < 100) {
                Spacer(modifier = Modifier.height(AppSpacing.small))
                LinearProgressIndicator(
                    progress = { progress / 100f },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .clip(RoundedCornerShape(2.dp)),
                    color = MaterialTheme.colorScheme.primary,
                    trackColor = MaterialTheme.colorScheme.surfaceVariant
                )
                Spacer(modifier = Modifier.height(AppSpacing.nano))
                Text(
                    text = "$progress%",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun ExecutionLogSection(
    log: String,
    logScrollState: ScrollState,
    isExpanded: Boolean
) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.execution_log),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Medium
            )

            TextButton(
                onClick = { /* Toggle expansion */ }
            ) {
                Icon(
                    imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                    contentDescription = null,
                    modifier = Modifier.size(AppSizes.iconMedium)
                )
                Spacer(modifier = Modifier.width(AppSpacing.nano))
                Text(text = if (isExpanded) stringResource(R.string.collapse) else stringResource(R.string.expand))
            }
        }

        Spacer(modifier = Modifier.height(AppSpacing.small))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(if (isExpanded) 300.dp else 200.dp)
                .clip(RoundedCornerShape(AppSizes.cornerRadiusMedium))
                .background(MaterialTheme.colorScheme.surfaceVariant)
        ) {
            LaunchedEffect(log) {
                if (logScrollState.maxValue > 0) {
                    logScrollState.animateScrollTo(logScrollState.maxValue)
                }
            }

            Text(
                text = log.ifEmpty { stringResource(R.string.no_logs_yet) },
                modifier = Modifier
                    .fillMaxSize()
                    .padding(AppSpacing.medium)
                    .verticalScroll(logScrollState),
                style = MaterialTheme.typography.bodySmall.copy(
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
                ),
                color = if (log.isEmpty()) {
                    MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
                } else {
                    MaterialTheme.colorScheme.onSurfaceVariant
                }
            )
        }
    }
}
