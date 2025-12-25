# Operit AI 项目结构与模块分析

## 📋 项目概述

**Operit AI** 是移动端首个功能完备的 AI 智能助手 Android 应用，完全独立运行于 Android 设备上（除 API 调用），拥有强大的工具调用能力、深度搜索、智能记忆库，并支持人设定制与角色卡等高度自定义功能。

### 基本信息
- **包名**: `com.ai.assistance.operit`
- **最低 SDK**: Android 8.0 (API 26)
- **目标 SDK**: Android 34
- **当前版本**: v1.7.0 (versionCode: 33)
- **开发语言**: Kotlin
- **UI 框架**: Jetpack Compose
- **许可证**: GNU LGPLv3

---

## 🏗️ 项目架构

### 核心技术栈

#### 1. **UI 层**
- **Jetpack Compose**: 现代化声明式 UI 框架
- **Material 3**: 遵循 Material Design 3 设计规范
- **Navigation Compose**: 页面导航管理
- **Coil**: 图片加载库

#### 2. **数据层**
- **ObjectBox**: 主要的本地数据库解决方案（NoSQL）
- **Room**: 关系型数据库（已集成但主要使用 ObjectBox）
- **DataStore**: 轻量级数据存储（用户偏好设置）
- **PreferencesManager**: 应用偏好管理

#### 3. **网络层**
- **OkHttp**: HTTP 客户端
- **Retrofit**: RESTful API 调用
- **Moshi**: JSON 序列化/反序列化
- **SSE (Server-Sent Events)**: 流式 AI 响应处理

#### 4. **AI 和机器学习**
- **ML Kit**: Google 文本识别（OCR）
  - 多语言支持（中文、日文、韩文、梵文）
- **ONNX Runtime**: 本地 AI 模型推理
- **TensorFlow Lite**: 轻量级 ML 框架
- **MediaPipe**: 文本处理任务
- **MNN**: 本地 AI 模型支持

#### 5. **系统集成**
- **Shizuku**: 提供系统级权限（无需 Root）
- **Accessibility Service**: 无障碍服务（UI 自动化）
- **libsu**: Root 权限管理
- **WorkManager**: 后台任务调度

---

## 📂 项目目录结构

```
Operit/
├── .github/                     # GitHub Actions CI/CD 配置
│   └── workflows/
│       └── build.yml            # 构建工作流
├── app/                         # 主应用模块
│   ├── build.gradle.kts         # 应用构建配置
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── java/com/ai/assistance/operit/
│   │   │   │   ├── api/         # API 相关
│   │   │   │   ├── core/        # 核心功能
│   │   │   │   ├── data/        # 数据层
│   │   │   │   ├── integrations/ # 第三方集成
│   │   │   │   ├── provider/    # Content Provider
│   │   │   │   ├── services/    # 系统服务
│   │   │   │   ├── ui/          # UI 层
│   │   │   │   ├── util/        # 工具类
│   │   │   │   └── widget/      # 小部件
│   │   │   ├── assets/          # 资源文件
│   │   │   │   ├── models/      # AI 模型文件
│   │   │   │   └── subpack/     # 子包资源
│   │   │   ├── res/             # Android 资源
│   │   │   └── jniLibs/         # 原生库
│   │   └── androidTest/         # Android 测试
│   └── libs/                    # 本地依赖库
│       ├── ffmpegkit.jar
│       └── arsc.jar
├── dragonbones/                 # DragonBones 动画模块
├── miniscrcpy/                  # Mini scrcpy 模块（虚拟屏幕）
├── examples/                    # 示例文件
├── tools/                       # 开发工具
├── docs/                        # 文档
│   ├── CONTRIBUTING.md          # 贡献指南
│   ├── BUILDING.md              # 编译指南
│   ├── SCRIPT_DEV_GUIDE.md      # 脚本开发指南
│   └── assets/                  # 文档资源
├── build.gradle.kts             # 项目级构建配置
├── settings.gradle.kts          # 项目设置
└── gradle.properties            # Gradle 属性配置
```

---

## 🔧 核心模块详解

### 1. **api 模块** (`app/src/main/java/com/ai/assistance/operit/api/`)

负责与 AI 模型提供商的交互和通信。

```
api/
├── chat/                        # AI 对话核心
│   ├── AIForegroundService.kt   # AI 前台服务
│   ├── ChatManager.kt           # 对话管理器
│   ├── ChatSession.kt           # 对话会话
│   ├── ModelProvider.kt         # 模型提供商抽象
│   └── providers/               # 各厂商实现
│       ├── OpenAIProvider.kt
│       ├── ClaudeProvider.kt
│       ├── GeminiProvider.kt
│       └── ...
├── speech/                      # 语音识别
│   ├── SpeechRecognizer.kt
│   └── WhisperClient.kt
└── voice/                       # 语音合成 (TTS)
    ├── TTSEngine.kt
    └── EdgeTTSClient.kt
```

**关键功能**:
- 支持多个 AI 模型提供商（OpenAI、Claude、Gemini、百灵、DeepSeek 等）
- 流式响应处理（SSE）
- 工具调用（Function Calling）
- 多模态支持（文本、图像、语音）

---

### 2. **core 模块** (`app/src/main/java/com/ai/assistance/operit/core/`)

应用的核心业务逻辑层。

```
core/
├── application/                 # 应用级别
│   └── OperitApplication.kt     # Application 入口
├── avatar/                      # 桌宠系统
│   ├── AvatarManager.kt         # 桌宠管理
│   ├── DragonBonesRenderer.kt   # DragonBones 动画渲染
│   └── expressions/             # 表情管理
├── chat/                        # 聊天核心逻辑
│   └── MessageProcessor.kt      # 消息处理器
├── config/                      # 配置管理
│   ├── ModelConfig.kt           # 模型配置
│   ├── ThemeConfig.kt           # 主题配置
│   └── UserConfig.kt            # 用户配置
├── subpack/                     # 子包系统（插件）
│   ├── SubpackManager.kt        # 子包管理器
│   ├── JSSubpackExecutor.kt     # JavaScript 脚本执行
│   └── ...
├── tools/                       # 工具系统 ⭐核心⭐
│   ├── ToolRegistration.kt      # 工具注册中心
│   ├── AIToolHandler.kt         # AI 工具处理器
│   ├── ToolPackage.kt           # 工具包
│   ├── defaultTool/             # 默认工具集
│   │   ├── standard/            # 标准权限工具
│   │   ├── accessibility/       # 无障碍工具
│   │   ├── admin/               # 管理员工具
│   │   ├── root/                # Root 工具
│   │   └── debugger/            # 调试工具
│   ├── agent/                   # Agent 工具
│   ├── calculator/              # 计算器工具
│   ├── javascript/              # JS 执行引擎
│   ├── mcp/                     # MCP (Model Context Protocol)
│   ├── packTool/                # 打包工具
│   └── system/                  # 系统工具
└── workflow/                    # 工作流系统
    ├── WorkflowEngine.kt        # 工作流引擎
    └── WorkflowScheduler.kt     # 工作流调度器
```

**核心亮点**:
- **工具系统**: 40+ 内置工具，分为不同权限级别
  - **Standard**: 基础功能（无需特殊权限）
  - **Accessibility**: 无障碍服务权限
  - **Admin**: Shizuku 权限
  - **Root**: Root 权限
  - **Debugger**: 调试权限
- **MCP 协议**: 支持模型上下文协议，可扩展第三方插件
- **子包系统**: TypeScript/JavaScript 脚本扩展能力

---

### 3. **data 模块** (`app/src/main/java/com/ai/assistance/operit/data/`)

数据持久化和管理层。

```
data/
├── model/                       # 数据模型
│   ├── ChatMessage.kt           # 聊天消息
│   ├── Conversation.kt          # 对话
│   ├── CharacterCard.kt         # 角色卡
│   ├── Memory.kt                # 记忆
│   ├── ToolCall.kt              # 工具调用记录
│   └── ...
├── db/                          # 数据库
│   ├── AppDatabase.kt           # Room 数据库
│   └── ObjectBoxManager.kt      # ObjectBox 管理器
├── dao/                         # 数据访问对象
│   ├── ConversationDao.kt
│   └── MessageDao.kt
├── repository/                  # 数据仓库
│   ├── ChatRepository.kt        # 聊天数据仓库
│   ├── MemoryRepository.kt      # 记忆仓库
│   ├── ModelConfigRepository.kt # 模型配置仓库
│   └── ...
├── preferences/                 # 偏好设置
│   ├── UserPreferencesManager.kt
│   ├── ThemePreferences.kt
│   ├── CharacterCardManager.kt
│   └── ...
├── mcp/                         # MCP 数据管理
│   ├── MCPServerManager.kt
│   └── MCPPluginRegistry.kt
├── converter/                   # 数据转换器
│   ├── DocumentConverter.kt     # 文档转换
│   └── ImageConverter.kt        # 图片转换
└── exporter/                    # 数据导出
    ├── ConversationExporter.kt
    └── MemoryExporter.kt
```

**关键特性**:
- **双数据库策略**: ObjectBox（主）+ Room（辅）
- **智能记忆系统**: AI 自动分类和检索
- **角色卡管理**: 导入/导出角色卡（PNG 元数据）
- **对话历史**: 支持分支、标签、搜索

---

### 4. **services 模块** (`app/src/main/java/com/ai/assistance/operit/services/`)

系统级服务组件。

```
services/
├── FloatingChatService.kt       # 悬浮窗聊天服务 ⭐
├── ChatServiceCore.kt           # 聊天服务核心
├── EmbeddingService.kt          # 向量嵌入服务
├── OnnxEmbeddingService.kt      # ONNX 嵌入服务
├── UIDebuggerService.kt         # UI 调试服务
├── TermuxCommandResultService.kt # Termux 命令服务
├── assistant/                   # 语音助手
│   ├── OperitVoiceInteractionService.kt
│   └── OperitVoiceInteractionSessionService.kt
├── core/                        # 核心服务
└── floating/                    # 悬浮窗组件
```

**主要服务**:
- **FloatingChatService**: 系统级悬浮窗，随时唤醒 AI
- **VoiceInteractionService**: 集成系统语音助手
- **EmbeddingService**: 本地向量嵌入（用于记忆检索）

---

### 5. **ui 模块** (`app/src/main/java/com/ai/assistance/operit/ui/`)

用户界面层，基于 Jetpack Compose。

```
ui/
├── main/                        # 主界面
│   └── MainActivity.kt          # 主 Activity
├── theme/                       # 主题系统
│   ├── Theme.kt
│   ├── Color.kt
│   ├── Typography.kt
│   └── CustomTheme.kt
├── common/                      # 通用组件
│   ├── components/              # UI 组件库
│   └── displays/                # 叠加层显示
│       ├── UIOperationOverlay.kt      # UI 操作叠加层
│       └── UIAutomationProgressOverlay.kt  # 自动化进度叠加层
├── features/                    # 功能页面
│   ├── chat/                    # 聊天界面
│   │   ├── ChatScreen.kt        # 聊天主屏幕
│   │   ├── MessageList.kt       # 消息列表
│   │   ├── InputBar.kt          # 输入栏
│   │   └── ...
│   ├── settings/                # 设置页面
│   │   ├── SettingsScreen.kt
│   │   ├── ModelConfigScreen.kt
│   │   ├── ThemeSettingsScreen.kt
│   │   └── ...
│   ├── memory/                  # 记忆管理
│   │   └── MemoryBrowserScreen.kt
│   ├── packages/                # 插件市场
│   │   ├── PackageMarketScreen.kt
│   │   └── MCPServerConfigScreen.kt
│   ├── toolbox/                 # 工具箱
│   │   ├── TerminalScreen.kt    # Ubuntu 终端
│   │   ├── WorkspaceScreen.kt   # 工作区
│   │   └── ...
│   ├── workflow/                # 工作流
│   ├── assistant/               # 语音助手
│   ├── permission/              # 权限管理
│   ├── about/                   # 关于页面
│   └── ...
├── floating/                    # 悬浮窗 UI
│   ├── FloatingBallView.kt      # 悬浮球
│   └── FloatingChatWindow.kt    # 悬浮聊天窗口
├── components/                  # 可复用组件
└── permissions/                 # 权限请求 UI
```

**UI 特色**:
- **Material 3 Design**: 现代化设计语言
- **自定义主题系统**: 颜色、字体、间距全可调
- **Markdown 渲染**: 支持 LaTeX、代码高亮、Mermaid 图表
- **悬浮窗系统**: 系统级悬浮球和聊天窗口
- **桌宠动画**: WebP / DragonBones 动画支持

---

### 6. **integrations 模块** (`app/src/main/java/com/ai/assistance/operit/integrations/`)

第三方集成。

```
integrations/
└── tasker/                      # Tasker 集成
    ├── ActivityConfigAIAgentAction.kt
    ├── WorkflowTaskerActivityConfig.kt
    ├── WorkflowTaskerReceiver.kt
    └── WorkflowBootReceiver.kt
```

**集成能力**:
- **Tasker 插件**: 允许通过 Tasker 触发 AI 代理和工作流
- 支持自定义事件和自动化场景

---

### 7. **util 模块** (`app/src/main/java/com/ai/assistance/operit/util/`)

工具类和辅助函数。

```
util/
├── FileUtils.kt                 # 文件操作工具
├── NetworkUtils.kt              # 网络工具
├── PermissionUtils.kt           # 权限检查工具
├── ImageUtils.kt                # 图片处理工具
├── JsonUtils.kt                 # JSON 工具
├── DateUtils.kt                 # 日期工具
└── ...
```

---

## 🛠️ 工具系统深度解析

Operit 的核心竞争力在于其强大的**工具系统**，允许 AI 调用各种系统能力。

### 工具分类

#### 1. **Standard Tools** (标准权限)
不需要特殊权限，任何应用都可使用的功能。

| 工具类 | 功能说明 |
|--------|---------|
| `StandardFileSystemTools` | 读写文件、搜索文件、压缩解压 |
| `StandardHttpTools` | HTTP 请求、文件上传下载 |
| `StandardWebVisitTool` | 访问网页、HTML 渲染 |
| `StandardCalculator` | 数学计算、表达式求值 |
| `StandardChatManagerTool` | 对话管理、历史记录 |
| `StandardShellToolExecutor` | Linux Shell 命令（Ubuntu 环境）|
| `StandardFFmpegTool` | 视频处理、格式转换 |
| `StandardWorkflowTools` | 工作流执行和管理 |
| `SSHRemoteConnectionTools` | SSH 连接、文件系统挂载 |
| `MemoryQueryToolExecutor` | 记忆检索和管理 |

#### 2. **Accessibility Tools** (无障碍服务)
需要无障碍服务权限，可进行 UI 自动化。

| 工具类 | 功能说明 |
|--------|---------|
| `AccessibilityUITools` | 点击、滑动、输入文本、截图 |
| `AccessibilityFileSystemTools` | 增强文件访问（通过 UI） |
| `AccessibilitySystemOperationTools` | 应用安装、启动、卸载 |
| `AccessibilityDeviceInfoToolExecutor` | 获取设备和应用信息 |

#### 3. **Admin Tools** (Shizuku 权限)
需要 Shizuku 提供的系统级权限。

| 工具类 | 功能说明 |
|--------|---------|
| `AdminUITools` | 更强大的 UI 操作 |
| `AdminFileSystemTools` | 系统文件访问 |
| `AdminSystemOperationTools` | 系统级操作（静默安装等）|
| `AdminDeviceInfoToolExecutor` | 详细设备信息 |

#### 4. **Root Tools** (Root 权限)
需要 Root 权限的最高级功能。

| 工具类 | 功能说明 |
|--------|---------|
| `RootUITools` | 完全的 UI 控制 |
| `RootFileSystemTools` | 完全的文件系统访问 |
| `RootSystemOperationTools` | 系统级修改 |
| `RootDeviceInfoToolExecutor` | 完整系统信息 |

#### 5. **其他专业工具**

- **Agent Tools**: AI 代理调用其他 AI
- **Calculator Tools**: 高级数学计算
- **JavaScript Tools**: 执行 JavaScript/TypeScript 代码
- **MCP Tools**: 模型上下文协议工具
- **Pack Tools**: 应用打包和修改

### 工具注册与调用流程

1. **注册**: `ToolRegistration.kt` 中注册所有工具
2. **解析**: AI 响应中的 `function_call` 被解析
3. **权限检查**: 检查当前权限级别是否满足
4. **执行**: `AIToolHandler.kt` 调用对应工具执行器
5. **返回**: 结果返回给 AI 继续对话

```kotlin
// 伪代码示例
val toolResult = when (toolName) {
    "click" -> AccessibilityUITools.click(x, y)
    "readFile" -> StandardFileSystemTools.readFile(path)
    "httpGet" -> StandardHttpTools.get(url)
    // ...
}
```

---

## 🌐 MCP (Model Context Protocol) 生态

Operit 支持 **MCP 协议**，允许加载第三方插件扩展 AI 能力。

### MCP 架构

```
data/mcp/
├── MCPServerManager.kt          # MCP 服务器管理器
├── MCPPluginRegistry.kt         # 插件注册表
├── MCPServerConfig.kt           # 服务器配置
└── models/
    ├── MCPServer.kt             # MCP 服务器模型
    ├── MCPTool.kt               # MCP 工具模型
    └── MCPResource.kt           # MCP 资源模型

core/tools/mcp/
├── MCPToolExecutor.kt           # MCP 工具执行器
├── MCPServerClient.kt           # MCP 客户端
└── MCPProtocolHandler.kt        # 协议处理器
```

### 支持的 MCP 插件类型

1. **uvx 插件**: Python 包插件（通过 `uvx` 运行）
2. **npx 插件**: Node.js 插件（通过 `npx` 运行）
3. **本地插件**: 本地可执行文件
4. **远程 MCP**: 通过网络连接的 MCP 服务器

---

## 📦 依赖库管理

### 主要依赖

#### UI 和 Android 核心
```kotlin
// Jetpack Compose
implementation(platform("androidx.compose:compose-bom:2024.XX.XX"))
implementation("androidx.compose.material3:material3")
implementation("androidx.compose.ui:ui")

// Navigation
implementation("androidx.navigation:navigation-compose")

// 图片加载
implementation("io.coil-kt:coil-compose")
```

#### 数据库
```kotlin
// ObjectBox (主数据库)
implementation("io.objectbox:objectbox-kotlin:3.8.0")

// Room (辅助)
implementation("androidx.room:room-runtime")
implementation("androidx.room:room-ktx")
```

#### 网络和 API
```kotlin
// OkHttp
implementation("com.squareup.okhttp3:okhttp")
implementation("com.squareup.okhttp3:sse") // SSE 支持

// Retrofit
implementation("com.squareup.retrofit2:retrofit")
implementation("com.squareup.retrofit2:converter-moshi")

// JSON
implementation("com.squareup.moshi:moshi-kotlin")
implementation("org.jetbrains.kotlinx:kotlinx-serialization-json")
```

#### AI 和机器学习
```kotlin
// ML Kit
implementation("com.google.mlkit:text-recognition")
implementation("com.google.mlkit:text-recognition-chinese")

// ONNX Runtime
implementation("com.microsoft.onnxruntime:onnxruntime-android:1.17.1")

// TensorFlow Lite
implementation("org.tensorflow:tensorflow-lite")

// MediaPipe
implementation("com.google.mediapipe:tasks-text")
```

#### 系统集成
```kotlin
// Shizuku
implementation("dev.rikka.shizuku:api")
implementation("dev.rikka.shizuku:provider")

// libsu (Root)
implementation("com.github.topjohnwu.libsu:core")
implementation("com.github.topjohnwu.libsu:service")
```

#### 文档处理
```kotlin
// PDF
implementation("com.itextpdf:itext7-core")
implementation("org.apache.pdfbox:pdfbox")

// Office 文档
implementation("org.apache.poi:poi")
implementation("org.apache.poi:poi-ooxml")

// 压缩
implementation("org.apache.commons:commons-compress")
implementation("net.lingala.zip4j:zip4j")
```

#### 其他功能
```kotlin
// MCP SDK
implementation("io.modelcontextprotocol.sdk:mcp:0.7.0")

// WorkManager
implementation("androidx.work:work-runtime-ktx")

// Tasker Plugin
implementation("com.joaomgcd:taskerpluginlibrary:0.4.10")

// Markdown 渲染
implementation("io.noties.markwon:core")

// LaTeX 渲染
implementation("org.scilab.forge:jlatexmath")

// ExoPlayer (视频)
implementation("com.google.android.exoplayer:exoplayer")
```

---

## 🔐 权限系统

### 必需权限
```xml
<!-- 网络 -->
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

<!-- 存储 -->
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.MANAGE_EXTERNAL_STORAGE" />

<!-- 前台服务 -->
<uses-permission android:name="android.permission.FOREGROUND_SERVICE" />
<uses-permission android:name="android.permission.FOREGROUND_SERVICE_MICROPHONE" />
<uses-permission android:name="android.permission.FOREGROUND_SERVICE_DATA_SYNC" />
<uses-permission android:name="android.permission.FOREGROUND_SERVICE_SPECIAL_USE" />

<!-- 悬浮窗 -->
<uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />

<!-- 通知 -->
<uses-permission android:name="android.permission.POST_NOTIFICATIONS" />

<!-- 语音 -->
<uses-permission android:name="android.permission.RECORD_AUDIO" />

<!-- Shizuku -->
<uses-permission android:name="moe.shizuku.manager.permission.API_V23" />
```

### 可选权限
```xml
<!-- 电话和短信 -->
<uses-permission android:name="android.permission.CALL_PHONE" />
<uses-permission android:name="android.permission.SEND_SMS" />

<!-- 位置 -->
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

<!-- 查询应用列表 -->
<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES" />
```

---

## 🚀 核心功能模块

### 1. Ubuntu 24 终端环境

**位置**: `ui/features/toolbox/TerminalScreen.kt`

- 完整的 Ubuntu 24.04 用户空间
- 支持 `apt` 包管理器
- 内置 Python、Node.js、vim 等工具
- 支持 SSH 连接（作为客户端和服务器）
- 文件系统挂载（反向挂载到手机）

**技术实现**:
- **proot-distro**: 无 Root 的 Linux 容器
- **Termux 兼容层**: 复用 Termux 的基础设施

### 2. 智能记忆系统

**位置**: `data/repository/MemoryRepository.kt`

- **AI 自动分类**: 根据内容自动分类记忆
- **向量检索**: 使用 ONNX 模型生成 embeddings
- **HNSW 索引**: 高效的相似度搜索
- **导入导出**: 支持记忆的备份和迁移

**存储结构**:
```kotlin
@Entity
data class Memory(
    @Id var id: Long = 0,
    var content: String,
    var category: String,
    var embedding: FloatArray?,
    var timestamp: Long,
    var metadata: Map<String, String>
)
```

### 3. 角色卡系统

**位置**: `data/preferences/CharacterCardManager.kt`

- **标准格式**: 支持 Character Card V2 规范
- **PNG 元数据**: 角色信息嵌入图片
- **导入导出**: 与其他应用兼容
- **独立历史**: 每个角色独立对话历史

### 4. 语音助手

**位置**: `services/assistant/`

- **持续对话**: 免唤醒词连续对话
- **TTS 支持**: 本地 / 云端 TTS
- **自定义音色**: 支持多种音色
- **悬浮球唤醒**: 随时随地唤起

### 5. Web 开发功能

**位置**: `ui/features/toolbox/WebDevScreen.kt`

- **在线 IDE**: 在手机上编写 HTML/CSS/JS
- **实时预览**: 即时查看效果
- **导出 APK**: 将网页打包成独立应用
- **本地服务器**: 内置 NanoHTTPD

### 6. 工作流系统

**位置**: `core/workflow/`

- **自动化任务**: 定时执行 AI 指令
- **Tasker 集成**: 与 Tasker 无缝配合
- **触发器**: 时间、事件、条件触发
- **WorkManager 调度**: 可靠的后台执行

---

## 🎨 UI/UX 设计系统

### 主题系统

**位置**: `ui/theme/`

```kotlin
// 自定义主题配置
data class CustomTheme(
    val primaryColor: Color,
    val secondaryColor: Color,
    val backgroundColor: Color,
    val surfaceColor: Color,
    val textColor: Color,
    val typography: Typography,
    val spacing: Spacing,
    val shapes: Shapes
)
```

**特色**:
- 完全自定义颜色、字体、间距
- 支持深色/浅色模式
- 导入导出主题配置
- 内置多套预设主题

### Markdown 渲染

**位置**: `ui/common/MarkdownRenderer.kt`

**支持的功能**:
- ✅ 标题、粗体、斜体、删除线
- ✅ 代码块 + 语法高亮（多语言）
- ✅ 表格
- ✅ 列表（有序、无序）
- ✅ LaTeX 数学公式（`$...$` 和 `$$...$$`）
- ✅ Mermaid 图表
- ✅ 图片（本地 + 网络）
- ✅ 链接（可点击）

### 桌宠系统

**位置**: `core/avatar/`

**支持格式**:
- WebP 动画
- DragonBones 骨骼动画
- Spine 动画（计划中）

**功能**:
- 自定义表情映射
- 情绪状态切换
- 悬浮窗显示

---

## 📱 CI/CD 配置

### GitHub Actions

**位置**: `.github/workflows/build.yml`

**构建流程**:
1. ✅ 检出代码
2. ✅ 设置 JDK 17
3. ✅ 下载依赖库（从 Google Drive）
4. ✅ 配置签名
5. ✅ 构建 APK（Debug / Release / Nightly）
6. ✅ 上传 Artifacts
7. ✅ 创建 GitHub Release（仅 tag）

**构建变体**:
- `debug`: 调试版本
- `release`: 正式版本（代码混淆 + 资源压缩）
- `nightly`: 每日构建版本

---

## 🔒 代码混淆和安全

### ProGuard 配置

**位置**: `app/proguard-rules.pro`

**保护策略**:
- ✅ R8 全模式优化
- ✅ 代码混淆
- ✅ 资源压缩
- ✅ 移除未使用的代码

**保留规则**:
- Kotlin 反射类
- Jetpack Compose UI
- ObjectBox 实体
- Retrofit 接口
- Moshi JSON 模型

### 安全措施

1. **API 密钥保护**: 使用 `local.properties`（Git 忽略）
2. **数据加密**: 使用 `EncryptedSharedPreferences`
3. **网络安全**: TLS 1.2+ 强制
4. **权限最小化**: 仅请求必需权限

---

## 🧪 测试策略

### 测试目录

```
app/src/
├── test/                        # 单元测试
│   └── java/com/ai/assistance/operit/
└── androidTest/                 # 集成测试
    └── java/com/ai/assistance/operit/
```

### 测试框架

- **JUnit**: 单元测试
- **Espresso**: UI 测试
- **MockK**: Kotlin Mock 框架
- **Coroutines Test**: 协程测试

---

## 📊 性能优化

### 编译优化

**位置**: `gradle.properties`

```properties
# JVM 堆内存
org.gradle.jvmargs=-Xmx8g -XX:MaxMetaspaceSize=1g

# 并行编译
org.gradle.parallel=true

# 增量编译
android.enableBuildCache=true
```

### 运行时优化

1. **LazyColumn**: 虚拟化长列表
2. **remember**: 避免重复计算
3. **derivedStateOf**: 优化状态计算
4. **Flow**: 异步数据流
5. **Coil**: 图片缓存和加载优化

---

## 📖 开发文档

### 重要文档

| 文档 | 说明 |
|------|------|
| `README.md` | 项目介绍和快速开始 |
| `docs/CONTRIBUTING.md` | 贡献指南 |
| `docs/BUILDING.md` | 编译指南 |
| `docs/SCRIPT_DEV_GUIDE.md` | 脚本开发指南 |
| `docs/BUILD_AND_SIGNING.md` | 构建和签名 |
| `docs/GITHUB_SECRETS_GUIDE.md` | GitHub Secrets 配置 |

### 社区资源

- **官方网站**: https://aaswordman.github.io/OperitWeb/
- **GitHub**: https://github.com/AAswordman/Operit
- **QQ 群**: [点击加入](https://qm.qq.com/q/Sa4fKEH7sO)
- **Discord**: https://discord.gg/YnV9MWurRF
- **Issue Tracker**: https://github.com/AAswordman/Operit/issues

---

## 🔮 技术栈总结

### 前端
- Jetpack Compose
- Material 3
- Coil (图片)
- Markwon (Markdown)

### 后端
- Kotlin Coroutines
- Flow
- OkHttp + Retrofit
- Moshi / Kotlinx Serialization

### 数据
- ObjectBox (主)
- Room (辅)
- DataStore
- EncryptedSharedPreferences

### AI/ML
- ML Kit
- ONNX Runtime
- TensorFlow Lite
- MediaPipe

### 系统
- Shizuku
- Accessibility Service
- libsu (Root)
- WorkManager

### 工具
- MCP SDK
- FFmpeg Kit
- Apache POI
- NanoHTTPD

---

## 💡 架构模式

### 整体架构: **MVVM + Repository**

```
UI Layer (Compose)
    ↓
ViewModel (State Management)
    ↓
Repository (Data Access)
    ↓
Data Sources (ObjectBox, Network, Preferences)
```

### 工具系统: **策略模式 + 工厂模式**

```
ToolRegistration (Factory)
    ↓
AIToolHandler (Context)
    ↓
Specific Tool Executor (Strategy)
```

### 服务架构: **前台服务 + Binder**

```
MainActivity
    ↓
Service (Foreground)
    ↓
ServiceCore (Business Logic)
```

---

## 🎯 总结

Operit AI 是一个**功能极其丰富、架构清晰、扩展性强**的 Android AI 助手应用。

### 核心优势

1. ✅ **工具系统**: 40+ 内置工具 + MCP 插件生态
2. ✅ **权限分级**: 从标准到 Root，灵活适配
3. ✅ **Ubuntu 环境**: 完整的 Linux 终端
4. ✅ **智能记忆**: AI 驱动的向量检索
5. ✅ **高度定制**: 主题、角色卡、桌宠全可调
6. ✅ **本地优先**: 数据私有，离线可用
7. ✅ **开放生态**: MCP 协议、脚本扩展

### 技术亮点

- 🚀 **现代化**: Jetpack Compose + Kotlin 协程
- 🏗️ **模块化**: 清晰的分层架构
- 🔧 **可扩展**: 插件化工具系统
- 💾 **高性能**: ObjectBox + 优化策略
- 🔒 **安全性**: 加密存储 + 权限控制

### 适合人群

- 🧑‍💻 **开发者**: 强大的工具调用和自动化能力
- 🎨 **创作者**: 自定义主题和角色卡
- 🔬 **研究者**: 开源、可扩展、功能完备
- 👥 **用户**: 功能丰富的 AI 助手

---

**最后更新**: 2025-12-25
**文档版本**: v1.0
**项目版本**: v1.7.0
