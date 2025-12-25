package com.ai.assistance.operit.ui.theme

import android.content.Context
import android.net.Uri
import com.ai.assistance.operit.util.AppLogger
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.core.net.toFile
import com.ai.assistance.operit.data.preferences.UserPreferencesManager
import java.io.File

/**
 * Anthropic-inspired Typography System for Operit AI
 *
 * Based on Anthropic's brand typography:
 * - Headings: Poppins (geometric, modern, friendly)
 * - Body: Lora (serif, warm, human-centric)
 * - Fallback: Arial/Georgia for compatibility
 *
 * Reference: https://www.anthropic.com
 *
 * Note: For optimal results, pre-install Poppins and Lora fonts on the device.
 * The system will fall back to default fonts if not available.
 */

// ============================================================================
// Default Typography (Anthropic-inspired with fallbacks)
// ============================================================================

/**
 * Default typography using system fonts as fallback for Poppins/Lora
 *
 * Design principles:
 * - Generous line height for readability (1.5x for body, 1.2x for headings)
 * - Reduced letter spacing for large text, increased for small text
 * - Clear hierarchy with 13 distinct scales
 */
val Typography = Typography(
    // Display styles - Largest text, reserved for short, important text
    displayLarge = TextStyle(
        fontFamily = FontFamily.SansSerif, // Poppins fallback
        fontWeight = FontWeight.Normal,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    ),

    // Headline styles - High-emphasis text, shorter than body text
    headlineLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),

    // Title styles - Medium-emphasis text, shorter than headlines
    titleLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleSmall = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),

    // Body styles - Main text, lower emphasis than titles
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Serif, // Lora fallback
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),

    // Label styles - Smallest text, used for captions and UI elements
    labelLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

// ============================================================================
// Custom Font Loading (preserving existing functionality)
// ============================================================================

/**
 * 根据系统字体名称获取 FontFamily
 */
fun getSystemFontFamily(systemFontName: String): FontFamily {
    return when (systemFontName) {
        UserPreferencesManager.SYSTEM_FONT_SERIF -> FontFamily.Serif
        UserPreferencesManager.SYSTEM_FONT_SANS_SERIF -> FontFamily.SansSerif
        UserPreferencesManager.SYSTEM_FONT_MONOSPACE -> FontFamily.Monospace
        UserPreferencesManager.SYSTEM_FONT_CURSIVE -> FontFamily.Cursive
        else -> FontFamily.Default
    }
}

/**
 * 从文件路径加载自定义字体
 */
fun loadCustomFontFamily(context: Context, fontPath: String): FontFamily? {
    return try {
        // - 修复了 file:// URI 路径无法被 File 正确解析的问题
        val file = if (fontPath.startsWith("file://")) {
            Uri.parse(fontPath).toFile()
        } else {
            File(fontPath)
        }

        if (!file.exists()) {
            AppLogger.e("TypeKt", "Font file does not exist: $fontPath")
            return null
        }

        FontFamily(
            Font(file)
        )
    } catch (e: Exception) {
        AppLogger.e("TypeKt", "Error loading custom font from $fontPath", e)
        null
    }
}

/**
 * 根据用户设置创建自定义 Typography
 */
fun createCustomTypography(
    context: Context,
    useCustomFont: Boolean,
    fontType: String,
    systemFontName: String,
    customFontPath: String?,
    fontScale: Float
): Typography {
    // 如果不使用自定义字体且字体大小为默认值，则直接返回默认Typography
    if (!useCustomFont && fontScale == 1.0f) {
        return Typography
    }

    // 确定要使用的 FontFamily
    val fontFamily: FontFamily = if (useCustomFont) {
        when (fontType) {
            UserPreferencesManager.FONT_TYPE_SYSTEM -> {
                getSystemFontFamily(systemFontName)
            }
            UserPreferencesManager.FONT_TYPE_FILE -> {
                if (!customFontPath.isNullOrEmpty()) {
                    loadCustomFontFamily(context, customFontPath) ?: FontFamily.Default
                } else {
                    FontFamily.Default
                }
            }
            else -> FontFamily.Default
        }
    } else {
        FontFamily.Default
    }

    // Helper to apply scale. It will be applied to every style.
    fun TextStyle.withScale(): TextStyle = if (fontScale != 1.0f) {
        copy(fontSize = fontSize * fontScale, lineHeight = lineHeight * fontScale)
    } else {
        this
    }

    // 创建带有自定义字体的 Typography
    return Typography(
        displayLarge = Typography.displayLarge.copy(fontFamily = fontFamily).withScale(),
        displayMedium = Typography.displayMedium.copy(fontFamily = fontFamily).withScale(),
        displaySmall = Typography.displaySmall.copy(fontFamily = fontFamily).withScale(),
        headlineLarge = Typography.headlineLarge.copy(fontFamily = fontFamily).withScale(),
        headlineMedium = Typography.headlineMedium.copy(fontFamily = fontFamily).withScale(),
        headlineSmall = Typography.headlineSmall.copy(fontFamily = fontFamily).withScale(),
        titleLarge = Typography.titleLarge.copy(fontFamily = fontFamily).withScale(),
        titleMedium = Typography.titleMedium.copy(fontFamily = fontFamily).withScale(),
        titleSmall = Typography.titleSmall.copy(fontFamily = fontFamily).withScale(),
        bodyLarge = Typography.bodyLarge.copy(fontFamily = fontFamily).withScale(),
        bodyMedium = Typography.bodyMedium.copy(fontFamily = fontFamily).withScale(),
        bodySmall = Typography.bodySmall.copy(fontFamily = fontFamily).withScale(),
        labelLarge = Typography.labelLarge.copy(fontFamily = fontFamily).withScale(),
        labelMedium = Typography.labelMedium.copy(fontFamily = fontFamily).withScale(),
        labelSmall = Typography.labelSmall.copy(fontFamily = fontFamily).withScale()
    )
}

// ============================================================================
// Typography Extension Functions
// ============================================================================

/**
 * Extension function to apply font scale to a TextStyle
 */
fun TextStyle.withFontScale(scale: Float): TextStyle {
    return if (scale != 1.0f) {
        copy(
            fontSize = fontSize * scale,
            lineHeight = lineHeight * scale
        )
    } else {
        this
    }
}

/**
 * Extension function to apply custom font family to a TextStyle
 */
fun TextStyle.withFontFamily(fontFamily: FontFamily): TextStyle {
    return copy(fontFamily = fontFamily)
}

/**
 * Extension function to apply custom font weight to a TextStyle
 */
fun TextStyle.withFontWeight(fontWeight: FontWeight): TextStyle {
    return copy(fontWeight = fontWeight)
}
