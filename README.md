# Operit（Open-AutoGLM）

Operit 是一个面向 Android 的 AutoGLM 自动化助手。核心原则：
- 动作执行：优先使用无障碍（点击/滑动/长按/全局返回/Home/截图/UI 层级）
- 文本输入：仅在需要输入时使用 Shizuku 临时切换到 Operit 输入法，输入完成后自动切回原输入法
- 虚拟屏幕：保留并使用 VirtualDisplay / Overlay 相关逻辑

<div align="center">
  <span>中文</span> | <a href="README(E).md">English</a>
</div>

## 当前仅保留的 4 个工具
1. 解除幻象进程限制
2. AutoGLM 执行器
3. AutoGLM 配置器（一键配置）
4. 网页转 APK 打包器

## 快速开始（必须）
1. 打开 `工具权限` 页面（侧边栏或工具箱右上角盾牌按钮）。
2. 按页面提示完成权限与环境配置：
   - Shizuku：安装/启动/授权
   - 无障碍服务：启用 Operit 无障碍
   - Operit 输入法：在系统里启用
   - 悬浮窗/通知权限：按需开启
3. 回到 `工具箱` 使用四个工具。

## 关键实现
- AutoGLM 控制器：`app/src/main/java/com/ai/assistance/operit/core/autoglm/AutoGLMController.kt`
- 无障碍：`app/src/main/java/com/ai/assistance/operit/core/accessibility/OperitAccessibilityService.kt`
- 输入法切换：`app/src/main/java/com/ai/assistance/operit/core/input/InputMethodManager.kt`
- 虚拟屏幕 UI：`app/src/main/java/com/ai/assistance/operit/ui/common/displays/VirtualDisplayOverlay.kt`
- 核心权限页：`app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/permissions/CoreToolPermissionsScreen.kt`

## 构建
本仓库通过 GitHub Actions 自动构建与发布（push main 触发）。

