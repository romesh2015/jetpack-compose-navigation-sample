package com.compose.myapplication.navigation.route
sealed class Screens(val rout: String) {
    object ScreenLoginRoute: Screens(rout = "Login")
    object ScreenForgotPassRoute: Screens(rout = "ForgotPass")
    object ScreenRegisterRoute: Screens(rout = "Register")
    object ScreenHomeRoute: Screens(rout = "Home")
    object ScreenARoute: Screens(rout = "A")
    object ScreenBRoute: Screens(rout = "B")
    object AuthRoute: Screens(rout = "Auth")
    object AppRoute:  Screens(rout = "App")
}
