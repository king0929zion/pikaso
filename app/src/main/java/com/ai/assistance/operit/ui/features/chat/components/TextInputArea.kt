package com.ai.assistance.operit.ui.features.chat.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fullscreen
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.sp
import com.ai.assistance.operit.R
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing

/**
 * Simplified text input area for chat
 */
@Composable
fun TextInputArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    isEnabled: Boolean = true,
    maxLines: Int = 5,
    onFullscreenRequest: () -> Unit = {}
) {
    val showFullscreenButton = value.contains("\n")
    val modernTextStyle = TextStyle(fontSize = 13.sp, lineHeight = 16.sp)

    Row(modifier = modifier) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = {
                Text(
                    placeholder,
                    style = modernTextStyle
                )
            },
            modifier = Modifier
                .weight(1f)
                .heightIn(min = AppSizes.inputMinHeightSmall),
            textStyle = modernTextStyle,
            maxLines = maxLines,
            minLines = 1,
            singleLine = false,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline
            ),
            shape = RoundedCornerShape(AppSizes.cornerRadiusLarge),
            trailingIcon = {
                if (showFullscreenButton) {
                    IconButton(onClick = onFullscreenRequest) {
                        Icon(
                            imageVector = Icons.Default.Fullscreen,
                            contentDescription = "Fullscreen input",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            },
            enabled = isEnabled
        )
    }
}
