package com.example.kitsuapi.data.remote.apiservice

import com.example.kitsuapi.models.DataItem
import com.example.kitsuapi.models.Response
import retrofit2.http.GET

interface MangaApiService {

    @GET("api/edge/manga")
    suspend fun fetchManga(
    ): Response<DataItem>
}
