package com.compose.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.compose.myapplication.navigation.route.Screens

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AuthRoute.rout) {
        authGraph(navController)
        appGraph(navController)
    }
}
