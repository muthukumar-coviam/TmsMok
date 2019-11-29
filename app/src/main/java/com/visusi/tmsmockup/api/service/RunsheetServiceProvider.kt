package com.visusi.tmsmockup.api.service

import retrofit2.Retrofit
import javax.inject.Inject

class RunsheetServiceProvider @Inject constructor(private var retrofit : Retrofit){

    fun provideOauthSignInService(): RunsheetService {
        return retrofit.create(RunsheetService::class.java)
    }
}