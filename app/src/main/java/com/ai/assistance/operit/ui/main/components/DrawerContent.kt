package com.ai.assistance.operit.ui.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ai.assistance.operit.R
import com.ai.assistance.operit.data.repository.ChatHistoryManager
import com.ai.assistance.operit.ui.common.NavItem
import com.ai.assistance.operit.ui.main.NavGroup
import com.ai.assistance.operit.ui.main.screens.OperitRouter
import com.ai.assistance.operit.ui.main.screens.Screen
import com.ai.assistance.operit.ui.theme.AppBorderRadius
import com.ai.assistance.operit.ui.theme.AppOpacity
import com.ai.assistance.operit.ui.theme.AppSizes
import com.ai.assistance.operit.ui.theme.AppSpacing
import java.time.format.DateTimeFormatter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/** Content for the expanded navigation drawer */
@Composable
fun DrawerContent(
        navGroups: List<NavGroup>,
        currentScreen: Screen,
        selectedItem: NavItem,
        isNetworkAvailable: Boolean,
        networkType: String,
        scope: CoroutineScope,
        drawerState: androidx.compose.material3.DrawerState,
        onScreenSelected: (Screen, NavItem) -> Unit
) {
        val context = LocalContext.current
        val chatHistoryManager = remember { ChatHistoryManager.getInstance(context) }
        val chatHistories by
                chatHistoryManager.chatHistoriesFlow.collectAsState(initial = emptyList())
        val currentChatId by chatHistoryManager.currentChatIdFlow.collectAsState(initial = null)
        val dateFormatter = remember { DateTimeFormatter.ofPattern("MM-dd HH:mm") }

        Column(
                modifier =
                        Modifier.fillMaxHeight()
                                .background(MaterialTheme.colorScheme.surfaceVariant)
                                .padding(AppSpacing.medium)
        ) {
                // Sidebar Header
                Row(
                        modifier =
                                Modifier.fillMaxWidth()
                                        .height(64.dp)
                                        .padding(start = AppSpacing.small),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                        Text(
                                text = stringResource(id = R.string.app_name),
                                style = MaterialTheme.typography.headlineMedium,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.onBackground
                        )
                }

                // New Chat Button
                Button(
                        onClick = {
                                scope.launch {
                                        chatHistoryManager.createNewChat()
                                        onScreenSelected(
                                                OperitRouter.getScreenForNavItem(NavItem.AiChat),
                                                NavItem.AiChat
                                        )
                                        drawerState.close()
                                }
                        },
                        modifier = Modifier.fillMaxWidth().height(AppSizes.buttonMinHeight),
                        shape = RoundedCornerShape(AppBorderRadius.full),
                        colors =
                                ButtonDefaults.buttonColors(
                                        containerColor = MaterialTheme.colorScheme.primary,
                                        contentColor = MaterialTheme.colorScheme.onPrimary
                                ),
                        elevation =
                                ButtonDefaults.buttonElevation(
                                        defaultElevation = 2.dp,
                                        pressedElevation = 1.dp
                                )
                ) {
                        Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = null,
                                modifier = Modifier.size(AppSizes.iconMedium)
                        )
                        Spacer(modifier = Modifier.size(AppSpacing.small))
                        Text(text = stringResource(id = R.string.new_conversation))
                }

                Spacer(modifier = Modifier.height(AppSpacing.large))

                // Scroll Area
                Column(
                        modifier =
                                Modifier.weight(1f)
                                        .verticalScroll(rememberScrollState())
                                        .padding(
                                                bottom =
                                                        WindowInsets.navigationBars
                                                                .asPaddingValues()
                                                                .calculateBottomPadding()
                                        ),
                        verticalArrangement = Arrangement.spacedBy(AppSpacing.nano)
                ) {
                        // Menu / Groups
                        NavigationDrawerItemHeader("菜单")
                        navGroups.flatMap { it.items }.forEach { item ->
                                CompactNavigationDrawerItem(
                                        icon = item.icon,
                                        label = stringResource(id = item.titleResId),
                                        selected = selectedItem == item,
                                        onClick = {
                                                onScreenSelected(
                                                        OperitRouter.getScreenForNavItem(item),
                                                        item
                                                )
                                                scope.launch { drawerState.close() }
                                        }
                                )
                        }

                        Spacer(modifier = Modifier.height(AppSpacing.medium))

                        // History List
                        NavigationDrawerItemHeader("历史记录")
                        val sortedHistories =
                                remember(chatHistories) {
                                        chatHistories.sortedByDescending { it.updatedAt }
                                }
                        sortedHistories.take(20).forEach { history ->
                                val isActive = history.id == currentChatId
                                Surface(
                                        modifier = Modifier.fillMaxWidth(),
                                        onClick = {
                                                scope.launch {
                                                        chatHistoryManager.setCurrentChatId(
                                                                history.id
                                                        )
                                                        onScreenSelected(
                                                                OperitRouter.getScreenForNavItem(
                                                                        NavItem.AiChat
                                                                ),
                                                                NavItem.AiChat
                                                        )
                                                        drawerState.close()
                                                }
                                        },
                                        color =
                                                if (isActive)
                                                        MaterialTheme.colorScheme.surfaceVariant
                                                else MaterialTheme.colorScheme.surface,
                                        contentColor = MaterialTheme.colorScheme.onBackground,
                                        shape = RoundedCornerShape(AppBorderRadius.extraLarge)
                                ) {
                                        Column(
                                                modifier = Modifier.padding(AppSpacing.medium),
                                                verticalArrangement =
                                                        Arrangement.spacedBy(AppSpacing.nano)
                                        ) {
                                                Text(
                                                        text =
                                                                runCatching {
                                                                                history.updatedAt.format(
                                                                                        dateFormatter
                                                                                )
                                                                        }
                                                                        .getOrElse { "" },
                                                        style = MaterialTheme.typography.bodySmall,
                                                        color =
                                                                MaterialTheme.colorScheme
                                                                        .onSurfaceVariant
                                                )
                                                Text(
                                                        text = history.title,
                                                        style =
                                                                MaterialTheme.typography
                                                                        .bodyMedium,
                                                        fontWeight = FontWeight.Medium,
                                                        maxLines = 1,
                                                        overflow = TextOverflow.Ellipsis
                                                )
                                        }
                                }
                        }

                        Spacer(modifier = Modifier.height(AppSpacing.medium))
                }

                // Footer
                HorizontalDivider(
                        color =
                                MaterialTheme.colorScheme.onSurfaceVariant.copy(
                                        alpha = AppOpacity.focus
                                )
                )
                Spacer(modifier = Modifier.height(AppSpacing.small))
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                ) {
                        Surface(
                                modifier = Modifier.size(AppSizes.avatarSmall),
                                shape = CircleShape,
                                color = MaterialTheme.colorScheme.outlineVariant
                        ) {}
                        Spacer(modifier = Modifier.size(AppSpacing.small))
                        Text(
                                text = "User",
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Medium,
                                color = MaterialTheme.colorScheme.onBackground
                        )
                }
        }
}

/** Content for the collapsed navigation drawer (for tablet mode) */
@Composable
fun CollapsedDrawerContent(
        navItems: List<NavItem>,
        selectedItem: NavItem,
        isNetworkAvailable: Boolean,
        onScreenSelected: (Screen, NavItem) -> Unit
) {
        Column(
                modifier =
                        Modifier.fillMaxHeight()
                                .background(MaterialTheme.colorScheme.surfaceVariant)
                                .verticalScroll(rememberScrollState())
                                .padding(vertical = AppSpacing.medium),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
                Surface(
                        modifier = Modifier.size(AppSizes.avatarSmall),
                        shape = CircleShape,
                        color = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                ) {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(
                                        text = "O",
                                        style = MaterialTheme.typography.labelLarge,
                                        fontWeight = FontWeight.Bold
                                )
                        }
                }

                Spacer(modifier = Modifier.height(AppSpacing.medium))
                HorizontalDivider(modifier = Modifier.fillMaxWidth(0.6f))
                Spacer(modifier = Modifier.height(AppSpacing.medium))

                for (item in navItems) {
                        Surface(
                                modifier = Modifier.padding(vertical = AppSpacing.extraSmall),
                                onClick = {
                                        onScreenSelected(
                                                OperitRouter.getScreenForNavItem(item),
                                                item
                                        )
                                },
                                color =
                                        if (selectedItem == item)
                                                MaterialTheme.colorScheme.secondaryContainer
                                        else Color.Transparent,
                                shape = RoundedCornerShape(AppBorderRadius.full)
                        ) {
                                Icon(
                                        imageVector = item.icon,
                                        contentDescription = stringResource(id = item.titleResId),
                                        tint =
                                                if (selectedItem == item)
                                                        MaterialTheme.colorScheme
                                                                .onSecondaryContainer
                                                else MaterialTheme.colorScheme.onSurfaceVariant,
                                        modifier =
                                                Modifier.padding(AppSpacing.small)
                                                        .size(AppSizes.iconNormal)
                                )
                        }
                }

                Spacer(modifier = Modifier.height(AppSpacing.medium))
        }
}
