package com.jenin.jetpackcomposemoviesample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jenin.jetpackcomposemoviesample.model.MovieDataClass
import com.jenin.jetpackcomposemoviesample.navigation.MovieNavigation
import com.jenin.jetpackcomposemoviesample.ui.theme.JetPackComposeMovieSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Changes Done by Hari
        setContent {
          MyApp {
           MovieNavigation()
              //New Function Created

          }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //Changes Done by Hari
    //changes by jenin joseph R J
    MyApp {
    MovieNavigation()
//        test completed
    }
}

@Composable
fun MyApp(content: @Composable () ->Unit){
    //Changes Done by Hari
    JetPackComposeMovieSampleTheme {
     content()
        //done
    }
}



