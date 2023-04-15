package com.example.kitsuapi.data.repositories.pagingsource

import android.net.Uri

import com.example.kitsuapi.base.BasePagingSource
import com.example.kitsuapi.data.remote.apiservice.AnimeApiService
import com.example.kitsuapi.models.DataItem

private const val ANIME_PAGE = 1

class AnimePagingSource(private val service: AnimeApiService) : BasePagingSource<DataItem>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DataItem> {
        return try {
            val nextPage = params.key ?: ANIME_PAGE
            val response = service.fetchAnime(params.loadSize, nextPage)
            val nextPages =
                Uri.parse(response.links.next).getQueryParameter("page[offset]")!!.toInt()

            LoadResult.Page(
                data = response.data,
                prevKey = if (nextPage == 1) null
                else nextPage - 1,
                nextKey = nextPages
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}