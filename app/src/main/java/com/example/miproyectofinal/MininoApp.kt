package com.example.miproyectofinal

import android.app.Application
import androidx.room.Room
import com.example.miproyectofinal.data.database.MininoRoomDatabase

class MininoApp: Application() {

    override fun onCreate() {
        super.onCreate()
        application = this
    }

    companion object{
        lateinit var application: Application
            private set
        val database: MininoRoomDatabase by lazy{MininoRoomDatabase.getDatabase(application)}

    }

    val database: MininoRoomDatabase by lazy {MininoRoomDatabase.getDatabase(this)}
}