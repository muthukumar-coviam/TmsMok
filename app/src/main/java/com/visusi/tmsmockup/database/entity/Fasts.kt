package com.visusi.tmsmockup.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Fasts(
    @PrimaryKey()
    @ColumnInfo(name = "id")
    val id: Int?= null,
    @ColumnInfo(name = "fastType")
    val fastType: String,
    @ColumnInfo(name = "title")
    val fastTitle: String,
    @ColumnInfo(name = "description")
    val description: String
)