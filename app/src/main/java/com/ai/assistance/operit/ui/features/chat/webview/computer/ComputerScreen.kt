package com.ai.assistance.operit.ui.features.chat.webview.computer

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput

/**
 * Computer Screen - Placeholder for future computer/terminal functionality
 * Terminal functionality has been removed from the application.
 */
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ComputerScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            // Use pointerInput to intercept touch events
            .pointerInput(Unit) {
                detectTapGestures(
                    onTap = { /* Consume tap event */ },
                    onDoubleTap = { /* Consume double tap event */ },
                    onLongPress = { /* Consume long press event */ },
                    onPress = { /* Consume press event */ }
                )
            }
    ) {
        // Terminal functionality has been removed
        // This screen is kept for API compatibility
    }
}
