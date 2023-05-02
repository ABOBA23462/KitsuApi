package com.example.kitsuapi.data.preferenceshelper

import javax.inject.Inject

const val PREF_IS_AUTHORIZED = "is_authorized"
const val PREF_REFRESH_TOKEN: String = "refresh_token"
const val PREF_ACCESS_TOKEN: String = "access_token"

class UserPreferencesData @Inject constructor(
    private val preferences: PreferencesHelper
) {
    var isAuthorized : Boolean
    get() = preferences().getBoolean(PREF_IS_AUTHORIZED, false)
    set(value) = preferences().edit().putBoolean(PREF_IS_AUTHORIZED, value).apply()

    var refreshToken : String
    get() = preferences().getString(PREF_REFRESH_TOKEN, "null")!!
    set(value) = preferences().edit().putString(PREF_REFRESH_TOKEN, value).apply()

    var accessToken : String
    get() = preferences().getString(PREF_ACCESS_TOKEN, "null")!!
    set(value) = preferences().edit().putString(PREF_ACCESS_TOKEN, value).apply()
 }