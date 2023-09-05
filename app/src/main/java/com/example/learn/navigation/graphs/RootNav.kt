package com.example.learn.navigation.graphs

import android.annotation.SuppressLint
 import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
 import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
 import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.learn.navigation.DashboardScreen
import com.example.learn.navigation.GraphRout
import com.example.learn.ui.screens.DashboardScreenUI


@Composable
fun RootNav(
  navController: NavHostController
){
    NavHost(
        navController = navController ,
        startDestination = GraphRout.AUTHENTICATION ,
        route =  GraphRout.ROOT
        ){
        authNav(navController = navController)

        composable(route = GraphRout.DASHBOARD){
            DashboardScreenUI()
        }
    }
}


