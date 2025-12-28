package com.ai.assistance.operit.ui.features.permission.viewmodel

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.Settings
import android.view.accessibility.AccessibilityManager
import android.accessibilityservice.AccessibilityServiceInfo
import com.ai.assistance.operit.util.AppLogger
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ai.assistance.operit.core.tools.system.AndroidPermissionLevel
import com.ai.assistance.operit.core.tools.system.ShizukuAuthorizer
import com.ai.assistance.operit.data.preferences.androidPermissionPreferences
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

/**
 * Permission Guide ViewModel
 *
 * 负责权限引导屏幕的逻辑，包括：
 * - 检查基础权限（存储、悬浮窗、电池优化、位置）
 * - 检查权限级别所需的权限（无障碍、Shizuku、Root等）
 * - 验证用户是否已授予所选权限级别的所有必要权限
 */
class PermissionGuideViewModel : ViewModel() {

    private val TAG = "PermissionGuideVM"

    // UI状态
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    // 步骤枚举
    enum class Step {
        WELCOME,
        BASIC_PERMISSIONS,
        PERMISSION_LEVEL
    }

    // 初始化
    init {
        AppLogger.d(TAG, "ViewModel initialized")
    }

    // 检查所有权限
    fun checkPermissions(context: Context) {
        AppLogger.d(TAG, "Checking permissions")

        // 存储权限
        val hasStoragePermission = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            Environment.isExternalStorageManager()
        } else {
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        }

        // 悬浮窗权限
        val hasOverlayPermission = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Settings.canDrawOverlays(context)
        } else {
            true // 低于Android 6.0不需要特别申请
        }

        // 电池优化豁免
        val hasBatteryOptimizationExemption = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val powerManager = context.getSystemService(Context.POWER_SERVICE) as android.os.PowerManager
            powerManager.isIgnoringBatteryOptimizations(context.packageName)
        } else {
            true // 低于Android 6.0不需要特别申请
        }

        // 位置权限
        val hasLocationPermission = ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(
                    context,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED

        // 更新UI状态
        _uiState.update { currentState ->
            currentState.copy(
                hasStoragePermission = hasStoragePermission,
                hasOverlayPermission = hasOverlayPermission,
                hasBatteryOptimizationExemption = hasBatteryOptimizationExemption,
                hasLocationPermission = hasLocationPermission,
                allBasicPermissionsGranted = hasStoragePermission &&
                        hasOverlayPermission &&
                        hasBatteryOptimizationExemption &&
                        hasLocationPermission
            )
        }

        AppLogger.d(TAG, "Permissions checked: Storage=$hasStoragePermission, " +
                "Overlay=$hasOverlayPermission, " +
                "Battery=$hasBatteryOptimizationExemption, " +
                "Location=$hasLocationPermission")
    }

    /**
     * 检查指定权限级别所需的权限是否已授予
     * @return Pair<是否已授予, 错误信息>
     */
    fun checkPermissionLevelRequirements(context: Context, level: AndroidPermissionLevel): Pair<Boolean, String> {
        return when (level) {
            AndroidPermissionLevel.STANDARD -> {
                // 标准权限不需要额外检查
                Pair(true, "")
            }
            AndroidPermissionLevel.ACCESSIBILITY -> {
                // 检查无障碍服务权限
                val hasAccessibility = isAccessibilityServiceEnabled(context)
                if (hasAccessibility) {
                    Pair(true, "")
                } else {
                    Pair(false, "请先授予无障碍服务权限")
                }
            }
            AndroidPermissionLevel.DEBUGGER -> {
                // 检查Shizuku服务是否运行和权限
                val isShizukuRunning = ShizukuAuthorizer.isShizukuServiceRunning()
                val hasShizukuPermission = if (isShizukuRunning) {
                    ShizukuAuthorizer.hasShizukuPermission()
                } else {
                    false
                }

                when {
                    !isShizukuRunning -> {
                        val errorMsg = ShizukuAuthorizer.getServiceErrorMessage()
                        Pair(false, "Shizuku服务未运行\n$errorMsg")
                    }
                    !hasShizukuPermission -> {
                        val errorMsg = ShizukuAuthorizer.getPermissionErrorMessage()
                        Pair(false, "Shizuku权限未授予\n$errorMsg")
                    }
                    else -> Pair(true, "")
                }
            }
            AndroidPermissionLevel.ADMIN -> {
                // 管理员权限需要设备管理员权限 + Shizuku权限
                val hasShizuku = checkPermissionLevelRequirements(context, AndroidPermissionLevel.DEBUGGER).first
                if (!hasShizuku) {
                    return Pair(false, "管理员权限需要Shizuku服务运行并授予权限")
                }
                // TODO: 添加设备管理员权限检查
                Pair(true, "")
            }
            AndroidPermissionLevel.ROOT -> {
                // Root权限需要Root访问 + Shizuku权限
                val hasShizuku = checkPermissionLevelRequirements(context, AndroidPermissionLevel.DEBUGGER).first
                if (!hasShizuku) {
                    return Pair(false, "Root权限需要Shizuku服务运行并授予权限")
                }
                // TODO: 添加Root权限检查
                Pair(true, "")
            }
        }
    }

    /**
     * 检查无障碍服务是否已启用
     */
    private fun isAccessibilityServiceEnabled(context: Context): Boolean {
        val am = context.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val enabledServices = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)

        for (service in enabledServices) {
            if (service.resolveInfo.serviceInfo.packageName == context.packageName) {
                return true
            }
        }
        return false
    }

    // 更新当前步骤
    fun setCurrentStep(step: Step) {
        _uiState.update { it.copy(currentStep = step) }
        AppLogger.d(TAG, "Current step set to: $step")
    }

    // 选择权限级别
    fun selectPermissionLevel(level: AndroidPermissionLevel) {
        _uiState.update { it.copy(selectedPermissionLevel = level) }
        AppLogger.d(TAG, "Selected permission level: $level")
    }

    /**
     * 验证并保存权限级别
     * 必须通过所有权限检查才能保存
     * @return Pair<是否成功, 错误信息>
     */
    fun validateAndSavePermissionLevel(context: Context): Pair<Boolean, String?> {
        val level = _uiState.value.selectedPermissionLevel
        if (level == null) {
            AppLogger.w(TAG, "Cannot save null permission level")
            return Pair(false, "请先选择权限级别")
        }

        AppLogger.d(TAG, "Validating permission level: $level")

        // 检查基础权限是否已授予
        if (!_uiState.value.allBasicPermissionsGranted) {
            return Pair(false, "请先授予所有基础权限")
        }

        // 检查权限级别所需的权限
        val (hasRequiredPermissions, errorMessage) = checkPermissionLevelRequirements(context, level)
        if (!hasRequiredPermissions) {
            AppLogger.w(TAG, "Permission level requirements not met: $errorMessage")
            return Pair(false, errorMessage)
        }

        // 所有检查通过，保存权限级别
        AppLogger.d(TAG, "Saving permission level: $level")
        viewModelScope.launch {
            try {
                androidPermissionPreferences.savePreferredPermissionLevel(level)
                _uiState.update { it.copy(isCompleted = true) }
                AppLogger.d(TAG, "Permission level saved, guide completed")
            } catch (e: Exception) {
                AppLogger.e(TAG, "Error saving permission level", e)
                _uiState.update { it.copy(saveError = e.message) }
            }
        }

        return Pair(true, null)
    }

    // 保存权限级别（旧方法，保留兼容性）
    fun savePermissionLevel() {
        val level = _uiState.value.selectedPermissionLevel
        if (level != null) {
            AppLogger.d(TAG, "Saving permission level: $level")

            viewModelScope.launch {
                try {
                    androidPermissionPreferences.savePreferredPermissionLevel(level)
                    _uiState.update { it.copy(isCompleted = true) }
                    AppLogger.d(TAG, "Permission level saved, guide completed")
                } catch (e: Exception) {
                    AppLogger.e(TAG, "Error saving permission level", e)
                }
            }
        } else {
            AppLogger.w(TAG, "Cannot save null permission level")
        }
    }

    // 更新位置权限状态
    fun updateLocationPermission(granted: Boolean) {
        _uiState.update { currentState ->
            val newState = currentState.copy(hasLocationPermission = granted)
            newState.copy(
                allBasicPermissionsGranted = newState.hasStoragePermission &&
                        newState.hasOverlayPermission &&
                        newState.hasBatteryOptimizationExemption &&
                        newState.hasLocationPermission
            )
        }
        AppLogger.d(TAG, "Location permission updated: $granted")
    }

    // 清除保存错误
    fun clearSaveError() {
        _uiState.update { it.copy(saveError = null) }
    }

    // UI状态数据类
    data class UiState(
        val currentStep: Step = Step.WELCOME,
        val hasStoragePermission: Boolean = false,
        val hasOverlayPermission: Boolean = false,
        val hasBatteryOptimizationExemption: Boolean = false,
        val hasLocationPermission: Boolean = false,
        val allBasicPermissionsGranted: Boolean = false,
        val selectedPermissionLevel: AndroidPermissionLevel? = null,
        val isCompleted: Boolean = false,
        val saveError: String? = null
    )
}
