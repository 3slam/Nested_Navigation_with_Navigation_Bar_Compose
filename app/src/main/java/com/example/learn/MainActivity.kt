

package com.example.learn


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.runtime.Composable
 import androidx.compose.ui.tooling.preview.Preview

import androidx.navigation.compose.rememberNavController

import com.example.learn.graphs.rootNav




@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}






//@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//
//   val navController = rememberNavController()
//
//     rootNav(navController)
//}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//
//}
//  Scaffold (
//        bottomBar = {
//
//            val screens = listOf(
//                BottomBarScreen.Home,
//                BottomBarScreen.Profile,
//                BottomBarScreen.Settings,
//            )
//            val navBackStackEntry by navController.currentBackStackEntryAsState()
//            val currentDestination = navBackStackEntry?.destination
//
//
//
//            NavigationBar {
//                screens.forEach { screen ->
//                    NavigationBarItem(
//                        label = {
//                            Text(text = screen.title)
//                        },
//                        icon = {
//                            Icon(
//                                imageVector =   screen.icon,
//                                contentDescription = "Navigation Icon"
//                            )
//                        },
//                        selected = currentDestination?.hierarchy?.any {
//                            it.route == screen.route
//                        } == true,
//
//                        onClick = {
//                            navController.navigate(screen.route) {
//                                popUpTo(navController.graph.findStartDestination().id)
//                                launchSingleTop = true
//                            }
//                        }
//                    )
//                }
//            }
//
//        })