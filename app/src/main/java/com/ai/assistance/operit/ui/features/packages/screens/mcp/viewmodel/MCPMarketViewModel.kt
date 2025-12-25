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
 * 仅支持远程MCP插件，本地部署功能和GitHub市场功能已移除
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

    // 为MCPManageScreen添加的属性
    val errorMessage: StateFlow<String?> = _error.asStateFlow()

    private val _userPublishedPlugins = MutableStateFlow<List<PluginMetadata>>(emptyList())
    val userPublishedPlugins: StateFlow<List<PluginMetadata>> = _userPublishedPlugins.asStateFlow()

    // 为MCPMarketScreen添加的属性
    private val _mcpIssues = MutableStateFlow<List<Any>>(emptyList())
    val mcpIssues: StateFlow<List<Any>> = _mcpIssues.asStateFlow()

    private val _installingPlugins = MutableStateFlow<Set<String>>(emptySet())
    val installingPlugins: StateFlow<Set<String>> = _installingPlugins.asStateFlow()

    private val _installProgress = MutableStateFlow<Map<String, Float>>(emptyMap())
    val installProgress: StateFlow<Map<String, Float>> = _installProgress.asStateFlow()

    private val _installedPluginIds = MutableStateFlow<Set<String>>(emptySet())
    val installedPluginIds: StateFlow<Set<String>> = _installedPluginIds.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    // 为MCPPluginDetailScreen添加的属性
    private val _issueComments = MutableStateFlow<List<Any>>(emptyList())
    val issueComments: StateFlow<List<Any>> = _issueComments.asStateFlow()

    private val _isLoadingComments = MutableStateFlow(false)
    val isLoadingComments: StateFlow<Boolean> = _isLoadingComments.asStateFlow()

    private val _isPostingComment = MutableStateFlow(false)
    val isPostingComment: StateFlow<Boolean> = _isPostingComment.asStateFlow()

    private val _issueReactions = MutableStateFlow<Map<String, Map<String, Int>>>(emptyMap())
    val issueReactions: StateFlow<Map<String, Map<String, Int>>> = _issueReactions.asStateFlow()

    val userAvatarCache: MutableMap<String, String> = mutableMapOf()

    private val _repositoryCache = MutableStateFlow<Map<String, Any>>(emptyMap())
    val repositoryCache: StateFlow<Map<String, Any>> = _repositoryCache.asStateFlow()

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
                _installedPluginIds.value = allPlugins.map { it.id }.toSet()
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

    /**
     * 加载MCP市场数据（存根实现）
     */
    fun loadMCPMarketData() {
        // GitHub market functionality has been removed
        _error.value = "GitHub market functionality has been removed"
    }

    /**
     * 清除错误
     */
    fun clearError() {
        _error.value = null
    }

    /**
     * 加载用户发布的插件（存根实现）
     */
    fun loadUserPublishedPlugins() {
        // GitHub publish functionality has been removed
        _userPublishedPlugins.value = emptyList()
    }

    /**
     * 发起GitHub登录（存根实现）
     */
    fun initiateGitHubLogin() {
        _error.value = "GitHub login functionality has been removed"
    }

    /**
     * 重新打开已发布的插件（存根实现）
     */
    fun reopenPublishedPlugin(number: Int, title: String) {
        _error.value = "GitHub publish functionality has been removed"
    }

    /**
     * 删除已发布的插件（存根实现）
     */
    fun deletePublishedPlugin(number: Int) {
        _error.value = "GitHub publish functionality has been removed"
    }

    /**
     * 搜索查询更改（存根实现）
     */
    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
    }

    /**
     * 从Issue安装MCP（存根实现）
     */
    fun installMCPFromIssue(
        issueNumber: Int,
        issueTitle: String,
        issueBody: String,
        repoOwner: String,
        repoName: String
    ) {
        _error.value = "Local MCP deployment functionality has been removed"
    }

    /**
     * 从GitHub登出（存根实现）
     */
    fun logoutFromGitHub() {
        // GitHub login functionality has been removed
    }

    /**
     * 加载Issue反应（存根实现）
     */
    fun loadIssueReactions(issueNumber: Int) {
        // GitHub reactions functionality has been removed
    }

    /**
     * 加载Issue评论（存根实现）
     */
    fun loadIssueComments(issueNumber: Int) {
        _issueComments.value = emptyList()
    }

    /**
     * 获取用户头像（存根实现）
     */
    fun fetchUserAvatar(username: String) {
        // GitHub avatar functionality has been removed
    }

    /**
     * 发表评论（存根实现）
     */
    fun postComment(issueNumber: Int, comment: String) {
        _error.value = "GitHub comment functionality has been removed"
    }

    /**
     * 获取仓库信息（存根实现）
     */
    fun fetchRepositoryInfo(owner: String, name: String) {
        // GitHub repository functionality has been removed
    }
}
