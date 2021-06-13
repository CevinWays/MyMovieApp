package com.submission1.movie

import androidx.lifecycle.ViewModel
import com.submission1.data.Movie
import com.submission1.utils.DataDummy

class MovieViewModel : ViewModel() {

    private var listMovie: List<Movie> = listOf()

    fun getListMovie(): List<Movie> {
        if (listMovie.isEmpty()) {
            listMovie = DataDummy.generateDummyMovies()
        }
        return listMovie
    }
}