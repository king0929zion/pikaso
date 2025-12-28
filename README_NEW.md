# Operit AI - 智能助手应用

<div align="center">
  <img src="app/src/main/res/playstore-icon.png" width="120" height="120" alt="Operit Logo">
  <h1>Operit AI</h1>
  <p>📱 <b>Android智能助手 - 集成AutoGLM自动化能力</b> 📱</p>
</div>

---

## 🌟 项目简介

**Operit AI** 是功能完备的 Android AI 智能助手应用，支持多种 LLM 提供商，具备强大的**UI自动化能力**（AutoGLM）、**无障碍服务集成**和 **Shizuku 支持**。

---

## ⚡ 核心功能

### 🤖 AutoGLM 自动化引擎
- **无障碍服务优先**：使用 Android 无障碍服务进行点击、滑动、长按等操作
- **Shizuku 文本输入**：通过 Shizuku 切换输入法实现文本输入
- **虚拟屏幕支持**：内置虚拟屏幕操作逻辑，支持屏幕镜像和操作
- **多权限协同**：无障碍 + Shizuku 双通道保障操作可靠性

### 📱 权限架构

| 权限 | 用途 | 优先级 |
|------|------|--------|
| 无障碍服务 | 点击、滑动、获取UI层次、截图 | 首选 |
| Shizuku | ADB命令执行、输入法切换 | 备选/文本输入 |
| Root | 高级系统操作 | 可选 |

---

## 🏗️ 项目架构

```
Operit/
├── app/src/main/java/com/ai/assistance/operit/
│   ├── core/
│   │   ├── accessibility/     # 无障碍服务
│   │   ├── autoglm/           # AutoGLM控制器
│   │   ├── input/             # Shizuku输入管理
│   │   ├── tools/             # 工具系统
│   │   └── vision/            # 视觉/截图功能
│   ├── api/                   # API层
│   │   └── chat/              # 聊天/LLM
│   ├── data/                  # 数据层
│   ├── ui/                    # Jetpack Compose UI
│   └── services/              # 服务层
└── docs/                      # 文档
```

---

## 📦 AutoGLM 模块说明

### 核心组件

| 组件 | 路径 | 功能 |
|------|------|------|
| `OperitAccessibilityService` | `core/accessibility/` | 无障碍服务，提供UI操作 |
| `AutoGLMController` | `core/autoglm/` | 核心控制器，协调各模块 |
| `InputMethodManager` | `core/input/` | Shizuku输入法管理 |
| `VirtualDisplayManager` | `core/tools/agent/` | 虚拟屏幕管理 |

### 操作流程

1. **权限检查**：启动时检查无障碍和Shizuku权限
2. **操作执行**：
   - 点击/滑动 → 优先使用无障碍服务手势
   - 文本输入 → 切换到Operit输入法
   - 截图 → 无障碍服务截图API
3. **自动恢复**：操作完成后自动恢复原输入法

---

## 🎨 UI 设计

采用 Anthropic 设计风格：
- 简洁、极简的布局
- 温暖的色调方案
- 充足的留白
- 人性化的交互设计

---

## 📋 版本历史

### v1.10.0 (2024-12)
- 重构无障碍服务，修复截图回调问题
- 优化Shizuku输入管理器
- 新增AutoGLMController核心模块
- 改进权限检查和错误提示
- 虚拟屏幕操作逻辑增强

---

## 🔧 开发指南

### 环境要求
- Android Studio Hedgehog (2023.1.1) 或更高版本
- JDK 17
- Gradle 8.x
- Android SDK 34 (targetSdk)

### 构建命令
```bash
# Debug构建
./gradlew assembleDebug

# Release构建
./gradlew assembleRelease

# 运行测试
./gradlew test
```

---

## 📄 许可证

Apache License 2.0
