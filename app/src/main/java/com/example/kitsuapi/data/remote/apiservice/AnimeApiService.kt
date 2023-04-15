package com.example.kitsuapi.data.remote.apiservice

import com.example.kitsuapi.models.DataItem
import com.example.kitsuapi.models.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {

    @GET("api/edge/anime")
    suspend fun fetchAnime(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int
    ): Response<DataItem>
}