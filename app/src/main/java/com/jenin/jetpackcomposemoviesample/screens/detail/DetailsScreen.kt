package com.jenin.jetpackcomposemoviesample.screens.detail

import android.telecom.Call
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jenin.jetpackcomposemoviesample.model.MovieDataClass

@Composable
fun DetailScreen(
    navController: NavController,
    movieData: String){
    
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.LightGray,
                elevation = 5.dp) {
                Row(horizontalArrangement = Arrangement.Start,
                   verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrow_back_icon",
                        modifier = Modifier.clickable {
                            navController.popBackStack()
                        })
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Movie")
                }

            }
    }) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = movieData, style = MaterialTheme.typography.h5)
            }

        }


    }


}

@Composable
fun sampleCode(){
    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(text ="",style = MaterialTheme.typography.h5)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = {
                //navController.popBackStack()
            }) {
                Text(text = "Go Back")
            }
        }

    }
}