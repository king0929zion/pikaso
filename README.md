# Operit（Open-AutoGLM）

Operit 是一个面向 Android 的 **AutoGLM 自动化助手**。目标是在不 root 的前提下，使用「**无障碍优先** + **Shizuku 辅助**」实现稳定的点击/滑动/输入，并**保留虚拟屏幕（VirtualDisplay/Shower）操作逻辑**以支持更强的自动化场景。

<div align="center">
  <span>中文</span> | <a href="README(E).md">English</a>
</div>

---

## ✅ 当前仅保留的 4 个工具

1. **解除幻象进程限制**：通过 ADB 级命令调整 Android 12+ 的 phantom process 限制（需要 Shizuku/更高权限）。
2. **AutoGLM 执行器**：按步骤执行手机 UI 自动化任务（点击/滑动等优先走无障碍）。
3. **AutoGLM 配置器（一键配置）**：创建/更新 `autoglm-phone`（智谱）模型配置，并切换 AutoGLM 工具包。
4. **网页转 APK 打包器**：选择网页工程目录与入口 HTML，将其导出为可安装的 APK。

入口：`工具箱（Toolbox）`

---

## 🤖 AutoGLM 模块设计（实现要点）

### 执行策略
- **无障碍优先**：点击、滑动、长按、全局返回/Home、UI 层次获取、截图等优先使用 `OperitAccessibilityService`。
- **Shizuku 仅用于输入**：当需要输入文本时，使用 `ime set` 临时切换到 Operit 内置输入法，输入后自动恢复到原输入法。
- **虚拟屏幕保留**：继续保留并使用 `VirtualDisplay` 相关逻辑（包含 Shower 虚拟屏幕的启动/抓帧/叠层展示）。

### 关键代码位置（建议从这里读）
- `app/src/main/java/com/ai/assistance/operit/core/accessibility/OperitAccessibilityService.kt`
- `app/src/main/java/com/ai/assistance/operit/core/autoglm/AutoGLMController.kt`
- `app/src/main/java/com/ai/assistance/operit/core/input/InputMethodManager.kt`
- `app/src/main/java/com/ai/assistance/operit/core/tools/agent/VirtualDisplayManager.kt`
- `app/src/main/java/com/ai/assistance/operit/core/tools/agent/ShowerServerManager.kt`

---

## 🔐 权限配置（务必完成）

在应用内：`工具箱 → AutoGLM 执行 → 右上角「权限」`

建议按以下顺序配置：
1. **无障碍服务**：AutoGLM 的核心权限（点击/滑动/UI 信息）。
2. **Shizuku**：用于输入法切换与解除幻象进程限制等 ADB 级操作。
3. **Operit 输入法**：在系统里启用该输入法（输入时会临时切换到它）。
4. **悬浮窗权限**：用于虚拟屏幕/操作提示叠层展示。
5. **存储权限/所有文件访问**：用于导出、打包与日志/资源写入。
6. **安装未知应用**：用于安装网页转 APK 生成的安装包（仅对本应用生效）。
7. **电池优化豁免**：避免自动化过程中在后台被系统回收。
8. **通知权限（可选）**：用于状态提示与完成通知。

---

## 🧱 项目结构（简版）

```
app/src/main/java/com/ai/assistance/operit/
  core/
    accessibility/      无障碍服务与虚拟屏幕操作入口
    autoglm/            AutoGLM 控制器（协调各模块）
    input/              Shizuku 输入法切换 + 内置输入法服务
    tools/agent/        PhoneAgent / VirtualDisplay / Shower 等自动化基础设施
  ui/
    features/toolbox/   工具箱与 4 个工具页面
```

---

## 🛠️ 开发说明

- JDK 17 / compileSdk 34 / minSdk 26
- 本仓库推荐以 **GitHub Actions** 为准进行构建验证（push 后触发自动构建）。

