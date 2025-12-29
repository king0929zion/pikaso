package com.ai.assistance.operit.ui.main.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
import com.ai.assistance.operit.ui.theme.AppBorderRadius

/** Displays a header in the navigation drawer */
@Composable
fun NavigationDrawerItemHeader(title: String) {
    Text(
            text = title.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 1.sp,
            modifier =
                    Modifier.padding(
                            start = AppSpacing.small,
                            top = AppSpacing.medium,
                            bottom = AppSpacing.extraSmall
                    )
    )
}

/** Displays a navigation item in the drawer with icon and label */
@Composable
fun CompactNavigationDrawerItem(
        icon: ImageVector,
        label: String,
        selected: Boolean,
        onClick: () -> Unit
) {
    val containerColor =
            if (selected) MaterialTheme.colorScheme.secondaryContainer else Color.Transparent
    val contentColor =
            if (selected) MaterialTheme.colorScheme.onSecondaryContainer
            else MaterialTheme.colorScheme.onBackground

    Surface(
            modifier =
                    Modifier.fillMaxWidth()
                            .padding(horizontal = AppSpacing.small, vertical = AppSpacing.micro)
                            .height(AppSizes.buttonMinHeight),
            onClick = onClick,
            color = containerColor,
            contentColor = contentColor,
            shape = RoundedCornerShape(AppBorderRadius.full)
    ) {
        Row(
                modifier = Modifier.fillMaxSize().padding(horizontal = AppSpacing.medium),
                verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = contentColor,
                    modifier = Modifier.size(AppSizes.iconMedium)
            )

            Spacer(modifier = Modifier.width(AppSpacing.small))

            Text(
                    text = label,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = if (selected) FontWeight.Medium else FontWeight.Normal,
                    color = contentColor
            )
        }
    }
}
