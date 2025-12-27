package com.ai.assistance.operit.ui.features.chat.components

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Add
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

    Surface(color = surfaceColor) {
        Column {
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
                    onInsert = onInsertAttachment
                )
            }

            // Main input row
            MainInputRow(
                userMessage = userMessage.text,
                onUserMessageChange = { onUserMessageChange(TextFieldValue(it)) },
                isProcessing = isProcessing,
                canSendMessage = canSendMessage,
                isOverTokenLimit = isOverTokenLimit,
                isWorkspaceOpen = isWorkspaceOpen,
                isEnabled = !isProcessing || allowTextInputWhileProcessing,
                showAttachmentPanel = showAttachmentPanel,
                onToggleAttachmentPanel = { showAttachmentPanel = !showAttachmentPanel },
                onSendClick = {
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
                        else -> {
                            actualViewModel.onFloatingButtonClick(
                                FloatingMode.FULLSCREEN,
                                voicePermissionLauncher,
                                colorScheme,
                                typography
                            )
                        }
                    }
                },
                onFullscreenRequest = { showFullscreenInput = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = AppSpacing.medium)
                    .padding(top = AppSpacing.small, bottom = AppSpacing.small)
            )

            // Token limit warning
            if (isOverTokenLimit && canSendMessage) {
                Text(
                    text = context.getString(
                        R.string.token_limit_exceeded_message,
                        userMessageTokens + currentWindowSize,
                        maxTokens
                    ),
                    color = MaterialTheme.colorScheme.error,
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = AppSpacing.medium)
                        .padding(bottom = AppSpacing.nano)
                )
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
}

/**
 * Main input row with text field and action buttons
 */
@Composable
private fun MainInputRow(
    userMessage: String,
    onUserMessageChange: (String) -> Unit,
    isProcessing: Boolean,
    canSendMessage: Boolean,
    isOverTokenLimit: Boolean,
    isWorkspaceOpen: Boolean,
    isEnabled: Boolean,
    showAttachmentPanel: Boolean,
    onToggleAttachmentPanel: () -> Unit,
    onSendClick: () -> Unit,
    onFullscreenRequest: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val modernTextStyle = TextStyle(fontSize = 13.sp, lineHeight = 16.sp)

    Row(
        modifier = modifier.wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Text input
        OutlinedTextField(
            value = userMessage,
            onValueChange = onUserMessageChange,
            placeholder = {
                Text(
                    if (isWorkspaceOpen)
                        context.getString(R.string.input_question_with_workspace)
                    else
                        context.getString(R.string.input_question_hint),
                    style = modernTextStyle
                )
            },
            modifier = Modifier
                .weight(1f)
                .heightIn(min = AppSizes.inputMinHeightSmall),
            textStyle = modernTextStyle,
            maxLines = 5,
            minLines = 1,
            singleLine = false,
            keyboardOptions = androidx.compose.foundation.text.KeyboardOptions(
                imeAction = androidx.compose.ui.text.input.ImeAction.Default
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline
            ),
            shape = RoundedCornerShape(AppSizes.cornerRadiusLarge),
            trailingIcon = {
                if (userMessage.contains("\n")) {
                    IconButton(onClick = onFullscreenRequest) {
                        Icon(
                            imageVector = androidx.compose.material.icons.Icons.Default.Fullscreen,
                            contentDescription = "Fullscreen input",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            },
            enabled = isEnabled
        )

        Spacer(Modifier.width(AppSpacing.small))

        // Attachment button
        AttachmentButton(
            isActive = showAttachmentPanel,
            isEnabled = !isProcessing,
            onClick = onToggleAttachmentPanel
        )

        Spacer(Modifier.width(AppSpacing.small))

        // Send button
        SendButton(
            isProcessing = isProcessing,
            canSend = canSendMessage,
            isOverTokenLimit = isOverTokenLimit,
            isEnabled = true,
            onClick = onSendClick
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
    onInsert: (AttachmentInfo) -> Unit
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = AppSpacing.medium, vertical = AppSpacing.nano),
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
