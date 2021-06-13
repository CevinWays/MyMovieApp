package com.submission1.tv

import androidx.lifecycle.ViewModel
import com.submission1.data.Tv
import com.submission1.utils.DataDummy

class TvViewModel : ViewModel() {

    private var listTvShow: List<Tv> = listOf()

    fun getListTvShow(): List<Tv> {
        if (listTvShow.isEmpty()) {
            listTvShow = DataDummy.generateDummyTv()
        }
        return listTvShow
    }
}