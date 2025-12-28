package com.ai.assistance.operit.core.accessibility

import android.accessibilityservice.AccessibilityService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Rect
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.xmlpull.v1.XmlSerializer
import java.io.File

/**
 * Operit 内置无障碍服务
 *
 * 功能：
 * - 获取UI层次结构
 * - 执行点击、滑动、长按等操作
 * - 截取屏幕截图
 * - 监听Activity变化
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
            sb.append(" selectable=\"${node.isSelectable}\"")
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

        // 执行点击
        fun performClick(x: Int, y: Int): Boolean {
            val service = instance ?: return false
            return try {
                val path = service.createPathForCoordinates(x, y)
                if (path != null) {
                    val result = path.performAction(AccessibilityNodeInfo.ACTION_CLICK)
                    path.recycle()
                    result
                } else {
                    // 使用手势执行点击
                    val stroke = GestureDescription.StrokeDescription(
                        createClickPath(x, y), 0, 100
                    )
                    val gesture = GestureDescription.Builder().addStroke(stroke).build()
                    service.dispatchGesture(gesture, null, null)
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform click at ($x, $y)", e)
                false
            }
        }

        // 执行长按
        fun performLongPress(x: Int, y: Int): Boolean {
            val service = instance ?: return false
            return try {
                val path = service.createPathForCoordinates(x, y)
                if (path != null) {
                    val result = path.performAction(AccessibilityNodeInfo.ACTION_LONG_CLICK)
                    path.recycle()
                    result
                } else {
                    // 使用手势执行长按
                    val stroke = GestureDescription.StrokeDescription(
                        createClickPath(x, y), 0, 500
                    )
                    val gesture = GestureDescription.Builder().addStroke(stroke).build()
                    service.dispatchGesture(gesture, null, null)
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform long press at ($x, $y)", e)
                false
            }
        }

        // 执行滑动
        fun performSwipe(startX: Int, startY: Int, endX: Int, endY: Int, duration: Long): Boolean {
            val service = instance ?: return false
            return try {
                val stroke = GestureDescription.StrokeDescription(
                    createSwipePath(startX, startY, endX, endY),
                    0,
                    duration
                )
                val gesture = GestureDescription.Builder().addStroke(stroke).build()
                service.dispatchGesture(gesture, null, null)
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform swipe from ($startX, $startY) to ($endX, $endY)", e)
                false
            }
        }

        // 执行全局操作（返回、Home等）
        fun performGlobalAction(action: Int): Boolean {
            val service = instance ?: return false
            return try {
                service.performGlobalAction(action)
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to perform global action: $action", e)
                false
            }
        }

        // 设置文本
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

        // 查找焦点节点ID
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

        // 截取屏幕截图 (Android 13+)
        fun takeScreenshot(): Bitmap? {
            val service = instance ?: return null
            return try {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                    var result: Bitmap? = null
                    service.takeScreenshot(
                        android.view.Display.DEFAULT_DISPLAY,
                        MainActivityExecutor { result = it },
                        null
                    )
                    result
                } else {
                    null
                }
            } catch (e: Exception) {
                AppLogger.e(TAG, "Failed to take screenshot", e)
                null
            }
        }

        // 保存截图到文件
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

        // 检查服务是否在系统设置中启用
        fun isAccessibilityServiceEnabled(): Boolean {
            return _isServiceEnabled.value
        }

        // 根据坐标查找节点
        private fun AccessibilityService.createPathForCoordinates(x: Int, y: Int): AccessibilityNodeInfo? {
            val rootNode = this.rootInActiveWindow ?: return null
            val result = findNodeAtCoordinates(rootNode, x, y)
            if (result != rootNode) {
                rootNode.recycle()
            }
            return result
        }

        private fun findNodeAtCoordinates(node: AccessibilityNodeInfo, x: Int, y: Int): AccessibilityNodeInfo? {
            val bounds = Rect()
            node.getBoundsInScreen(bounds)

            if (!bounds.contains(x, y)) {
                return null
            }

            // 检查子节点
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

            // 如果没有子节点匹配，返回当前节点
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

        private fun createClickPath(x: Int, y: Int): android.graphics.Path {
            val path = android.graphics.Path()
            path.moveTo(x.toFloat(), y.toFloat())
            return path
        }

        private fun createSwipePath(x1: Int, y1: Int, x2: Int, y2: Int): android.graphics.Path {
            val path = android.graphics.Path()
            path.moveTo(x1.toFloat(), y1.toFloat())
            path.lineTo(x2.toFloat(), y2.toFloat())
            return path
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

        // 监听窗口状态变化，获取当前Activity名称
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
        instance = null
        _isServiceEnabled.value = false
        _currentActivityName.value = ""
        AppLogger.d(TAG, "Accessibility service unbound")
        return super.onUnbind(intent)
    }

    // 截图回调 (Android 13+)
    private class MainActivityExecutor(private val callback: (Bitmap?) -> Unit) :
        AccessibilityService.TakeScreenshotCallback {
        override fun onSuccess(screenshot: ScreenshotResult) {
            val hardwareBuffer = screenshot.hardwareBuffer
            if (hardwareBuffer != null) {
                val bitmap = Bitmap.wrapHardwareBuffer(hardwareBuffer, null)
                callback(bitmap?.copy(Bitmap.Config.ARGB_8888, false))
                hardwareBuffer.close()
            } else {
                callback(null)
            }
        }

        override fun onFailure(error: Int) {
            AppLogger.e(TAG, "Screenshot failed with error code: $error")
            callback(null)
        }
    }
}
