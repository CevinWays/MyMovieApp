package com.submission1.data

import com.google.gson.annotations.SerializedName

data class Tv(
    val id:String,
    @SerializedName("name")
    val title:String,
    @SerializedName("backdrop_path")
    val backdropPath:String,
    @SerializedName("poster_path")
    val posterPath:String,
    val overview:String,
    @SerializedName("first_air_date")
    val firstAirDate:String,
    @SerializedName("vote_average")
    val voteAverage:Double
)