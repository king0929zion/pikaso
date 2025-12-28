package com.ai.assistance.operit.data.repository

import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Settings
import com.ai.assistance.operit.core.accessibility.OperitAccessibilityService
import com.ai.assistance.operit.util.AppLogger

/**
 * UI层次结构管理器
 * 负责与内置的无障碍服务通信，获取UI层次结构和执行操作。
 */
object UIHierarchyManager {
    private const val TAG = "UIHierarchyManager"

    /**
     * 检查无障碍服务是否在系统设置中启用
     */
    fun isAccessibilityServiceEnabled(context: Context): Boolean {
        return OperitAccessibilityService.isAccessibilityServiceEnabled()
    }

    /**
     * 打开系统无障碍服务设置页面
     */
    fun openAccessibilitySettings(context: Context) {
        try {
            val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (e: Exception) {
            AppLogger.e(TAG, "Failed to open accessibility settings", e)
            // 尝试备用方法
            try {
                val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            } catch (e2: Exception) {
                AppLogger.e(TAG, "Failed to open accessibility settings (fallback)", e2)
            }
        }
    }

    /**
     * 获取UI层次结构
     */
    fun getUIHierarchy(): String {
        return OperitAccessibilityService.getUIHierarchy()
    }

    /**
     * 执行点击操作
     */
    fun performClick(x: Int, y: Int): Boolean {
        return OperitAccessibilityService.performClick(x, y)
    }

    /**
     * 执行长按操作
     */
    fun performLongPress(x: Int, y: Int): Boolean {
        return OperitAccessibilityService.performLongPress(x, y)
    }

    /**
     * 执行滑动操作
     */
    fun performSwipe(startX: Int, startY: Int, endX: Int, endY: Int, duration: Long): Boolean {
        return OperitAccessibilityService.performSwipe(startX, startY, endX, endY, duration)
    }

    /**
     * 执行全局操作（返回、Home等）
     */
    fun performGlobalAction(action: Int): Boolean {
        return OperitAccessibilityService.performGlobalAction(action)
    }

    /**
     * 设置文本
     */
    fun setTextOnNode(nodeId: String, text: String): Boolean {
        return OperitAccessibilityService.setText(nodeId, text)
    }

    /**
     * 查找焦点节点ID
     */
    fun findFocusedNodeId(): String? {
        return OperitAccessibilityService.findFocusedNodeId()
    }

    /**
     * 截取屏幕截图
     */
    fun takeScreenshot(path: String): Boolean {
        return OperitAccessibilityService.saveScreenshotToFile(path)
    }

    /**
     * 获取当前Activity名称
     */
    fun getCurrentActivityName(): String? {
        return OperitAccessibilityService.currentActivityName.value
    }
}
