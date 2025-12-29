package com.ai.assistance.operit.ui.main.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ai.assistance.operit.ui.common.NavItem
import com.ai.assistance.operit.ui.main.NavGroup
import com.ai.assistance.operit.ui.main.components.AppContent
import com.ai.assistance.operit.ui.main.components.BottomNavBar
import com.ai.assistance.operit.ui.main.screens.OperitRouter
import com.ai.assistance.operit.ui.main.screens.Screen
import kotlinx.coroutines.CoroutineScope

/**
 * Phone layout with Bottom Navigation Bar instead of Drawer
 */
@Composable
fun PhoneLayout(
        currentScreen: Screen,
        selectedItem: NavItem,
        isLoading: Boolean,
        navGroups: List<NavGroup>,
        isNetworkAvailable: Boolean,
        networkType: String,
        drawerWidth: Dp,
        navController: NavController,
        scope: CoroutineScope,
        drawerState: DrawerState,
        showFpsCounter: Boolean,
        onScreenChange: (Screen) -> Unit,
        onNavItemChange: (NavItem) -> Unit,
        navigateToTokenConfig: () -> Unit,
        canGoBack: Boolean,
        onGoBack: () -> Unit,
        isNavigatingBack: Boolean = false,
        topBarActions: @Composable RowScope.() -> Unit = {}
) {
    val showBottomBar = currentScreen.navItem in listOf(NavItem.Toolbox, NavItem.AiChat, NavItem.Settings) && !canGoBack

    Scaffold(
        bottomBar = {
            if (showBottomBar) {
                BottomNavBar(
                    selectedItem = selectedItem,
                    onItemSelected = { item ->
                        onNavItemChange(item)
                        onScreenChange(OperitRouter.getScreenForNavItem(item))
                    }
                )
            }
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = if (showBottomBar) innerPadding.calculateBottomPadding() else 0.dp)
            ) {
                AppContent(
                    currentScreen = currentScreen,
                    selectedItem = selectedItem,
                    useTabletLayout = false,
                    isTabletSidebarExpanded = false,
                    isLoading = isLoading,
                    navController = navController,
                    scope = scope,
                    drawerState = drawerState,
                    showFpsCounter = showFpsCounter,
                    onScreenChange = onScreenChange,
                    onNavItemChange = onNavItemChange,
                    onToggleSidebar = { /* Not used in phone layout */ },
                    navigateToTokenConfig = navigateToTokenConfig,
                    canGoBack = canGoBack,
                    onGoBack = onGoBack,
                    isNavigatingBack = isNavigatingBack,
                    actions = topBarActions
                )
            }
        }
    )
}
