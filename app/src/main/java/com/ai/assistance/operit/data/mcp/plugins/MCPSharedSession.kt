package com.ai.assistance.operit.data.mcp.plugins

import android.content.Context
import com.ai.assistance.operit.util.AppLogger
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * MCP 共享终端会话管理器
 *
 * 用于在 MCPStarter 和 MCPDeployer 之间共享同一个终端会话
 * 避免重复创建会话，提高资源利用效率
 *
 * Note: Terminal functionality has been removed. This class is kept for API compatibility.
 */
object MCPSharedSession {

    private const val TAG = "MCPSharedSession"
    private const val SESSION_NAME = "mcp-shared"

    @Volatile
    private var sharedSessionId: String? = null
    private val mutex = Mutex()

    /**
     * 获取或创建共享的终端会话
     *
     * @param context Android上下文
     * @return 会话ID，如果创建失败返回null
     */
    suspend fun getOrCreateSharedSession(context: Context): String? {
        // Terminal functionality has been removed
        AppLogger.w(TAG, "Terminal functionality has been removed. Shared session creation is disabled.")
        return null
    }

    /**
     * 获取当前共享会话ID（如果存在）
     */
    fun getCurrentSessionId(): String? = sharedSessionId

    /**
     * 清除共享会话引用
     * 注意：这不会实际关闭会话，只是清除引用
     */
    suspend fun clearSession() {
        mutex.withLock {
            AppLogger.d(TAG, "Clearing shared session reference: $sharedSessionId")
            sharedSessionId = null
        }
    }

    /**
     * 检查共享会话是否存在
     */
    fun hasActiveSession(): Boolean = sharedSessionId != null
} 