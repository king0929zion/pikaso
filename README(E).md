# Operit (Open-AutoGLM)

Operit is an Android-oriented AutoGLM automation assistant. Core principles:
- Actions: prefer Accessibility (tap/swipe/long-press/global back/home/screenshot/UI hierarchy)
- Text input: use Shizuku only when input is needed, temporarily switch to Operit IME, then restore the previous IME
- Virtual screen: keep VirtualDisplay / overlay logic intact

## Only 4 tools are exposed in UI
1. Phantom process limit remover
2. AutoGLM executor
3. AutoGLM configurator (one-click)
4. Web-to-APK packager

## Quick start (required)
1. Open `Tool Permissions` from the sidebar or the shield button on Toolbox.
2. Finish the required setup:
   - Shizuku: install / start / grant permission
   - Accessibility service: enable Operit Accessibility
   - Operit IME: enable in system settings
   - Overlay / notification permissions: enable if needed
3. Go back to `Toolbox` and use the 4 tools.

## Key code
- AutoGLM controller: `app/src/main/java/com/ai/assistance/operit/core/autoglm/AutoGLMController.kt`
- Accessibility: `app/src/main/java/com/ai/assistance/operit/core/accessibility/OperitAccessibilityService.kt`
- IME switching: `app/src/main/java/com/ai/assistance/operit/core/input/InputMethodManager.kt`
- Virtual screen UI: `app/src/main/java/com/ai/assistance/operit/ui/common/displays/VirtualDisplayOverlay.kt`
- Permission page: `app/src/main/java/com/ai/assistance/operit/ui/features/toolbox/screens/permissions/CoreToolPermissionsScreen.kt`

## Build
This repo builds and publishes via GitHub Actions on every push to `main`.

