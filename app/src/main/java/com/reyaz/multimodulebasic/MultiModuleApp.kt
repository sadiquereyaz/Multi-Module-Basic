package com.reyaz.multimodulebasic

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.reyaz.core.ui.navigation.AppNavigation
import com.reyaz.core.ui.navigation.Routes
import com.reyaz.feature.home.HomeScreen
import com.reyaz.feature.profile.ProfileScreen
import com.reyaz.feature.profile.UserDetailScreen
import com.reyaz.feature.settings.SettingsScreen

@Composable
fun MultiModuleApp(
    navController: NavHostController,
    modifier: Modifier
) {
    AppNavigation(
        modifier = modifier,
        navController = navController,
        homeScreen = {
            HomeScreen(
                modifier = modifier,
                onNavigateToProfile = {
                    navController.navigate(Routes.PROFILE)
                },
                onNavigateToSettings = {
                    navController.navigate(Routes.SETTINGS)
                },
                onNavigateToUserDetail = { userId ->
                    //Log.d("MULTI_MODULE_APP", "onNavigateToUserDetail: $userId")
                    navController.navigate(Routes.userDetail(userId))
                }
            )
        },
        profileScreen = { userId ->
            ProfileScreen(
                modifier = modifier,
                userId = userId,
                onNavigateBack = {
                    navController.popBackStack()
                },
                onNavigateToSettings = {
                    navController.navigate(Routes.SETTINGS)
                }
            )
        },
        settingsScreen = {
            SettingsScreen(
                modifier = modifier,
                onNavigateBack = {
                    navController.popBackStack()
                },
                onNavigateToProfile = {
                    navController.navigate(Routes.PROFILE)
                }
            )
        },
        userDetailScreen = { userId ->
            UserDetailScreen(
                modifier = modifier,
                userId = userId,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
    )
}