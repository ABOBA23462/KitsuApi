package com.example.kitsuapi.ui.fragments.manga.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kitsuapi.R

class MangaDetailFragment : Fragment() {

    companion object {
        fun newInstance() = MangaDetailFragment()
    }

    private lateinit var viewModel: MangaDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_manga_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MangaDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}