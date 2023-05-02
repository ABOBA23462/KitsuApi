package com.example.kitsuapi.data.preferenceshelper

import android.content.Context
import android.content.SharedPreferences

class PreferencesHelper(context: Context) {

    private val preference: SharedPreferences = context.getSharedPreferences("userStatus", Context.MODE_PRIVATE)

    operator fun invoke() = preference
}