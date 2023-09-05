package com.example.learn.navigation.graphs


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learn.navigation.DashboardScreen
import com.example.learn.navigation.GraphRout
import com.example.learn.ui.screens.HomeScreen
import com.example.learn.ui.screens.ProfileScreen



@Composable
fun DashboardNav(
    navController: NavHostController
){
    NavHost(
        navController = navController ,
        startDestination = DashboardScreen.Home.route ,
        route = GraphRout.DASHBOARD
    ){

        composable(
            route = DashboardScreen.Home.route
        ){
            HomeScreen(navController)
        }
        composable(
            route = DashboardScreen.Profile.route
        ){
            ProfileScreen(navController)
        }


         subHomeNav(navController)
    }

}







