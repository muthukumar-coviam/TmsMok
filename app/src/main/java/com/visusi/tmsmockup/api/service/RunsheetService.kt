package com.visusi.tmsmockup.api.service

import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RunsheetService {

    @Headers("Accept: application/json", "TMS-API-VERSION: 1")
    @POST("crowdSourceCourier/saveUser")
    fun personalDetailsSignUp(
        @Body
        request: HashMap<String, String>
    ): Observable<Response<String>>
}