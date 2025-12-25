# Operit Android 签名配置指南

## 1. 生成签名密钥

### 使用 keytool 生成密钥

```bash
keytool -genkeypair \
  -v \
  -storetype PKCS12 \
  -keystore release.keystore \
  -alias operit \
  -keyalg RSA \
  -keysize 2048 \
  -validity 10000 \
  -storepass your_store_password \
  -keypass your_key_password \
  -dname "CN=Operit, OU=Development, O=YourCompany, L=YourCity, ST=YourState, C=CN"
```

### 使用 Android Studio 生成密钥

1. 打开 Android Studio
2. 选择 `Build` > `Generate Signed Bundle/APK`
3. 选择 APK 或 App Bundle
4. 点击 `Create new...` 创建新密钥
5. 填写密钥信息并生成

## 2. 配置本地签名

### 方法一：使用 keystore.properties 文件

1. 将生成的 `release.keystore` 文件复制到 `app/` 目录
2. 复制 `app/keystore.properties.example` 为 `app/keystore.properties`
3. 编辑 `keystore.properties` 填入实际值：

```properties
storePassword=your_actual_store_password
keyPassword=your_actual_key_password
keyAlias=your_actual_key_alias
storeFile=release.keystore
```

### 方法二：使用环境变量

在 `~/.gradle/gradle.properties` 中添加：

```properties
OPERIT_STORE_PASSWORD=your_store_password
OPERIT_KEY_PASSWORD=your_key_password
OPERIT_KEY_ALIAS=your_key_alias
```

## 3. GitHub Actions 配置

### 3.1 生成 GitHub Secrets

在 GitHub 仓库中配置以下 Secrets：

1. 进入仓库的 `Settings` > `Secrets and variables` > `Actions`
2. 添加以下 secrets：

| Secret 名称 | 说明 | 示例值 |
|------------|------|--------|
| `KEYSTORE_BASE64` | Base64 编码的 keystore 文件内容 | 见下方说明 |
| `STORE_PASSWORD` | Keystore 密码 | your_store_password |
| `KEY_PASSWORD` | Key 密码 | your_key_password |
| `KEY_ALIAS` | Key 别名 | operit |

### 3.2 生成 KEYSTORE_BASE64

**Windows (PowerShell):**
```powershell
[Convert]::ToBase64String([IO.File]::ReadAllBytes("release.keystore"))
```

**Linux/macOS:**
```bash
base64 -i release.keystore | tr -d '\n'
```

**使用在线工具:**
- 访问 https://www.base64-image.de/
- 上传 `release.keystore` 文件
- 复制生成的 Base64 字符串

### 3.3 验证配置

配置完成后，推送代码到 `main` 分支即可自动触发构建：

```bash
git add .
git commit -m "chore: 添加 GitHub Actions 构建配置"
git push origin main
```

## 4. 构建产物

GitHub Actions 将生成以下产物：

### Debug 构建
- **文件名**: `Operit-Debug-{version}-{timestamp}.apk`
- **用途**: 开发测试
- **保留时间**: 30 天

### Release 构建
- **APK**: `Operit-Release-{version}-{timestamp}.apk`
- **AAB**: `app-release.aab`
- **保留时间**: 90 天

### GitHub Release
- **触发条件**: 推送到 `main` 或 `master` 分支
- **Tag 格式**: `v{version}+{versionCode}`
- **包含文件**: Release APK 和 AAB

## 5. 本地构建

### 构建 Debug APK
```bash
./gradlew assembleDebug
```

### 构建 Release APK
```bash
./gradlew assembleRelease
```

### 构建发布包 (AAB)
```bash
./gradlew bundleRelease
```

构建产物位置：
- APK: `app/build/outputs/apk/`
- AAB: `app/build/outputs/bundle/release/`

## 6. 常见问题

### Q: 密钥泄露怎么办？
A: 立即撤销泄露的密钥，生成新密钥，并更新所有配置。

### Q: 如何验证 APK 签名？
A: 使用 `apksigner` 工具：
```bash
apksigner verify --print-certs app-release.apk
```

### Q: GitHub Actions 构建失败？
A: 检查以下几点：
1. GitHub Secrets 是否正确配置
2. keystore.properties 文件中的值是否匹配
3. build.gradle.kts 中的签名配置是否正确

### Q: 如何在 CI 中使用调试密钥？
A: 如果未配置 `KEYSTORE_BASE64`，workflow 会自动创建一个临时密钥。

## 7. 安全建议

1. **永远不要**将 keystore 文件或包含密码的 keystore.properties 提交到 Git
2. 确保 `.gitignore` 包含以下内容：
   ```
   *.keystore
   *.jks
   keystore.properties
   ```
3. 定期更新密钥密码
4. 为不同环境使用不同的密钥（开发/测试/生产）
5. 限制 GitHub Secrets 的访问权限

## 8. 升级应用签名

如果需要更换签名密钥：

1. 生成新的 keystore
2. 更新 `keystore.properties` 或 GitHub Secrets
3. 更新 `build.gradle.kts` 中的签名配置
4. 增加 `versionCode`
5. 清理并重新构建：
   ```bash
   ./gradlew clean
   ./gradlew assembleRelease
   ```

注意：更换签名密钥后，用户需要卸载旧版本才能安装新版本。
