package com.example.kitsuapi.ui.fragments.main.anime

import com.example.kitsuapi.base.BaseViewModel
import com.example.kitsuapi.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val repository: AnimeRepository
) : BaseViewModel() {
    fun fetchAnime() = repository.fetchAnime()
}