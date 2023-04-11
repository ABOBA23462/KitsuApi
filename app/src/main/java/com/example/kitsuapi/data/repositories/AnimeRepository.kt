package com.example.kitsuapi.data.repositories

import androidx.lifecycle.liveData
import com.example.kitsuapi.Resource
import com.example.kitsuapi.data.remote.apiservice.AnimeApiService
import com.example.kitsuapi.models.Response
import javax.inject.Inject

class AnimeRepository @Inject constructor(
    private val service: AnimeApiService
) {

    fun fetchAnime() = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(service.fetchAnime()))
        } catch (exception: Exception){
            emit(Resource.Error(exception.localizedMessage ?: "Error", null))
        }
    }

}