package com.example.learn.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learn.screens.LogInScreen
import com.example.learn.screens.Screen
import com.example.learn.screens.SignUpScreen

fun NavGraphBuilder.authNav(
    navController: NavHostController
){
    navigation(
       startDestination =  Screen.LogIn.route ,
        route = AuthNavRoute
    ){
        composable(
            route = Screen.LogIn.route
        ){
            LogInScreen(navController)
        }
        composable(
            route = Screen.SignUP.route
        ){
            SignUpScreen(navController)
        }
    }
}

const val AuthNavRoute ="AuthNavRoute"
const val MainNavRoute ="MainNavRoute"