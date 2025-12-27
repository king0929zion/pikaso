package com.ai.assistance.operit.ui.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * Style Guide for Operit AI
 *
 * This file documents the standard typography, spacing, and visual patterns
 * to ensure consistency across the application.
 *
 * DESIGN PRINCIPLES:
 * - Use DesignTokens (AppSpacing, AppSizes) instead of hardcoded values
 * - Maintain visual hierarchy through typography scale
 * - Use generous spacing for better readability
 * - Keep UI elements aligned to 4dp grid
 * - Limit color usage to semantic colors from MaterialTheme
 *
 * TYPOGRAPHY HIERARCHY:
 * - Display: Large, attention-grabbing text (rarely used)
 * - Headline: Section headers, page titles
 * - Title: Important headers, card titles
 * - Body: Primary content text
 * - Label: Secondary text, captions, labels
 *
 * SPACING PATTERNS:
 * - nano (4dp): Inside compact elements, between icon and text
 * - small (12dp): Related items, button internal spacing
 * - medium (16dp): Default padding, card spacing
 * - large (24dp): Section separation
 * - extraLarge (32dp): Major section breaks
 */
object StyleGuide {

    // ==================== TYPOGRAPHY HELPERS ====================

    /**
     * Heading text for page titles and major sections
     */
    @Composable
    fun Heading(
        text: String,
        modifier: Modifier = Modifier
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.headlineMedium,
            modifier = modifier,
            fontWeight = FontWeight.SemiBold
        )
    }

    /**
     * Subheading for sections and card titles
     */
    @Composable
    fun Subheading(
        text: String,
        modifier: Modifier = Modifier
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier,
            fontWeight = FontWeight.Medium
        )
    }

    /**
     * Body text for primary content
     */
    @Composable
    fun Body(
        text: String,
        modifier: Modifier = Modifier
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier
        )
    }

    /**
     * Caption text for secondary information
     */
    @Composable
    fun Caption(
        text: String,
        modifier: Modifier = Modifier
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodySmall,
            modifier = modifier,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }

    /**
     * Label text for form fields and metadata
     */
    @Composable
    fun Label(
        text: String,
        modifier: Modifier = Modifier
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium,
            modifier = modifier
        )
    }

    // ==================== MODIFIER HELPERS ====================

    /**
     * Standard padding for cards
     */
    fun Modifier.cardPadding() = this.padding(AppSpacing.cardPadding)

    /**
     * Standard padding for list items
     */
    fun Modifier.listPadding() = this.padding(AppSpacing.listPadding)

    /**
     * Standard padding for buttons
     */
    fun Modifier.buttonPadding() = this.padding(AppSpacing.buttonPadding)

    /**
     * Standard padding for inputs
     */
    fun Modifier.inputPadding() = this.padding(AppSpacing.inputPadding)

    /**
     * Standard padding for screen edges
     */
    fun Modifier.screenPadding() = this.padding(AppSpacing.screenPadding)

    /**
     * Spacing between sections
     */
    fun Modifier.sectionSpacing() = this.padding(AppSpacing.sectionSpacing)

    /**
     * Spacing between elements
     */
    fun Modifier.elementSpacing() = this.padding(AppSpacing.elementSpacing)

    // ==================== COMMON PATTERNS ====================

    /**
     * Standard page layout pattern:
     * - Screen padding
     * - Vertical spacing between sections
     */
    @Composable
    fun StandardPageLayout(
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit
    ) {
        androidx.compose.foundation.layout.Column(
            modifier = modifier.screenPadding(),
            verticalArrangement = androidx.compose.foundation.layout.Arrangement
                .spacedBy(AppSpacing.sectionSpacing)
        ) {
            content()
        }
    }

    /**
     * Standard card content pattern:
     * - Card padding
     * - Spaced elements
     */
    @Composable
    fun StandardCardContent(
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit
    ) {
        androidx.compose.foundation.layout.Column(
            modifier = modifier.cardPadding(),
            verticalArrangement = androidx.compose.foundation.layout.Arrangement
                .spacedBy(AppSpacing.elementSpacing)
        ) {
            content()
        }
    }

    // ==================== COLOR USAGE GUIDELINES ====================

    /**
     * Color usage guidelines:
     *
     * PRIMARY: Key actions, active states, important highlights
     * - Primary buttons
     * - Active tabs/selections
     * - Links
     *
     * SECONDARY: Supporting actions, less emphasis
     * - Secondary buttons
     * - Toggles
     * - Badges
     *
     * TERTIARY: Accents, special states
     * - Progress indicators
     * - Special highlights
     *
     * SURFACE: Cards, sheets, backgrounds
     * - Card backgrounds
     * - Bottom sheets
     * - Dialog backgrounds
     *
     * SURFACE_VARIANT: Alternative surface for separation
     * - Nested cards
     * - Section dividers
     *
     * ERROR: Errors, warnings, destructive actions
     * - Error messages
     * - Delete buttons
     * - Validation warnings
     *
     * SUCCESS: Success states, confirmations (custom color)
     * - Success messages
     * - Completed actions
     */

    // ==================== ICON SIZE GUIDELINES ====================

    /**
     * Standard icon sizes:
     *
     * SMALL (16dp): Inline icons, compact buttons
     * - Inside text buttons
     * - List item icons
     * - Compact toolbar icons
     *
     * MEDIUM (20dp): Standard icons
     * - Button icons
     * - Menu icons
     * - Tab icons
     *
     * NORMAL (24dp): Default icons
     * - FAB icons
     * - Card action icons
     * - Standard action icons
     *
     * LARGE (32dp): Prominent icons
     * - Feature icons
     * - Onboarding icons
     * - Empty state icons
     *
     * EXTRA_LARGE (48dp): Hero icons
     * - Illustration icons
     * - Large empty state icons
     * - Feature highlights
     */

    // ==================== BORDER RADIUS GUIDELINES ====================

    /**
     * Border radius usage:
     *
     * SMALL (8dp): Compact elements
     * - Chips
     * - Small buttons
     * - Tags
     *
     * MEDIUM (12dp): Standard elements
     * - Buttons
     * - Cards
     * - Text fields
     *
     * LARGE (16dp): Emphasized elements
     * - Dialogs
     * - Bottom sheets
     * - Large cards
     *
     * EXTRA_LARGE (24dp): Special elements
     * - Hero cards
     * - Feature sections
     *
     * FULL (28dp+): Fully rounded
     * - Pills
     * - Circular buttons
     * - Avatar containers
     */
}
