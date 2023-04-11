package com.example.kitsuapi.models

import com.google.gson.annotations.SerializedName

data class Response<T>(@SerializedName("errors")
                    val errors: List<ErrorsItem>?,
                       @SerializedName("data")
                       val data: List<T>?
)