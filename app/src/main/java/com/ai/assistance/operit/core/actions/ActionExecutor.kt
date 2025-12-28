package com.ai.assistance.operit.core.actions

import android.content.Context
import android.accessibilityservice.AccessibilityService
import com.ai.assistance.operit.core.accessibility.OperitAccessibilityService
import com.ai.assistance.operit.core.input.OperitInputMethodService
import com.ai.assistance.operit.core.vision.VisionActionExecutor
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.delay
import kotlin.math.max
import kotlin.math.min

/**
 * 统一动作执行器
 *
 * 优先使用无障碍服务实现动作，如果不可用则使用ADB/Shizuku命令
 * 结合了无障碍服务的稳定性和ADB/Shizuku命令的通用性
 *
 * 设计原则：
 * 1. 点击、滑动、长按等手势操作：优先使用无障碍服务
 * 2. 文本输入：使用输入法服务（通过无障碍切换输入法）
 * 3. 全局操作（返回、Home等）：使用无障碍服务
 * 4. 截图：优先使用无障碍服务，否则使用ADB
 */
object ActionExecutor {
    private const val TAG = "ActionExecutor"

    /**
     * 检查是否可以使用无障碍服务
     */
    fun canUseAccessibilityService(): Boolean {
        return OperitAccessibilityService.isAccessibilityServiceEnabled()
    }

    /**
     * 检查是否可以使用输入法
     */
    fun canUseInputMethod(): Boolean {
        return OperitInputMethodService.getInstance() != null
    }

    /**
     * 点击操作 - 优先使用无障碍服务
     */
    suspend fun tap(context: Context, x: Int, y: Int): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performClick(x, y).also {
                AppLogger.d(TAG, "Tap via Accessibility: ($x, $y) = $it")
            }
        } else {
            VisionActionExecutor.tap(context, x, y).also {
                AppLogger.d(TAG, "Tap via ADB: ($x, $y) = $it")
            }
        }
    }

    /**
     * 双击操作
     */
    suspend fun doubleTap(context: Context, x: Int, y: Int): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performDoubleTap(x, y).also {
                AppLogger.d(TAG, "Double tap via Accessibility: ($x, $y) = $it")
            }
        } else {
            // 降级：快速连续点击两次
            val result1 = tap(context, x, y)
            delay(100)
            val result2 = tap(context, x, y)
            result1 && result2
        }
    }

    /**
     * 长按操作
     */
    suspend fun longPress(context: Context, x: Int, y: Int): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performLongPress(x, y).also {
                AppLogger.d(TAG, "Long press via Accessibility: ($x, $y) = $it")
            }
        } else {
            VisionActionExecutor.longPress(context, x, y)
        }
    }

    /**
     * 滑动操作 - 支持多种滑动模式
     */
    suspend fun swipe(
        context: Context,
        startX: Int,
        startY: Int,
        endX: Int,
        endY: Int,
        durationMs: Long? = null
    ): Boolean {
        return if (canUseAccessibilityService()) {
            val duration = durationMs ?: calculateSwipeDuration(startX, startY, endX, endY)
            OperitAccessibilityService.performSwipe(startX, startY, endX, endY, duration).also {
                AppLogger.d(TAG, "Swipe via Accessibility: ($startX, $startY) -> ($endX, $endY) = $it")
            }
        } else {
            VisionActionExecutor.swipe(context, startX, startY, endX, endY, durationMs).also {
                AppLogger.d(TAG, "Swipe via ADB: ($startX, $startY) -> ($endX, $endY) = $it")
            }
        }
    }

    /**
     * 滑动指定距离（用于滚动）
     */
    suspend fun scrollDown(context: Context, x: Int, y: Int, distance: Int = 500): Boolean {
        return swipe(context, x, y, x, y + distance, 300)
    }

    suspend fun scrollUp(context: Context, x: Int, y: Int, distance: Int = 500): Boolean {
        return swipe(context, x, y, x, y - distance, 300)
    }

    /**
     * 向左滑动
     */
    suspend fun swipeLeft(context: Context, x: Int, y: Int, distance: Int = 300): Boolean {
        return swipe(context, x, y, x - distance, y, 300)
    }

    /**
     * 向右滑动
     */
    suspend fun swipeRight(context: Context, x: Int, y: Int, distance: Int = 300): Boolean {
        return swipe(context, x, y, x + distance, y, 300)
    }

    /**
     * 返回键
     */
    suspend fun pressBack(context: Context): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_BACK).also {
                AppLogger.d(TAG, "Press back via Accessibility: $it")
            }
        } else {
            VisionActionExecutor.pressBack(context)
        }
    }

    /**
     * Home键
     */
    suspend fun pressHome(context: Context): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_HOME).also {
                AppLogger.d(TAG, "Press home via Accessibility: $it")
            }
        } else {
            VisionActionExecutor.pressHome(context)
        }
    }

    /**
     * 最近任务键
     */
    suspend fun pressRecent(context: Context): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_RECENTS).also {
                AppLogger.d(TAG, "Press recent via Accessibility: $it")
            }
        } else {
            VisionActionExecutor.pressRecent(context)
        }
    }

    /**
     * 电源键
     */
    suspend fun pressPower(context: Context): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_POWER_DIALOG).also {
                AppLogger.d(TAG, "Press power via Accessibility: $it")
            }
        } else {
            VisionActionExecutor.pressPower(context)
        }
    }

    /**
     * 通知栏
     */
    suspend fun expandNotification(context: Context): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_NOTIFICATIONS).also {
                AppLogger.d(TAG, "Expand notification via Accessibility: $it")
            }
        } else {
            VisionActionExecutor.expandNotification(context)
        }
    }

    /**
     * 快速设置
     */
    suspend fun expandQuickSettings(context: Context): Boolean {
        return if (canUseAccessibilityService()) {
            OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_QUICK_SETTINGS).also {
                AppLogger.d(TAG, "Expand quick settings via Accessibility: $it")
            }
        } else {
            VisionActionExecutor.expandQuickSettings(context)
        }
    }

    /**
     * 输入文本 - 通过输入法实现
     * 这是最可靠的文本输入方式
     */
    suspend fun inputText(context: Context, text: String): Boolean {
        val ime = OperitInputMethodService.getInstance()
        return if (ime != null && ime.isInputActive()) {
            ime.commitText(text).also {
                AppLogger.d(TAG, "Input text via IME: ${text.take(50)}... = $it")
            }
        } else {
            // 尝试使用 InputMethodManager
            com.ai.assistance.operit.core.input.InputMethodManager.inputText(context, text).also {
                AppLogger.d(TAG, "Input text via InputMethodManager: ${text.take(50)}... = $it")
            }
        }
    }

    /**
     * 输入多行文本
     */
    suspend fun inputMultilineText(context: Context, text: String): Boolean {
        val ime = OperitInputMethodService.getInstance()
        return if (ime != null && ime.isInputActive()) {
            ime.commitMultilineText(text).also {
                AppLogger.d(TAG, "Input multiline text: ${text.lines().size} lines = $it")
            }
        } else {
            inputText(context, text)
        }
    }

    /**
     * 清空输入框
     */
    suspend fun clearText(context: Context): Boolean {
        return if (canUseAccessibilityService()) {
            // 尝试通过无障碍服务清空（找到焦点节点并清空）
            val focusedNodeId = OperitAccessibilityService.findFocusedNodeId()
            if (focusedNodeId != null) {
                OperitAccessibilityService.setText(focusedNodeId, "").also {
                    AppLogger.d(TAG, "Clear text via Accessibility node: $it")
                }
            } else {
                // 降级到输入法清空
                com.ai.assistance.operit.core.input.InputMethodManager.clearText(context).also {
                    AppLogger.d(TAG, "Clear text via InputMethodManager: $it")
                }
            }
        } else {
            // 通过输入法清空
            VisionActionExecutor.clearText(context)
        }
    }

    /**
     * 删除指定数量的字符
     */
    suspend fun deleteCharacters(context: Context, count: Int): Boolean {
        val ime = OperitInputMethodService.getInstance()
        return if (ime != null && ime.isInputActive()) {
            ime.deleteCharacters(count).also {
                AppLogger.d(TAG, "Delete $count characters via IME: $it")
            }
        } else {
            false
        }
    }

    /**
     * 启动应用
     */
    suspend fun launchApp(context: Context, packageName: String): Boolean {
        return VisionActionExecutor.launchApp(context, packageName).also {
            AppLogger.d(TAG, "Launch app: $packageName = $it")
        }
    }

    /**
     * 打开URL
     */
    suspend fun openUrl(context: Context, url: String): Boolean {
        return VisionActionExecutor.openUrl(context, url).also {
            AppLogger.d(TAG, "Open URL: $url = $it")
        }
    }

    /**
     * 截图
     */
    suspend fun captureScreenshot(context: Context): android.graphics.Bitmap? {
        return if (canUseAccessibilityService()) {
            // 优先使用无障碍服务截图（Android 13+）
            val bitmap = OperitAccessibilityService.takeScreenshot()
            if (bitmap != null) {
                AppLogger.d(TAG, "Screenshot via Accessibility: ${bitmap.width}x${bitmap.height}")
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
     * 保存截图到文件
     */
    suspend fun saveScreenshot(context: Context, path: String): Boolean {
        return OperitAccessibilityService.saveScreenshotToFile(path).also {
            AppLogger.d(TAG, "Save screenshot to $path: $it")
        }
    }

    /**
     * 获取当前Activity名称
     */
    fun getCurrentActivityName(): String {
        return OperitAccessibilityService.currentActivityName.value
    }

    /**
     * 检查权限
     */
    fun hasRequiredPermissions(context: Context): Boolean {
        return canUseAccessibilityService() || VisionActionExecutor.hasPermission()
    }

    /**
     * 获取当前包名
     */
    suspend fun getCurrentPackage(context: Context): String? {
        return VisionActionExecutor.getCurrentPackage(context)
    }

    /**
     * 获取UI层次结构（用于AI分析）
     */
    fun getUIHierarchy(): String {
        return OperitAccessibilityService.getUIHierarchy()
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
