package com.ai.assistance.operit.ui.floating.ui.fullscreen.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.ui.floating.FloatContext
import com.ai.assistance.operit.ui.floating.FloatingMode
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
import kotlinx.coroutines.withTimeoutOrNull

/**
 * 底部控制栏组件
 * 包含返回按钮、麦克风按钮和缩小按钮
 */
@Composable
fun BottomControlBar(
    visible: Boolean,
    isRecording: Boolean,
    isProcessingSpeech: Boolean,
    showDragHints: Boolean,
    floatContext: FloatContext,
    onStartVoiceCapture: () -> Unit,
    onStopVoiceCapture: (Boolean) -> Unit,
    onEnterWaveMode: () -> Unit,
    onEnterEditMode: (String) -> Unit,
    onShowDragHintsChange: (Boolean) -> Unit,
    userMessage: String,
    modifier: Modifier = Modifier
) {
    AnimatedVisibility(
        visible = visible,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = AppSizes.floatingBallSize, start = AppSizes.avatarLarge, end = AppSizes.avatarLarge)
        ) {
            // 返回按钮 - 左侧
            BackButton(
                floatContext = floatContext,
                modifier = Modifier.align(Alignment.CenterStart)
            )

            // 麦克风按钮 - 中间（带拖动提示）
            MicrophoneButtonWithHints(
                isRecording = isRecording,
                isProcessingSpeech = isProcessingSpeech,
                showDragHints = showDragHints,
                onStartVoiceCapture = onStartVoiceCapture,
                onStopVoiceCapture = onStopVoiceCapture,
                onEnterWaveMode = onEnterWaveMode,
                onEnterEditMode = onEnterEditMode,
                onShowDragHintsChange = onShowDragHintsChange,
                userMessage = userMessage,
                modifier = Modifier.align(Alignment.Center)
            )

            // 缩小成悬浮球按钮 - 右侧
            MinimizeToVoiceBallButton(
                floatContext = floatContext,
                modifier = Modifier.align(Alignment.CenterEnd)
            )
        }
    }
}

/**
 * 返回按钮
 */
@Composable
private fun BackButton(
    floatContext: FloatContext,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = {
            val targetMode = if (floatContext.previousMode == FloatingMode.FULLSCREEN || 
                                 floatContext.previousMode == FloatingMode.VOICE_BALL) {
                FloatingMode.WINDOW
            } else {
                floatContext.previousMode
            }
            floatContext.onModeChange(targetMode)
        },
        modifier = modifier.size(AppSizes.buttonMinHeightSmall + 2.dp)
    ) {
        Icon(
            imageVector = Icons.Default.KeyboardArrowDown,
            contentDescription = "返回窗口模式",
            tint = Color.White,
            modifier = Modifier.size(AppSizes.avatarMedium - 4.dp)
        )
    }
}

/**
 * 缩小成语音球按钮
 */
@Composable
private fun MinimizeToVoiceBallButton(
    floatContext: FloatContext,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = { floatContext.onModeChange(FloatingMode.VOICE_BALL) },
        modifier = modifier.size(AppSizes.buttonMinHeightSmall + 2.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Chat,
            contentDescription = "缩小成语音球",
            tint = Color.White,
            modifier = Modifier.size(AppSizes.iconNormal)
        )
    }
}

/**
 * 麦克风按钮和拖动提示
 */
@Composable
private fun MicrophoneButtonWithHints(
    isRecording: Boolean,
    isProcessingSpeech: Boolean,
    showDragHints: Boolean,
    onStartVoiceCapture: () -> Unit,
    onStopVoiceCapture: (Boolean) -> Unit,
    onEnterWaveMode: () -> Unit,
    onEnterEditMode: (String) -> Unit,
    onShowDragHintsChange: (Boolean) -> Unit,
    userMessage: String,
    modifier: Modifier = Modifier
) {
    var dragOffset by remember { mutableStateOf(0f) }
    val isDraggingToCancel = remember { mutableStateOf(false) }
    val isDraggingToEdit = remember { mutableStateOf(false) }

    Box(modifier = modifier) {
        // 左侧编辑提示
        DragHint(
            visible = showDragHints,
            icon = Icons.Default.Edit,
            iconColor = MaterialTheme.colorScheme.primary,
            description = "编辑",
            isLeft = true,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset(x = (-AppSizes.floatingBallSize + 16.dp).dp)
        )

        // 右侧取消提示
        DragHint(
            visible = showDragHints,
            icon = Icons.Default.Delete,
            iconColor = MaterialTheme.colorScheme.error,
            description = "取消",
            isLeft = false,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .offset(x = AppSizes.floatingBallSize + 16.dp)
        )

        // 麦克风按钮
        MicrophoneButton(
            isRecording = isRecording,
            isProcessingSpeech = isProcessingSpeech,
            isDraggingToCancel = isDraggingToCancel,
            isDraggingToEdit = isDraggingToEdit,
            onStartVoiceCapture = onStartVoiceCapture,
            onStopVoiceCapture = onStopVoiceCapture,
            onEnterWaveMode = onEnterWaveMode,
            onEnterEditMode = onEnterEditMode,
            onShowDragHintsChange = onShowDragHintsChange,
            onDragOffsetChange = { dragOffset = it },
            onDraggingToCancelChange = { isDraggingToCancel.value = it },
            onDraggingToEditChange = { isDraggingToEdit.value = it },
            userMessage = userMessage,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

/**
 * 拖动提示组件
 */
@Composable
private fun DragHint(
    visible: Boolean,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    iconColor: Color,
    description: String,
    isLeft: Boolean,
    modifier: Modifier = Modifier
) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn() + slideInHorizontally(initialOffsetX = { if (isLeft) -it else it }),
        exit = fadeOut() + slideOutHorizontally(targetOffsetX = { if (isLeft) -it else it }),
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (isLeft) {
                // 编辑图标在左
                Icon(
                    imageVector = icon,
                    contentDescription = description,
                    tint = iconColor,
                    modifier = Modifier.size(AppSizes.iconNormal)
                )
                DashedLine()
            } else {
                // 取消图标在右
                DashedLine()
                Icon(
                    imageVector = icon,
                    contentDescription = description,
                    tint = iconColor,
                    modifier = Modifier.size(AppSizes.iconNormal)
                )
            }
        }
    }
}

/**
 * 虚线组件
 */
@Composable
private fun DashedLine() {
    Canvas(
        modifier = Modifier
            .width(AppSizes.avatarMedium - 8.dp)
            .height(AppSizes.strokeMedium)
    ) {
        val pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f, 4f), 0f)
        drawLine(
            color = Color.White.copy(alpha = 0.7f),
            start = Offset(0f, size.height / 2),
            end = Offset(size.width, size.height / 2),
            strokeWidth = AppSizes.strokeMedium.toPx(),
            pathEffect = pathEffect
        )
    }
}

/**
 * 麦克风按钮
 */
@Composable
private fun MicrophoneButton(
    isRecording: Boolean,
    isProcessingSpeech: Boolean,
    isDraggingToCancel: MutableState<Boolean>,
    isDraggingToEdit: MutableState<Boolean>,
    onStartVoiceCapture: () -> Unit,
    onStopVoiceCapture: (Boolean) -> Unit,
    onEnterWaveMode: () -> Unit,
    onEnterEditMode: (String) -> Unit,
    onShowDragHintsChange: (Boolean) -> Unit,
    onDragOffsetChange: (Float) -> Unit,
    onDraggingToCancelChange: (Boolean) -> Unit,
    onDraggingToEditChange: (Boolean) -> Unit,
    userMessage: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(AppSizes.avatarExtraLarge)
            .shadow(elevation = AppSizes.elevationSmall, shape = CircleShape)
            .clip(CircleShape)
            .background(
                brush = Brush.radialGradient(
                    colors = if (isRecording || isProcessingSpeech) {
                        listOf(
                            MaterialTheme.colorScheme.secondary,
                            MaterialTheme.colorScheme.secondaryContainer
                        )
                    } else {
                        listOf(
                            MaterialTheme.colorScheme.primary.copy(alpha = 0.8f),
                            MaterialTheme.colorScheme.primary
                        )
                    }
                )
            )
            .clickable(enabled = false, onClick = {})
            .pointerInput(Unit) {
                detectTapGestures(
                    onTap = {
                        onEnterWaveMode()
                    },
                    onLongPress = {
                        onDragOffsetChange(0f)
                        onDraggingToCancelChange(false)
                        onDraggingToEditChange(false)
                        onShowDragHintsChange(true)
                        onStartVoiceCapture()
                    }
                )
            }
            .pointerInput(isRecording) {
                // 仅在录音时追踪拖动和释放
                if (!isRecording) return@pointerInput
                
                awaitPointerEventScope {
                    var previousPosition: Offset? = null
                    var currentOffset = 0f
                    
                    while (true) {
                        val event = awaitPointerEvent(PointerEventPass.Main)
                        val change = event.changes.firstOrNull()
                        
                        if (change == null) break
                        
                        // 检查是否手指抬起
                        if (!change.pressed) {
                            // 释放时的 处理
                            onShowDragHintsChange(false)
                            when {
                                isDraggingToCancel.value -> {
                                    onStopVoiceCapture(true)
                                }
                                isDraggingToEdit.value -> {
                                    onEnterEditMode(userMessage)
                                }
                                else -> {
                                    onStopVoiceCapture(false)
                                }
                            }
                            break
                        }
                        
                        val position = change.position
                        
                        if (previousPosition == null) {
                            previousPosition = position
                        } else {
                            // 计算拖动偏移
                            val horizontalDrag = position.x - previousPosition.x
                            currentOffset += horizontalDrag
                            onDragOffsetChange(currentOffset)

                            val dragThreshold = 60f
                            when {
                                currentOffset > dragThreshold -> {
                                    onDraggingToCancelChange(true)
                                    onDraggingToEditChange(false)
                                }
                                currentOffset < -dragThreshold -> {
                                    onDraggingToEditChange(true)
                                    onDraggingToCancelChange(false)
                                }
                                else -> {
                                    onDraggingToCancelChange(false)
                                    onDraggingToEditChange(false)
                                }
                            }
                            
                            previousPosition = position
                        }
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        // 图标显示
        when {
            isRecording && isDraggingToCancel.value -> {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "取消录音",
                    tint = Color.White,
                    modifier = Modifier.size(AppSizes.avatarMedium - 4.dp)
                )
            }
            isRecording && isDraggingToEdit.value -> {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "编辑录音",
                    tint = Color.White,
                    modifier = Modifier.size(AppSizes.avatarMedium - 4.dp)
                )
            }
            else -> {
                Icon(
                    imageVector = Icons.Default.Mic,
                    contentDescription = "按住说话",
                    tint = Color.White,
                    modifier = Modifier.size(AppSizes.avatarMedium - 4.dp)
                )
            }
        }
    }
}

