# 核心工具与权限说明

本项目当前 UI 默认只呈现 4 个核心工具模块（入口：`工具箱`）。

## 1) 解除幻象进程限制

- 目的：提升后台/多进程相关任务的稳定性，避免系统对“幻象进程”过度限制
- 实现：通过具备 shell 权限的通道执行 `device_config` 相关命令
- 关键页面：`app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/processlimit/ProcessLimitRemoverScreen.kt`

需要：
- Shizuku 服务运行 + 授权（推荐）

## 2) AutoGLM 执行器

AutoGLM 的执行策略：

- 点击/滑动/长按：优先走无障碍（`OperitAccessibilityService`）
- 文本输入：仅在需要输入时走 Shizuku（切换到 Operit 输入法 → 发送输入广播 → 恢复原输入法）
- 虚拟屏幕：保留 `VirtualDisplayOverlay` 的悬浮可视化与交互逻辑

关键实现：
- 无障碍：`app/src/main/java/com/ai/assistance/operit/core/accessibility/OperitAccessibilityService.kt`
- 控制器：`app/src/main/java/com/ai/assistance/operit/core/autoglm/AutoGLMController.kt`
- 输入法切换：`app/src/main/java/com/ai/assistance/operit/core/input/InputMethodManager.kt`
- 输入法服务：`app/src/main/java/com/ai/assistance/operit/core/input/OperitInputMethodService.kt`

需要：
- 无障碍服务（必选，首选通道）
- Shizuku 服务运行 + 授权（输入时必选）
- 在系统里启用 `Operit 输入法`（输入时必选）
- 悬浮窗（按需：虚拟屏幕/悬浮层）

## 3) AutoGLM 配置器（一键配置）

- 目的：为 AutoGLM 相关模型/参数提供快速配置入口
- 入口：工具箱中的 “AutoGLM 配置器”

需要：
- 网络（用于拉取/提交配置相关请求，取决于你选择的模型供应商）

## 4) 网页转 APK 打包器

- 目的：将一份网页（HTML/CSS/JS）打包为可安装 APK
- 入口：工具箱中的 “网页转 APK 打包器”

需要：
- 存储权限（按需：读写输入/输出文件）

## 权限页

建议优先在应用内的权限页完成检查与跳转：
- 入口：`工具箱` → 右上角 `权限`
- 组件：`app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/autoglm/AutoGlmPermissionScreen.kt`
