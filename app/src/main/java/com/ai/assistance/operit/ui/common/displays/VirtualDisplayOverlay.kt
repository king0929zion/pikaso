package com.ai.assistance.operit.ui.common.displays

import android.content.Context
import android.graphics.PixelFormat
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.ArrowCircleDown
import androidx.compose.material.icons.outlined.Minimize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.lifecycle.setViewTreeViewModelStoreOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import com.ai.assistance.operit.services.ServiceLifecycleOwner
import com.ai.assistance.operit.util.AppLogger
import com.ai.assistance.operit.core.tools.agent.ShowerController
import com.ai.assistance.operit.ui.theme.AppSpacing
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppBorderRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.StrokeCap
import kotlinx.coroutines.delay
import kotlin.math.*
import kotlin.random.Random
import com.ai.assistance.operit.ui.floating.ui.ball.rememberParticleSystem

class VirtualDisplayOverlay private constructor(private val context: Context) {

    companion object {
        @Volatile
        private var instance: VirtualDisplayOverlay? = null

        fun getInstance(context: Context): VirtualDisplayOverlay {
            return instance ?: synchronized(this) {
                instance ?: VirtualDisplayOverlay(context.applicationContext).also { instance = it }
            }
        }
    }

    private fun mapOffsetToRemote(offset: Offset, overlaySize: IntSize, videoSize: Pair<Int, Int>?): Pair<Int, Int>? {
        val (vw, vh) = videoSize ?: return null
        if (overlaySize.width <= 0 || overlaySize.height <= 0) return null
        val normX = (offset.x / overlaySize.width.toFloat()).coerceIn(0f, 1f)
        val normY = (offset.y / overlaySize.height.toFloat()).coerceIn(0f, 1f)
        val devX = (normX * (vw - 1)).roundToInt()
        val devY = (normY * (vh - 1)).roundToInt()
        return devX to devY
    }

    private val handler = Handler(Looper.getMainLooper())
    private var windowManager: WindowManager? = null
    private var overlayView: ComposeView? = null
    private var lifecycleOwner: ServiceLifecycleOwner? = null
    private var layoutParams: WindowManager.LayoutParams? = null
    private var displayId: Int? = null
    private var isFullscreen by mutableStateOf(false)
    private var isSnapped by mutableStateOf(false)
    private var snappedToRight by mutableStateOf(false)
    private var animator: android.animation.ValueAnimator? = null
    private var lastWindowX: Int = 0
    private var lastWindowY: Int = 0
    private var lastWindowWidth: Int = 0
    private var lastWindowHeight: Int = 0
    private var previewPath by mutableStateOf<String?>(null)
    private var controlsVisible by mutableStateOf(false)
    private var rainbowBorderVisible by mutableStateOf(false)
    private var automationCurrentStep by mutableStateOf<Int?>(null)
    private var automationTotalSteps by mutableStateOf<Int?>(null)
    private var automationStatusText by mutableStateOf<String?>(null)
    private var automationIsPaused by mutableStateOf(false)
    private var automationVisible by mutableStateOf(false)
    private var automationOnTogglePauseResume: ((Boolean) -> Unit)? = null
    private var automationOnExit: (() -> Unit)? = null
    // Fixed left control panel width (in px) added on top of the original video width.
    // The video region itself still uses 0.4x of the screen width; this extra width
    // is only used to host controls without changing the video size.
    private val automationPanelWidthPx: Int by lazy {
        (AppSpacing.mediumLarge.value * context.resources.displayMetrics.density).roundToInt()
    }
    private val automationPanelWidthDp = AppSpacing.mediumLarge

    private fun runOnMainThread(action: () -> Unit) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            action()
        } else {
            handler.post {
                try {
                    action()
                } catch (e: Exception) {
                    AppLogger.e("VirtualDisplayOverlay", "Error on main thread", e)
                }
            }
        }
    }

    private fun ensureOverlay() {
        if (overlayView != null) return
        try {
            windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val params = WindowManager.LayoutParams().apply {
                width = WindowManager.LayoutParams.WRAP_CONTENT
                height = WindowManager.LayoutParams.WRAP_CONTENT
                type = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
                } else {
                    @Suppress("DEPRECATION")
                    WindowManager.LayoutParams.TYPE_PHONE
                }
                flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                format = PixelFormat.TRANSLUCENT
                gravity = Gravity.TOP or Gravity.START
            }
            layoutParams = params
            lifecycleOwner = ServiceLifecycleOwner().apply {
                handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
                handleLifecycleEvent(Lifecycle.Event.ON_START)
                handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
            }
            overlayView = ComposeView(context).apply {
                setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow)
                setViewTreeLifecycleOwner(lifecycleOwner)
                setViewTreeViewModelStoreOwner(lifecycleOwner)
                setViewTreeSavedStateRegistryOwner(lifecycleOwner)
                setContent {
                    val id = displayId
                    val fullscreen = isFullscreen
                    val path = previewPath
                    if (id != null) {
                        OverlayCard(id = id, isFullscreen = fullscreen, previewPath = path)
                    }
                }
            }
            windowManager?.addView(overlayView, params)
        } catch (e: Exception) {
            AppLogger.e("VirtualDisplayOverlay", "Error creating overlay", e)
            overlayView = null
            lifecycleOwner = null
            windowManager = null
            layoutParams = null
        }
    }

    fun show(displayId: Int) {
        runOnMainThread {
            this.displayId = displayId
            isFullscreen = false
            isSnapped = false
            ensureOverlay()
            overlayView?.visibility = View.VISIBLE
            updateLayoutParams()
        }
    }

    fun showAutomationControls(
        totalSteps: Int,
        initialStatus: String,
        onTogglePauseResume: (Boolean) -> Unit,
        onExit: () -> Unit
    ) {
        runOnMainThread {
            automationTotalSteps = totalSteps
            automationCurrentStep = 1
            automationStatusText = initialStatus
            automationIsPaused = false
            automationOnTogglePauseResume = onTogglePauseResume
            automationOnExit = onExit
            automationVisible = true
        }
    }

    fun updateAutomationProgress(currentStep: Int, totalSteps: Int, statusText: String) {
        runOnMainThread {
            automationTotalSteps = totalSteps
            automationCurrentStep = if (currentStep <= 0) 1 else currentStep
            automationStatusText = statusText
        }
    }

    fun hideAutomationControls() {
        runOnMainThread {
            automationVisible = false
            automationOnTogglePauseResume = null
            automationOnExit = null
            automationCurrentStep = null
            automationTotalSteps = null
            automationStatusText = null
            automationIsPaused = false
        }
    }

    fun hide() {
        runOnMainThread {
            try {
                ShowerController.shutdown()
                overlayView?.let { view ->
                    lifecycleOwner?.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                    lifecycleOwner?.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
                    lifecycleOwner?.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    try {
                        windowManager?.removeView(view)
                    } catch (e: Exception) {
                        AppLogger.e("VirtualDisplayOverlay", "Error removing overlay view", e)
                    }
                }
                overlayView = null
                lifecycleOwner = null
                layoutParams = null
                windowManager = null
                displayId = null
            } catch (e: Exception) {
                AppLogger.e("VirtualDisplayOverlay", "Error hiding overlay", e)
            }
        }
    }

    fun setShowerBorderVisible(visible: Boolean) {
        runOnMainThread {
            rainbowBorderVisible = visible
        }
    }

    private fun toggleFullScreen() {
        runOnMainThread {
            isFullscreen = !isFullscreen
            if (isFullscreen) {
                controlsVisible = false
            }
            isSnapped = false
            updateLayoutParams()
        }
    }

    private fun snapToEdge(forceSnap: Boolean = false) {
        runOnMainThread {
            val params = layoutParams ?: return@runOnMainThread
            val metrics = context.resources.displayMetrics
            val statusBarHeight = getStatusBarHeight()
            if (!isSnapped || forceSnap) {
                isSnapped = true
                lastWindowX = params.x
                lastWindowY = params.y

                val screenWidth = metrics.widthPixels
                val centerX = params.x + params.width / 2
                snappedToRight = centerX >= screenWidth / 2

                val snappedWidthPx = (AppSizes.buttonMinHeightSmall.value * context.resources.displayMetrics.density).roundToInt()
                val snappedHeightPx = ((AppSizes.buttonMinHeightSmall + 12.dp).value * context.resources.displayMetrics.density).roundToInt()
                val targetX = if (snappedToRight) screenWidth - snappedWidthPx else 0
                val maxY = metrics.heightPixels - snappedHeightPx
                val targetY = params.y.coerceIn(statusBarHeight, maxY)
                animateToPosition(targetX, targetY, isSnapping = true)
            }
        }
    }

    private fun animateToDefaultPosition() {
        val metrics = context.resources.displayMetrics
        val statusBarHeight = getStatusBarHeight()
        val params = layoutParams ?: return
        val videoWidth = (lastWindowWidth * 0.4f).toInt()
        val videoHeight = (lastWindowHeight * 0.4f).toInt()
        val restoredWidth = videoWidth + automationPanelWidthPx
        val restoredHeight = videoHeight

        val maxX = metrics.widthPixels - restoredWidth
        val maxY = metrics.heightPixels - restoredHeight

        val targetX = lastWindowX.coerceIn(0, maxX)
        val targetY = lastWindowY.coerceIn(statusBarHeight, maxY)

        animateToPosition(targetX, targetY, isSnapping = false)
    }

    private fun animateToPosition(targetX: Int, targetY: Int, isSnapping: Boolean) {
        val wm = windowManager ?: return
        val view = overlayView ?: return
        val params = layoutParams ?: return
        val startX = params.x
        val startY = params.y
        val startWidth = params.width
        val startHeight = params.height
        val metrics = context.resources.displayMetrics
        val snappedWidth = (AppSizes.buttonMinHeightSmall.value * metrics.density).roundToInt()
        val snappedHeight = ((AppSizes.buttonMinHeightSmall + 12.dp).value * metrics.density).roundToInt()
        val (endWidth, endHeight) = if (isSnapping) {
            snappedWidth to snappedHeight
        } else {
            val videoWidth = (lastWindowWidth * 0.4f).toInt()
            val videoHeight = (lastWindowHeight * 0.4f).toInt()
            (videoWidth + automationPanelWidthPx) to videoHeight
        }
        animator?.cancel()
        animator = android.animation.ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 300
            addUpdateListener { animation ->
                val fraction = animation.animatedFraction
                params.x = (startX + (targetX - startX) * fraction).toInt()
                params.y = (startY + (targetY - startY) * fraction).toInt()
                params.width = (startWidth + (endWidth - startWidth) * fraction).toInt()
                params.height = (startHeight + (endHeight - startHeight) * fraction).toInt()
                try {
                    wm.updateViewLayout(view, params)
                } catch (e: Exception) {
                    // Ignore
                }
            }
            start()
        }
    }

    private fun updateLayoutParams() {
        val wm = windowManager ?: return
        val view = overlayView ?: return
        val params = layoutParams ?: return
        val metrics = context.resources.displayMetrics
        val statusBarHeight = getStatusBarHeight()
        if (lastWindowWidth == 0 || lastWindowHeight == 0) {
            lastWindowWidth = metrics.widthPixels
            lastWindowHeight = (metrics.heightPixels - statusBarHeight).coerceAtLeast(1)
            val videoWidth = (lastWindowWidth * 0.4f).toInt()
            val videoHeight = (lastWindowHeight * 0.4f).toInt()
            params.width = videoWidth + automationPanelWidthPx
            params.height = videoHeight
            params.x = ((metrics.widthPixels - params.width) / 2f).toInt()
            params.y = statusBarHeight + ((lastWindowHeight - params.height) / 2f).toInt()
            lastWindowX = params.x
            lastWindowY = params.y
        }
        if (isFullscreen) {
            params.width = metrics.widthPixels
            params.height = metrics.heightPixels
            params.x = 0
            params.y = 0
        } else {
            // Small window: keep the video region at 0.4x of the screen width, and
            // add a fixed-width left control panel. This keeps the video size and
            // aspect ratio identical to the previous behavior.
            val videoWidth = (lastWindowWidth * 0.4f).toInt()
            val videoHeight = (lastWindowHeight * 0.4f).toInt()
            params.width = videoWidth + automationPanelWidthPx
            params.height = videoHeight
            params.x = lastWindowX
            params.y = lastWindowY
        }
        try {
            wm.updateViewLayout(view, params)
        } catch (e: Exception) {
            AppLogger.e("VirtualDisplayOverlay", "Error updating layout params", e)
        }
    }

    private fun moveWindowBy(dx: Float, dy: Float) {
        val wm = windowManager ?: return
        val view = overlayView ?: return
        val params = layoutParams ?: return
        if (isFullscreen) return
        if (isSnapped) {
            val metrics = context.resources.displayMetrics
            val statusBarHeight = getStatusBarHeight()
            val snappedSize = params.height
            val maxY = metrics.heightPixels - snappedSize
            params.y = (params.y + dy.toInt()).coerceIn(statusBarHeight, maxY)
            val screenWidth = metrics.widthPixels
            params.x = if (snappedToRight) screenWidth - params.width else 0
            // 保留 lastWindowX 为缩小前的小窗 X，只更新垂直位置用于恢复时的 Y
            lastWindowY = params.y
            try {
                wm.updateViewLayout(view, params)
            } catch (e: Exception) {
                AppLogger.e("VirtualDisplayOverlay", "Error moving snapped overlay via moveWindowBy", e)
            }
            return
        }
        val metrics = context.resources.displayMetrics
        val statusBarHeight = getStatusBarHeight()
        val newX = params.x + dx.toInt()
        val newY = params.y + dy.toInt()

        val maxX = metrics.widthPixels - params.width
        val maxY = metrics.heightPixels - params.height

        params.x = newX.coerceIn(0, maxX)
        params.y = newY.coerceIn(statusBarHeight, maxY)

        lastWindowX = params.x
        lastWindowY = params.y
        try {
            wm.updateViewLayout(view, params)
        } catch (e: Exception) {
            AppLogger.e("VirtualDisplayOverlay", "Error moving overlay via moveWindowBy", e)
        }
    }

    @Composable
    private fun OverlayCard(id: Int, isFullscreen: Boolean, previewPath: String?) {
        var overlaySize by remember { mutableStateOf(IntSize.Zero) }
        val snapped = isSnapped

        Box(
            modifier = Modifier
                .fillMaxSize()
                .onSizeChanged { size -> overlaySize = size }
                .pointerInput(id, isFullscreen, snapped) {
                    if (snapped) {
                        // Minimized: only drag and tap to restore are available
                        detectDragGestures {
                            change, dragAmount ->
                            change.consume()
                            moveWindowBy(dragAmount.x, dragAmount.y)
                        }
                    } else if (isFullscreen) {
                        var lastPoint: Pair<Int, Int>? = null
                        detectDragGestures(
                            onDragStart = { start ->
                                val pt = mapOffsetToRemote(start, overlaySize, ShowerController.getVideoSize())
                                if (pt != null) {
                                    lastPoint = pt
                                    kotlinx.coroutines.runBlocking { ShowerController.touchDown(pt.first, pt.second) }
                                }
                            },
                            onDrag = { change, _ ->
                                change.consume()
                                val pt = mapOffsetToRemote(change.position, overlaySize, ShowerController.getVideoSize())
                                if (pt != null && pt != lastPoint) {
                                    lastPoint = pt
                                    kotlinx.coroutines.runBlocking { ShowerController.touchMove(pt.first, pt.second) }
                                }
                            },
                            onDragEnd = {
                                lastPoint?.let { pt ->
                                    kotlinx.coroutines.runBlocking { ShowerController.touchUp(pt.first, pt.second) }
                                }
                                lastPoint = null
                            },
                            onDragCancel = {
                                lastPoint?.let { pt ->
                                    kotlinx.coroutines.runBlocking { ShowerController.touchUp(pt.first, pt.second) }
                                }
                                lastPoint = null
                            }
                        )
                    } else {
                         detectDragGestures(
                            onDragStart = { controlsVisible = true },
                            onDrag = { change, dragAmount ->
                                change.consume()
                                moveWindowBy(dragAmount.x, dragAmount.y)
                            }
                        )
                    }
                }
                .pointerInput(id, isFullscreen, overlaySize, snapped) {
                    detectTapGestures(
                        onTap = { offset ->
                            if (snapped) {
                                isSnapped = false
                                animateToDefaultPosition()
                            } else if (isFullscreen) {
                                val pt = mapOffsetToRemote(offset, overlaySize, ShowerController.getVideoSize())
                                if (pt != null) {
                                    kotlinx.coroutines.runBlocking {
                                        ShowerController.touchDown(pt.first, pt.second)
                                        ShowerController.touchUp(pt.first, pt.second)
                                    }
                                }
                            } else {
                                controlsVisible = true
                            }
                        }
                    )
                }
                .clip(RoundedCornerShape(AppBorderRadius.none))
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                    var hasShowerDisplay by remember { mutableStateOf(ShowerController.getVideoSize() != null) }
                    LaunchedEffect(Unit) {
                        while (true) {
                            val ready = ShowerController.getVideoSize() != null
                            if (hasShowerDisplay != ready) {
                                hasShowerDisplay = ready
                            }
                            delay(500)
                        }
                    }
                    if (id == 0 && hasShowerDisplay) {
                        if (isFullscreen) {
                            // 全屏模式：保持原来的视频 fillMaxSize 布局
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                AndroidView(
                                    modifier = Modifier.fillMaxSize(),
                                    factory = { ctx -> ShowerSurfaceView(ctx) }
                                )
                                LaunchedEffect(controlsVisible) {
                                    if (controlsVisible) {
                                        delay(3000)
                                        controlsVisible = false
                                    }
                                }
                                if (controlsVisible && !isFullscreen) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.3f))
                                    )
                                }
                                if (rainbowBorderVisible) {
                                    RainbowStatusBorderOverlay()
                                }
                                // Fullscreen: top-right Windows-like controls, small white icons on pill background
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(AppSpacing.small)
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(AppSizes.avatarExtraLarge))
                                            .background(Color.Black.copy(alpha = 0.45f))
                                            .padding(horizontal = AppSpacing.nano, vertical = AppSpacing.none),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(AppSpacing.none)
                                    ) {
                                        // Minimize (映射到贴边，类似最小化到侧边)
                                        IconButton(
                                            onClick = {
                                                toggleFullScreen()
                                                snapToEdge()
                                            },
                                            modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp),
                                            colors = IconButtonDefaults.iconButtonColors(
                                                contentColor = Color.White,
                                                containerColor = Color.Transparent
                                            )
                                        ) {
                                            Icon(
                                                imageVector = Icons.Outlined.Minimize,
                                                contentDescription = "Minimize",
                                                modifier = Modifier.size(AppSpacing.extraSmall),
                                                tint = Color.White
                                            )
                                        }
                                        // Restore (退出全屏)
                                        IconButton(
                                            onClick = { toggleFullScreen() },
                                            modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp),
                                            colors = IconButtonDefaults.iconButtonColors(
                                                contentColor = Color.White,
                                                containerColor = Color.Transparent
                                            )
                                        ) {
                                            Icon(
                                                imageVector = Icons.Filled.FullscreenExit,
                                                contentDescription = "Exit Fullscreen",
                                                modifier = Modifier.size(AppSpacing.extraSmall),
                                                tint = Color.White
                                            )
                                        }
                                        // Close
                                        IconButton(
                                            onClick = { hide() },
                                            modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp),
                                            colors = IconButtonDefaults.iconButtonColors(
                                                contentColor = Color.White,
                                                containerColor = Color.Transparent
                                            )
                                        ) {
                                            Icon(
                                                imageVector = Icons.Filled.Close,
                                                contentDescription = "Close",
                                                modifier = Modifier.size(AppSpacing.extraSmall),
                                                tint = Color.White
                                            )
                                        }
                                    }
                                }
                            }
                        } else {
                            if (snapped) {
                                Box(
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // 保持 ShowerSurfaceView 附着但几乎不可见，仅用于维持渲染管线
                                    AndroidView(
                                        modifier = Modifier.size(AppSizes.strokeThin),
                                        factory = { ctx -> ShowerSurfaceView(ctx) }
                                    )

                                    val handleShape = if (snappedToRight) {
                                        RoundedCornerShape(topStart = AppSizes.cornerRadiusMedium, bottomStart = AppSizes.cornerRadiusMedium, topEnd = AppBorderRadius.none, bottomEnd = AppBorderRadius.none)
                                    } else {
                                        RoundedCornerShape(topStart = AppBorderRadius.none, bottomStart = AppBorderRadius.none, topEnd = AppSizes.cornerRadiusMedium, bottomEnd = AppSizes.cornerRadiusMedium)
                                    }
                                    val arrowIcon = if (snappedToRight) Icons.Filled.ChevronLeft else Icons.Filled.ChevronRight

                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .background(
                                                color = Color.Gray.copy(alpha = 0.85f),
                                                shape = handleShape
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = arrowIcon,
                                            contentDescription = "Restore",
                                            modifier = Modifier.size(AppSpacing.extraSmall),
                                            tint = Color.White
                                        )
                                    }
                                }
                            } else {
                                // 小窗模式：左侧为固定宽度控制栏，右侧为原始大小的视频区域
                                Row(
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Left control panel area (fixed dp width)
                                    Box(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(automationPanelWidthDp)
                                    ) {
                                        if (automationVisible) {
                                            val step = automationCurrentStep
                                            val total = automationTotalSteps
                                            if (step != null && total != null) {
                                                AutomationControlBar(
                                                    currentStep = step,
                                                    totalSteps = total,
                                                    isPaused = automationIsPaused,
                                                    onTogglePauseResume = { newPaused ->
                                                        automationIsPaused = newPaused
                                                        automationOnTogglePauseResume?.invoke(newPaused)
                                                    },
                                                    onExit = { automationOnExit?.invoke() }
                                                )
                                            }
                                        }
                                    }

                                    // Right video region: keep the same size as before (matches 0.4x screen width)
                                    Box(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .weight(1f)
                                    ) {
                                        AndroidView(
                                            modifier = Modifier.fillMaxSize(),
                                            factory = { ctx -> ShowerSurfaceView(ctx) }
                                        )

                                        LaunchedEffect(controlsVisible) {
                                            if (controlsVisible) {
                                                delay(3000)
                                                controlsVisible = false
                                            }
                                        }
                                        if (controlsVisible) {
                                            Box(
                                                modifier = Modifier
                                                    .fillMaxSize()
                                                    .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.3f))
                                            )
                                            // Small window: Centered, vertical column (restore original layout)
                                            Column(
                                                modifier = Modifier.align(Alignment.Center),
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.spacedBy(AppSpacing.extraSmall)
                                            ) {
                                                IconButton(onClick = { snapToEdge() }) {
                                                    Icon(
                                                        imageVector = Icons.Outlined.Minimize,
                                                        contentDescription = "Minimize to ball",
                                                        modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp)
                                                    )
                                                }
                                                IconButton(onClick = { toggleFullScreen() }) {
                                                    Icon(
                                                        imageVector = Icons.Filled.Fullscreen,
                                                        contentDescription = "Toggle Fullscreen",
                                                        modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp)
                                                    )
                                                }
                                                IconButton(onClick = { hide() }) {
                                                    Icon(
                                                        imageVector = Icons.Filled.Close,
                                                        contentDescription = "Close",
                                                        modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp)
                                                    )
                                                }
                                            }
                                        }
                                        if (rainbowBorderVisible) {
                                            RainbowStatusBorderOverlay()
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        Text(
                            text = "Shower 虚拟屏尚未就绪",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                        )
                    }
                }
        }
    }
    @Composable
    private fun AutomationControlBar(
        currentStep: Int,
        totalSteps: Int,
        isPaused: Boolean,
        onTogglePauseResume: (Boolean) -> Unit,
        onExit: () -> Unit
    ) {
        Card(
            modifier = Modifier
                .wrapContentWidth()
                .padding(horizontal = AppSpacing.nano, vertical = AppSpacing.nano),
            elevation = CardDefaults.cardElevation(defaultElevation = AppSizes.elevationSmall + 2.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.9f),
                contentColor = MaterialTheme.colorScheme.onSurface
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = AppSpacing.extraSmall, vertical = AppSpacing.nano),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(AppSpacing.nano)
            ) {
                // 只保留简单的步骤进度文案，例如 "3/20"
                Box(
                    modifier = Modifier.size(AppSizes.buttonMinHeightSmall - 4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "$currentStep/$totalSteps",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                // 垂直排列：上面是暂停/继续，下面是退出任务的 X
                IconButton(onClick = { onTogglePauseResume(!isPaused) }) {
                    Icon(
                        imageVector = if (isPaused) Icons.Filled.PlayArrow else Icons.Filled.Pause,
                        contentDescription = if (isPaused) "Resume automation" else "Pause automation",
                        modifier = Modifier.size(AppSpacing.extraSmall),
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
                IconButton(onClick = onExit) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Stop automation",
                        modifier = Modifier.size(AppSpacing.extraSmall),
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
    }

private fun getStatusBarHeight(): Int {
        val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) context.resources.getDimensionPixelSize(resourceId) else 0
    }
}

@Composable
private fun RainbowStatusBorderOverlay() {
    val infiniteTransition = rememberInfiniteTransition(label = "vd_status_indicator_rainbow")
    val animatedProgress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 4000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "vd_status_indicator_progress"
    )

    val rainbowColors = listOf(
        Color(0xFFFF5F6D),
        Color(0xFFFFC371),
        Color(0xFF47CF73),
        Color(0xFF00C6FF),
        Color(0xFF845EF7),
        Color(0xFFFF5F6D)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val strokeWidth = size.minDimension * 0.025f
            // Match FloatingWindowManager.FullscreenRainbowStatusIndicator: outer rect + rounded inner rect
            val innerCornerRadius = androidx.compose.ui.geometry.CornerRadius(strokeWidth * 1.5f, strokeWidth * 1.5f)

            val phase = animatedProgress * size.maxDimension
            val borderBrush = Brush.linearGradient(
                colors = rainbowColors,
                start = Offset(-phase, 0f),
                end = Offset(size.width - phase, size.height)
            )

            val innerRoundRect = androidx.compose.ui.geometry.RoundRect(
                left = strokeWidth,
                top = strokeWidth,
                right = size.width - strokeWidth,
                bottom = size.height - strokeWidth,
                cornerRadius = innerCornerRadius
            )
            val innerPath = androidx.compose.ui.graphics.Path().apply {
                addRoundRect(innerRoundRect)
            }

            val outerPath = androidx.compose.ui.graphics.Path().apply {
                addRect(androidx.compose.ui.geometry.Rect(Offset.Zero, size))
            }
            val ringPath = androidx.compose.ui.graphics.Path().apply {
                op(outerPath, innerPath, androidx.compose.ui.graphics.PathOperation.Difference)
            }

            clipPath(innerPath) {
                val bandSteps = 5
                val innerBandWidth = strokeWidth * 3f
                val singleBandWidth = innerBandWidth / bandSteps
                val maxAlpha = 0.32f

                for (i in 0 until bandSteps) {
                    val t = i / (bandSteps - 1).coerceAtLeast(1).toFloat()
                    val alpha = (1f - t) * maxAlpha

                    val inset = i * singleBandWidth + singleBandWidth / 2f

                    val bandLeft = innerRoundRect.left + inset
                    val bandTop = innerRoundRect.top + inset
                    val bandRight = innerRoundRect.right - inset
                    val bandBottom = innerRoundRect.bottom - inset
                    if (bandRight <= bandLeft || bandBottom <= bandTop) break

                    val bandCornerRadius = androidx.compose.ui.geometry.CornerRadius(
                        (innerCornerRadius.x - inset).coerceAtLeast(0f),
                        (innerCornerRadius.y - inset).coerceAtLeast(0f)
                    )

                    drawRoundRect(
                        brush = borderBrush,
                        topLeft = Offset(bandLeft, bandTop),
                        size = Size(bandRight - bandLeft, bandBottom - bandTop),
                        cornerRadius = bandCornerRadius,
                        style = Stroke(width = singleBandWidth),
                        alpha = alpha
                    )
                }
            }

            drawPath(
                path = ringPath,
                brush = borderBrush,
                alpha = 0.7f
            )
        }
    }
}
