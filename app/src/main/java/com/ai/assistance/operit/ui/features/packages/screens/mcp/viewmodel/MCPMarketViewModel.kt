package com.ai.assistance.operit.ui.features.packages.screens.mcp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.ai.assistance.operit.data.mcp.MCPRepository
import com.ai.assistance.operit.data.mcp.MCPLocalServer.PluginMetadata
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * MCP市场视图模型（简化版）
 * 仅支持远程MCP插件，本地部署功能已移除
 */
class MCPMarketViewModel(
    application: Application,
    private val mcpRepository: MCPRepository
) : AndroidViewModel(application) {

    // 插件列表
    private val _plugins = MutableStateFlow<List<PluginMetadata>>(emptyList())
    val plugins: StateFlow<List<PluginMetadata>> = _plugins.asStateFlow()

    // 加载状态
    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    // 错误信息
    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    /**
     * 加载所有可用的MCP插件
     */
    fun loadPlugins() {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            try {
                val allPlugins = mcpRepository.getAllMCPServers()
                _plugins.value = allPlugins
            } catch (e: Exception) {
                _error.value = e.message ?: "加载插件失败"
            } finally {
                _isLoading.value = false
            }
        }
    }

    /**
     * 刷新插件列表
     */
    fun refresh() {
        loadPlugins()
    }
}
