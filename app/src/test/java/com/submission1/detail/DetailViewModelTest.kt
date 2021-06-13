package com.submission1.detail

import com.submission1.utils.DataDummy
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

class DetailViewModelTest {

    private var detailViewModel: DetailViewModel = DetailViewModel()
    private var selectedMovie = DataDummy.generateDummyMovies().first()
    private var selectedTvShow = DataDummy.generateDummyTv().first()

    @Test
    fun setMovie() {
        detailViewModel.setMovie(selectedMovie.id)
        Assert.assertNotNull(detailViewModel.getMovie())
        assertEquals(selectedMovie.id, detailViewModel.getMovie().id)
        assertEquals(selectedMovie.title, detailViewModel.getMovie().title)
        assertEquals(selectedMovie.overview, detailViewModel.getMovie().overview)
        assertEquals(selectedMovie.releaseDate, detailViewModel.getMovie().releaseDate)
        assertEquals(selectedMovie.voteAverage, detailViewModel.getMovie().voteAverage, 0.0001)
        assertEquals(selectedMovie.posterPath, detailViewModel.getMovie().posterPath)
        assertEquals(selectedMovie.backdropPath, detailViewModel.getMovie().backdropPath)
    }

    @Test
    fun setTvShow() {
        detailViewModel.setTvShow(selectedTvShow.id)
        Assert.assertNotNull(detailViewModel.getTvShow())
        assertEquals(selectedTvShow.id, detailViewModel.getTvShow().id)
        assertEquals(selectedTvShow.title, detailViewModel.getTvShow().title)
        assertEquals(selectedTvShow.overview, detailViewModel.getTvShow().overview)
        assertEquals(selectedTvShow.firstAirDate, detailViewModel.getTvShow().firstAirDate)
        assertEquals(selectedTvShow.voteAverage, detailViewModel.getTvShow().voteAverage, 0.0001)
        assertEquals(selectedTvShow.posterPath, detailViewModel.getTvShow().posterPath)
        assertEquals(selectedTvShow.backdropPath, detailViewModel.getTvShow().backdropPath)
    }
}