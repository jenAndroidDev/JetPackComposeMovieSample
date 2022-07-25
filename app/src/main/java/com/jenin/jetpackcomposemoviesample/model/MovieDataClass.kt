package com.jenin.jetpackcomposemoviesample.model

data class MovieDataClass(
    val id:String,
    val title:String,
    val year:String,
    val genre:String,
    val director:String,
    val actor:String,
    val plot:String,
    val poster:String,
    val rating:String
)

fun getMovieList():List<MovieDataClass>{

    return arrayListOf(
        MovieDataClass(
            "1",
            "Beetlejuice",
            "1988",
            "Comedy,Fantasy","Tim Burton",
            "Alec Baldwin, Geena Davis, Annie McEnroe, Maurice Page",
            "\"A couple of recently deceased ghosts contract the services of a \\\"bio-exorcist\\\" in order to remove the obnoxious new owners of their house.",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BMTUwODE3MDE0MV5BMl5BanBnXkFtZTgwNTk1MjI4MzE@._V1_SX300.jpg",
        "8"),

        MovieDataClass(
            "2",
            "The Cotton Club",
            "1984",
            "Crime,Drama",
            "Francis Ford Coppola",
            "Richard Gere, Gregory Hines, Diane Lane, Lonette McKee",
            "The Cotton Club was a famous night club in Harlem. The story follows the people that visited the club, those that ran it, and is peppered with the Jazz music that made it so famous.",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BMTU5ODAyNzA4OV5BMl5BanBnXkFtZTcwNzYwNTIzNA@@._V1_SX300.jpg",
            "9"),
        MovieDataClass(
            "3",
            "The Shawshank Redemption",
            "1994",
            "Crime,Drama",
            "Frank Darabont",
            "Tim Robbins, Morgan Freeman, Bob Gunton, William Sadler",
            "wo imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BODU4MjU4NjIwNl5BMl5BanBnXkFtZTgwMDU2MjEyMDE@._V1_SX300.jpg",
            "9"),
        MovieDataClass(
            "4",
            "Crocodile Dunde",
            "1986",
            "Adventures,Comedy",
            "Peter Faiman",
            "Paul Hogan, Linda Kozlowski, John Meillon, David Gulpilil",
            "An American reporter goes to the Australian outback to meet an eccentric crocodile poacher and invites him to New York City.",
            "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg0MTU1MTg4NF5BMl5BanBnXkFtZTgwMDgzNzYxMTE@._V1_SX300.jpg",
            "8.5"),
        MovieDataClass(
            "5",
            "Valkyrie",
            "2008",
            "Drama,History,Thriller",
            "Bryan Singer",
            "Tom Cruise, Kenneth Branagh, Bill Nighy, Tom Wilkinson",
            "A dramatization of the 20 July assassination and political coup plot by desperate renegade German Army officers against Hitler during World War II.",
            "http://ia.media-imdb.com/images/M/MV5BMTg3Njc2ODEyN15BMl5BanBnXkFtZTcwNTAwMzc3NA@@._V1_SX300.jpg",
            "10"),

    )
}
