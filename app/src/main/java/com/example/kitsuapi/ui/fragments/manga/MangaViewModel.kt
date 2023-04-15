package com.example.kitsuapi.ui.fragments.manga

import com.example.kitsuapi.base.BaseViewModel
import com.example.kitsuapi.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class MangaViewModel @javax.inject.Inject constructor(
    private val repository: MangaRepository
) : BaseViewModel() {

    fun fetchManga() = repository.fetchManga()
}