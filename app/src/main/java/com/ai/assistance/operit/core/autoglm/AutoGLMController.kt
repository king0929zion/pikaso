package com.ai.assistance.operit.core.autoglm

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Rect
import android.os.Build
import android.view.accessibility.AccessibilityNodeInfo
import android.accessibilityservice.AccessibilityService
import com.ai.assistance.operit.core.accessibility.OperitAccessibilityService
import com.ai.assistance.operit.core.input.InputMethodManager
import com.ai.assistance.operit.core.vision.VisionActionExecutor
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * AutoGLM 核心控制器
 *
 * 功能：
 * - 协调无障碍服务和Shizuku实现设备自动化
 * - 优先使用无障碍服务进行点击、滑动等操作
 * - 使用Shizuku输入法进行文本输入
 * - 支持虚拟屏幕操作
 */
class AutoGLMController(private val context: Context) {

    companion object {
        private const val TAG = "AutoGLMController"

        @Volatile
        private var instance: AutoGLMController? = null

        fun getInstance(context: Context): AutoGLMController {
            return instance ?: synchronized(this) {
                instance ?: AutoGLMController(context.applicationContext).also { instance = it }
            }
        }
    }

    // 执行状态
    private val _isExecuting = MutableStateFlow(false)
    val isExecuting: StateFlow<Boolean> = _isExecuting.asStateFlow()

    // 当前状态消息
    private val _statusMessage = MutableStateFlow("")
    val statusMessage: StateFlow<String> = _statusMessage.asStateFlow()

    // 进度 (0-100)
    private val _progress = MutableStateFlow(0)
    val progress: StateFlow<Int> = _progress.asStateFlow()

    // 执行日志
    private val _executionLog = MutableStateFlow("")
    val executionLog: StateFlow<String> = _executionLog.asStateFlow()

    // 异常状态
    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    private var executionJob: Job? = null
    private var currentStep = 0
    private var maxSteps = 20

    /**
     * 检查所需权限是否可用
     */
    fun checkPermissions(): PermissionCheckResult {
        val accessibilityEnabled = OperitAccessibilityService.isAccessibilityServiceEnabled()
        val shizukuAvailable = InputMethodManager.checkShizukuAvailability()

        return PermissionCheckResult(
            accessibilityEnabled = accessibilityEnabled,
            shizukuEnabled = shizukuAvailable,
            canExecute = accessibilityEnabled || shizukuAvailable
        )
    }

    /**
     * 执行自动化任务
     */
    suspend fun executeTask(task: String, maxSteps: Int = 20): ExecutionResult {
        if (_isExecuting.value) {
            return ExecutionResult(
                success = false,
                error = "任务正在执行中，请先取消当前任务"
            )
        }

        this.maxSteps = maxSteps
        currentStep = 0

        // 检查权限
        val permissions = checkPermissions()
        if (!permissions.canExecute) {
            val errorMsg = buildString {
                if (!permissions.accessibilityEnabled) {
                    appendLine("- 无障碍服务未启用（用于点击、滑动等操作）")
                }
                if (!permissions.shizukuEnabled) {
                    appendLine("- Shizuku服务未运行（用于输入法切换和文本输入）")
                }
            }
            return ExecutionResult(success = false, error = "权限不足：\n$errorMsg")
        }

        return withContext(Dispatchers.IO) {
            _isExecuting.value = true
            _error.value = null
            _progress.value = 0
            _executionLog.value = ""
            addLog("开始执行任务: $task")
            addLog("权限检查: 无障碍=${permissions.accessibilityEnabled}, Shizuku=${permissions.shizukuEnabled}")

            try {
                executeTaskInternal(task)
            } finally {
                _isExecuting.value = false
            }
        }
    }

    /**
     * 取消当前执行的任务
     */
    fun cancelTask() {
        executionJob?.cancel()
        executionJob = null
        _isExecuting.value = false
        addLog("任务已取消")
    }

    /**
     * 清除任务状态
     */
    fun clearTask() {
        _executionLog.value = ""
        _statusMessage.value = ""
        _progress.value = 0
        _error.value = null
        currentStep = 0
    }

    // ========== 私有方法 ==========

    private suspend fun executeTaskInternal(task: String): ExecutionResult {
        // 示例：执行一系列操作
        // 实际实现应该根据任务内容调用相应的操作

        try {
            // 模拟执行步骤
            repeat(maxSteps) { step ->
                if (!currentCoroutineContext().isActive) {
                    addLog("执行被中断")
                    return ExecutionResult(success = false, error = "执行被中断")
                }

                currentStep = step + 1
                val progressPercent = (currentStep * 100) / maxSteps
                _progress.value = progressPercent
                _statusMessage.value = "执行步骤 $currentStep / $maxSteps"

                addLog("步骤 $currentStep: 执行中...")

                // 模拟每个步骤的执行时间
                delay(500)
            }

            _progress.value = 100
            _statusMessage.value = "任务完成"
            addLog("任务执行完成")

            return ExecutionResult(
                success = true,
                message = "任务执行完成，共执行 $currentStep 步"
            )
        } catch (e: CancellationException) {
            addLog("任务被取消")
            return ExecutionResult(success = false, error = "任务被取消")
        } catch (e: Exception) {
            val errorMsg = "执行出错: ${e.message}"
            addLog(errorMsg)
            _error.value = errorMsg
            return ExecutionResult(success = false, error = errorMsg)
        }
    }

    private fun addLog(message: String) {
        val timestamp = java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.getDefault())
            .format(java.util.Date())
        val logLine = "[$timestamp] $message"
        _executionLog.value = if (_executionLog.value.isEmpty()) {
            logLine
        } else {
            "${_executionLog.value}\n$logLine"
        }
        AppLogger.d(TAG, message)
    }

    // ========== 设备操作方法 ==========

    /**
     * 执行点击操作 - 优先使用无障碍服务
     */
    suspend fun tap(x: Int, y: Int): Boolean {
        return withContext(Dispatchers.IO) {
            // 优先使用无障碍服务
            if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
                val result = OperitAccessibilityService.performClick(x, y)
                if (result) {
                    addLog("点击 ($x, $y) - 无障碍服务")
                    return@withContext true
                }
            }

            // 回退到Shizuku ADB
            if (VisionActionExecutor.hasPermission()) {
                val result = VisionActionExecutor.tap(context, x, y)
                if (result) {
                    addLog("点击 ($x, $y) - Shizuku ADB")
                    return@withContext true
                }
            }

            addLog("点击 ($x, $y) - 失败")
            false
        }
    }

    /**
     * 执行滑动操作 - 优先使用无障碍服务
     */
    suspend fun swipe(startX: Int, startY: Int, endX: Int, endY: Int, duration: Long = 300): Boolean {
        return withContext(Dispatchers.IO) {
            if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
                val result = OperitAccessibilityService.performSwipe(startX, startY, endX, endY, duration)
                if (result) {
                    addLog("滑动从 ($startX, $startY) 到 ($endX, $endY) - 无障碍服务")
                    return@withContext true
                }
            }

            if (VisionActionExecutor.hasPermission()) {
                val result = VisionActionExecutor.swipe(context, startX, startY, endX, endY, duration)
                if (result) {
                    addLog("滑动从 ($startX, $startY) 到 ($endX, $endY) - Shizuku ADB")
                    return@withContext true
                }
            }

            addLog("滑动 - 失败")
            false
        }
    }

    /**
     * 执行长按操作
     */
    suspend fun longPress(x: Int, y: Int): Boolean {
        return withContext(Dispatchers.IO) {
            if (OperitAccessibilityService.isAccessibilityServiceEnabled()) {
                val result = OperitAccessibilityService.performLongPress(x, y)
                if (result) {
                    addLog("长按 ($x, $y) - 无障碍服务")
                    return@withContext true
                }
            }

            if (VisionActionExecutor.hasPermission()) {
                val result = VisionActionExecutor.longPress(context, x, y)
                if (result) {
                    addLog("长按 ($x, $y) - Shizuku ADB")
                    return@withContext true
                }
            }

            addLog("长按 - 失败")
            false
        }
    }

    /**
     * 输入文本 - 使用Shizuku输入法
     */
    suspend fun inputText(text: String): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                val success = InputMethodManager.inputText(context, text)
                if (success) {
                    addLog("输入文本: ${text.take(50)}${if (text.length > 50) "..." else ""}")
                }
                success
            } catch (e: Exception) {
                addLog("输入文本失败: ${e.message}")
                false
            }
        }
    }

    /**
     * 按返回键
     */
    suspend fun pressBack(): Boolean {
        return withContext(Dispatchers.IO) {
            if (OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_BACK)) {
                addLog("按下返回键 - 无障碍服务")
                return@withContext true
            }

            if (VisionActionExecutor.pressBack(context)) {
                addLog("按下返回键 - Shizuku ADB")
                return@withContext true
            }

            addLog("按下返回键 - 失败")
            false
        }
    }

    /**
     * 按Home键
     */
    suspend fun pressHome(): Boolean {
        return withContext(Dispatchers.IO) {
            if (OperitAccessibilityService.performGlobalAction(AccessibilityService.GLOBAL_ACTION_HOME)) {
                addLog("按下Home键 - 无障碍服务")
                return@withContext true
            }

            if (VisionActionExecutor.pressHome(context)) {
                addLog("按下Home键 - Shizuku ADB")
                return@withContext true
            }

            addLog("按下Home键 - 失败")
            false
        }
    }

    /**
     * 截取屏幕截图
     */
    suspend fun takeScreenshot(): Bitmap? {
        return withContext(Dispatchers.IO) {
            OperitAccessibilityService.takeScreenshot()
        }
    }

    /**
     * 获取当前界面层次结构
     */
    suspend fun getUIHierarchy(): String {
        return withContext(Dispatchers.IO) {
            OperitAccessibilityService.getUIHierarchy()
        }
    }

    /**
     * 获取当前包名
     */
    fun getCurrentPackageName(): String? {
        return OperitAccessibilityService.getCurrentPackageName()
    }

    /**
     * 创建虚拟屏幕
     */
    fun createVirtualDisplay(width: Int, height: Int, densityDpi: Int): Int? {
        return OperitAccessibilityService.createVirtualDisplay(width, height, densityDpi)
    }

    /**
     * 释放虚拟屏幕
     */
    fun releaseVirtualDisplay() {
        OperitAccessibilityService.releaseVirtualDisplay()
    }
}

// ========== 数据类 ==========

/**
 * 权限检查结果
 */
data class PermissionCheckResult(
    val accessibilityEnabled: Boolean,
    val shizukuEnabled: Boolean,
    val canExecute: Boolean
)

/**
 * 执行结果
 */
data class ExecutionResult(
    val success: Boolean,
    val message: String? = null,
    val error: String? = null
)
