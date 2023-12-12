package com.compose.myapplication.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.compose.myapplication.presentation.view.ForgotPasswordScreen
import com.compose.myapplication.presentation.view.RegisterScreen
import com.compose.myapplication.navigation.route.Screens
import com.compose.myapplication.presentation.view.LoginScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(startDestination = Screens.ScreenLoginRoute.rout, Screens.AuthRoute.rout) {
        composable(route = Screens.ScreenLoginRoute.rout) {
            LoginScreen(navController)
        }
        composable(route = Screens.ScreenRegisterRoute.rout) {
            RegisterScreen(navController)
        }

        composable(route = Screens.ScreenForgotPassRoute.rout) {
            ForgotPasswordScreen(navController)
        }
    }
}
