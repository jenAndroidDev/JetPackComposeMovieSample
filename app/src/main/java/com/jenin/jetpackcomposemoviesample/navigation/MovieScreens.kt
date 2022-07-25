package com.jenin.jetpackcomposemoviesample.navigation

enum class MovieScreens {
    //Changes Done by Hari
    HomeScreen,
    DetailsScreen;
    companion object{
      fun fromRoute(route: String?):MovieScreens
      {
       return   when(route?.substringBefore("/")){

              HomeScreen.name -> {
                   HomeScreen
              }

              DetailsScreen.name -> {
                   DetailsScreen
              }

              null -> {
                  HomeScreen
              }

           else -> {

               throw IllegalArgumentException("Route $route is not recognised")
           }
       }
      }
    }
}