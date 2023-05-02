package com.example.kitsuapi.ui.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.databinding.FragmentHomeBinding
import com.example.kitsuapi.ui.adapters.viewpager.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.viewPager.adapter = ViewPagerAdapter(requireActivity())
        TabLayoutMediator(binding.tabLayout, binding.viewPager){
                tab, pos ->
            when(pos){
                0 -> {
                    tab.text = "Anime"
                }
                1 -> {
                    tab.text = "Manga"
                }
            }
        }.attach()
    }
}