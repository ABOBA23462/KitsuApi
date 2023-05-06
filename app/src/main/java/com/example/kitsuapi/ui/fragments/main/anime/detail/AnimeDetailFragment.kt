package com.example.kitsuapi.ui.fragments.main.anime.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.kitsuapi.R
import com.example.kitsuapi.base.BaseFragment
import com.example.kitsuapi.databinding.FragmentAnimeDetailBinding
import com.example.kitsuapi.extensions.setImage
import com.example.kitsuapi.extensions.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeDetailFragment : BaseFragment<FragmentAnimeDetailBinding, AnimeDetailViewModel>
    (R.layout.fragment_anime_detail) {

    override val binding by viewBinding(FragmentAnimeDetailBinding::bind)
    override val viewModel: AnimeDetailViewModel by viewModels()
    private val args: AnimeDetailFragmentArgs by navArgs()

    override fun setupSubscribes() {
        subscribeToAnimeDetail()
    }

    private fun subscribeToAnimeDetail() = with(binding) {
        viewModel.fetchDetailAnime(args.id).subscribe(
            onError = {
                toast(it)
            },
            onSuccess = {
                it.data.let {
                    binding.tvAnimeName.text = it!!.attributes.titles.enJp
                    binding.ivAnimeImage.setImage(it.attributes.posterImage.original)
                    binding.backgroundPoster.setImage(it.attributes.posterImage.original)
                    binding.tvAnimeStudios.text = it.attributes.slug
                    binding.tvAnimeEpisodes.text =
                        it.attributes.episodeCount.toString()
                    binding.tvAnimeStatus.text = it.attributes.status
                    binding.tvAnimePremiered.text = it.attributes.createdAt
                    binding.tvAnimeAgeRating.text = it.attributes.ageRating
                }
            }
        )
    }
}