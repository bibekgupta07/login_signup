package com.example.firebaseauthdemoapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.firebaseauthdemoapp.pages.HomePage
import com.example.firebaseauthdemoapp.pages.LoginPage
import com.example.firebaseauthdemoapp.pages.SignupPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login"){
            LoginPage(modifier, navController, authViewModel)
        }

        composable("signup"){
            SignupPage(modifier, navController, authViewModel)
        }

        composable("home"){
            HomePage(modifier, navController, authViewModel)
        }

    })
}