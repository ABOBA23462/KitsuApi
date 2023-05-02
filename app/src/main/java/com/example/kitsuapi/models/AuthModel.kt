package com.example.kitsuapi.models

import com.google.gson.annotations.SerializedName

data class AuthModel(
    @SerializedName("grant_type")
    val grant_type: String = "password",
    @SerializedName("username")
    val email: String,
    @SerializedName("password")
    val password: String
)