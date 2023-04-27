package com.example.miproyectofinal.data.database.entities

import androidx.room.*

@Entity(tableName = "minino")
data class Minino (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "nombre")
    val nombres: String,
    @ColumnInfo(name = "zona")
    val zonas: String,
)
