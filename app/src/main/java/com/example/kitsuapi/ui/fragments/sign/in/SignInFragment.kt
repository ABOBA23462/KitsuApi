package com.example.kitsuapi.ui.fragments.sign.`in`

import android.util.Log
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.base.BaseFragment
import com.example.kitsuapi.data.preferenceshelper.UserPreferencesData
import com.example.kitsuapi.databinding.FragmentSignInBinding
import com.example.kitsuapi.models.AuthModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignInFragment :
    BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {

    @Inject
    lateinit var userPreferencesData: UserPreferencesData

    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignInViewModel by viewModels()

    override fun setupSubscribes() = with(binding) {

        binding.btn.setOnClickListener {
            val email = etGmail.text.toString()
            val password = etPassword.text.toString()
            val authModel = AuthModel(grant_type = "password", email, password)

            viewModel.postUserData(authModel).subscribe(
                onError = {
                    Toast.makeText(requireContext(), "kama loh", Toast.LENGTH_SHORT).show()
                    Log.e("TAG", authModel.toString())
                },
                onSuccess = {
                    userPreferencesData.apply {
                        isAuthorized = true
                        accessToken = accessToken
                        refreshToken = refreshToken
                    }
                    requireActivity().findNavController(R.id.fragment_container)
                        .navigate(R.id.action_signInFlowFragment_to_homeFlowFragment)
                }
            )
        }
    }
}