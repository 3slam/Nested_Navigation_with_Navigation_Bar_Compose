package com.example.learn.screens

sealed class  Screen(
    val route: String,
) {
    object Home :Screen(route = "Home")
    object Profile :Screen(route = "Profile")
    object LogIn :Screen(route = "LogIn")
    object SignUP :Screen(route = "SignUP")

}

