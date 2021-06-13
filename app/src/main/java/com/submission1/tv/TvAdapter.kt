package com.submission1.tv

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission1.R
import com.submission1.data.Tv
import com.submission1.databinding.ItemTvBinding
import com.submission1.detail.DetailActivity
import com.submission1.utils.Constant

class TvAdapter : RecyclerView.Adapter<TvAdapter.ViewHolder>() {

    private var listTvShow = ArrayList<Tv>()

    fun setTvShow(tvShow: List<Tv>?) {
        if (tvShow == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShow)
    }

    class ViewHolder(private val binding: ItemTvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: Tv){
            with(binding){
                textViewTitle.text = tvShow.title
                textViewOverview.text = tvShow.overview
                textViewRating.text = tvShow.voteAverage.toString()
                textViewReleaseDate.text = tvShow.firstAirDate
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_KEY_TV_SHOW_ID, tvShow.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(Constant.IMAGE_BASE_URL+tvShow.posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(imageViewThumbnail)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvAdapter.ViewHolder {
        val itemTvBinding = ItemTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemTvBinding)
    }

    override fun onBindViewHolder(holder: TvAdapter.ViewHolder, position: Int) {
        val tv = listTvShow[position]
        holder.bind(tv)
    }

    override fun getItemCount(): Int = listTvShow.size
}