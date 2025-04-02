package com.example.roomatch_front.android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roomatch_front.android.presentation.login.LoginScreen
import com.example.roomatch_front.android.presentation.register.ChooseTypeUserScreen
import com.example.roomatch_front.android.presentation.welcome.WelcomeScreen


@Composable
fun AppNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen(
                onGetStartedClick = {navController.navigate("login")}
            )
        }
        composable("login") {
            LoginScreen(
                onLoginClick =  {},
                onGoogleLoginClick = {},
                onForgotPasswordClick = {},
                onRegisterClick = {navController.navigate("chooseType")}
            )
        }
        composable("chooseType") {
            ChooseTypeUserScreen(
                onRoommateClick = {},
                onOwnerClick = {}
            )
        }
    }
}
