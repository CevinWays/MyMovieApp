package com.submission1.detail

import androidx.lifecycle.ViewModel
import com.submission1.data.Movie
import com.submission1.data.Tv
import com.submission1.utils.DataDummy

class DetailViewModel : ViewModel() {

    private lateinit var selectedMovie: Movie

    private lateinit var selectedTvShow: Tv

    fun setMovie(movieId: String) {
        val listMovie: List<Movie> = DataDummy.generateDummyMovies()
        selectedMovie = listMovie.first { it.id == movieId }
    }

    fun setTvShow(movieId: String) {
        val listTvShow: List<Tv> = DataDummy.generateDummyTv()
        selectedTvShow = listTvShow.first { it.id == movieId }
    }

    fun getMovie(): Movie = selectedMovie

    fun getTvShow(): Tv = selectedTvShow
}