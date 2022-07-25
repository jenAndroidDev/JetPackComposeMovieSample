package com.jenin.jetpackcomposemoviesample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jenin.jetpackcomposemoviesample.screens.detail.DetailScreen
import com.jenin.jetpackcomposemoviesample.screens.home.HomeScreen

@Composable
fun MovieNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(MovieScreens.HomeScreen.name) {
            //pass the destination
            HomeScreen(navController = navController)
        }

        composable(
            MovieScreens.DetailsScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") { type = NavType.StringType })
        )
        { backStackEntry ->
            backStackEntry?.arguments?.getString("movie")?.let {
                DetailScreen(
                    navController = navController,
                    movieData = it
                )
            }
        }
    }
}