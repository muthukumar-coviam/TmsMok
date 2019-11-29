package com.visusi.tmsmockup.features.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import java.lang.NullPointerException
import javax.inject.Inject

class LoginViewModel @Inject constructor(val loginRepository: LoginRepository) : ViewModel() {

    fun returnEmailAddress() : MutableLiveData<String> {
        val liveData = MutableLiveData<String>()
        liveData.postValue("visusi.p")
        return liveData
    }

    suspend fun foundError() : Int {
        supervisorScope {
            async {
                throw NullPointerException()
            }
          }
        return 100
    }


}