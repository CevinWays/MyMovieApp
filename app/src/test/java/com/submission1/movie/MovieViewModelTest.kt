package com.submission1.movie

import com.submission1.utils.DataDummy
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {

    private lateinit var movieViewModel: MovieViewModel
    private val listMovie = DataDummy.generateDummyMovies()

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel()
    }

    @Test
    fun getListMovie() {
        Assert.assertNotNull(movieViewModel.getListMovie())
        assertEquals(listMovie.size, movieViewModel.getListMovie().size)
    }
}