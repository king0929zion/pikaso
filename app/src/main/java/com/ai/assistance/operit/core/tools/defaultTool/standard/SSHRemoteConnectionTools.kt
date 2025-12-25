package com.ai.assistance.operit.core.tools.defaultTool.standard

import android.content.Context
import com.ai.assistance.operit.util.AppLogger
import com.ai.assistance.operit.core.tools.StringResultData
import com.ai.assistance.operit.data.model.AITool
import com.ai.assistance.operit.data.model.ToolResult

/**
 * SSH远程文件连接工具
 *
 * 提供简单的SSH登录/退出功能
 * 登录后，所有文件系统工具将使用SSH连接
 *
 * 1. ssh_login - 登录SSH远程服务器
 * 2. ssh_exit - 退出SSH连接
 *
 * Note: Terminal functionality has been removed. This file is kept for API compatibility.
 */
class SSHRemoteConnectionTools(private val context: Context) {

    companion object {
        private const val TAG = "SSHRemoteConnTools"
        private const val DEFAULT_CONNECTION_ID = "ssh_remote_files"
    }

    /**
     * 登录SSH远程服务器
     *
     * 参数:
     * - host: SSH服务器地址 (必填)
     * - port: SSH端口 (可选，默认22)
     * - username: 用户名 (必填)
     * - password: 密码 (必填)
     * - enable_reverse_mount: 是否启用反向挂载 (可选，默认false)
     *
     * 登录后，所有文件工具的environment="linux"将使用此SSH连接
     */
    suspend fun sshLogin(tool: AITool): ToolResult {
        return ToolResult(
            toolName = tool.name,
            success = false,
            result = StringResultData(""),
            error = "SSH functionality has been removed. Terminal features are no longer available."
        )
    }

    /**
     * 退出SSH连接
     *
     * 退出后，文件工具将恢复使用本地文件系统
     */
    suspend fun sshExit(tool: AITool): ToolResult {
        return ToolResult(
            toolName = tool.name,
            success = true,
            result = StringResultData("SSH functionality has been removed. No active connection.")
        )
    }
}
