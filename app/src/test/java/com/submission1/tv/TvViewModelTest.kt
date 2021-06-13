package com.submission1.tv

import com.submission1.utils.DataDummy
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {
    private lateinit var tvShowViewModel: TvViewModel
    private val listTvShow = DataDummy.generateDummyTv()

    @Before
    fun setUp() {
        tvShowViewModel = TvViewModel()
    }

    @Test
    fun getListTvShow() {
        Assert.assertNotNull(tvShowViewModel.getListTvShow())
        assertEquals(listTvShow.size, tvShowViewModel.getListTvShow().size)
    }
}