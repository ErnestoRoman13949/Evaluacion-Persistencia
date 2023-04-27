package com.example.miproyectofinal.data.database

import android.content.Context
import androidx.room.*
import com.example.miproyectofinal.data.database.dao.MininoDao
import com.example.miproyectofinal.data.database.entities.Minino

@Database(entities = [Minino::class], version = 1, exportSchema = false)
abstract class MininoRoomDatabase : RoomDatabase() {

    abstract fun MininoDao(): MininoDao

    companion object {
        @Volatile
        private var INSTANCE: MininoRoomDatabase? = null

        fun getDatabase(context: Context): MininoRoomDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MininoRoomDatabase::class.java,
                    "mininos_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}