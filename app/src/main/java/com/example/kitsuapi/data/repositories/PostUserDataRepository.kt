package com.example.kitsuapi.data.repositories

import com.example.kitsuapi.base.BaseRepository
import com.example.kitsuapi.data.remote.apiservice.SignInApiService
import com.example.kitsuapi.models.AuthModel
import javax.inject.Inject

class PostUserDataRepository @Inject constructor(
    private val service: SignInApiService
): BaseRepository() {
    fun postUserData(authModel: AuthModel) = doRequest {
        service.postAuthDataUser(authModel)
    }
}