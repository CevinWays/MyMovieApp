package com.submission1.detail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission1.R
import com.submission1.databinding.ActivityDetailBinding
import com.submission1.utils.Constant

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_KEY_MOVIE_ID = "movie_id"
        const val EXTRA_KEY_TV_SHOW_ID = "tv_show_id"
    }

    private lateinit var detailBinding: ActivityDetailBinding
    private val detailViewModel : DetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            if (bundle.containsKey(EXTRA_KEY_MOVIE_ID)) {
                detailViewModel.setMovie(bundle.getString(EXTRA_KEY_MOVIE_ID)!!)
                setMovie()
            } else if (bundle.containsKey(EXTRA_KEY_TV_SHOW_ID)) {
                detailViewModel.setTvShow(bundle.getString(EXTRA_KEY_TV_SHOW_ID)!!)
                setTvShow()
            }
        }
    }

    private fun setTvShow() {
        with(detailViewModel.getTvShow()){
            with(detailBinding){
                textViewTitle.text = title
                textViewOverview.text = overview
                textViewRating.text = voteAverage.toString()
                textViewReleaseDate.text = firstAirDate
                Glide.with(this@DetailActivity)
                    .load(Constant.IMAGE_BASE_URL+posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(imageBackDrop)
            }
        }
    }

    private fun setMovie() {
        with(detailViewModel.getMovie()){
            with(detailBinding){
                textViewTitle.text = title
                textViewOverview.text = overview
                textViewRating.text = voteAverage.toString()
                textViewReleaseDate.text = releaseDate
                Glide.with(this@DetailActivity)
                    .load(Constant.IMAGE_BASE_URL+posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(imageBackDrop)
            }
        }
    }
}