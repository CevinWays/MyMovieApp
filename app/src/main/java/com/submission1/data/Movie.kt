package com.submission1.data

import com.google.gson.annotations.SerializedName

data class Movie(
    val id:String,
    val title:String,
    @SerializedName("backdrop_path")
    val backdropPath:String,
    @SerializedName("poster_path")
    val posterPath:String,
    val overview:String,
    @SerializedName("release_date")
    val releaseDate:String,
    @SerializedName("vote_average")
    val voteAverage:Double
)