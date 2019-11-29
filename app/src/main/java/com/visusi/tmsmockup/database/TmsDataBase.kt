package com.visusi.tmsmockup.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.visusi.tmsmockup.database.dao.FastsDao
import com.visusi.tmsmockup.database.entity.Fasts


const val DATA_BASE_NAME = "Tms-db"

@Database(entities = [Fasts::class], version = 1, exportSchema = false)
abstract class TmsDataBase : RoomDatabase(){

    abstract fun getFastsDao(): FastsDao

}

