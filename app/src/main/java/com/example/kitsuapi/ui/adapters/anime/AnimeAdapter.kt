package com.example.kitsuapi.ui.adapters.anime

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuapi.databinding.ItemAnimeBinding
import com.example.kitsuapi.extensions.setImage
import com.example.kitsuapi.models.AnimeModel

class AnimeAdapter : ListAdapter<AnimeModel, AnimeAdapter.ViewHolder>(
diffUtil
) {

    class ViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: AnimeModel?) = with(binding) {
            name.text = item?.slug
            img.setImage(item!!.posterImage.original)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<AnimeModel>() {
            override fun areItemsTheSame(
                oldItem: AnimeModel,
                newItem: AnimeModel
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: AnimeModel,
                newItem: AnimeModel
            ): Boolean {
                return oldItem.slug == newItem.slug
            }
        }
    }
}
