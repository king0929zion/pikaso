 
package com.ai.assistance.operit.ui.features.settings.components

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
import coil.compose.rememberAsyncImagePainter

@Composable
fun AvatarPicker(
    label: String,
    avatarUri: String?,
    onAvatarChange: () -> Unit,
    onAvatarReset: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.nano + 2.dp)
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.padding(horizontal = AppSpacing.nano)
        )

        Box(
            modifier = Modifier
                .size(AppSizes.avatarExtraLarge - 2.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .clickable(onClick = onAvatarChange)
                .border(AppSizes.strokeMedium, MaterialTheme.colorScheme.primary, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            if (avatarUri != null) {
                Image(
                    painter = rememberAsyncImagePainter(model = Uri.parse(avatarUri)),
                    contentDescription = "$label Avatar",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            } else {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Default Avatar",
                    modifier = Modifier.size(AppSizes.avatarLarge - 1.dp),
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        OutlinedButton(
            onClick = onAvatarReset,
            enabled = avatarUri != null,
            modifier = Modifier
                .height(AppSizes.buttonMinHeightSmall - 8.dp)
                .padding(horizontal = AppSpacing.nano)
        ) {
            Icon(
                imageVector = Icons.Default.Refresh,
                contentDescription = "Reset Avatar",
                modifier = Modifier.size(AppSizes.iconSmall)
            )
            Spacer(modifier = Modifier.width(AppSpacing.micro))
            Text(
                text = "重置",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
} 