package com.example.kitsuapi.ui.adapters.anime

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuapi.base.BaseDiffUtilItemCallback
import com.example.kitsuapi.databinding.ItemKitsuBinding
import com.example.kitsuapi.extensions.setImage
import com.example.kitsuapi.models.DataItem

class AnimeAdapter : ListAdapter<DataItem, AnimeAdapter.ViewHolder>(
    BaseDiffUtilItemCallback()
) {

    class ViewHolder(private val binding: ItemKitsuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: DataItem?) = with(binding) {
            name.text = item?.attributes?.titles?.enJp
            img.setImage(item!!.attributes.posterImage.large)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemKitsuBinding.inflate(
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
}