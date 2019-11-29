package com.visusi.tmsmockup.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.visusi.tmsmockup.database.entity.Fasts

@Dao
interface FastsDao {

    @Insert
    fun insertBatchFast(fast: List<Fasts>)

    @Insert
    fun insertSingleFast(fast: Fasts)

    @Delete
    fun deleteFastData(fast: Fasts): Int

    @Query("SELECT * FROM Fasts")
    fun getFast(): List<Fasts>
}