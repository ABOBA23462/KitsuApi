package com.example.kitsuapi.ui.adapters.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kitsuapi.ui.fragments.main.anime.AnimeFragment
import com.example.kitsuapi.ui.fragments.main.manga.MangaFragment

class ViewPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AnimeFragment()
            1 -> MangaFragment()
            else -> MangaFragment()
        }
    }
}