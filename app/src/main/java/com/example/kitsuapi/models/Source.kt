package com.example.kitsuapi.models

import com.google.gson.annotations.SerializedName

data class Source(@SerializedName("pointer")
                  val pointer: String = "",
                  @SerializedName("parameter")
                  val parameter: String = "")