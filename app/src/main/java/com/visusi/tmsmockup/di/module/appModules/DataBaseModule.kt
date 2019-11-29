package com.visusi.tmsmockup.di.module.appModules

import android.app.Application
import androidx.room.Room
import com.visusi.tmsmockup.database.DATA_BASE_NAME
import com.visusi.tmsmockup.database.TmsDataBase
import com.visusi.tmsmockup.database.dao.FastsDao
import dagger.Module
import dagger.Provides

@Module
class DataBaseModule {

    @Provides
    fun provideRoomInstance(application: Application): TmsDataBase {
        return Room.databaseBuilder(application, TmsDataBase::class.java, DATA_BASE_NAME)
            .allowMainThreadQueries().build()
    }

    @Provides
    fun provideFastTableInstance(roomDatabase: TmsDataBase): FastsDao {
        return roomDatabase.getFastsDao()
    }
}