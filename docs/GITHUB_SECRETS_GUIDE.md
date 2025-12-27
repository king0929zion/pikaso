# GitHub Secrets 配置指南

## 签名密钥信息

### 本地已生成的密钥
- **Keystore 文件**: `app/release.keystore`
- **密钥别名**: `operit`
- **Keystore 密码**: `Pikaso2025!`
- **Key 密码**: `Pikaso2025!`
- **有效期**: 10000 天 (到 2053 年)

## GitHub Actions 配置步骤

### 1. 进入 GitHub Secrets 设置

1. 访问仓库: https://github.com/king0929zion/pikaso
2. 点击 `Settings` (设置)
3. 左侧菜单选择 `Secrets and variables` > `Actions`
4. 点击 `New repository secret` 添加新的 secret

### 2. 添加以下 Secrets

#### Secret 1: KEYSTORE_BASE64

**名称**: `KEYSTORE_BASE64`

**值** (复制以下完整内容，不要换行):
```
MIIKtAIBAzCCCl4GCSqGSIb3DQEHAaCCCk8EggpLMIIKRzCCBa4GCSqGSIb3DQEHAaCCBZ8EggWbMIIFlzCCBZMGCyqGSIb3DQEMCgECoIIFQDCCBTwwZgYJKoZIhvcNAQUNMFkwOAYJKoZIhvcNAQUMMCsEFFDIciCb1pdhtWaoGOdsNlF8b0p5AgInEAIBIDAMBggqhkiG9w0CCQUAMB0GCWCGSAFlAwQBKgQQ85pmT/coMNiu0xb8xfPRkQSCBNDNPsfSuFH8jEHmsRZrQ0szOrkJlMfgFtvhPS6RlIN0rf2Ay27d9gC2Y3PNMoZccYPe2ZHIkuxPO7gNYBnccOA4RNDes9F8KdFSqnwVroke4W/Qpb1CMwaeIQuiyRPCVte0WQObnTbQDJV0v1Fk3GFEcfkseUhN5Z6dTGylXOlRX6tOgU5fgv3/r96b/WMkndaCqJW1N/2eacEaHf2XwWBTxXX8cE2sxLni8oXeKdTbBtFadJWF4OkgA25bKR2R0Ualjqcqw8TTziRhFPCwoqo/pEINZHNomGpn4LUxQzf1xi1528yDxvnOJ7/YKwgDAfG3x4QZcC0aF6bzVEuPecpSuQlt6BNs6LcQ9O1tkNYdRpuH+3nT4C1RXbIkDnZuZBV97AbK0llUL/Gw8D5NCqFt9rtXqTGgq1toAl0ID7g7huI4YO/a4xolNuElV6lfuKZN5JzsCrEEZP0ITzOcGhPoe1iV7sdCfRPEO/tRmPaOvCouX42DNr+fmPnWTctm+yfFPfgyMg4/edlQ66v9a/CzhCXIQEin5VSFLyBltb2FLj7Pn6MZah09xPhZAzhmdsjBaiaNtj9XbxCDguZkkKjqsosWhqeEce3kYRVr9sTRZ4sStueqVZjmcHZyeLmw8smhfQ/o66YUVd6g8fNpipy3kf8nMP5jUk4Bj/JKB/9686JN/+8EZROulH+hSxmJcb+03mYa+1XHfv/AOrXM/0cDiu1xJHqFJ1WMf8mvO41wJWcoBQhKIlCza8hYgR4Z+aWTSPXHLtM68af9TXZWqDckovUQ8jjfCZytUr4ppM5W9E3XRgYEUmi7sNu2m08Nbssvaxat3D712QK5faYUXsovcq5FZBOi1Wgp6VRAADZQRFhLo1TmRdjbwciodEigmay65LL3ZnVz52739GyEuu71Ex2fTjMDya5ky2mHlXx2XDiqOy2YBjf3Z9aDtx3rVGkb4PxSsPFDBHUAsZiwFGaso4ai15OsMik/V4YdTacwK7V8xdE8Q2DFG07OawXWt6AxRrrA2pktp5RB8J/c0IefHUMizpx6EP61qP5YTrDF4f7T67sUMuG9HLLKJdneA8XNmINzU9l88cR1Et5M9QaWVr0hJwODVHebJmim4qeQIpTC4G+SHll0pB+ZD4XZDOiskT8OUzZ4Urg+AnyIpTp/7hLHKCQ2y1C/thA9UV/SqgcDY6MYl9ysCkw0KtQSTfO1sZ+vhAJDsDo+0LkvQbbZigGbLZZifSKK1ffiVE10ZcDQkEql+ChuW8rBUvJAw18Teb+SweeeeVohbHDtYwnKTBnABlKCSN3LrStug6iDYDPE59/WB/OcQSkbJbU8zc3ZxfmZHeIinp/QokAKE4DfZ9SFiWuLTMkoUKWgSuUAdyz8rHBKUcv55GvwcbJRAOfJw6sLvQhtUyGm6PB14llK7wQPOxbkpEF9FF2GInJXA+j2+j6H36T5vp3fhB6EOECFPyqNIb6dKgL6qoHoL4w+4GFzw6mjcDutO1I2yuVw1feaMt2BwVn/z0K5NPr7L2kteUDpTFoDRUthLABb5RfZU5kZqRtbW2Sh+nVKyzEaY8GnLqCbFdZ7kxzYvoLr28oZeIoY4YwwiZD7HWmsLtveTeWkGrrnoa8mx99DobKFJDFAMBsGCSqGSIb3DQEJFDEOHgwAbwBwAGUAcgBpAHQwIQYJKoZIhvcNAQkVMRQEElRpbWUgMTc2NjY1MzAzMzI3NTCCBJEGCSqGSIb3DQEHBqCCBIIwggR+AgEAMIIEdwYJKoZIhvcNAQcBMGYGCSqGSIb3DQEFDTBZMDgGCSqGSIb3DQEFDDArBBQneli2VhxS9c5ozNpJ5IWRD/njTAICJxACASAwDAYIKoZIhvcNAgkFADAdBglghkgBZQMEASoEEANxpwOMpI1AfT509s0VwrqAggQAQU7xayNVSUK/2qsk5t8kv3caAurMeSWRrMrE4KGsNOFxt/UAQ5j2+LlCR6aWUDSG5GHsE9xqxZyyj8oJcmXGvG1LzFz5fFWHOJ3DhZKImf7tsCrC73X7bEYjpAfYbSKnkPxs+Dq/OL6+xwMY+Jb/P1vf1ae6F1TGcuEGN7NN6GKVU7FjkWnxVZU06Wa2iNL+zBChdTr5KPafQJ7DiHy6t72kUS7F9lkruJD+1rKJnH55S+fn+QXTIuqZP2tvFydD9fTEn9RJmLBmETRo91SPJ+a5pnAP8dhA+cPq9mk0i4h0UfxknXTNzPK8rUenQrFEB+uK0h8Q1vYve8lLQ9luVsRKiNsgFXJuTM7Q57dxCUfc8Z/fxZqZJfO2O6NYu/pDgF0zuv2teF9Ak0nakkh4eXQCeiO8XYhoQoY83IUExa/i0IrznHnioUc8IxgHwSw0bQKTP9UWdAXmPZYH//5C9Vil/Lfk1UWIK5FNJo9w3/qWF0q7gIZIEWW437s0ZELJar89FBRiNB0exzxrR+tSGW7vMTHkF8UnmFEqGjF3l6Vc6DnxHY6NsqMgoU2EpO/IiHIf32ci7XDOqHq3eIn8B6x5PFe9uLdo65Wbc24v/wa+GfCEXD4SWomO0S5A0ud0T9NjM6Z5w9iV2zQlv4I7xkkkQqNnH9RzUKHGlD+4JUcUlsMf/LeX6Ll/kNPAf9YQj32trUTlUqO7AFsQldGOQJUL8FGN3uajyX67E4GLL6ksS/8T+1o7BV4PeOySMpuC/IMIjWBx4jFcUUZcxwc4ANX1G60Jjysdz+FXjm1elqiFCmTy/GYBmqQOgaKYSE0lGwxnw9uLh9tKa6YsPaE+b/NhSPj4Yf1I5uJzC+QKmD7C0pP34PX2/Y2Cp3yGVo5Trc2Fn2Ge2DLnLTIZEApU6Up7bx3qbUPVrhAIP6F2C91DB8imfM6b1nEeeSt2wy4eoB0n+FERAhrMcPczEcAvkQvSMBItYb3KM/JhpB3OP3fu7XWhXsIKPC3i7DQHZcevCdjSnchmQEhoHCzzyITPY3I8mpkeE6ZjFlRqIQycMcKNUdH7E4jp6rhmwHIF+JPdqRM9/9F8kt5mJDPgBY722qW+juA2+2/zW1suHYQP6sCYC+aICwy2qVAvLx07zlNCcHNJZY1KzdU/B4o4U1Mm/HW6IbBAMyb5k+uUCpWPCbH9tAQGmF0eYIpQB6Y1xcebZQ9lkMZ39ECsOGeqko5EcGEzpHjpl9xUNITryPHhxxgN4wfiuo8NALsrIX+4ygRAgmasVCr9NIl7bbO2NxXkNj3Na1/gVbsNQ9ly0+nI+C98WO+VRadNsWUUeaWAP/jKnlxs+aAe6laxNWzqsISVFjBNMDEwDQYJYIZIAWUDBAIBBQAEIJU7OyoRpPjF1CT866wF3OAMsynuPyF+CLITangtsHtiBBTlfCASjjLqdT28enehrIwsaS6gNwICJxA=
```

#### Secret 2: STORE_PASSWORD

**名称**: `STORE_PASSWORD`
**值**: `Pikaso2025!`

#### Secret 3: KEY_PASSWORD

**名称**: `KEY_PASSWORD`
**值**: `Pikaso2025!`

#### Secret 4: KEY_ALIAS

**名称**: `KEY_ALIAS`
**值**: `operit`

### 3. 验证配置

配置完成后，点击页面顶端的 `Actions` 标签，查看工作流运行状态。

## 测试本地构建

在本地测试构建是否成功：

```bash
cd G:\Open-AutoGLM\Pikaso
.\gradlew assembleRelease
```

构建成功后，APK 文件位于:
`app\build\outputs\apk\release\app-release.apk`

## 快速配置链接

点击以下链接快速添加 Secrets:

- [添加 KEYSTORE_BASE64](https://github.com/king0929zion/pikaso/settings/secrets/actions/new)
- [添加 STORE_PASSWORD](https://github.com/king0929zion/pikaso/settings/secrets/actions/new)
- [添加 KEY_PASSWORD](https://github.com/king0929zion/pikaso/settings/secrets/actions/new)
- [添加 KEY_ALIAS](https://github.com/king0929zion/pikaso/settings/secrets/actions/new)

## 注意事项

⚠️ **安全警告**:
1. **永远不要**将 `keystore.properties` 或 `release.keystore` 提交到 Git
2. `.gitignore` 已配置忽略这些文件
3. 定期备份 `release.keystore` 文件到安全位置
4. 如果密钥泄露，立即撤销并生成新密钥

## 密钥信息摘要

| 项目 | 值 |
|------|-----|
| Keystore 文件 | `app/release.keystore` |
| 密钥别名 | `operit` |
| Keystore 密码 | `Pikaso2025!` |
| Key 密码 | `Pikaso2025!` |
| 有效期 | 10000 天 (至 2053-05-12) |
| 证书指纹 SHA-256 | `A1:20:69:B4:C1:E6:7E:77:58:BD:5B:75:71:57:5A:1D:42:FA:7E:27:19:8D:25:E1:50:C1:37:5F:6E:19:92:37` |
