package com.ai.assistance.operit.core.accessibility

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.PixelFormat
import android.graphics.Rect
import android.hardware.display.DisplayManager
import android.hardware.display.VirtualDisplay
import android.media.Image
import android.media.ImageReader
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Display
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.io.File
import java.io.FileOutputStream

/**
 * Operit 内置无障碍服务
 *
 * 功能：
 * - 获取UI层次结构
 * - 执行点击、滑动、长按等操作
 * - 截取屏幕截图
 * - 监听Activity变化
 * - 支持虚拟屏幕操作
 */
class OperitAccessibilityService : AccessibilityService() {

    companion object {
        private const val TAG = "OperitAccessibilityService"

        @Volatile
        var instance: OperitAccessibilityService? = null

        // 服务状态
        private val _isServiceEnabled = MutableStateFlow(false)
        val isServiceEnabled: StateFlow<Boolean> = _isServiceEnabled.asStateFlow()

        // 当前Activity名称
        private val _currentActivityName = MutableStateFlow("")
        val currentActivityName: StateFlow<String> = _currentActivityName.asStateFlow()

        // 虚拟屏幕状态
        private val _isVirtualDisplayActive = MutableStateFlow(false)
        val isVirtualDisplayActive: StateFlow<Boolean> = _isVirtualDisplayActive.asStateFlow()

        // 虚拟屏幕实例
        @Volatile
        private var virtualDisplay: VirtualDisplay? = null
        @Volatile
        private var imageReader: ImageReader? = null

        // 获取UI层次结构
        fun getUIHierarchy(): String {
            val service = instance ?: return ""
            return try {
                val rootNode = service.rootInActiveWindow ?: return ""
                buildXmlHierarchy(rootNode).also {
                    rootNode.recycle()
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to get UI hierarchy", e)
                ""
            }
        }

        // 构建XML格式的UI层次结构
        private fun buildXmlHierarchy(node: AccessibilityNodeInfo): String {
            val sb = StringBuilder()
            sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
            sb.append("<hierarchy>")
            appendNodeXml(node, sb)
            sb.append("</hierarchy>")
            return sb.toString()
        }

        private fun appendNodeXml(node: AccessibilityNodeInfo, sb: StringBuilder) {
            sb.append("<node")
            sb.append(" class=\"${node.className ?: ""}\"")
            sb.append(" package=\"${node.packageName ?: ""}\"")
            sb.append(" text=\"${node.text?.toString() ?: ""}\"")
            sb.append(" content-desc=\"${node.contentDescription?.toString() ?: ""}\"")
            sb.append(" resource-id=\"${node.viewIdResourceName ?: ""}\"")

            val bounds = Rect()
            node.getBoundsInScreen(bounds)
            sb.append(" bounds=\"${bounds.toShortString()}\"")

            sb.append(" clickable=\"${node.isClickable}\"")
            sb.append(" checkable=\"${node.isCheckable}\"")
            sb.append(" checked=\"${node.isChecked}\"")
            sb.append(" scrollable=\"${node.isScrollable}\"")
            sb.append(" enabled=\"${node.isEnabled}\"")
            sb.append(" focusable=\"${node.isFocusable}\"")
            sb.append(" focused=\"${node.isFocused}\"")
            sb.append(" selected=\"${node.isSelected}\"")

            sb.append(">")

            for (i in 0 until node.childCount) {
                val child = node.getChild(i)
                if (child != null) {
                    appendNodeXml(child, sb)
                    child.recycle()
                }
            }

            sb.append("</node>")
        }

        /**
         * 执行点击 - 优先使用节点操作，其次使用手势
         */
        fun performClick(x: Int, y: Int): Boolean {
            val service = instance ?: return false
            return try {
                // 首先尝试直接点击节点
                val rootNode = service.rootInActiveWindow
                if (rootNode != null) {
                    val node = findNodeAtCoordinates(rootNode, x, y)
                    if (node != null && node.isClickable) {
                        val result = node.performAction(AccessibilityNodeInfo.ACTION_CLICK)
                        node.recycle()
                        rootNode.recycle()
                        if (result) {
                            AppLogger.d(TAG, "Direct click succeeded at ($x, $y)")
                            return true
                        }
                    }
                    rootNode.recycle()
                }

                // 使用手势执行点击
                val gestureCompleted = service.dispatchGesture(
                    createClickGesture(x, y),
                    null,
                    null
                )
                if (gestureCompleted) {
                    AppLogger.d(TAG, "Gesture click succeeded at ($x, $y)")
                }
                gestureCompleted
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform click at ($x, $y)", e)
                false
            }
        }

        /**
         * 执行双击
         */
        fun performDoubleTap(x: Int, y: Int): Boolean {
            val service = instance ?: return false
            return try {
                val result1 = service.dispatchGesture(createClickGesture(x, y), null, null)
                Thread.sleep(100)
                val result2 = service.dispatchGesture(createClickGesture(x, y), null, null)
                result1 && result2
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform double tap at ($x, $y)", e)
                false
            }
        }

        /**
         * 执行长按
         */
        fun performLongPress(x: Int, y: Int): Boolean {
            val service = instance ?: return false
            return try {
                // 首先尝试直接长按节点
                val rootNode = service.rootInActiveWindow
                if (rootNode != null) {
                    val node = findNodeAtCoordinates(rootNode, x, y)
                    if (node != null && node.isLongClickable) {
                        val result = node.performAction(AccessibilityNodeInfo.ACTION_LONG_CLICK)
                        node.recycle()
                        rootNode.recycle()
                        if (result) {
                            AppLogger.d(TAG, "Direct long press succeeded at ($x, $y)")
                            return true
                        }
                    }
                    rootNode.recycle()
                }

                // 使用手势执行长按 (500ms)
                val result = service.dispatchGesture(createLongPressGesture(x, y), null, null)
                if (result) {
                    AppLogger.d(TAG, "Gesture long press succeeded at ($x, $y)")
                }
                result
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform long press at ($x, $y)", e)
                false
            }
        }

        /**
         * 执行滑动
         */
        fun performSwipe(startX: Int, startY: Int, endX: Int, endY: Int, duration: Long): Boolean {
            val service = instance ?: return false
            return try {
                val displayMetrics = service.resources.displayMetrics
                val safeStartX = startX.coerceIn(0, displayMetrics.widthPixels)
                val safeStartY = startY.coerceIn(0, displayMetrics.heightPixels)
                val safeEndX = endX.coerceIn(0, displayMetrics.widthPixels)
                val safeEndY = endY.coerceIn(0, displayMetrics.heightPixels)

                val gesture = createSwipeGesture(safeStartX, safeStartY, safeEndX, safeEndY, duration)
                val result = service.dispatchGesture(gesture, null, null)

                if (result) {
                    AppLogger.d(TAG, "Swipe succeeded from ($safeStartX, $safeStartY) to ($safeEndX, $safeEndY)")
                } else {
                    AppLogger.e(TAG, "Swipe failed from ($startX, $startY) to ($endX, $endY)")
                }
                result
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform swipe from ($startX, $startY) to ($endX, $endY)", e)
                false
            }
        }

        /**
         * 执行滑动手势序列（用于复杂手势）
         */
        fun performGestureSequence(strokes: List<GestureDescription.StrokeDescription>): Boolean {
            val service = instance ?: return false
            return try {
                val builder = GestureDescription.Builder()
                strokes.forEach { builder.addStroke(it) }
                service.dispatchGesture(builder.build(), null, null)
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform gesture sequence", e)
                false
            }
        }

        /**
         * 执行全局操作（返回、Home等）
         */
        fun performGlobalAction(action: Int): Boolean {
            val service = instance ?: return false
            return try {
                service.performGlobalAction(action)
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform global action: $action", e)
                false
            }
        }

        /**
         * 设置文本到指定节点
         */
        fun setText(nodeId: String, text: String): Boolean {
            val service = instance ?: return false
            return try {
                val rootNode = service.rootInActiveWindow ?: return false
                val node = findNodeById(rootNode, nodeId)
                if (node != null) {
                    val args = Bundle()
                    args.putCharSequence(
                        AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE,
                        text
                    )
                    val result = node.performAction(AccessibilityNodeInfo.ACTION_SET_TEXT, args)
                    node.recycle()
                    rootNode.recycle()
                    result
                } else {
                    rootNode.recycle()
                    false
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to set text on node: $nodeId", e)
                false
            }
        }

        /**
         * 查找焦点节点ID
         */
        fun findFocusedNodeId(): String? {
            val service = instance ?: return null
            return try {
                val rootNode = service.rootInActiveWindow ?: return null
                val node = findFocusedNode(rootNode)
                val result = node?.viewIdResourceName
                rootNode.recycle()
                result
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to find focused node", e)
                null
            }
        }

        /**
         * 截取屏幕截图 (Android 13+)
         */
        fun takeScreenshot(): Bitmap? {
            val service = instance ?: return null
            return try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    val callback = ScreenshotCallback()
                    service.takeScreenshot(
                        Display.DEFAULT_DISPLAY,
                        service.mainExecutor,
                        callback
                    )
                    callback.getBitmap()
                } else {
                    null
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to take screenshot", e)
                null
            }
        }

        /**
         * 保存截图到文件
         */
        fun saveScreenshotToFile(path: String): Boolean {
            val bitmap = takeScreenshot() ?: return false
            return try {
                File(path).outputStream().use { out ->
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
                }
                true
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to save screenshot to: $path", e)
                false
            } finally {
                bitmap.recycle()
            }
        }

        /**
         * 获取当前包名
         */
        fun getCurrentPackageName(): String? {
            val service = instance ?: return null
            return service.rootInActiveWindow?.packageName?.toString()
        }

        /**
         * 检查服务是否在系统设置中启用
         */
        fun isAccessibilityServiceEnabled(): Boolean = _isServiceEnabled.value

        /**
         * 创建虚拟屏幕
         */
        fun createVirtualDisplay(width: Int, height: Int, densityDpi: Int): Int? {
            val service = instance ?: return null
            return try {
                releaseVirtualDisplay()

                imageReader = ImageReader.newInstance(width, height, PixelFormat.RGBA_8888, 2)

                virtualDisplay = service.displayManager.createVirtualDisplay(
                    "OperitVirtualDisplay",
                    width,
                    height,
                    densityDpi,
                    imageReader?.surface,
                    DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR
                )

                _isVirtualDisplayActive.value = true
                virtualDisplay?.display?.displayId
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to create virtual display", e)
                null
            }
        }

        /**
         * 释放虚拟屏幕
         */
        fun releaseVirtualDisplay() {
            try {
                virtualDisplay?.release()
                imageReader?.close()
                virtualDisplay = null
                imageReader = null
                _isVirtualDisplayActive.value = false
                AppLogger.d(TAG, "Virtual display released")
            } catch (e: Exception) {
                AppLogger.e(TAG, "Error releasing virtual display", e)
            }
        }

        /**
         * 获取虚拟屏幕截图
         */
        fun getVirtualDisplayScreenshot(): Bitmap? {
            val reader = imageReader ?: return null
            return try {
                val image = reader.acquireLatestImage()
                if (image != null) {
                    val planes = image.planes
                    val buffer = planes[0].buffer
                    val pixelStride = planes[0].pixelStride
                    val rowStride = planes[0].rowStride
                    val rowPadding = rowStride - pixelStride * image.width

                    val bitmap = Bitmap.createBitmap(
                        image.width + rowPadding / pixelStride,
                        image.height,
                        Bitmap.Config.ARGB_8888
                    )
                    buffer.rewind()
                    bitmap.copyPixelsFromBuffer(buffer)

                    // 裁剪到实际大小
                    val cropped = Bitmap.createBitmap(bitmap, 0, 0, image.width, image.height)
                    bitmap.recycle()
                    image.close()
                    cropped
                } else {
                    null
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to get virtual display screenshot", e)
                null
            }
        }

        /**
         * 在虚拟屏幕上执行点击
         */
        fun performClickOnVirtualDisplay(x: Int, y: Int): Boolean {
            val service = instance ?: return false
            return try {
                val displayId = virtualDisplay?.display?.displayId ?: return false
                val gesture = createClickGesture(x, y)
                service.dispatchGesture(gesture, null, null)
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform click on virtual display", e)
                false
            }
        }

        // ========== 私有辅助方法 ==========

        private fun findNodeAtCoordinates(node: AccessibilityNodeInfo, x: Int, y: Int): AccessibilityNodeInfo? {
            val bounds = Rect()
            node.getBoundsInScreen(bounds)

            if (!bounds.contains(x, y)) {
                return null
            }

            for (i in node.childCount - 1 downTo 0) {
                val child = node.getChild(i) ?: continue
                val result = findNodeAtCoordinates(child, x, y)
                if (result != null) {
                    if (result != child) {
                        child.recycle()
                    }
                    return result
                }
                child.recycle()
            }

            return AccessibilityNodeInfo.obtain(node)
        }

        private fun findNodeById(node: AccessibilityNodeInfo, id: String): AccessibilityNodeInfo? {
            if (node.viewIdResourceName == id) {
                return node
            }
            for (i in 0 until node.childCount) {
                val child = node.getChild(i) ?: continue
                val result = findNodeById(child, id)
                if (result != null) {
                    if (result != child) {
                        child.recycle()
                    }
                    return result
                }
                child.recycle()
            }
            return null
        }

        private fun findFocusedNode(node: AccessibilityNodeInfo): AccessibilityNodeInfo? {
            if (node.isFocused) {
                return node
            }
            for (i in 0 until node.childCount) {
                val child = node.getChild(i) ?: continue
                val result = findFocusedNode(child)
                if (result != null) {
                    if (result != child) {
                        child.recycle()
                    }
                    return result
                }
                child.recycle()
            }
            return null
        }

        private fun createClickGesture(x: Int, y: Int): GestureDescription {
            val path = android.graphics.Path()
            path.moveTo(x.toFloat(), y.toFloat())
            val stroke = GestureDescription.StrokeDescription(path, 0, 100)
            return GestureDescription.Builder().addStroke(stroke).build()
        }

        private fun createLongPressGesture(x: Int, y: Int): GestureDescription {
            val path = android.graphics.Path()
            path.moveTo(x.toFloat(), y.toFloat())
            val stroke = GestureDescription.StrokeDescription(path, 0, 500)
            return GestureDescription.Builder().addStroke(stroke).build()
        }

        private fun createSwipeGesture(startX: Int, startY: Int, endX: Int, endY: Int, durationMs: Long): GestureDescription {
            val path = android.graphics.Path()
            path.moveTo(startX.toFloat(), startY.toFloat())
            path.lineTo(endX.toFloat(), endY.toFloat())
            val stroke = GestureDescription.StrokeDescription(path, 0, durationMs)
            return GestureDescription.Builder().addStroke(stroke).build()
        }

        /**
         * 截图回调类
         */
        private class ScreenshotCallback : AccessibilityService.TakeScreenshotCallback {
            private val handler = Handler(Looper.getMainLooper())
            private var result: Bitmap? = null
            private var isComplete = false

            override fun onSuccess(screenshot: AccessibilityService.ScreenshotResult) {
                val hardwareBuffer = screenshot.hardwareBuffer
                if (hardwareBuffer != null) {
                    result = Bitmap.wrapHardwareBuffer(hardwareBuffer, null)?.copy(Bitmap.Config.ARGB_8888, false)
                    hardwareBuffer.close()
                }
                isComplete = true
            }

            override fun onFailure(error: Int) {
                AppLogger.e(TAG, "Screenshot failed with error code: $error")
                isComplete = true
            }

            fun getBitmap(): Bitmap? {
                // 等待结果（最多2秒）
                val startTime = System.currentTimeMillis()
                while (!isComplete && System.currentTimeMillis() - startTime < 2000) {
                    Thread.sleep(50)
                }
                return result
            }
        }
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        instance = this
        _isServiceEnabled.value = true
        AppLogger.d(TAG, "Accessibility service connected")
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        event ?: return

        if (event.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            val className = event.className?.toString()
            if (!className.isNullOrEmpty()) {
                _currentActivityName.value = className
                AppLogger.d(TAG, "Activity changed: $className")
            }
        }
    }

    override fun onInterrupt() {
        instance = null
        _isServiceEnabled.value = false
        _currentActivityName.value = ""
        AppLogger.d(TAG, "Accessibility service interrupted")
    }

    override fun onUnbind(intent: Intent?): Boolean {
        releaseVirtualDisplay()
        instance = null
        _isServiceEnabled.value = false
        _currentActivityName.value = ""
        AppLogger.d(TAG, "Accessibility service unbound")
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        releaseVirtualDisplay()
        super.onDestroy()
    }
}
