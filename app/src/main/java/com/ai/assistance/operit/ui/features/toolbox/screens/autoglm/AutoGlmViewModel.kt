package com.ai.assistance.operit.ui.features.toolbox.screens.autoglm

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ai.assistance.operit.R
import com.ai.assistance.operit.api.chat.EnhancedAIService
import com.ai.assistance.operit.core.autoglm.AutoGLMController
import com.ai.assistance.operit.core.autoglm.PermissionCheckResult
import com.ai.assistance.operit.core.config.FunctionalPrompts
import com.ai.assistance.operit.core.tools.agent.ActionHandler
import com.ai.assistance.operit.core.tools.agent.AgentConfig
import com.ai.assistance.operit.core.tools.agent.PhoneAgent
import com.ai.assistance.operit.core.tools.agent.StepResult
import com.ai.assistance.operit.core.tools.defaultTool.ToolGetter
import com.ai.assistance.operit.data.model.FunctionType
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

/**
 * AutoGLM UI State
 */
data class AutoGlmUiState(
    val isLoading: Boolean = false,
    val task: String = "",
    val status: String? = null,
    val progress: Int = 0,
    val log: String = "Ready to execute task.",
    val isLogExpanded: Boolean = false,
    val permissions: PermissionCheckResult = PermissionCheckResult(false, false, false),
    val error: String? = null
)

/**
 * AutoGLM ViewModel
 *
 * Manages the UI state and coordinates with AutoGLMController
 * for permission checking and basic operations
 */
class AutoGlmViewModel(private val context: Context) : ViewModel() {

    private val controller = AutoGLMController.getInstance(context)
    private var executionJob: Job? = null

    private val _uiState = MutableStateFlow(AutoGlmUiState())
    val uiState: StateFlow<AutoGlmUiState> = _uiState.asStateFlow()

    init {
        // 监听控制器状态
        viewModelScope.launch {
            controller.isExecuting.collect { isExecuting ->
                _uiState.value = _uiState.value.copy(isLoading = isExecuting)
            }
        }

        viewModelScope.launch {
            controller.statusMessage.collect { status ->
                _uiState.value = _uiState.value.copy(status = status)
            }
        }

        viewModelScope.launch {
            controller.progress.collect { progress ->
                _uiState.value = _uiState.value.copy(progress = progress)
            }
        }

        viewModelScope.launch {
            controller.executionLog.collect { log ->
                _uiState.value = _uiState.value.copy(log = log)
            }
        }

        viewModelScope.launch {
            controller.error.collect { error ->
                _uiState.value = _uiState.value.copy(error = error)
            }
        }

        // 初始化时检查权限
        checkPermissions()
    }

    /**
     * 检查权限状态
     */
    fun checkPermissions() {
        val permissions = controller.checkPermissions()
        _uiState.value = _uiState.value.copy(permissions = permissions)
    }

    fun setTask(task: String) {
        _uiState.value = _uiState.value.copy(task = task, error = null)
    }

    fun clearTask() {
        _uiState.value = _uiState.value.copy(task = "", error = null)
        controller.clearTask()
    }

    fun executeTask(task: String) {
        if (task.isBlank()) {
            _uiState.value = _uiState.value.copy(error = "请输入任务描述")
            return
        }

        val permissions = controller.checkPermissions()
        if (!permissions.canExecute) {
            _uiState.value = _uiState.value.copy(
                error = buildString {
                    appendLine("需要以下权限才能执行自动化任务：")
                    if (!permissions.accessibilityEnabled) {
                        appendLine("- 无障碍服务（用于点击、滑动等操作）")
                    }
                    if (!permissions.shizukuEnabled) {
                        appendLine("- Shizuku服务（用于文本输入）")
                    }
                    appendLine()
                    appendLine("请在设置中启用相关权限后重试。")
                }
            )
            return
        }

        executionJob = viewModelScope.launch {
            _uiState.value = AutoGlmUiState(
                isLoading = true,
                task = task,
                status = context.getString(R.string.initializing),
                log = "Initializing agent...\nPermission check: OK",
                permissions = permissions
            )

            try {
                val uiService = EnhancedAIService.getAIServiceForFunction(
                    context,
                    FunctionType.UI_CONTROLLER
                )
                val systemPrompt = buildUiAutomationSystemPrompt()

                val agentConfig = AgentConfig(maxSteps = 25)
                val uiTools = ToolGetter.getUITools(context)
                val actionHandler = ActionHandler(
                    context = context,
                    screenWidth = context.resources.displayMetrics.widthPixels,
                    screenHeight = context.resources.displayMetrics.heightPixels,
                    toolImplementations = uiTools
                )

                val agent = PhoneAgent(
                    context = context,
                    config = agentConfig,
                    uiService = uiService,
                    actionHandler = actionHandler
                )

                val logBuilder = StringBuilder()

                // Header section
                appendWithTimestamp(logBuilder, "==================================================")
                appendWithTimestamp(logBuilder, "Task: $task")
                appendWithTimestamp(logBuilder, "Max Steps: ${agentConfig.maxSteps}")
                appendWithTimestamp(logBuilder, "==================================================")
                appendWithTimestamp(logBuilder, "")

                _uiState.value = AutoGlmUiState(
                    isLoading = true,
                    log = logBuilder.toString(),
                    permissions = permissions
                )

                var stepIndex = 1
                val pausedState = MutableStateFlow(false)

                withContext(Dispatchers.IO) {
                    val finalMessage = agent.run(
                        task = task,
                        systemPrompt = systemPrompt,
                        onStep = { stepResult: StepResult ->
                            appendStepLog(logBuilder, stepIndex, stepResult)
                            stepIndex++

                            _uiState.value = AutoGlmUiState(
                                isLoading = true,
                                log = logBuilder.toString().trimEnd(),
                                permissions = permissions
                            )
                        },
                        isPausedFlow = pausedState
                    )

                    // 追加最终结果
                    val finalTime = currentTimeString()
                    fun appendFinal(line: String) {
                        logBuilder.append("[")
                        logBuilder.append(finalTime)
                        logBuilder.append("] ")
                        logBuilder.appendLine(line)
                    }

                    appendFinal("==================================================")

                    val finalLines = finalMessage.lines()
                    if (finalLines.isNotEmpty()) {
                        appendFinal("Task completed: ${finalLines.first().trim()}")
                        finalLines.drop(1).forEach { line ->
                            if (line.isNotBlank()) {
                                appendFinal(line.trim())
                            }
                        }
                    }

                    _uiState.value = AutoGlmUiState(
                        isLoading = false,
                        log = logBuilder.toString().trimEnd(),
                        permissions = permissions
                    )
                }

            } catch (e: Exception) {
                AppLogger.e("AutoGlmViewModel", "Error executing task", e)
                _uiState.value = AutoGlmUiState(
                    isLoading = false,
                    log = "Error: ${e.message}",
                    error = "执行出错: ${e.message}",
                    permissions = permissions
                )
            }
        }
    }

    fun cancelTask() {
        executionJob?.cancel()
        controller.cancelTask()
        _uiState.value = AutoGlmUiState(
            isLoading = false,
            log = _uiState.value.log + "\n[Execution Cancelled by User]",
            permissions = _uiState.value.permissions
        )
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    private fun buildUiAutomationSystemPrompt(): String {
        val calendar = Calendar.getInstance()
        val sdf = SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault())
        val datePart = sdf.format(Date())
        val weekdayNames = arrayOf("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六")
        val weekday = weekdayNames[calendar.get(Calendar.DAY_OF_WEEK) - 1]
        val formattedDate = "$datePart $weekday"
        return FunctionalPrompts.UI_AUTOMATION_AGENT_PROMPT.replace("{{current_date}}", formattedDate)
    }

    private fun appendStepLog(builder: StringBuilder, stepIndex: Int, stepResult: StepResult) {
        val time = currentTimeString()

        fun append(line: String) {
            builder.append("[")
            builder.append(time)
            builder.append("] ")
            builder.appendLine(line)
        }

        append("==================================================")

        stepResult.thinking?.takeIf { it.isNotBlank() }?.let { thinking ->
            append("思考过程:")
            append("--------------------------------------------------")
            thinking.trim().lines().forEach { line ->
                if (line.isNotBlank()) {
                    append(line.trim())
                }
            }
        }

        stepResult.action?.let { action ->
            append("--------------------------------------------------")
            append("执行动作:")

            val jsonLines = mutableListOf<String>()
            action.actionName?.let { name ->
                jsonLines += "\"action\": \"$name\""
            }
            jsonLines += "\"_metadata\": \"${action.metadata}\""
            action.fields.forEach { (key, value) ->
                if (key != "action") {
                    jsonLines += "\"$key\": \"$value\""
                }
            }

            append("{")
            jsonLines.forEachIndexed { index, line ->
                val suffix = if (index == jsonLines.lastIndex) "" else ","
                append("  $line$suffix")
            }
            append("}")
        }

        stepResult.message
            ?.takeIf { it.isNotBlank() && stepResult.action?.metadata != "finish" }
            ?.let { msg ->
                append("--------------------------------------------------")
                msg.trim().lines().forEach { line ->
                    if (line.isNotBlank()) {
                        append(line.trim())
                    }
                }
            }

        append("==================================================")
    }

    private fun currentTimeString(): String {
        val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        return sdf.format(Date())
    }

    private fun appendWithTimestamp(builder: StringBuilder, line: String) {
        val time = currentTimeString()
        builder.append("[")
        builder.append(time)
        builder.append("] ")
        builder.appendLine(line)
    }
}
