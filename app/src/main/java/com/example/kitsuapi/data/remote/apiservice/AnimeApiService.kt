package com.example.kitsuapi.data.remote.apiservice

import com.example.kitsuapi.models.DataItem
import com.example.kitsuapi.models.Response
import retrofit2.http.GET

interface AnimeApiService {

    @GET("api/edge/anime")
    suspend fun fetchAnime(
    ): Response<DataItem>
}