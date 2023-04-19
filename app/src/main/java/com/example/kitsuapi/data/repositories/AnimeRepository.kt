package com.example.kitsuapi.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.kitsuapi.base.BaseRepository
import com.example.kitsuapi.data.remote.apiservice.AnimeApiService
import com.example.kitsuapi.data.repositories.pagingsource.AnimePagingSource
import javax.inject.Inject

class AnimeRepository @Inject constructor(
    private val service: AnimeApiService
) : BaseRepository() {

    fun fetchAnime() = Pager(
        PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        AnimePagingSource(service)
    }.liveData

    fun fetchDetailAnime(id: String) = doRequest {
        service.fetchDetailAnime(id)
    }
}