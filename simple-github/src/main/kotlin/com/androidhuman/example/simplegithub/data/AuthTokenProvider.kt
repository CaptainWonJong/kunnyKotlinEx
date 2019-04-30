package com.androidhuman.example.simplegithub.data

import android.content.Context
import android.preference.PreferenceManager

class AuthTokenProvider(private val context: Context) {

    val token: String?
        get() = PreferenceManager.getDefaultSharedPreferences(context)
                .getString(KEY_AUTH_TOKEN, null)

    fun updateToken(token: String) {
        PreferenceManager.getDefaultSharedPreferences(context).edit()
                .putString(KEY_AUTH_TOKEN, token)
                .apply()
    }

    // 오른쪽과 동일 : private static final String KEY_AUTH_TOKEN = "auth_token";
    companion object {

        private val KEY_AUTH_TOKEN = "auth_token"
    }

}
