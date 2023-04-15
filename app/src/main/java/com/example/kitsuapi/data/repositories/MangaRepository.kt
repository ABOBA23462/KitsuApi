package com.example.kitsuapi.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.kitsuapi.data.remote.apiservice.MangaApiService
import com.example.kitsuapi.data.repositories.pagingsource.MangaPagingSource
import javax.inject.Inject

class MangaRepository @Inject constructor(
    private val service: MangaApiService
) {


    fun fetchManga() = Pager(
        PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        MangaPagingSource(service)
    }.liveData
}