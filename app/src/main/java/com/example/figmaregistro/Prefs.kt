package com.example.figmaregistro

import android.content.Context

class Prefs (val context: Context) {
    val DATABASE = "myDB"
    val NAME = "Name"
    val EMAIL = "Email"
    val PASSWORD = "Password"
    val storage = context.getSharedPreferences(DATABASE, Context.MODE_PRIVATE)

    fun saveName(name:String){
        storage.edit().putString(NAME, name).apply()
    }

    fun getName():String{
        return storage.getString(NAME, "")!!
    }

    fun wipeData(){
        storage.edit().clear().apply()
    }
}