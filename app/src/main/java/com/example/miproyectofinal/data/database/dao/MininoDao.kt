package com.example.miproyectofinal.data.database.dao

import com.example.miproyectofinal.data.database.entities.Minino
import androidx.room.*
import kotlinx.coroutines.flow.Flow

interface MininoDao {
    //Query para obtener todo
    @Query("SELECT * FROM minino ORDER BY nombre DESC")
    fun getMininos(): Flow<List<Minino>>

    @Query("SELECT * FROM minino WHERE id = :id")
    fun getMinino(id: Int): Flow<Minino>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertMinino(minino: Minino)

    @Update
    suspend fun updateMinino(minino: Minino)

    @Delete
    suspend fun deleteMinino(minino: Minino)
}