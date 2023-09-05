package com.example.learn.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learn.navigation.GraphRout
import com.example.learn.navigation.SubHomeScreen
import com.example.learn.ui.screens.DetailsScreen

fun NavGraphBuilder.subHomeNav(
    navController: NavHostController
){
    navigation(
        startDestination =  SubHomeScreen.Details.route ,
        route = GraphRout.SUB_HOME
    ){
        composable(
            route = SubHomeScreen.Details.route
        ){
            DetailsScreen(navController)
        }

    }
}