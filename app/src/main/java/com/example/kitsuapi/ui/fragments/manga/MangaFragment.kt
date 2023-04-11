package com.example.kitsuapi.ui.fragments.manga

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kitsuapi.R

class MangaFragment : Fragment() {

    companion object {
        fun newInstance() = MangaFragment()
    }

    private lateinit var viewModel: MangaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_manga, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MangaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}