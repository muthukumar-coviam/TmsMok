package com.visusi.tmsmockup.di.module.appModules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.visusi.tmsmockup.Utils
import com.visusi.tmsmockup.api.LiveDataCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
class AppModule {

    @Provides
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    fun providesSharedPreferences(application: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    fun providesUtilsInstance(): Utils {
        return Utils()
    }
}