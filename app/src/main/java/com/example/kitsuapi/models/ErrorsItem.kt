package com.example.kitsuapi.models

import com.google.gson.annotations.SerializedName

data class ErrorsItem(@SerializedName("code")
                      val code: String = "",
                      @SerializedName("detail")
                      val detail: String = "",
                      @SerializedName("source")
                      val source: Source,
                      @SerializedName("title")
                      val title: String = "",
                      @SerializedName("status")
                      val status: String = "")