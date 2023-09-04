package com.example.learn.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost


@Composable
fun rootNav(
  navController: NavHostController
){
    NavHost(
        navController = navController ,
        startDestination = AuthNavRoute
        ){
        authNav(navController)
        mainNav(navController)
    }
}