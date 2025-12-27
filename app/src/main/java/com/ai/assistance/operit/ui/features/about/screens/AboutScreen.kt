package com.ai.assistance.operit.ui.features.about.screens

import android.content.Context
import android.content.pm.PackageManager
import android.net.Uri
import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.ai.assistance.operit.R
import com.ai.assistance.operit.data.updates.UpdateManager
import com.ai.assistance.operit.data.updates.UpdateStatus
import com.ai.assistance.operit.ui.components.CustomScaffold
import com.ai.assistance.operit.ui.theme.AppSpacing
import com.ai.assistance.operit.ui.theme.AppSizes
import kotlinx.coroutines.launch

private const val GITHUB_PROJECT_URL = "https://github.com/AAswordman/Operit"

// 简化的开源库列表（只保留主要的）
private val essentialLibraries = listOf(
    "AndroidX Compose" to "Modern declarative UI toolkit",
    "Kotlin Coroutines" to "Asynchronous programming",
    "Room" to "SQLite database ORM",
    "OkHttp" to "HTTP client",
    "Gson" to "JSON parsing",
    "Coil" to "Image loading",
    "ExoPlayer" to "Media player",
    "ML Kit" to "Machine learning",
    "TensorFlow Lite" to "On-device ML",
    "Shizuku" to "System API access",
    "ObjectBox" to "NoSQL database",
    "Material Design 3" to "Design system"
)

@Composable
fun HtmlText(html: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val textStyle = MaterialTheme.typography.bodyMedium

    AndroidView(
        modifier = modifier,
        factory = { ctx ->
            TextView(ctx).apply {
                textSize = textStyle.fontSize.value
                setTextColor(textStyle.color.toArgb())
                movementMethod = android.text.method.LinkMovementMethod.getInstance()
            }
        },
        update = { textView ->
            textView.text = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                android.text.Html.fromHtml(html, android.text.Html.FROM_HTML_MODE_COMPACT)
            } else {
                @Suppress("DEPRECATION") android.text.Html.fromHtml(html)
            }
        }
    )
}

@Composable
fun LicenseDialog(onDismiss: () -> Unit) {
    val context = LocalContext.current
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.open_source_licenses)) },
        text = {
            LazyColumn {
                items(essentialLibraries) { (name, desc) ->
                    ListItem(
                        headlineContent = { Text(name, fontWeight = FontWeight.Bold) },
                        supportingContent = { Text(desc, style = MaterialTheme.typography.bodySmall) }
                    )
                    HorizontalDivider()
                }
                item {
                    val intent = android.content.Intent(
                        android.content.Intent.ACTION_VIEW,
                        Uri.parse("$GITHUB_PROJECT_URL/blob/main/LICENSE")
                    ).addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK)
                    ListItem(
                        headlineContent = { Text("View Full List on GitHub") },
                        leadingContent = { Icon(Icons.Default.Public, null) },
                        modifier = Modifier.clickable { context.startActivity(intent) }
                    )
                }
            }
        },
        confirmButton = {
            Button(onClick = onDismiss) { Text(stringResource(R.string.ok)) }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navigateToUpdateHistory: () -> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val updateManager = remember { UpdateManager.getInstance(context) }

    var updateStatus by remember { mutableStateOf<UpdateStatus>(UpdateStatus.Initial) }
    var showUpdateDialog by remember { mutableStateOf(false) }
    var showLicenseDialog by remember { mutableStateOf(false) }

    DisposableEffect(updateManager) {
        val observer = androidx.lifecycle.Observer<UpdateStatus> { newStatus -> updateStatus = newStatus }
        updateManager.updateStatus.observeForever(observer)
        onDispose { updateManager.updateStatus.removeObserver(observer) }
    }

    LaunchedEffect(updateStatus) {
        if (updateStatus is UpdateStatus.Available || updateStatus is UpdateStatus.UpToDate || updateStatus is UpdateStatus.Error) {
            showUpdateDialog = true
        }
    }

    val appVersion = remember {
        try {
            context.packageManager.getPackageInfo(context.packageName, 0).versionName
        } catch (e: PackageManager.NameNotFoundException) {
            "Unknown"
        }
    }

    fun checkForUpdates() {
        scope.launch { updateManager.checkForUpdates(appVersion) }
    }

    if (showLicenseDialog) LicenseDialog(onDismiss = { showLicenseDialog = false })

    if (showUpdateDialog) {
        UpdateDialog(
            updateStatus = updateStatus,
            appVersion = appVersion,
            onDismiss = { showUpdateDialog = false },
            onConfirm = {
                if (updateStatus is UpdateStatus.Available) {
                    val intent = android.content.Intent(
                        android.content.Intent.ACTION_VIEW,
                        Uri.parse((updateStatus as UpdateStatus.Available).updateUrl)
                    ).addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                showUpdateDialog = false
            }
        )
    }

    CustomScaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(AppSpacing.medium),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(AppSpacing.medium))

            // Logo
            Surface(
                modifier = Modifier.size(100.dp),
                shape = CircleShape,
                color = MaterialTheme.colorScheme.primaryContainer
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = null,
                        modifier = Modifier.size(70.dp)
                    )
                }
            }

            Spacer(Modifier.height(AppSpacing.medium))

            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = stringResource(R.string.about_version, appVersion),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(top = AppSpacing.nano, bottom = AppSpacing.medium)
            )

            // Check update button
            Button(
                onClick = { checkForUpdates() },
                modifier = Modifier.fillMaxWidth().height(AppSizes.buttonMinHeight),
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium),
                enabled = updateStatus !is UpdateStatus.Checking
            ) {
                if (updateStatus is UpdateStatus.Checking) {
                    CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(20.dp))
                } else {
                    Icon(Icons.Default.Update, null, modifier = Modifier.size(20.dp))
                }
                Spacer(Modifier.width(AppSpacing.small))
                Text(
                    if (updateStatus is UpdateStatus.Checking) stringResource(R.string.checking_updates)
                    else stringResource(R.string.check_for_updates)
                )
            }

            Spacer(Modifier.height(AppSpacing.medium))

            // About card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
            ) {
                Column(Modifier.padding(AppSpacing.medium)) {
                    Text(
                        text = stringResource(R.string.about_title),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(Modifier.height(AppSpacing.small))
                    Text(
                        text = stringResource(R.string.about_description),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(Modifier.height(AppSpacing.small))
                    HtmlText(html = stringResource(R.string.about_developer))
                    Spacer(Modifier.height(AppSpacing.small))
                    HtmlText(html = stringResource(R.string.about_website))
                    Spacer(Modifier.height(AppSpacing.small))
                    Text(
                        text = stringResource(R.string.about_copyright),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
            }

            Spacer(Modifier.height(AppSpacing.small))

            // Action cards
            ActionCard(Icons.Default.Star, stringResource(R.string.star_on_github)) {
                val intent = android.content.Intent(
                    android.content.Intent.ACTION_VIEW,
                    Uri.parse(GITHUB_PROJECT_URL)
                ).addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            }

            ActionCard(Icons.Default.History, stringResource(R.string.update_log), navigateToUpdateHistory)

            ActionCard(Icons.Default.Source, stringResource(R.string.open_source_licenses)) {
                showLicenseDialog = true
            }

            Spacer(Modifier.height(AppSpacing.small))
        }
    }
}

@Composable
private fun ActionCard(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable(onClick = onClick),
        shape = RoundedCornerShape(AppSizes.cornerRadiusMedium)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(AppSpacing.medium),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(icon, null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            Spacer(Modifier.width(AppSpacing.medium))
            Text(
                text = text,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.weight(1f)
            )
            Icon(
                Icons.AutoMirrored.Filled.ArrowForward,
                null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateDialog(
    updateStatus: UpdateStatus,
    appVersion: String,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        icon = {
            Icon(
                when (updateStatus) {
                    is UpdateStatus.Available -> Icons.Default.Update
                    is UpdateStatus.Checking -> Icons.Default.Download
                    is UpdateStatus.UpToDate -> Icons.Default.CheckCircle
                    is UpdateStatus.Error -> Icons.Default.Error
                    else -> Icons.Default.Update
                },
                null
            )
        },
        title = {
            Text(
                when (updateStatus) {
                    is UpdateStatus.Available -> stringResource(R.string.new_version_found)
                    is UpdateStatus.Checking -> stringResource(R.string.checking_updates)
                    is UpdateStatus.UpToDate -> stringResource(R.string.check_complete)
                    is UpdateStatus.Error -> stringResource(R.string.check_failed)
                    else -> stringResource(R.string.update_check)
                }
            )
        },
        text = {
            when (val status = updateStatus) {
                is UpdateStatus.Available -> {
                    Column {
                        Text(stringResource(R.string.new_version, appVersion, status.newVersion))
                        if (status.releaseNotes.isNotEmpty()) {
                            Spacer(Modifier.height(AppSpacing.small))
                            Text(stringResource(R.string.update_content), fontWeight = FontWeight.Bold)
                            Text(status.releaseNotes, style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
                is UpdateStatus.UpToDate -> Text(stringResource(R.string.already_latest_version, appVersion))
                is UpdateStatus.Error -> Text(status.message)
                else -> Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            }
        },
        confirmButton = {
            Button(onClick = onConfirm, enabled = updateStatus !is UpdateStatus.Checking) {
                Text(if (updateStatus is UpdateStatus.Available) stringResource(R.string.download) else stringResource(R.string.ok))
            }
        },
        dismissButton = {
            if (updateStatus !is UpdateStatus.Checking) {
                TextButton(onClick = onDismiss) { Text(stringResource(R.string.close)) }
            }
        }
    )
}
