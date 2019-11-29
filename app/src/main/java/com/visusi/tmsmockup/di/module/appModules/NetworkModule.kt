package com.visusi.tmsmockup.di.module.appModules

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.visusi.tmsmockup.api.LiveDataCallAdapterFactory
import com.visusi.tmsmockup.api.service.RunsheetServiceProvider
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }


    @Provides
    fun provideRetrofitBuilder(gsonBuilder: Gson): Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://172.20.0.252:8080/courier-api/")
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create(gsonBuilder)).build()
    }

    @Provides
    fun  provideRunsheetService(retrofit: Retrofit) = RunsheetServiceProvider(retrofit)
}