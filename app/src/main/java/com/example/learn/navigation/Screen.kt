package com.example.learn.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class  DashboardScreen(
    val route: String,
    val title :String ,
    val icon  : ImageVector
) {

    object Home : DashboardScreen(
        route = "Home" ,
        title = "Home" ,
        icon = Icons.Outlined.Home
    )

    object Profile : DashboardScreen(
        route = "Profile" ,
        title = "Profile" ,
        icon = Icons.Outlined.Info
    )

    object Search : DashboardScreen(
        route = "Search" ,
        title = "Search" ,
        icon = Icons.Outlined.Search
    )
}
//---------------------------------------------
sealed class AuthScreen(
    val route: String,
) {

    object LogIn : AuthScreen(route = "LogIn")
}
//---------------------------------------------
sealed class SubHomeScreen(
    val route: String
) {
    object Details : SubHomeScreen(route = "Details")
}
