# 核心工具与权限说明

应用 UI 目前只保留 4 个核心工具入口（`工具箱`），并提供统一的权限配置页（`工具权限`）。

## 0) 权限配置页（入口）
- 页面：`app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/permissions/CoreToolPermissionsScreen.kt`
- 入口：
  - 侧边栏：`工具权限`
  - 工具箱右上角：盾牌按钮

## 1) 解除幻象进程限制
- 目标：提升后台多进程任务的稳定性，调整 phantom process 限制
- 实现：通过 Shell 执行 `device_config` 相关命令
- 页面：`app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/processlimit/ProcessLimitRemoverScreen.kt`
- 关键执行器：`app/src/main/java/com/ai/assistance/operit/core/tools/system/AndroidShellExecutor.kt`

需要：
- Shizuku 安装、服务运行、已授权（推荐/通常必需）

备注：
- `AndroidShellExecutor` 会在“首选执行器失败时”回退到当前可用的最高权限级别，以减少因权限不足导致的失败。

## 2) AutoGLM 执行器
执行策略（必须遵守）：
- 点击/滑动/长按/全局返回/Home：优先使用无障碍（稳定、可控）
- 文本输入：仅在需要输入时使用 Shizuku 进行输入法切换（`ime set`），随后恢复原输入法
- 虚拟屏幕：保留 VirtualDisplay/Overlay 的可视化与交互逻辑

关键实现：
- 控制器：`app/src/main/java/com/ai/assistance/operit/core/autoglm/AutoGLMController.kt`
- 无障碍：`app/src/main/java/com/ai/assistance/operit/core/accessibility/OperitAccessibilityService.kt`
- 输入法切换：`app/src/main/java/com/ai/assistance/operit/core/input/InputMethodManager.kt`
- 输入法服务：`app/src/main/java/com/ai/assistance/operit/core/input/OperitInputMethodService.kt`
- 虚拟屏幕 UI：`app/src/main/java/com/ai/assistance/operit/ui/common/displays/VirtualDisplayOverlay.kt`

需要：
- 无障碍服务：必需
- Shizuku：输入时必需（用于临时切换输入法）
- Operit 输入法：系统里启用（输入时必需）
- 悬浮窗权限：按需（虚拟屏幕/悬浮层）

## 3) AutoGLM 配置器（一键配置）
- 目标：快速创建/更新 `autoglm-phone` 模型配置，并切换 AutoGLM 工具包
- 页面：`app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/autoglm/AutoGlmOneClickToolScreen.kt`

需要：
- 网络（用于模型配置的请求与校验，取决于所选供应商）

## 4) 网页转 APK 打包器
- 目标：选择网页工程目录与入口 HTML，导出为可安装 APK
- 页面：`app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/htmlpackager/HtmlPackagerScreen.kt`

需要：
- 通常无需存储权限：使用系统文件选择器（SAF）访问目录与文件

