package com.ai.assistance.operit.ui.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * Component Variants Library
 *
 * Standardized UI components with consistent styling using DesignTokens.
 * Provides reusable component variants that ensure visual consistency
 * across the entire application.
 *
 * Usage:
 * ```kotlin
 * PrimaryButton(onClick = { /* action */ }) {
 *     Text("Submit")
 * }
 *
 * SurfaceCard {
 *     Text("Card content")
 * }
 * ```
 */
object ComponentVariants {

    // ==================== BUTTON VARIANTS ====================

    /**
     * Primary action button - uses primary color from theme
     *
     * @param onClick Callback when button is clicked
     * @param enabled Whether the button is enabled
     * @param modifier Modifier for the button
     * @param content Button content
     */
    @Composable
    fun PrimaryButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable ButtonScope.() -> Unit
    ) {
        Button(
            onClick = onClick,
            modifier = modifier
                .height(AppSizes.buttonMinHeight)
                .defaultMinSize(minWidth = AppSizes.buttonMinWidth),
            enabled = enabled,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
            content = content
        )
    }

    /**
     * Secondary action button - uses tonal button style
     */
    @Composable
    fun SecondaryButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable ButtonScope.() -> Unit
    ) {
        FilledTonalButton(
            onClick = onClick,
            modifier = modifier
                .height(AppSizes.buttonMinHeight)
                .defaultMinSize(minWidth = AppSizes.buttonMinWidth),
            enabled = enabled,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
            content = content
        )
    }

    /**
     * Outlined button - uses outlined button style
     */
    @Composable
    fun OutlinedButtonVariant(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable ButtonScope.() -> Unit
    ) {
        OutlinedButton(
            onClick = onClick,
            modifier = modifier
                .height(AppSizes.buttonMinHeight)
                .defaultMinSize(minWidth = AppSizes.buttonMinWidth),
            enabled = enabled,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
            content = content
        )
    }

    /**
     * Text button - minimal button with text only
     */
    @Composable
    fun TextButtonVariant(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable ButtonScope.() -> Unit
    ) {
        TextButton(
            onClick = onClick,
            modifier = modifier.height(AppSizes.buttonMinHeight),
            enabled = enabled,
            content = content
        )
    }

    /**
     * Icon button - square button with icon
     *
     * @param size Icon/button size (default: AppSizes.buttonMinHeightSmall)
     */
    @Composable
    fun IconButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        size: Dp = AppSizes.buttonMinHeightSmall,
        content: @Composable () -> Unit
    ) {
        androidx.compose.material3.IconButton(
            onClick = onClick,
            modifier = modifier.size(size),
            enabled = enabled,
            content = content
        )
    }

    // ==================== CARD VARIANTS ====================

    /**
     * Surface card - basic elevated card with surface color
     *
     * @param modifier Modifier for the card
     * @param onClick Optional click handler
     * @param content Card content
     */
    @Composable
    fun SurfaceCard(
        modifier: Modifier = Modifier,
        onClick: (() -> Unit)? = null,
        content: @Composable ColumnScope.() -> Unit
    ) {
        if (onClick != null) {
            Card(
                onClick = onClick,
                modifier = modifier,
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                content = content
            )
        } else {
            Card(
                modifier = modifier,
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                content = content
            )
        }
    }

    /**
     * Elevated card - card with elevation
     */
    @Composable
    fun ElevatedCard(
        modifier: Modifier = Modifier,
        onClick: (() -> Unit)? = null,
        content: @Composable ColumnScope.() -> Unit
    ) {
        if (onClick != null) {
            androidx.compose.material3.ElevatedCard(
                onClick = onClick,
                modifier = modifier,
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                content = content
            )
        } else {
            androidx.compose.material3.ElevatedCard(
                modifier = modifier,
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                content = content
            )
        }
    }

    /**
     * Outlined card - card with border
     */
    @Composable
    fun OutlinedCard(
        modifier: Modifier = Modifier,
        onClick: (() -> Unit)? = null,
        content: @Composable ColumnScope.() -> Unit
    ) {
        if (onClick != null) {
            androidx.compose.material3.OutlinedCard(
                onClick = onClick,
                modifier = modifier,
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                content = content
            )
        } else {
            androidx.compose.material3.OutlinedCard(
                modifier = modifier,
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                content = content
            )
        }
    }

    // ==================== INPUT VARIANTS ====================

    /**
     * Standard text input field
     *
     * @param value Current text value
     * @param onValueChange Callback when text changes
     * @param modifier Modifier for the field
     * @param placeholder Optional placeholder text
     * @param label Optional label
     * @param enabled Whether the field is enabled
     * @param isError Whether to show error state
     * @param maxLines Maximum number of lines
     */
    @Composable
    fun TextField(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        placeholder: String? = null,
        label: String? = null,
        enabled: Boolean = true,
        isError: Boolean = false,
        maxLines: Int = 1,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        visualTransformation: VisualTransformation = VisualTransformation.None
    ) {
        androidx.compose.material3.TextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                .defaultMinSize(minHeight = AppSizes.inputMinHeight),
            placeholder = if (placeholder != null) {
                { Text(placeholder) }
            } else null,
            label = if (label != null) {
                { Text(label) }
            } else null,
            enabled = enabled,
            isError = isError,
            maxLines = maxLines,
            keyboardOptions = keyboardOptions,
            visualTransformation = visualTransformation,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline
            )
        )
    }

    /**
     * Outlined text input field
     */
    @Composable
    fun OutlinedTextField(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        placeholder: String? = null,
        label: String? = null,
        enabled: Boolean = true,
        isError: Boolean = false,
        maxLines: Int = 1,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default
    ) {
        androidx.compose.material3.OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                .defaultMinSize(minHeight = AppSizes.inputMinHeight),
            placeholder = if (placeholder != null) {
                { Text(placeholder) }
            } else null,
            label = if (label != null) {
                { Text(label) }
            } else null,
            enabled = enabled,
            isError = isError,
            maxLines = maxLines,
            keyboardOptions = keyboardOptions,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline
            )
        )
    }

    /**
     * Multi-line text area
     */
    @Composable
    fun TextArea(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        placeholder: String? = null,
        enabled: Boolean = true,
        minLines: Int = 3,
        maxLines: Int = 8
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                .defaultMinSize(minHeight = AppSizes.inputMinHeight),
            placeholder = if (placeholder != null) {
                { Text(placeholder) }
            } else null,
            enabled = enabled,
            minLines = minLines,
            maxLines = maxLines,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline
            )
        )
    }

    // ==================== CHIP VARIANTS ====================

    /**
     * Action chip - clickable chip for actions
     *
     * @param text Chip text
     * @param onClick Callback when chip is clicked
     * @param modifier Modifier for the chip
     * @param leadingIcon Optional leading icon
     */
    @Composable
    fun ActionChip(
        text: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        leadingIcon: (@Composable () -> Unit)? = null
    ) {
        androidx.compose.material3.AssistChip(
            onClick = onClick,
            modifier = modifier,
            label = { Text(text) },
            leadingIcon = leadingIcon,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
        )
    }

    /**
     * Filter chip - selectable chip for filtering
     */
    @Composable
    fun FilterChip(
        text: String,
        selected: Boolean,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        leadingIcon: (@Composable () -> Unit)? = null
    ) {
        androidx.compose.material3.FilterChip(
            selected = selected,
            onClick = onClick,
            modifier = modifier,
            label = { Text(text) },
            leadingIcon = leadingIcon,
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
        )
    }

    /**
     * Suggestion chip - non-clickable informational chip
     */
    @Composable
    fun SuggestionChip(
        text: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier
    ) {
        androidx.compose.material3.SuggestionChip(
            onClick = onClick,
            modifier = modifier,
            label = { Text(text) },
            shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
        )
    }

    // ==================== CONTAINER VARIANTS ====================

    /**
     * Standard container with padding
     *
     * @param modifier Modifier for the container
     * @param padding Padding to apply (default: AppSpacing.medium)
     * @param content Container content
     */
    @Composable
    fun Container(
        modifier: Modifier = Modifier,
        padding: Dp = AppSpacing.medium,
        content: @Composable ColumnScope.() -> Unit
    ) {
        Column(
            modifier = modifier.padding(padding),
            content = content
        )
    }

    /**
     * Row container with standard spacing
     */
    @Composable
    fun RowContainer(
        modifier: Modifier = Modifier,
        padding: Dp = AppSpacing.medium,
        horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
        verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
        content: @Composable RowScope.() -> Unit
    ) {
        Row(
            modifier = modifier.padding(padding),
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = verticalAlignment,
            content = content
        )
    }

    /**
     * Spaced row container with items evenly spaced
     */
    @Composable
    fun SpacedRow(
        modifier: Modifier = Modifier,
        spacing: Dp = AppSpacing.small,
        verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
        content: @Composable RowScope.() -> Unit
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(spacing),
            verticalAlignment = verticalAlignment,
            content = content
        )
    }

    /**
     * Spaced column container
     */
    @Composable
    fun SpacedColumn(
        modifier: Modifier = Modifier,
        spacing: Dp = AppSpacing.small,
        content: @Composable ColumnScope.() -> Unit
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.spacedBy(spacing),
            content = content
        )
    }
}
