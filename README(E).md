# Pikaso (Operit) - Android Automation Toolkit

Pikaso/Operit is an Android 8.0+ automation toolkit that currently focuses on 4 core modules:

1. Phantom process limit remover
2. AutoGLM Executor (UI automation execution)
3. AutoGLM Configurator (one-click AutoGLM configuration)
4. Web-to-APK Packager (HTML -> APK)

## Design Principles

- UI actions: prioritize Accessibility Service for tap/swipe/long-press, hierarchy, and screenshots
- Text input: use Shizuku only when input is required (temporarily switch to the built-in Operit IME, then restore the original IME)
- Virtual screen: keep and maintain `VirtualDisplayOverlay` logic for visualization and interaction
- UI style: minimalist layout inspired by https://www.anthropic.com/

## Required Permissions

In-app entry: `Toolbox` → top-right `Permissions` button.

- Accessibility Service (primary channel for UI actions)
- Shizuku (IME switching during text input; also used by some shell-based tools)
- Operit IME enabled in system settings
- Overlay (optional; for overlays/virtual screen)
- Storage (optional; for Web-to-APK and file operations)
- Notifications (Android 13+; optional)

See `docs/TOOLS.md` for details.

## Key Paths

- `app/src/main/java/com/ai/assistance/operit/core/accessibility/OperitAccessibilityService.kt`
- `app/src/main/java/com/ai/assistance/operit/core/autoglm/AutoGLMController.kt`
- `app/src/main/java/com/ai/assistance/operit/core/input/InputMethodManager.kt`
- `app/src/main/java/com/ai/assistance/operit/ui/common/displays/VirtualDisplayOverlay.kt`
- `app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/ToolboxScreen.kt`

## CI Build

GitHub Actions builds signed Release APKs via `.github/workflows/build.yml`.
