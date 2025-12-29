package com.ai.assistance.operit.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Material You-inspired Color Palette for Operit AI
 *
 * Based on the UI prototype design:
 * - Background: #F4F3EF (warm off-white)
 * - Surface: #E8E6DF (warm light gray)
 * - Primary: #2D2D2D (near black)
 * - Secondary Container: #DCC8C0 (muted terracotta)
 * - Tertiary Container: #C4D0C5 (sage green)
 *
 * Reference: UI Prototype G:\Open-AutoGLM\Operit\ui_prototype
 */

// ============================================================================
// Main Brand Colors (Material You - Anthropic Design)
// ============================================================================

/**
 * Background color - warm off-white
 * #F4F3EF - Main app background
 */
val MdSysBackground = Color(0xFFF4F3EF)

/**
 * On background color - nearly black
 * #1C1C1C - Main text color
 */
val MdSysOnBackground = Color(0xFF1C1C1C)

/**
 * Surface color - same as background for unified look
 * #F4F3EF - Surface color
 */
val MdSysSurface = Color(0xFFF4F3EF)

/**
 * Surface variant - warm light gray
 * #E8E6DF - Card backgrounds, elevated surfaces
 */
val MdSysSurfaceVariant = Color(0xFFE8E6DF)

/**
 * On surface variant - medium gray
 * #484644 - Secondary text, icons
 */
val MdSysOnSurfaceVariant = Color(0xFF484644)

/**
 * Primary color - near black
 * #2D2D2D - Main interactive elements
 */
val MdSysPrimary = Color(0xFF2D2D2D)

/**
 * On primary color - white
 * #FFFFFF - Text on primary
 */
val MdSysOnPrimary = Color(0xFFFFFFFF)

// ============================================================================
// Container Colors
// ============================================================================

/**
 * Secondary container - muted terracotta tint
 * #DCC8C0 - Primary accent containers
 */
val MdSysSecondaryContainer = Color(0xFFDCC8C0)

/**
 * On secondary container - dark brown
 * #3E2620 - Text on secondary container
 */
val MdSysOnSecondaryContainer = Color(0xFF3E2620)

/**
 * Tertiary container - sage green tint
 * #C4D0C5 - Success/accent containers
 */
val MdSysTertiaryContainer = Color(0xFFC4D0C5)

/**
 * On tertiary container - dark green
 * #2A352B - Text on tertiary container
 */
val MdSysOnTertiaryContainer = Color(0xFF2A352B)

// ============================================================================
// Outline Colors
// ============================================================================

/**
 * Outline color - medium gray
 * #787674 - Dividers, borders
 */
val MdSysOutline = Color(0xFF787674)

/**
 * Outline variant - light gray
 * #CAC5C0 - Subtle borders
 */
val MdSysOutlineVariant = Color(0xFFCAC5C0)

// ============================================================================
// Error Colors
// ============================================================================

/**
 * Error color
 * #BA1A1A - Error states
 */
val MdSysError = Color(0xFFBA1A1A)

/**
 * On error color
 * #FFFFFF - Text on error
 */
val MdSysOnError = Color(0xFFFFFFFF)

/**
 * Error container
 * #FFDAD6 - Error background
 */
val MdSysErrorContainer = Color(0xFFFFDAD6)

/**
 * On error container
 * #410002 - Text on error container
 */
val MdSysOnErrorContainer = Color(0xFF410002)

// ============================================================================
// Dark Theme Colors
// ============================================================================

/**
 * Dark background - near black
 * #1C1C1C - Main app background (dark)
 */
val MdSysBackgroundDark = Color(0xFF1C1C1C)

/**
 * Dark on background - warm light gray
 * #E6E3DB - Main text (dark)
 */
val MdSysOnBackgroundDark = Color(0xFFE6E3DB)

/**
 * Dark surface - near black
 * #1C1C1C - Surface (dark)
 */
val MdSysSurfaceDark = Color(0xFF1C1C1C)

/**
 * Dark surface variant - dark gray
 * #3A3A36 - Elevated surfaces (dark)
 */
val MdSysSurfaceVariantDark = Color(0xFF3A3A36)

/**
 * Dark on surface variant - light gray
 * #CAC5C0 - Secondary text (dark)
 */
val MdSysOnSurfaceVariantDark = Color(0xFFCAC5C0)

/**
 * Dark primary - warm cream
 * #E8DCC8 - Primary (dark)
 */
val MdSysPrimaryDark = Color(0xFFE8DCC8)

/**
 * Dark on primary - near black
 * #1C1C1C - Text on primary (dark)
 */
val MdSysOnPrimaryDark = Color(0xFF1C1C1C)

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
    val UserMessage = MdSysPrimary
    val UserMessageLight = Color(0xFFffe8e0)
    val AiMessage = MdSysSurfaceVariant
    val AiMessageDark = Color(0xFF3a3a36)
    val SystemMessage = MdSysOnSurfaceVariant
    val ThinkingBackground = Color(0xFFf0efe9)
    val ThinkingBorder = Color(0xFF6a9bcc)

    // Status Colors
    val Success = Color(0xFF4CAF50)
    val SuccessLight = Color(0xFFe8ecd9)
    val Warning = Color(0xFFFF9800)
    val WarningLight = Color(0xFFfdf4dc)
    val Error = MdSysError
    val ErrorLight = Color(0xFFfadddd)
    val Info = Color(0xFF2196F3)
    val InfoLight = Color(0xFFdce8f5)

    // Action Colors
    val PrimaryAction = MdSysPrimary
    val SecondaryAction = MdSysSecondaryContainer
    val TertiaryAction = MdSysTertiaryContainer

    // Overlay Colors
    val OverlayDark = Color(0xDD000000)  // 87% opacity
    val OverlayLight = Color(0x44000000) // 26% opacity
    val Scrim = Color(0x600000000)        // 38% opacity (M3 standard)

    // Surface Colors (variants)
    val SurfaceVariant = MdSysSurfaceVariant
    val SurfaceInverse = MdSysSurfaceVariantDark
    val OnSurfaceVariant = MdSysOnSurfaceVariant

    // Container Colors
    val PrimaryContainer = MdSysSecondaryContainer
    val OnPrimaryContainer = MdSysOnSecondaryContainer
    val SecondaryContainer = MdSysTertiaryContainer
    val OnSecondaryContainer = MdSysOnTertiaryContainer
    val TertiaryContainer = MdSysSecondaryContainer
    val OnTertiaryContainer = MdSysOnSecondaryContainer
}

// ============================================================================
// Dark Theme Adaptations
// ============================================================================

object AppColorsDark {
    // Chat Message Colors (Dark)
    val UserMessage = MdSysPrimaryDark
    val UserMessageDark = Color(0xFF5C4033)
    val AiMessage = Color(0xFF2a2a27)
    val AiMessageDark = MdSysOnBackgroundDark
    val SystemMessage = MdSysOnSurfaceVariantDark
    val ThinkingBackground = Color(0xFF1f1f1e)
    val ThinkingBorder = Color(0xFF4a6a8c)

    // Status Colors (Dark)
    val Success = Color(0xFF9cb882)
    val SuccessDark = Color(0xFF4a5c35)
    val Warning = Color(0xFFe6c77a)
    val WarningDark = Color(0xFF8c7235)
    val Error = Color(0xFFFFB4AB)
    val ErrorDark = Color(0xFF93000A)
    val Info = Color(0xFF8ca8c9)
    val InfoDark = Color(0xFF355a7a)

    // Surface Colors (Dark)
    val SurfaceVariant = MdSysSurfaceVariantDark
    val SurfaceInverse = MdSysOnBackgroundDark
    val OnSurfaceVariant = MdSysOnSurfaceVariantDark

    // Container Colors (Dark)
    val PrimaryContainer = Color(0xFF5C4033)
    val OnPrimaryContainer = MdSysPrimaryDark
    val SecondaryContainer = Color(0xFF3D4A3A)
    val OnSecondaryContainer = MdSysPrimaryDark
    val TertiaryContainer = Color(0xFF4A5048)
    val OnTertiaryContainer = MdSysPrimaryDark
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
