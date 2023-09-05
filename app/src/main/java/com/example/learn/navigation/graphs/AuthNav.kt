package com.example.learn.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
 import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learn.navigation.AuthScreen
import com.example.learn.navigation.GraphRout
import com.example.learn.ui.screens.LogInScreen


fun NavGraphBuilder.authNav(
    navController: NavHostController
){
    navigation(
       startDestination =  AuthScreen.LogIn.route ,
        route = GraphRout.AUTHENTICATION
    ){

        composable(
            AuthScreen.LogIn.route
        ){
            LogInScreen(navController)
        }

    }
}




