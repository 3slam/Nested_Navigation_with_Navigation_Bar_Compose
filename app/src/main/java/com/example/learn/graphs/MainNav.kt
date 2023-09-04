package com.example.learn.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learn.screens.HomeScreen
import com.example.learn.screens.LogInScreen
import com.example.learn.screens.ProfileScreen
import com.example.learn.screens.Screen
import com.example.learn.screens.SignUpScreen

fun NavGraphBuilder.mainNav(
    navController: NavHostController
){
    navigation(
        startDestination =  Screen.Home.route ,
        route = MainNavRoute
    ){
        composable(
            route = Screen.Home.route
        ){
           HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Profile.route
        ){
            ProfileScreen()
        }
    }
}
