package com.example.kitsuapi.di

import com.example.kitsuapi.data.remote.RetrofitClient
import com.example.kitsuapi.data.remote.apiservice.AnimeApiService
import com.example.kitsuapi.data.remote.apiservice.MangaApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient: RetrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideAnimeApiService(): AnimeApiService =
        retrofitClient.provideAnimeApiService()

    @Singleton
    @Provides
    fun provideMangaApiService(): MangaApiService =
        retrofitClient.provideMangaApiService()
}