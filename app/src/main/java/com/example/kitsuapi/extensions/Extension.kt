package com.example.kitsuapi.extensions

import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun ImageView.setImage(uri: String) {
    Glide.with(this)
        .load(uri)
        .into(this)
}

fun Fragment.toast(text : String){
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
}