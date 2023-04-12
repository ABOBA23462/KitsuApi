package com.example.kitsuapi.data.repositories

import androidx.lifecycle.liveData
import com.example.kitsuapi.Resource
import com.example.kitsuapi.data.remote.apiservice.MangaApiService
import javax.inject.Inject

class MangaRepository @Inject constructor(
    private val service: MangaApiService
) {

    fun fetchManga() = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(service.fetchManga()))
        } catch (exception: Exception) {
            emit(Resource.Error(exception.localizedMessage ?: "Error", null))
        }
    }
}