package com.ai.assistance.operit.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Anthropic-inspired Color Palette for Operit AI
 *
 * Based on Anthropic's brand colors:
 * - Clean, warm, muted tones for natural harmony
 * - Human-centric, approachable feel
 * - Minimalist design philosophy
 *
 * Reference: https://www.anthropic.com
 */

// ============================================================================
// Main Brand Colors (Anthropic)
// ============================================================================

/**
 * Primary dark color - used for text and dark backgrounds
 * #141413 - Nearly black with warm undertone
 */
val AnthropicDark = Color(0xFF141413)

/**
 * Primary light color - used for light backgrounds and text on dark
 * #faf9f5 - Warm off-white, cream tone
 */
val AnthropicLight = Color(0xFFfaf9f5)

/**
 * Mid gray - secondary elements, subtle text
 * #b0aea5 - Warm medium gray
 */
val AnthropicMidGray = Color(0xFFb0aea5)

/**
 * Light gray - subtle backgrounds, dividers
 * #e8e6dc - Warm light gray
 */
val AnthropicLightGray = Color(0xFFe8e6dc)

/**
 * Warm gray for elevated surfaces in dark theme
 * #2a2a27 - Elevated dark surface
 */
val AnthropicElevatedDark = Color(0xFF2a2a27)

/**
 * Surface color for light theme
 * #f5f3eb - Warm surface tone
 */
val AnthropicSurfaceLight = Color(0xFFf5f3eb)

// ============================================================================
// Accent Colors (Anthropic)
// ============================================================================

/**
 * Primary accent - orange tone
 * #d97757 - Warm terracotta/coral orange
 */
val AnthropicOrange = Color(0xFFd97757)

/**
 * Secondary accent - blue tone
 * #6a9bcc - Soft, muted blue
 */
val AnthropicBlue = Color(0xFF6a9bcc)

/**
 * Tertiary accent - green tone
 * #788c5d - Muted olive/sage green
 */
val AnthropicGreen = Color(0xFF788c5d)

// ============================================================================
// Legacy Colors (for backward compatibility)
// ============================================================================

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

// ============================================================================
// Semantic Color Extensions
// ============================================================================

/**
 * Custom semantic colors for specific UI elements
 * These extend the Material color scheme with app-specific meanings
 */
object AppColors {
    // Chat Message Colors
    val UserMessage = AnthropicOrange
    val UserMessageLight = Color(0xFFffe8e0)
    val AiMessage = AnthropicLightGray
    val AiMessageDark = Color(0xFF3a3a36)
    val SystemMessage = AnthropicMidGray
    val ThinkingBackground = Color(0xFFf0efe9)
    val ThinkingBorder = AnthropicBlue

    // Status Colors
    val Success = AnthropicGreen
    val SuccessLight = Color(0xFFe8ecd9)
    val Warning = Color(0xFFc9a855)
    val WarningLight = Color(0xFFfdf4dc)
    val Error = Color(0xFFcc5c5c)
    val ErrorLight = Color(0xFFfadddd)
    val Info = AnthropicBlue
    val InfoLight = Color(0xFFdce8f5)

    // Action Colors
    val PrimaryAction = AnthropicOrange
    val SecondaryAction = AnthropicBlue
    val TertiaryAction = AnthropicGreen

    // Overlay Colors
    val OverlayDark = Color(0xDD000000)  // 87% opacity
    val OverlayLight = Color(0x44000000) // 26% opacity
    val Scrim = Color(0x60000000)        // 38% opacity (M3 standard)

    // Surface Colors (variants)
    val SurfaceVariant = Color(0xFFf5f3eb)
    val SurfaceInverse = Color(0xFF3a3a36)
    val OnSurfaceVariant = AnthropicMidGray

    // Container Colors
    val PrimaryContainer = UserMessageLight
    val OnPrimaryContainer = AnthropicOrange
    val SecondaryContainer = AiMessage
    val OnSecondaryContainer = AnthropicDark
    val TertiaryContainer = SuccessLight
    val OnTertiaryContainer = AnthropicGreen
}

// ============================================================================
// Dark Theme Adaptations
// ============================================================================

object AppColorsDark {
    // Chat Message Colors (Dark)
    val UserMessage = AnthropicOrange
    val UserMessageDark = Color(0xFF8c4a35)
    val AiMessage = Color(0xFF2a2a27)
    val AiMessageDark = AnthropicLight
    val SystemMessage = AnthropicLightGray
    val ThinkingBackground = Color(0xFF1f1f1e)
    val ThinkingBorder = Color(0xFF4a6a8c)

    // Status Colors (Dark)
    val Success = Color(0xFF9cb882)
    val SuccessDark = Color(0xFF4a5c35)
    val Warning = Color(0xFFe6c77a)
    val WarningDark = Color(0xFF8c7235)
    val Error = Color(0xFFe68c8c)
    val ErrorDark = Color(0xFF8c3535)
    val Info = Color(0xFF8ca8c9)
    val InfoDark = Color(0xFF355a7a)

    // Surface Colors (Dark)
    val SurfaceVariant = Color(0xFF1a1a19)
    val SurfaceInverse = AnthropicLight
    val OnSurfaceVariant = AnthropicLightGray

    // Container Colors (Dark)
    val PrimaryContainer = UserMessageDark
    val OnPrimaryContainer = AnthropicOrange
    val SecondaryContainer = AiMessage
    val OnSecondaryContainer = AnthropicLight
    val TertiaryContainer = SuccessDark
    val OnTertiaryContainer = Color(0xFF9cb882)
}

// ============================================================================
// Helper Functions
// ============================================================================

/**
 * Creates a color with modified opacity
 */
fun Color.alpha(alpha: Float): Color {
    return this.copy(alpha = alpha)
}

/**
 * Lightens a color by a factor (0-1)
 */
fun Color.lighten(factor: Float): Color {
    return Color(
        red = (red + (1f - red) * factor).coerceIn(0f, 1f),
        green = (green + (1f - green) * factor).coerceIn(0f, 1f),
        blue = (blue + (1f - blue) * factor).coerceIn(0f, 1f)
    )
}

/**
 * Darkens a color by a factor (0-1)
 */
fun Color.darken(factor: Float): Color {
    return Color(
        red = (red * (1f - factor)).coerceIn(0f, 1f),
        green = (green * (1f - factor)).coerceIn(0f, 1f),
        blue = (blue * (1f - factor)).coerceIn(0f, 1f)
    )
}
