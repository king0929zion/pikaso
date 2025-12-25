package com.ai.assistance.operit.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Design Tokens for Operit AI
 *
 * Inspired by Anthropic's design philosophy:
 * - Clean, minimalist layouts
 * - Warm, muted color palette
 * - Generous white space
 * - Human-centric, approachable feel
 *
 * Reference: https://www.anthropic.com
 */
object AppSpacing {
    // Micro spacing (4px base unit)
    val none: Dp = 0.dp
    val micro: Dp = 2.dp
    val nano: Dp = 4.dp

    // Small spacing
    val extraSmall: Dp = 8.dp      // 2x base unit
    val small: Dp = 12.dp          // 3x base unit

    // Medium spacing
    val medium: Dp = 16.dp         // 4x base unit - primary spacing unit
    val mediumLarge: Dp = 20.dp    // 5x base unit

    // Large spacing
    val large: Dp = 24.dp          // 6x base unit
    val extraLarge: Dp = 32.dp     // 8x base unit
    val huge: Dp = 40.dp           // 10x base unit
    val extraHuge: Dp = 48.dp      // 12x base unit
    val massive: Dp = 64.dp        // 16x base unit

    // Context-specific spacing
    val cardPadding: Dp = 20.dp
    val listPadding: Dp = 12.dp
    val buttonPadding: Dp = 16.dp
    val inputPadding: Dp = 16.dp
    val screenPadding: Dp = 20.dp
    val sectionSpacing: Dp = 32.dp
    val groupSpacing: Dp = 24.dp
    val elementSpacing: Dp = 12.dp
    val messageSpacing: Dp = 8.dp
}

object AppSizes {
    // Button sizes (minimum 48dp for accessibility)
    val buttonMinHeight: Dp = 48.dp
    val buttonMinHeightSmall: Dp = 40.dp
    val buttonMinWidth: Dp = 64.dp
    val buttonIconSize: Dp = 24.dp

    // Input sizes
    val inputMinHeight: Dp = 48.dp
    val inputMinHeightSmall: Dp = 40.dp

    // Icon sizes
    val iconSmall: Dp = 16.dp
    val iconMedium: Dp = 20.dp
    val iconNormal: Dp = 24.dp
    val iconLarge: Dp = 32.dp
    val iconExtraLarge: Dp = 48.dp

    // Avatar sizes
    val avatarSmall: Dp = 32.dp
    val avatarMedium: Dp = 40.dp
    val avatarLarge: Dp = 56.dp
    val avatarExtraLarge: Dp = 72.dp

    // Card/Container sizes
    val cornerRadiusSmall: Dp = 8.dp
    val cornerRadiusMedium: Dp = 12.dp
    val cornerRadiusLarge: Dp = 16.dp
    val cornerRadiusExtraLarge: Dp = 24.dp
    val cornerRadiusFull: Dp = 50.dp  // Fully rounded (circular)

    // Stroke widths
    val strokeThin: Dp = 1.dp
    val strokeMedium: Dp = 2.dp
    val strokeThick: Dp = 3.dp

    // Elevations (shadows)
    val elevationNone: Dp = 0.dp
    val elevationSmall: Dp = 2.dp
    val elevationMedium: Dp = 4.dp
    val elevationLarge: Dp = 8.dp
    val elevationExtraLarge: Dp = 16.dp

    // Floating elements
    val floatingBallSize: Dp = 56.dp
    val floatingBallExpandedSize: Dp = 72.dp
    val floatingMinWidth: Dp = 320.dp
    val floatingMaxWidth: Dp = 400.dp

    // Message bubble sizing
    val messageBubbleMaxWidth: Dp = 280.dp
    val messageBubbleMinWidth: Dp = 80.dp

    // Desktop pet
    val desktopPetSize: Dp = 120.dp
    val desktopPetSizeSmall: Dp = 80.dp

    // List item heights
    val listItemHeightSingle: Dp = 56.dp
    val listItemHeightDouble: Dp = 72.dp
    val listItemHeightTriple: Dp = 88.dp
}

object AppAnimation {
    // Duration constants (in milliseconds)
    val durationFast: Int = 150
    val durationNormal: Int = 250
    val durationSlow: Int = 350
    val durationExtraSlow: Int = 500

    // Spring damping ratios
    val springDampingHigh: Float = 0.9f    // Bouncy
    val springDampingMedium: Float = 0.7f  // Balanced
    val springDampingLow: Float = 0.5f     // More bouncy

    // Spring stiffness
    val springStiffnessHigh: Float = 1000f  // Quick
    val springStiffnessMedium: Float = 500f // Medium
    val springStiffnessLow: Float = 200f    // Slow
}

object AppBorderRadius {
    val none: Dp = 0.dp
    val small: Dp = 4.dp
    val medium: Dp = 8.dp
    val large: Dp = 12.dp
    val extraLarge: Dp = 16.dp
    val full: Dp = 28.dp  // For pills and fully rounded elements
}

object AppOpacity {
    val disabled: Float = 0.38f     // M3 disabled opacity
    val hover: Float = 0.08f        // M3 hover state
    val focus: Float = 0.12f        // M3 focus state
    val pressed: Float = 0.12f      // M3 pressed state
    val dragged: Float = 0.16f      // M3 dragged state
    val overlay: Float = 0.32f      // Modal overlay
    val secondaryText: Float = 0.6f
    val tertiaryText: Float = 0.45f
}

/**
 * Breakpoints for responsive design
 */
object AppBreakpoints {
    val compact: Int = 600    // Phone
    val medium: Int = 840     // Foldable/Tablet portrait
    val expanded: Int = 1200  // Tablet landscape/Desktop
}

/**
 * Z-index levels for elevation hierarchy
 */
object AppElevation {
    const val level0 = 0f      // Default
    const val level1 = 1f      // Raised cards
    const val level2 = 2f      // Dropdowns, menus
    const val level3 = 3f      // Bottom sheets, dialogs
    const val level4 = 4f      // Modals
    const val level5 = 5f      // Toast, snackbar
    const val level10 = 10f    // Floating windows
}
