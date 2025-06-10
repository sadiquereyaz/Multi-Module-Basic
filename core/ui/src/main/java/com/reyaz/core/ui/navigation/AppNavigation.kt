package com.reyaz.core.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(
    modifier: Modifier,
    navController: NavHostController = rememberNavController(),
    homeScreen: @Composable () -> Unit,
    profileScreen: @Composable (String?) -> Unit,
    settingsScreen: @Composable () -> Unit,
    userDetailScreen: @Composable (String) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            homeScreen()
        }

        composable(Routes.PROFILE) {
            profileScreen(null)
        }

        composable(Routes.SETTINGS) {
            settingsScreen()
        }

        composable(Routes.USER_DETAIL) { backStackEntry ->
            val userId = backStackEntry.arguments?.getString("user_id") ?: "Empty"
            if (userId.isNotEmpty())
                userDetailScreen(userId)
        }
    }
}