package com.ai.assistance.operit.ui.features.chat.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.outlined.Code
import androidx.compose.material.icons.outlined.Tag
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.ai.assistance.operit.R
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * 消息编辑器组件，用于编辑包含XML标签的消息
 */
data class ParsedMessagePart(val type: PartType, val content: String, val tag: String? = null, val attributes: String? = null)
enum class PartType { TEXT, XML }

fun parseMessageContentForEditor(content: String): List<ParsedMessagePart> {
    val parts = mutableListOf<ParsedMessagePart>()
    // 支持带属性的标签
    val regex = "<([a-zA-Z0-9_-]+)([^>]*)>([\\s\\S]*?)</\\1>".toRegex(RegexOption.DOT_MATCHES_ALL)
    var lastIndex = 0

    regex.findAll(content).forEach { matchResult ->
        val startIndex = matchResult.range.first
        if (startIndex > lastIndex) {
            val textPart = content.substring(lastIndex, startIndex)
            if (textPart.isNotBlank()) {
                parts.add(ParsedMessagePart(PartType.TEXT, textPart, null, null))
            }
        }
        val tag = matchResult.groupValues[1]
        val attributes = matchResult.groupValues[2]
        val tagContent = matchResult.groupValues[3]
        parts.add(ParsedMessagePart(PartType.XML, tagContent, tag, attributes))
        lastIndex = matchResult.range.last + 1
    }

    if (lastIndex < content.length) {
        val trailingText = content.substring(lastIndex)
        if (trailingText.isNotBlank()) {
            parts.add(ParsedMessagePart(PartType.TEXT, trailingText, null, null))
        }
    }
    return parts
}

fun recomposeMessageFromParts(parts: List<ParsedMessagePart>): String {
    return parts.joinToString(separator = "") { part ->
        if (part.type == PartType.TEXT) {
            part.content
        } else {
            "<${part.tag}${part.attributes ?: ""}>${part.content}</${part.tag}>"
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun MessageEditor(
    editingMessageContent: MutableState<String>,
    onCancel: () -> Unit,
    onSave: () -> Unit,
    onResend: () -> Unit,
    showResendButton: Boolean
) {
    val context = LocalContext.current
    val initialParts = remember(editingMessageContent.value) {
        parseMessageContentForEditor(editingMessageContent.value)
    }
    var partsState by remember { mutableStateOf(initialParts) }
    var partToEdit by remember { mutableStateOf<Pair<Int, ParsedMessagePart>?>(null) }
    var showCreateTagDialog by remember { mutableStateOf(false) }
    var isRawEditMode by remember { mutableStateOf(false) }

    LaunchedEffect(partsState) {
        if (!isRawEditMode) {
            editingMessageContent.value = recomposeMessageFromParts(partsState)
        }
    }

    LaunchedEffect(isRawEditMode) {
        if (!isRawEditMode) {
            // Just switched from raw to visual editor, re-parse the content
            partsState = parseMessageContentForEditor(editingMessageContent.value)
        }
    }

    Dialog(
        onDismissRequest = onCancel,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .widthIn(max = AppSizes.floatingMaxWidth * 13)
                .fillMaxWidth(0.9f)
                .shadow(elevation = AppSizes.elevationSmall * 4, shape = RoundedCornerShape(AppSizes.floatingBallSize)),
            shape = RoundedCornerShape(AppSizes.floatingBallSize),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = AppSizes.elevationSmall / 2
        ) {
            Column {
                // Header
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f))
                        .padding(horizontal = AppSpacing.medium, vertical = AppSpacing.extraSmall),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        if (showResendButton) context.getString(R.string.edit_message) else context.getString(R.string.modify_memory),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        TextButton(onClick = { isRawEditMode = !isRawEditMode }) {
                            Text(if (isRawEditMode) context.getString(R.string.visual) else context.getString(R.string.plain_text))
                        }

                        IconButton(
                            onClick = onCancel,
                            modifier = Modifier
                                .size(AppSpacing.medium + AppSizes.avatarSmall)
                                .clip(CircleShape)
                        ) {
                            Icon(
                                Icons.Default.Close,
                                contentDescription = context.getString(R.string.cancel),
                                tint = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }

                // Content
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, fill = false)
                        .heightIn(max = AppSizes.floatingMaxWidth * 28)
                ) {
                    if (isRawEditMode) {
                        OutlinedTextField(
                            value = editingMessageContent.value,
                            onValueChange = { editingMessageContent.value = it },
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = AppSpacing.medium, vertical = AppSizes.strokeMedium),
                            label = { Text(context.getString(R.string.plain_text_content)) },
                            textStyle = MaterialTheme.typography.bodyMedium.copy(
                                fontFamily = FontFamily.Monospace
                            ),
                            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium + AppSizes.none),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = MaterialTheme.colorScheme.primary,
                                unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
                                focusedContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha=0.3f),
                                unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha=0.3f)
                            )
                        )
                    } else {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .verticalScroll(rememberScrollState())
                                .padding(horizontal = AppSpacing.medium, vertical = AppSizes.strokeMedium)
                        ) {
                            // Section label
                            Row(
                                modifier = Modifier.padding(bottom = AppSizes.strokeMedium, top = AppSizes.strokeThin, start = AppSizes.strokeThin),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    context.getString(R.string.content_fragment),
                                    style = MaterialTheme.typography.labelMedium,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            }

                            // Message parts
                            partsState.forEachIndexed { index, part ->
                                when (part.type) {
                                    PartType.TEXT -> {
                                        Box(modifier = Modifier.padding(bottom = AppSizes.strokeMedium)) {
                                            OutlinedTextField(
                                                value = part.content,
                                                onValueChange = { newText ->
                                                    val updatedParts = partsState.toMutableList()
                                                    updatedParts[index] = part.copy(content = newText)
                                                    partsState = updatedParts
                                                },
                                                modifier = Modifier
                                                    .fillMaxWidth(),
                                                label = { Text(context.getString(R.string.text_label), style = MaterialTheme.typography.bodySmall) },
                                                placeholder = { Text(context.getString(R.string.input_text_content)) },
                                                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium + AppSizes.none),
                                                colors = OutlinedTextFieldDefaults.colors(
                                                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                                                    unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
                                                    focusedContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha=0.3f),
                                                    unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha=0.3f)
                                                ),
                                                textStyle = MaterialTheme.typography.bodyMedium
                                            )
                                            ActionIconButton(
                                                icon = Icons.Default.Delete,
                                                contentDescription = context.getString(R.string.delete),
                                                onClick = {
                                                    val updatedParts = partsState.toMutableList()
                                                    updatedParts.removeAt(index)
                                                    partsState = updatedParts
                                                },
                                                modifier = Modifier
                                                    .align(Alignment.TopEnd)
                                                    .padding(top = AppSizes.strokeMedium, end = AppSizes.strokeThin)
                                            )
                                        }
                                    }
                                    PartType.XML -> {
                                        XmlTagItem(
                                            part = part,
                                            onClick = { partToEdit = index to part },
                                            onDelete = {
                                                val updatedParts = partsState.toMutableList()
                                                updatedParts.removeAt(index)
                                                partsState = updatedParts
                                            }
                                        )
                                        Spacer(modifier = Modifier.height(AppSizes.strokeMedium))
                                    }
                                }
                            }

                            // Add part buttons
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = AppSizes.strokeThin),
                                horizontalArrangement = Arrangement.spacedBy(AppSizes.strokeMedium, Alignment.CenterHorizontally)
                            ) {
                                // Add text button
                                OutlinedButton(
                                    onClick = { partsState = partsState + ParsedMessagePart(PartType.TEXT, "") },
                                    shape = RoundedCornerShape(AppSizes.floatingBallSize),
                                    border = BorderStroke(AppSizes.strokeThin, MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)),
                                    colors = ButtonDefaults.outlinedButtonColors(
                                        contentColor = MaterialTheme.colorScheme.primary
                                    ),
                                    contentPadding = PaddingValues(horizontal = AppSpacing.medium, vertical = AppSizes.strokeMedium)
                                ) {
                                    Icon(
                                        Icons.Default.Add,
                                        contentDescription = context.getString(R.string.add_text),
                                        modifier = Modifier.size(AppSpacing.extraSmall)
                                    )
                                    Spacer(modifier = Modifier.width(AppSizes.strokeThin))
                                    Text(
                                        context.getString(R.string.add_text),
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                }

                                // Add tag button
                                OutlinedButton(
                                    onClick = { showCreateTagDialog = true },
                                    shape = RoundedCornerShape(AppSizes.floatingBallSize),
                                    border = BorderStroke(AppSizes.strokeThin, MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)),
                                    colors = ButtonDefaults.outlinedButtonColors(
                                        contentColor = MaterialTheme.colorScheme.primary
                                    ),
                                    contentPadding = PaddingValues(horizontal = AppSpacing.medium, vertical = AppSizes.strokeMedium)
                                ) {
                                    Icon(
                                        Icons.Outlined.Tag,
                                        contentDescription = context.getString(R.string.add_tag),
                                        modifier = Modifier.size(AppSpacing.extraSmall)
                                    )
                                    Spacer(modifier = Modifier.width(AppSizes.strokeThin))
                                    Text(
                                        context.getString(R.string.add_tag),
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                }
                            }
                        }
                    }
                }

                // Action buttons
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f))
                        .padding(horizontal = AppSpacing.extraSmall, vertical = AppSizes.strokeMedium),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(
                        onClick = onCancel,
                        shape = RoundedCornerShape(AppSizes.floatingBallSize)
                    ) {
                        Text(
                            context.getString(R.string.cancel),
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(modifier = Modifier.width(AppSizes.strokeThin))

                    if (showResendButton) {
                        OutlinedButton(
                            onClick = onSave,
                            shape = RoundedCornerShape(AppSizes.floatingBallSize),
                            border = ButtonDefaults.outlinedButtonBorder.copy(
                                width = AppSizes.strokeThin
                            )
                        ) {
                            Text(
                                context.getString(R.string.save),
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium
                            )
                        }

                        Spacer(modifier = Modifier.width(AppSizes.strokeThin))

                        Button(
                            onClick = onResend,
                            shape = RoundedCornerShape(AppSizes.floatingBallSize),
                            contentPadding = PaddingValues(horizontal = AppSpacing.medium, vertical = AppSizes.strokeMedium),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            )
                        ) {
                            Text(
                                context.getString(R.string.save_and_resend),
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium
                            )
                            Spacer(modifier = Modifier.width(AppSizes.strokeThin))
                            Icon(
                                Icons.AutoMirrored.Filled.Send,
                                contentDescription = null,
                                modifier = Modifier.size(AppSpacing.extraSmall - 2.dp)
                            )
                        }
                    } else {
                        Button(
                            onClick = onSave,
                            shape = RoundedCornerShape(AppSizes.floatingBallSize)
                        ) {
                            Text(
                                context.getString(R.string.update_memory),
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }
        }
    }

    if (showCreateTagDialog || partToEdit != null) {
        val editingPart = partToEdit?.second
        TagEditorDialog(
            part = editingPart,
            onDismiss = {
                partToEdit = null
                showCreateTagDialog = false
            },
            onSave = { updatedPart ->
                if (partToEdit != null) {
                    partsState = partsState.toMutableList().apply { set(partToEdit!!.first, updatedPart) }
                } else {
                    partsState = partsState + updatedPart
                }
                partToEdit = null
                showCreateTagDialog = false
            }
        )
    }
}

@Composable
private fun XmlTagItem(
    part: ParsedMessagePart,
    onClick: () -> Unit,
    onDelete: () -> Unit
) {
    val context = LocalContext.current
    var expanded by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(
        targetValue = if (expanded) 180f else 0f,
        animationSpec = tween(150, easing = FastOutSlowInEasing),
        label = "rotation"
    )
    val interactionSource = remember { MutableInteractionSource() }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium + AppSizes.none),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.08f)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = AppSizes.none)
    ) {
        Column {
            // Tag header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(
                        interactionSource = interactionSource,
                        indication = rememberRipple(bounded = true),
                        onClick = { expanded = !expanded }
                    )
                    .padding(horizontal = AppSpacing.extraSmall, vertical = AppSizes.strokeMedium),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Outlined.Code,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(AppSpacing.extraSmall + 2.dp)
                )

                Spacer(modifier = Modifier.width(AppSizes.strokeMedium))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = part.tag ?: "XML",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.primary
                    )

                    if (!part.attributes.isNullOrBlank()) {
                        Text(
                            text = part.attributes,
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    ActionIconButton(
                        icon = Icons.Default.Edit,
                        contentDescription = context.getString(R.string.edit),
                        onClick = onClick
                    )

                    ActionIconButton(
                        icon = Icons.Default.Delete,
                        contentDescription = context.getString(R.string.delete),
                        onClick = onDelete
                    )

                    Icon(
                        Icons.Default.KeyboardArrowDown,
                        contentDescription = context.getString(R.string.expand),
                        modifier = Modifier
                            .rotate(rotationState)
                            .size(AppSpacing.extraSmall + 4.dp),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // Tag content
            AnimatedVisibility(
                visible = expanded,
                enter = fadeIn(animationSpec = tween(150)) + expandVertically(animationSpec = tween(150)),
                exit = fadeOut(animationSpec = tween(150)) + shrinkVertically(animationSpec = tween(150))
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.5f))
                ) {
                    Text(
                        text = part.content,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.9f),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = AppSpacing.extraSmall, vertical = AppSizes.strokeMedium)
                    )
                }
            }
        }
    }
}

@Composable
private fun ActionIconButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(AppSpacing.extraSmall + 12.dp)
            .clip(CircleShape)
    ) {
        Icon(
            icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(AppSpacing.extraSmall),
            tint = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TagEditorDialog(
    part: ParsedMessagePart?,
    onDismiss: () -> Unit,
    onSave: (ParsedMessagePart) -> Unit
) {
    val context = LocalContext.current
    var tagName by remember { mutableStateOf(part?.tag ?: "") }
    var attributes by remember { mutableStateOf(part?.attributes ?: "") }
    var content by remember { mutableStateOf(part?.content ?: "") }
    val isNewTag = part == null

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .shadow(elevation = AppSizes.elevationSmall * 4, shape = RoundedCornerShape(AppSizes.floatingBallSize)),
            shape = RoundedCornerShape(AppSizes.floatingBallSize),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = AppSizes.elevationSmall
        ) {
            Column(modifier = Modifier.padding(AppSizes.floatingBallSize)) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = if (isNewTag) context.getString(R.string.new_tag) else context.getString(R.string.edit_tag),
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = if (isNewTag) context.getString(R.string.create_new_xml_tag) else context.getString(R.string.modify_xml_tag_content),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(top = AppSizes.strokeThin)
                        )
                    }

                    Surface(
                        modifier = Modifier.size(AppSpacing.extraSmall + 16.dp),
                        shape = CircleShape,
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                Icons.Outlined.Tag,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(AppSpacing.extraSmall + 4.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(AppSpacing.medium))

                // Tag name
                OutlinedTextField(
                    value = tagName,
                    onValueChange = { tagName = it },
                    label = { Text(context.getString(R.string.tag_name), style=MaterialTheme.typography.bodySmall) },
                    placeholder = { Text(context.getString(R.string.tag_example)) },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(AppSizes.cornerRadiusMedium + AppSizes.none),
                    textStyle = MaterialTheme.typography.bodyMedium,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colorScheme.primary,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
                    )
                )

                Spacer(modifier = Modifier.height(AppSpacing.extraSmall))

                // Attributes
                OutlinedTextField(
                    value = attributes,
                    onValueChange = { attributes = it },
                    label = { Text(context.getString(R.string.attributes_optional), style=MaterialTheme.typography.bodySmall) },
                    placeholder = { Text(context.getString(R.string.attributes_example)) },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(AppSizes.cornerRadiusMedium + AppSizes.none),
                    textStyle = MaterialTheme.typography.bodyMedium,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colorScheme.primary,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
                    )
                )

                Spacer(modifier = Modifier.height(AppSpacing.extraSmall))

                // Content
                OutlinedTextField(
                    value = content,
                    onValueChange = { content = it },
                    label = { Text(context.getString(R.string.content_label), style=MaterialTheme.typography.bodySmall) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(AppSizes.avatarExtraLarge * 3),
                    shape = RoundedCornerShape(AppSizes.cornerRadiusMedium + AppSizes.none),
                    textStyle = MaterialTheme.typography.bodyMedium,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colorScheme.primary,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
                        containerColor = MaterialTheme.colorScheme.surface
                    )
                )

                Spacer(modifier = Modifier.height(AppSizes.floatingBallSize))

                // Action buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(AppSpacing.medium),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        shape = RoundedCornerShape(AppSizes.floatingBallSize),
                        border = ButtonDefaults.outlinedButtonBorder.copy(
                            width = AppSizes.strokeThin
                        ),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            context.getString(R.string.cancel),
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Button(
                        onClick = {
                            onSave(ParsedMessagePart(PartType.XML, content, tagName, attributes))
                        },
                        enabled = tagName.isNotBlank(),
                        shape = RoundedCornerShape(AppSizes.floatingBallSize),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            context.getString(R.string.save),
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }
    }
} 