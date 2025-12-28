package com.ai.assistance.operit.core.actions

import android.content.Context
import com.ai.assistance.operit.core.accessibility.OperitAccessibilityService
import com.ai.assistance.operit.core.vision.VisionActionExecutor
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.delay

/**
 * 统一动作执行器
 *
 * 优先使用无障碍服务实现动作，如果不可用则使用ADB命令
 * 结合了无障碍服务的稳定性和ADB命令的通用性
 */
object ActionExecutor {
    private const val TAG = "ActionExecutor"

    /**
     * 点击操作
     */
    suspend fun tap(context: Context, x: Int, y: Int): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            // 优先使用无障碍服务
            OperitAccessibilityService.performClick(x, y).also {
                AppLogger.d(TAG, "Tap via Accessibility: ($x, $y) = $it")
            }
        } else {
            // 降级到ADB命令
            VisionActionExecutor.tap(context, x, y).also {
                AppLogger.d(TAG, "Tap via ADB: ($x, $y) = $it")
            }
        }
    }

    /**
     * 双击操作
     */
    suspend fun doubleTap(context: Context, x: Int, y: Int): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            // 使用无障碍服务连续点击两次
            val result1 = OperitAccessibilityService.performClick(x, y)
            delay(100)
            val result2 = OperitAccessibilityService.performClick(x, y)
            result1 && result2
        } else {
            VisionActionExecutor.doubleTap(context, x, y)
        }
    }

    /**
     * 长按操作
     */
    suspend fun longPress(context: Context, x: Int, y: Int): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            OperitAccessibilityService.performLongPress(x, y)
        } else {
            VisionActionExecutor.longPress(context, x, y)
        }
    }

    /**
     * 滑动操作
     */
    suspend fun swipe(
        context: Context,
        startX: Int,
        startY: Int,
        endX: Int,
        endY: Int,
        durationMs: Long? = null
    ): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            val duration = durationMs ?: calculateSwipeDuration(startX, startY, endX, endY)
            OperitAccessibilityService.performSwipe(startX, startY, endX, endY, duration)
        } else {
            VisionActionExecutor.swipe(context, startX, startY, endX, endY, durationMs)
        }
    }

    /**
     * 返回键
     */
    suspend fun pressBack(context: Context): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            OperitAccessibilityService.performGlobalAction(android.view.accessibility.AccessibilityService.GLOBAL_ACTION_BACK)
        } else {
            VisionActionExecutor.pressBack(context)
        }
    }

    /**
     * Home键
     */
    suspend fun pressHome(context: Context): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            OperitAccessibilityService.performGlobalAction(android.view.accessibility.AccessibilityService.GLOBAL_ACTION_HOME)
        } else {
            VisionActionExecutor.pressHome(context)
        }
    }

    /**
     * 最近任务键
     */
    suspend fun pressRecent(context: Context): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            OperitAccessibilityService.performGlobalAction(android.view.accessibility.AccessibilityService.GLOBAL_ACTION_RECENTS)
        } else {
            VisionActionExecutor.pressRecent(context)
        }
    }

    /**
     * 输入文本 - 通过输入法实现
     */
    suspend fun inputText(context: Context, text: String): Boolean {
        // 文本输入总是通过输入法实现，因为这是最可靠的方式
        return com.ai.assistance.operit.core.input.InputMethodManager.inputText(context, text)
    }

    /**
     * 清空输入框
     */
    suspend fun clearText(context: Context): Boolean {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            // 尝试通过无障碍服务清空（找到焦点节点并清空）
            val focusedNodeId = OperitAccessibilityService.findFocusedNodeId()
            if (focusedNodeId != null) {
                OperitAccessibilityService.setText(focusedNodeId, "")
            } else {
                // 降级到输入法清空
                com.ai.assistance.operit.core.input.InputMethodManager.clearText(context)
            }
        } else {
            // 通过输入法清空（Ctrl+A + Delete）
            VisionActionExecutor.clearText(context)
        }
    }

    /**
     * 启动应用
     */
    suspend fun launchApp(context: Context, packageName: String): Boolean {
        // 启动应用总是通过ADB实现（monkey命令）
        return VisionActionExecutor.launchApp(context, packageName)
    }

    /**
     * 截图
     */
    suspend fun captureScreenshot(context: Context): android.graphics.Bitmap? {
        return if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
            // 优先使用无障碍服务截图（Android 13+）
            val bitmap = OperitAccessibilityService.takeScreenshot()
            if (bitmap != null) {
                bitmap
            } else {
                // 降级到ADB截图
                com.ai.assistance.operit.core.vision.VisionScreenshotManager.captureScreenshot(context)
            }
        } else {
            // 使用ADB截图
            com.ai.assistance.operit.core.vision.VisionScreenshotManager.captureScreenshot(context)
        }
    }

    /**
     * 检查权限
     */
    fun hasRequiredPermissions(context: Context): Boolean {
        return OperitAccessibilityService.isAccessibilityServiceEnabled() ||
                VisionActionExecutor.hasPermission()
    }

    /**
     * 获取当前包名
     */
    suspend fun getCurrentPackage(context: Context): String? {
        return VisionActionExecutor.getCurrentPackage(context)
    }

    /**
     * 计算滑动时长
     */
    private fun calculateSwipeDuration(x1: Int, y1: Int, x2: Int, y2: Int): Long {
        val distanceSquared = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)
        val duration = (distanceSquared / 1000).toLong()
        return max(300, min(duration, 2000))
    }
}
