package com.example.kitsuapi.data.remote.apiservice

import com.example.kitsuapi.models.DataItem
import com.example.kitsuapi.models.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaApiService {

    @GET("edge/manga")
    suspend fun fetchManga(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int
    ): Response<DataItem>
}