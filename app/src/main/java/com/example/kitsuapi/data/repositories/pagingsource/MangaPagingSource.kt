package com.example.kitsuapi.data.repositories.pagingsource

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kitsuapi.base.BasePagingSource
import com.example.kitsuapi.data.remote.apiservice.AnimeApiService
import com.example.kitsuapi.data.remote.apiservice.MangaApiService
import com.example.kitsuapi.models.DataItem

private const val MANGA_PAGE = 1

class MangaPagingSource(private val service: MangaApiService) : BasePagingSource<DataItem>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DataItem> {
        return try {
            val nextPage = params.key ?: MANGA_PAGE
            val response = service.fetchManga(params.loadSize, nextPage)
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