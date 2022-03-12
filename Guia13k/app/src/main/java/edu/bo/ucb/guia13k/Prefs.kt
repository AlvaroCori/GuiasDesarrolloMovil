package edu.bo.ucb.guia13k
import android.content.Context
import android.content.SharedPreferences

class Prefs(context:Context) {
    private val PREFS_FILENAME = "edu.bo.ucb.pref"
    private val KEY_USER ="user"
    private val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)
    var user: String?
        get() = prefs.getString(KEY_USER, "")
        set(value) = prefs.edit().putString(KEY_USER, value).apply()
}


