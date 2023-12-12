package com.compose.myapplication.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.compose.myapplication.presentation.view.HomeScreen
import com.compose.myapplication.presentation.view.ScreenA
import com.compose.myapplication.presentation.view.ScreenB
import com.compose.myapplication.navigation.route.Screens

fun NavGraphBuilder.appGraph(navController: NavController){
    navigation(startDestination = Screens.ScreenHomeRoute.rout, Screens.AppRoute.rout) {
        composable(route = Screens.ScreenHomeRoute.rout) {
            HomeScreen(navController)
        }
        composable(route = Screens.ScreenARoute.rout) {
            ScreenA(navController)
        }

        composable(route = Screens.ScreenBRoute.rout) {
            ScreenB(navController)
        }
    }
}
