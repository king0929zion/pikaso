package com.ai.assistance.operit.ui.features.chat.components

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ai.assistance.operit.R
import com.ai.assistance.operit.data.model.AttachmentInfo
import com.ai.assistance.operit.data.model.ChatMessage
import com.ai.assistance.operit.data.model.InputProcessingState
import com.ai.assistance.operit.ui.floating.FloatingMode
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
import com.ai.assistance.operit.util.ChatUtils
import android.net.Uri
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Fullscreen
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Close
import androidx.compose.foundation.shape.RoundedCornerShape

/**
 * Simplified chat input section component
 */
@Composable
fun ChatInputSection(
    actualViewModel: com.ai.assistance.operit.ui.features.chat.viewmodel.ChatViewModel,
    userMessage: TextFieldValue,
    onUserMessageChange: (TextFieldValue) -> Unit,
    onSendMessage: () -> Unit,
    onCancelMessage: () -> Unit,
    isLoading: Boolean,
    inputState: InputProcessingState = InputProcessingState.Idle,
    allowTextInputWhileProcessing: Boolean = false,
    onAttachmentRequest: (String) -> Unit = {},
    attachments: List<AttachmentInfo> = emptyList(),
    onRemoveAttachment: (String) -> Unit = {},
    onInsertAttachment: (AttachmentInfo) -> Unit = {},
    onAttachScreenContent: () -> Unit = {},
    onAttachNotifications: () -> Unit = {},
    onAttachLocation: () -> Unit = {},
    onAttachMemory: () -> Unit = {},
    onTakePhoto: (Uri) -> Unit,
    hasBackgroundImage: Boolean = false,
    chatInputTransparent: Boolean = false,
    modifier: Modifier = Modifier,
    externalAttachmentPanelState: Boolean? = null,
    onAttachmentPanelStateChange: ((Boolean) -> Unit)? = null,
    showInputProcessingStatus: Boolean = true,
    enableTools: Boolean = true,
    replyToMessage: ChatMessage? = null,
    onClearReply: (() -> Unit)? = null,
    isWorkspaceOpen: Boolean = false
) {
    val context = LocalContext.current
    val colorScheme = MaterialTheme.colorScheme
    val typography = MaterialTheme.typography

    // Token limit calculation
    val currentWindowSize by actualViewModel.currentWindowSize.collectAsState()
    val maxWindowSizeInK by actualViewModel.maxWindowSizeInK.collectAsState()
    val maxTokens = (maxWindowSizeInK * 1024).toInt()
    val userMessageTokens = remember(userMessage.text) { ChatUtils.estimateTokenCount(userMessage.text) }

    val isOverTokenLimit = maxTokens > 0 && (userMessageTokens + currentWindowSize) > maxTokens
    val canSendMessage = userMessage.text.isNotBlank() || attachments.isNotEmpty()
    val isProcessing = isLoading

    // States
    var showTokenLimitDialog by remember { mutableStateOf(false) }
    var showFullscreenInput by remember { mutableStateOf(false) }
    var showAttachmentPanel by remember { mutableStateOf(externalAttachmentPanelState ?: false) }

    // Sync external panel state
    LaunchedEffect(externalAttachmentPanelState) {
        externalAttachmentPanelState?.let { showAttachmentPanel = it }
    }
    LaunchedEffect(showAttachmentPanel) {
        onAttachmentPanelStateChange?.invoke(showAttachmentPanel)
    }

    // Voice permission launcher
    val voicePermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            actualViewModel.launchFloatingModeIn(FloatingMode.FULLSCREEN, colorScheme, typography)
        } else {
            actualViewModel.showToast(context.getString(R.string.microphone_permission_denied_toast))
        }
    }

    // Token limit dialog
    if (showTokenLimitDialog) {
        AlertDialog(
            onDismissRequest = { showTokenLimitDialog = false },
            title = { Text(context.getString(R.string.token_limit_warning)) },
            text = { Text(context.getString(R.string.token_limit_warning_message)) },
            confirmButton = {
                TextButton(onClick = {
                    showTokenLimitDialog = false
                    onSendMessage()
                }) { Text(context.getString(R.string.continue_send)) }
            },
            dismissButton = {
                TextButton(onClick = { showTokenLimitDialog = false }) {
                    Text(context.getString(R.string.cancel))
                }
            }
        )
    }

    val surfaceColor = when {
        chatInputTransparent -> MaterialTheme.colorScheme.surface.copy(alpha = 0f)
        hasBackgroundImage -> MaterialTheme.colorScheme.surface.copy(alpha = 0.85f)
        else -> MaterialTheme.colorScheme.surface
    }

    Column(modifier = modifier.fillMaxWidth()) {
        Box(
            modifier =
                Modifier.fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            colors =
                                listOf(
                                    Color.Transparent,
                                    MaterialTheme.colorScheme.background
                                )
                        )
                    )
                    .padding(AppSpacing.medium),
            contentAlignment = Alignment.BottomCenter
        ) {
            Surface(
                modifier = Modifier.fillMaxWidth().widthIn(max = 800.dp),
                color = surfaceColor,
                shape = RoundedCornerShape(24.dp),
                shadowElevation = 8.dp,
                tonalElevation = 0.dp,
                border =
                    androidx.compose.foundation.BorderStroke(
                        AppSizes.strokeThin,
                        MaterialTheme.colorScheme.onSurface.copy(alpha = 0.05f)
                    )
            ) {
                Column(
                    modifier =
                        Modifier.padding(
                            start = 12.dp,
                            end = 12.dp,
                            top = 12.dp,
                            bottom = 8.dp
                        ),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Reply preview
                    replyToMessage?.let { message ->
                        ReplyPreview(
                            replyToMessage = message,
                            onClearReply = { onClearReply?.invoke() }
                        )
                    }

                    // Input processing indicator
                    if (showInputProcessingStatus) {
                        InputProcessingIndicator(inputState = inputState)
                    }

                    // Attachment chips
                    if (attachments.isNotEmpty()) {
                        AttachmentChipsRow(
                            attachments = attachments,
                            onRemove = onRemoveAttachment,
                            onInsert = onInsertAttachment,
                            horizontalPadding = AppSpacing.none
                        )
                    }

                    OutlinedTextField(
                        value = userMessage,
                        onValueChange = onUserMessageChange,
                        placeholder = {
                            Text(
                                if (isWorkspaceOpen)
                                    context.getString(R.string.input_question_with_workspace)
                                else context.getString(R.string.input_question_hint),
                                style =
                                    TextStyle(
                                        fontSize = 16.sp,
                                        lineHeight = 24.sp
                                    )
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        textStyle = TextStyle(fontSize = 16.sp, lineHeight = 24.sp),
                        maxLines = 6,
                        minLines = 1,
                        singleLine = false,
                        keyboardOptions =
                            androidx.compose.foundation.text.KeyboardOptions(
                                imeAction =
                                    androidx.compose.ui.text.input.ImeAction.Default
                            ),
                        colors =
                            OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.Transparent,
                                unfocusedBorderColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent,
                                disabledBorderColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            ),
                        shape = RoundedCornerShape(0.dp),
                        trailingIcon = {
                            if (userMessage.text.contains("\n")) {
                                IconButton(onClick = { showFullscreenInput = true }) {
                                    Icon(
                                        imageVector =
                                            androidx.compose.material.icons.Icons.Default
                                                .Fullscreen,
                                        contentDescription = "Fullscreen input",
                                        tint =
                                            MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        },
                        enabled = !isProcessing || allowTextInputWhileProcessing
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            ToolbarIconButton(
                                icon = Icons.Default.Add,
                                contentDescription =
                                    context.getString(R.string.add_attachment),
                                isEnabled = !isProcessing,
                                onClick = {
                                    showAttachmentPanel = !showAttachmentPanel
                                }
                            )

                            ToolbarIconButton(
                                icon = Icons.Default.Build,
                                contentDescription =
                                    context.getString(R.string.nav_toolbox),
                                isEnabled = true,
                                onClick = {
                                    actualViewModel.toggleTools()
                                    actualViewModel.showToast(
                                        if (enableTools) "工具已关闭" else "工具已开启"
                                    )
                                }
                            )
                        }

                        SendButton(
                            isProcessing = isProcessing,
                            canSend = canSendMessage,
                            isOverTokenLimit = isOverTokenLimit,
                            isEnabled = isProcessing || canSendMessage,
                            onClick = {
                                when {
                                    isProcessing -> onCancelMessage()
                                    canSendMessage -> {
                                        if (isOverTokenLimit) {
                                            showTokenLimitDialog = true
                                        } else {
                                            onSendMessage()
                                            showAttachmentPanel = false
                                        }
                                    }
                                }
                            }
                        )
                    }

                    // Token limit warning
                    if (isOverTokenLimit && canSendMessage) {
                        Text(
                            text =
                                context.getString(
                                    R.string.token_limit_exceeded_message,
                                    userMessageTokens + currentWindowSize,
                                    maxTokens
                                ),
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.labelSmall,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }

        // Attachment selector panel
        AttachmentSelectorPanel(
            visible = showAttachmentPanel,
            onAttachImage = { filePath -> onAttachmentRequest(filePath) },
            onAttachFile = { filePath -> onAttachmentRequest(filePath) },
            onAttachScreenContent = onAttachScreenContent,
            onAttachNotifications = onAttachNotifications,
            onAttachLocation = onAttachLocation,
            onAttachMemory = onAttachMemory,
            onTakePhoto = onTakePhoto,
            userQuery = userMessage.text,
            onDismiss = { showAttachmentPanel = false }
        )

        // Fullscreen input dialog
        if (showFullscreenInput) {
            FullscreenInputDialog(
                value = userMessage,
                onValueChange = onUserMessageChange,
                onDismiss = { showFullscreenInput = false },
                onConfirm = { showFullscreenInput = false }
            )
        }
    }
}

@Composable
private fun ToolbarIconButton(
    icon: ImageVector,
    contentDescription: String,
    isEnabled: Boolean,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
        enabled = isEnabled,
        modifier = Modifier.size(36.dp),
        colors =
            IconButtonDefaults.iconButtonColors(
                containerColor = Color.Transparent,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                disabledContentColor =
                    MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.38f),
                disabledContainerColor = Color.Transparent
            )
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(20.dp)
        )
    }
}

/**
 * Horizontal row of attachment chips
 */
@Composable
private fun AttachmentChipsRow(
    attachments: List<AttachmentInfo>,
    onRemove: (String) -> Unit,
    onInsert: (AttachmentInfo) -> Unit,
    horizontalPadding: Dp = AppSpacing.medium
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalPadding, vertical = AppSpacing.nano),
        horizontalArrangement = Arrangement.spacedBy(AppSpacing.nano)
    ) {
        items(attachments) { attachment ->
            AttachmentChip(
                attachmentInfo = attachment,
                onRemove = { onRemove(attachment.filePath) },
                onInsert = { onInsert(attachment) }
            )
        }
    }
}

/**
 * Individual attachment chip with icon and remove button
 */
@Composable
fun AttachmentChip(
    attachmentInfo: AttachmentInfo,
    onRemove: () -> Unit,
    onInsert: () -> Unit
) {
    val context = LocalContext.current
    val isImage = attachmentInfo.mimeType.startsWith("image/")
    val icon: ImageVector = if (isImage) Icons.Default.Image else Icons.Default.Description

    Surface(
        modifier = Modifier
            .height(AppSizes.buttonMinHeightSmall - 14.dp)
            .border(
                width = AppSizes.strokeThin,
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
                shape = RoundedCornerShape(AppSizes.cornerRadiusLarge)
            ),
        shape = RoundedCornerShape(AppSizes.cornerRadiusLarge),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = AppSpacing.nano, vertical = AppSpacing.nano),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(AppSpacing.small + 2.dp),
                tint = MaterialTheme.colorScheme.primary
            )

            Spacer(Modifier.width(AppSpacing.nano))

            Text(
                text = attachmentInfo.fileName,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.widthIn(max = AppSizes.messageBubbleMinWidth - 40.dp)
            )

            Spacer(Modifier.width(AppSpacing.nano))

            IconButton(
                onClick = onInsert,
                modifier = Modifier.size(AppSpacing.small + 2.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = context.getString(R.string.insert_attachment),
                    modifier = Modifier.size(AppSpacing.extraSmall + 2.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            Spacer(Modifier.width(AppSpacing.nano))

            IconButton(
                onClick = onRemove,
                modifier = Modifier.size(AppSpacing.small + 2.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = context.getString(R.string.remove_attachment),
                    modifier = Modifier.size(AppSpacing.extraSmall + 2.dp),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun Spacer(modifier: Modifier = Modifier) {
    androidx.compose.foundation.layout.Spacer(modifier = modifier)
}
