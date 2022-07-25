package com.jenin.jetpackcomposemoviesample.screens.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jenin.jetpackcomposemoviesample.model.MovieDataClass
import com.jenin.jetpackcomposemoviesample.model.getMovieList
import com.jenin.jetpackcomposemoviesample.navigation.MovieScreens
import com.jenin.jetpackcomposemoviesample.widgets.MovieRow

@Composable
fun HomeScreen(navController: NavController){

    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color.Magenta,
            elevation = 5.dp) {
            Text(text = "Movies")
        }
    }) {
        MainContent(navController = navController, movieList = getMovieList())
    }
}

@Composable
fun MainContent(movieList:List<MovieDataClass>,navController: NavController){

    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            LazyColumn{
                items(items = movieList){movieName->
                    MovieRow(movie = movieName){clickedMovie->


                        navController.navigate(route = MovieScreens.DetailsScreen.name+"/${clickedMovie}")
                    }
                }
            }

        }
    }
}