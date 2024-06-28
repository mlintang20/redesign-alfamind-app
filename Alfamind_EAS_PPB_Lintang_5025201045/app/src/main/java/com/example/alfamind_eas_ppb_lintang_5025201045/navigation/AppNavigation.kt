package com.example.alfamind_eas_ppb_lintang_5025201045.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.alfamind_eas_ppb_lintang_5025201045.screens.*

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = "root",
        startDestination = "splash"
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("signin") { SignIn(navController) }
        composable("signup") { SignUp(navController) }
        composable("main") { MainScreen() }
    }
}