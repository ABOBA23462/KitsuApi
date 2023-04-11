package com.example.kitsuapi.models

import com.google.gson.annotations.SerializedName

data class AnimeModel(
    @SerializedName("slug")
    val slug: String = "",
    @SerializedName("startDate")
    val startDate: String = "",
    @SerializedName("endDate")
    val endDate: String = "",
    @SerializedName("ratingRank")
    val ratingRank: Number,
    @SerializedName("posterImage")
    val posterImage: PosterImage,
)