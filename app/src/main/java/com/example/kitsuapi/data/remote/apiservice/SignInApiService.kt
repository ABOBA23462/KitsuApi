package com.example.kitsuapi.data.remote.apiservice

import com.example.kitsuapi.models.AuthModel
import com.example.kitsuapi.models.TokenModel
import retrofit2.http.Body
import retrofit2.http.POST

interface SignInApiService {
    @POST("oauth/token")
    suspend fun postAuthDataUser(
        @Body authModel: AuthModel
        ) : TokenModel
}