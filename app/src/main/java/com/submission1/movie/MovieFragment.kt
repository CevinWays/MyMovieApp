package com.submission1.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.submission1.databinding.MovieFragmentBinding

class MovieFragment : Fragment() {
    private lateinit var viewModel: MovieViewModel
    private lateinit var movieFragmentBinding: MovieFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        movieFragmentBinding = MovieFragmentBinding.inflate(inflater, container, false)
        return movieFragmentBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        val movieAdapter = MovieAdapter()
        movieAdapter.setMovie(viewModel.getListMovie())
        with(movieFragmentBinding.rvMovie) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = movieAdapter
        }
    }

}