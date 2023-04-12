package com.example.kitsuapi.ui.fragments.manga

import androidx.lifecycle.ViewModel
import com.example.kitsuapi.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class MangaViewModel @javax.inject.Inject constructor(
    private val repository: MangaRepository
) : ViewModel() {

    fun fetchManga() = repository.fetchManga()
}