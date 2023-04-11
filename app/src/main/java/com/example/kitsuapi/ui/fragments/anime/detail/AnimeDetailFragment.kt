package com.example.kitsuapi.ui.fragments.anime.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kitsuapi.R

class AnimeDetailFragment : Fragment() {

    companion object {
        fun newInstance() = AnimeDetailFragment()
    }

    private lateinit var viewModel: AnimeDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anime_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AnimeDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}