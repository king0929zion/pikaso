package com.ai.assistance.operit.core.tools.system

import android.content.Context
import com.ai.assistance.operit.util.AppLogger
import com.ai.assistance.operit.core.tools.system.shell.ShellExecutorFactory
import com.ai.assistance.operit.data.preferences.androidPermissionPreferences

/** 向后兼容的Shell命令执行工具类 通过权限级别委托到相应的Shell执行器 */
class AndroidShellExecutor {
    companion object {
        private const val TAG = "AndroidShellExecutor"
        private var context: Context? = null

        /**
         * 设置全局上下文引用
         * @param appContext 应用上下文
         */
        fun setContext(appContext: Context) {
            context = appContext.applicationContext
        }
        /**
         * 封装执行命令的函数
         * @param command 要执行的命令
         * @return 命令执行结果
         */
        suspend fun executeShellCommand(command: String): CommandResult {
            val ctx = context ?: return CommandResult(false, "", "Context not initialized")

            // 首先尝试使用用户首选的权限级别执行命令
            val preferredLevel = androidPermissionPreferences.getPreferredPermissionLevel()
            AppLogger.d(TAG, "Using preferred permission level: $preferredLevel")

            // 如果preferredLevel为null，使用标准权限级别
            val actualLevel = preferredLevel ?: AndroidPermissionLevel.STANDARD
            
            val preferredExecutor = ShellExecutorFactory.getExecutor(ctx, actualLevel)
            val permStatus = preferredExecutor.hasPermission()

            // 尝试使用首选权限级别执行命令
            if (preferredExecutor.isAvailable() && permStatus.granted) {
                // AppLogger.d(TAG, "Executing command with preferred permission level: $preferredLevel")
                val result = preferredExecutor.executeCommand(command)
                val preferredResult = CommandResult(result.success, result.stdout, result.stderr, result.exitCode)

                // 首选执行器失败时，回退到当前可用的最高权限级别，提升工具稳定性
                if (preferredResult.success) {
                    return preferredResult
                }

                val (fallbackExecutor, fallbackStatus) = ShellExecutorFactory.getHighestAvailableExecutor(ctx)
                if (fallbackStatus.granted &&
                    fallbackExecutor.getPermissionLevel() != preferredExecutor.getPermissionLevel()
                ) {
                    val fallback = fallbackExecutor.executeCommand(command)
                    return CommandResult(fallback.success, fallback.stdout, fallback.stderr, fallback.exitCode)
                }

                return preferredResult
            }

                        AppLogger.d(
                                TAG,
                    "Preferred executor not available (${permStatus.reason}), trying highest available executor"
            )

            // 如果首选执行器不可用，尝试获取最高可用级别的执行器
            val (executor, executorStatus) = ShellExecutorFactory.getHighestAvailableExecutor(ctx)

            if (!executorStatus.granted) {
                return CommandResult(
                                                false,
                                                "",
                        "No suitable shell executor available: ${executorStatus.reason}",
                        -1
                )
            }

            AppLogger.d(TAG, "Using executor with permission level: ${executor.getPermissionLevel()}")

            val result = executor.executeCommand(command)
            return CommandResult(result.success, result.stdout, result.stderr, result.exitCode)
        }
    }

    /** 命令执行结果数据类 */
    data class CommandResult(
            val success: Boolean,
            val stdout: String,
            val stderr: String = "",
            val exitCode: Int = -1
    )
}
