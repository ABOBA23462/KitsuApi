package com.example.kitsuapi.data.remote

import com.example.kitsuapi.constant.Constant
import com.example.kitsuapi.data.remote.apiservice.AnimeApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {
    private val okHttpClient = OkHttpClient().newBuilder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS).build()

    private val retrofitClient = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    fun provideAnimeApiService(): AnimeApiService {
        return retrofitClient.create(AnimeApiService::class.java)
    }
}