# Operit UI Component Style Guide

> Based on Anthropic's design philosophy: clean, warm, human-centric interfaces
>
> Reference: https://www.anthropic.com
>
> **Last Updated**: 2025-12-25

---

## Table of Contents

1. [Design Principles](#design-principles)
2. [Color System](#color-system)
3. [Typography](#typography)
4. [Spacing & Layout](#spacing--layout)
5. [Component Examples](#component-examples)
6. [Chat UI Patterns](#chat-ui-patterns)
7. [Accessibility Guidelines](#accessibility-guidelines)
8. [Design Token Migration Progress](#design-token-migration-progress)

---

## Design Principles

### Core Philosophy

- **Minimalism**: Less is more - use generous white space
- **Warmth**: Muted, warm tones create approachability
- **Clarity**: Clear hierarchy with intentional contrast
- **Human-centric**: Design feels personal and trustworthy

### Visual Characteristics

| Aspect | Guideline |
|--------|-----------|
| **Color** | Warm, muted tones - no harsh saturation |
| **Spacing** | Generous padding - let content breathe |
| **Typography** | Sans-serif for headings, Serif for body |
| **Shapes** | Rounded corners (12-16dp) for softness |
| **Motion** | Smooth, subtle transitions |

---

## Color System

### Primary Palette

```kotlin
// Main brand colors (Anthropic-inspired)
AnthropicDark    // #141413 - Primary text/dark backgrounds
AnthropicLight   // #faf9f5 - Light backgrounds
AnthropicMidGray // #b0aea5 - Secondary elements
AnthropicLightGray // #e8e6dc - Subtle backgrounds/dividers
```

### Accent Colors

```kotlin
// Use hierarchy: Primary > Secondary > Tertiary
AnthropicOrange  // #d97757 - Primary accent (CTAs, user messages)
AnthropicBlue    // #6a9bcc - Secondary accent (info, AI messages)
AnthropicGreen   // #788c5d - Tertiary accent (success, confirmations)
```

### Semantic Colors

```kotlin
// Status and state colors
AppColors.Success      // Success states
AppColors.Warning      // Warning states
AppColors.Error        // Error states
AppColors.Info         // Informational states

// Chat-specific
AppColors.UserMessage      // User message bubbles
AppColors.AiMessage        // AI message bubbles
AppColors.ThinkingBackground // AI thinking state
```

### Usage Guidelines

```kotlin
// ✅ Good: Using semantic colors
Card(
    colors = CardDefaults.cardColors(
        containerColor = AppColors.UserMessage
    )
)

// ❌ Bad: Hardcoded colors
Card(
    colors = CardDefaults.cardColors(
        containerColor = Color(0xFFd97757)
    )
)
```

---

## Typography

### Font Families

| Context | Font | Fallback |
|---------|------|----------|
| **Headings** (24pt+) | Poppins | Sans-Serif |
| **Body Text** | Lora | Serif |

### Type Scale

```kotlin
// Display - Largest, short important text
MaterialTheme.typography.displayLarge  // 57sp
MaterialTheme.typography.displayMedium // 45sp
MaterialTheme.typography.displaySmall  // 36sp

// Headline - High emphasis, shorter than body
MaterialTheme.typography.headlineLarge  // 32sp, SemiBold
MaterialTheme.typography.headlineMedium // 28sp, SemiBold
MaterialTheme.typography.headlineSmall  // 24sp, SemiBold

// Title - Medium emphasis
MaterialTheme.typography.titleLarge  // 22sp, SemiBold
MaterialTheme.typography.titleMedium // 16sp, Medium
MaterialTheme.typography.titleSmall  // 14sp, Medium

// Body - Main text
MaterialTheme.typography.bodyLarge  // 16sp, 1.5 line-height
MaterialTheme.typography.bodyMedium // 14sp, 1.43 line-height
MaterialTheme.typography.bodySmall  // 12sp, 1.33 line-height

// Label - Smallest, UI elements
MaterialTheme.typography.labelLarge  // 14sp, Medium
MaterialTheme.typography.labelMedium // 12sp, Medium
MaterialTheme.typography.labelSmall  // 11sp, Medium
```

### Usage Examples

```kotlin
// ✅ Good: Using theme typography
Text(
    text = "Welcome to Operit",
    style = MaterialTheme.typography.headlineMedium
)

// ❌ Bad: Hardcoded font size
Text(
    text = "Welcome to Operit",
    fontSize = 28.sp
)
```

---

## Spacing & Layout

### Spacing Scale

```kotlin
import com.ai.assistance.operit.ui.theme.AppSpacing

AppSpacing.nano        // 4dp  - Micro spacing
AppSpacing.extraSmall  // 8dp  - Between related items
AppSpacing.small       // 12dp - Compact spacing
AppSpacing.medium      // 16dp - Primary spacing unit
AppSpacing.large       // 24dp - Section spacing
AppSpacing.extraLarge  // 32dp - Major sections
AppSpacing.huge        // 40dp - Component separation
AppSpacing.extraHuge   // 48dp - Large gaps
AppSpacing.massive     // 64dp - Hero sections
```

### Size Tokens

```kotlin
import com.ai.assistance.operit.ui.theme.AppSizes

// Buttons
AppSizes.buttonMinHeight      // 48dp (a11y minimum)
AppSizes.buttonMinHeightSmall // 40dp (compact)

// Icons
AppSizes.iconSmall  // 16dp
AppSizes.iconNormal // 24dp
AppSizes.iconLarge  // 32dp

// Corners
AppSizes.cornerRadiusMedium // 12dp
AppSizes.cornerRadiusLarge  // 16dp
```

### Layout Patterns

```kotlin
// ✅ Good: Using spacing tokens
Card(
    modifier = Modifier.padding(AppSpacing.medium)
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(AppSpacing.small)
    ) {
        // Content with consistent spacing
    }
}

// ❌ Bad: Hardcoded spacing
Card(
    modifier = Modifier.padding(16.dp)
) {
    Column {
        Spacer(modifier = Modifier.height(8.dp))
        // Content
        Spacer(modifier = Modifier.height(8.dp))
    }
}
```

---

## Component Examples

### Button

```kotlin
@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(AppSizes.buttonMinHeight)
            .padding(horizontal = AppSpacing.medium),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        ),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge
        )
    }
}
```

### Card

```kotlin
@Composable
fun MessageCard(
    message: String,
    isUser: Boolean,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .widthIn(
                min = AppSizes.messageBubbleMinWidth,
                max = AppSizes.messageBubbleMaxWidth
            )
            .padding(AppSpacing.extraSmall),
        colors = CardDefaults.cardColors(
            containerColor = if (isUser) {
                AppColors.UserMessage
            } else {
                AppColors.AiMessage
            }
        ),
        shape = RoundedCornerShape(AppSizes.cornerRadiusLarge)
    ) {
        Text(
            text = message,
            modifier = Modifier.padding(AppSpacing.cardPadding),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}
```

### Input Field

```kotlin
@Composable
fun ChatInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .height(AppSizes.inputMinHeight)
            .fillMaxWidth(),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = MaterialTheme.colorScheme.outline,
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface
        ),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
        placeholder = {
            Text(
                "Type a message...",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    )
}
```

### Icon Button

```kotlin
@Composable
fun AppIconButton(
    icon: ImageVector,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier.size(AppSizes.buttonMinHeight),
        content = {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(AppSizes.iconNormal)
            )
        }
    )
}
```

---

## Chat UI Patterns

### Message Bubble

```kotlin
@Composable
fun ChatMessageBubble(
    message: ChatMessage,
    modifier: Modifier = Modifier
) {
    val isUser = message.sender == Sender.USER

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = AppSpacing.medium,
                vertical = AppSpacing.extraSmall
            ),
        horizontalArrangement = if (isUser) {
            Arrangement.End
        } else {
            Arrangement.Start
        }
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = if (isUser) {
                    AppColors.UserMessage
                } else {
                    AppColors.AiMessage
                }
            ),
            shape = RoundedCornerShape(
                topStart = if (isUser) AppSizes.cornerRadiusLarge else 0.dp,
                topEnd = if (isUser) 0.dp else AppSizes.cornerRadiusLarge,
                bottomStart = AppSizes.cornerRadiusLarge,
                bottomEnd = AppSizes.cornerRadiusLarge
            )
        ) {
            Text(
                text = message.content,
                modifier = Modifier.padding(AppSpacing.cardPadding),
                style = MaterialTheme.typography.bodyMedium,
                color = if (isUser) {
                    MaterialTheme.colorScheme.onPrimary
                } else {
                    MaterialTheme.colorScheme.onSurface
                }
            )
        }
    }
}
```

### Thinking Indicator

```kotlin
@Composable
fun ThinkingIndicator(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(AppSpacing.small),
        colors = CardDefaults.cardColors(
            containerColor = AppColors.ThinkingBackground
        ),
        border = BorderStroke(
            AppSizes.strokeThin,
            AppColors.ThinkingBorder
        ),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
    ) {
        Row(
            modifier = Modifier.padding(AppSpacing.small),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(AppSpacing.small)
        ) {
            CircularProgressIndicator(
                modifier = Modifier.size(AppSizes.iconMedium),
                strokeWidth = AppSizes.strokeMedium,
                color = AppColors.ThinkingBorder
            )
            Text(
                "Thinking...",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
```

---

## Accessibility Guidelines

### Minimum Touch Targets

```kotlin
// All interactive elements: minimum 48dp
Button(
    modifier = Modifier.size(
        width = AppSizes.buttonMinWidth,
        height = AppSizes.buttonMinHeight  // 48dp minimum
    )
)
```

### Content Descriptions

```kotlin
// ✅ Good: Descriptive contentDescription
Icon(
    imageVector = Icons.Default.Send,
    contentDescription = stringResource(R.string.send_message)
)

// ❌ Bad: Null contentDescription
Icon(
    imageVector = Icons.Default.Send,
    contentDescription = null
)
```

### Color Contrast

All text must meet WCAG AA standards:
- **Normal text** (< 18pt): 4.5:1 contrast ratio
- **Large text** (≥ 18pt): 3:1 contrast ratio

The theme colors are pre-configured for accessibility.

### Semantics

```kotlin
// Add semantics for complex interactions
Modifier
    .clickable { /* ... */ }
    .semantics {
        role = Role.Button
        state = "Send message"
    }
```

---

## Migration Checklist

### For Existing Components

- [ ] Replace hardcoded colors with theme colors
- [ ] Replace hardcoded spacing with `AppSpacing` tokens
- [ ] Replace hardcoded sizes with `AppSizes` tokens
- [ ] Use `MaterialTheme.typography` instead of custom styles
- [ ] Add `contentDescription` to all icons
- [ ] Ensure minimum touch target of 48dp
- [ ] Test in both light and dark themes

### Before/After Example

```kotlin
// ❌ Before: Hardcoded values
Card(
    modifier = Modifier
        .padding(16.dp)
        .height(40.dp),
    shape = RoundedCornerShape(8.dp),
    backgroundColor = Color(0xFFd97757)
) {
    Text(
        text = "Send",
        fontSize = 14.sp,
        color = Color.White
    )
}

// ✅ After: Using design tokens
Card(
    modifier = Modifier.padding(AppSpacing.medium),
    shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
    colors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.primary
    )
) {
    Text(
        text = "Send",
        style = MaterialTheme.typography.labelLarge,
        color = MaterialTheme.colorScheme.onPrimary
    )
}
```

---

## Quick Reference

```kotlin
// Imports needed
import com.ai.assistance.operit.ui.theme.*
import androidx.compose.material3.MaterialTheme

// Common patterns
MaterialTheme.colorScheme.primary       // Primary accent color
MaterialTheme.colorScheme.onPrimary     // Text on primary
MaterialTheme.colorScheme.surface       // Card/background color
MaterialTheme.colorScheme.onSurface     // Text on surface
MaterialTheme.typography.bodyMedium     // Body text style
AppSpacing.medium                        // 16dp spacing
AppSizes.cornerRadiusMedium             // 12dp corners
AppSizes.buttonMinHeight                 // 48dp buttons
```

---

## Design Token Migration Progress

> **Status**: 🟡 In Progress (60+ components updated)
>
> **Goal**: Replace all hardcoded dp values and colors with design tokens

### Migration Summary

| Category | Status | Files Updated |
|----------|--------|---------------|
| **Core UI** | ✅ Complete | 15 files |
| **Settings** | ✅ Complete | 12 files |
| **Floating Window** | ✅ Complete | 8 files |
| **Common UI** | ✅ Complete | 10 files |
| **Chat Components** | 🟡 In Progress | 12 of 30+ files |
| **Bubble Style** | ✅ Complete | 2 files |
| **Cursor Style** | 🟡 In Progress | 1 of 4 files |
| **Demo** | ✅ Complete | 8 files |
| **Workspace** | ✅ Complete | 3 files |
| **Wizard** | ✅ Complete | 2 files |

### Recently Updated Files (2025-12-25)

#### Chat Components ✅
- `AttachmentPreview.kt` - Spacing, sizes, corner radius updated
- `CharacterSelectorPanel.kt` - Padding, sizes, elevation updated
- `LinkPreviewDialog.kt` - Padding, corner radius, elevation updated
- `ChatScreenContent.kt` - Multi-select bar, scroll button updated
- `ExportDialogs.kt` - Dialogs fully updated with tokens
- `MessageEditor.kt` - Complete editor dialog updated
- `MemoryFolderSelectionDialog.kt` - Folder selector updated
- `ScrollToBottomButton.kt` - Already using design tokens ✅
- `ChatSettingsBar.kt` - Already using design tokens ✅
- `FullscreenInputDialog.kt` - Already using design tokens ✅
- `ChatInputSection.kt` - Already using design tokens ✅
- `BubbleUserMessageComposable.kt` - Already using design tokens ✅
- `BubbleAiMessageComposable.kt` - Already using design tokens ✅
- `UserMessageComposable.kt` - Dialogs and spacing updated ✅

#### Still Need Update
- `AiMessageComposable.kt` (cursor style) - Needs padding and spacing updates
- `CursorStyleChatMessage.kt` - Routing file (no changes needed)
- `BubbleStyleChatMessage.kt` - Routing file (no changes needed)
- `SummaryMessageComposable.kt` - Needs review
- `ChatHistorySelector.kt` - Needs review

### Standard Mapping Reference

```kotlin
// Spacing replacements (most common)
padding(horizontal = 16.dp, vertical = 4.dp)
  → padding(horizontal = AppSpacing.medium, vertical = AppSizes.none)

padding(horizontal = 16.dp, vertical = 8.dp)
  → padding(horizontal = AppSpacing.medium, vertical = AppSizes.strokeThin)

padding(16.dp)
  → padding(AppSpacing.medium)

padding(8.dp)
  → padding(AppSizes.strokeMedium)

padding(12.dp)
  → padding(AppSpacing.extraSmall)

padding(4.dp)
  → padding(AppSizes.strokeThin)

// Icon/button sizes
size(24.dp)
  → size(AppSpacing.extraSmall + 8.dp) or size(AppSizes.iconNormal)

size(18.dp)
  → size(AppSpacing.extraSmall + 2.dp)

size(32.dp)
  → size(AppSpacing.medium + AppSizes.avatarSmall)

// Corner radius
RoundedCornerShape(8.dp)
  → RoundedCornerShape(AppSizes.cornerRadiusMedium)

RoundedCornerShape(12.dp)
  → RoundedCornerShape(AppSizes.cornerRadiusMedium + AppSizes.none)

RoundedCornerShape(16.dp)
  → RoundedCornerShape(AppSizes.cornerRadiusLarge)

// Border/Stroke
BorderStroke(1.dp, ...)
  → BorderStroke(AppSizes.strokeThin, ...)

// Elevation
elevation = 4.dp
  → elevation = AppSizes.elevationMedium

elevation = 8.dp
  → elevation = AppSizes.elevationSmall * 2

// Width/Height
width(100.dp)
  → width(AppSizes.floatingMaxWidth - AppSizes.floatingBallSize)

height(400.dp)
  → height(AppSizes.floatingMaxWidth * 25)
```

### Migration Best Practices

1. **Import the design tokens**:
```kotlin
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
```

2. **Start with padding**, then sizes, then corner radius
3. **Use semantic combinations** (e.g., `AppSpacing.extraSmall + 4.dp` for 20dp)
4. **Test in both light and dark theme** after changes
5. **Keep visual consistency** - maintain proportions

### Component Priority Order

1. **High Priority** (User-facing):
   - Chat messages ✅
   - Input fields ✅
   - Buttons ✅
   - Cards ✅
   - Dialogs ✅

2. **Medium Priority** (Settings):
   - Preference screens ✅
   - Configuration panels ✅
   - Forms ✅

3. **Low Priority** (Internal):
   - Debug views
   - Developer tools
   - Demo components ✅

---

## Resources

- [Material 3 Guidelines](https://m3.material.io/)
- [Anthropic Brand](https://www.anthropic.com)
- [WCAG Accessibility Standards](https://www.w3.org/WAI/WCAG21/quickref/)
