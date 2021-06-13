package com.submission1.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.submission1.databinding.TvFragmentBinding

class TvFragment : Fragment() {
    private lateinit var viewModel: TvViewModel
    private lateinit var tvShowFragmentBinding: TvFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tvShowFragmentBinding = TvFragmentBinding.inflate(inflater, container, false)
        return tvShowFragmentBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TvViewModel::class.java)
        val tvShowAdapter = TvAdapter()
        tvShowAdapter.setTvShow(viewModel.getListTvShow())
        with(tvShowFragmentBinding.rvTvShow) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = tvShowAdapter
        }
    }

}