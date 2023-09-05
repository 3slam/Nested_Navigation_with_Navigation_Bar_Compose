package com.example.learn.ui.screens

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
import com.example.learn.navigation.graphs.DashboardNav


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreenUI(
    navController : NavHostController = rememberNavController()
){
    Scaffold (bottomBar = { BottomNavigationBar (navController) })
    {
        DashboardNav(navController)
    }
}
@Composable
fun BottomNavigationBar(
    navController :NavHostController
) {
    val screens = listOf(
        DashboardScreen.Home,
        DashboardScreen.Profile,
        
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomBarDestination = screens.any { it.route == currentDestination?.route }

  if (bottomBarDestination){
      NavigationBar  {
          screens.forEach { screen ->
              NavigationBarItem(
                  label = {
                      Text(text = screen.route)
                  },
                  icon = {
                      Icon(
                          imageVector = Icons.Default.Settings,
                          contentDescription = "Navigation Icon"
                      )
                  },
                  selected = currentDestination?.hierarchy?.any {
                      it.route == screen.route
                  } == true,

                  onClick = {
                      navController.navigate(screen.route) {
                          popUpTo(navController.graph.findStartDestination().id)
                          launchSingleTop = true
                      }
                  }
              )
          }

      }

  }

}