package com.visusi.tmsmockup.features.login

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import com.visusi.tmsmockup.R
import com.visusi.tmsmockup.api.service.RunsheetService
import com.visusi.tmsmockup.api.service.RunsheetServiceProvider
import com.visusi.tmsmockup.base.BaseActivity
import com.visusi.tmsmockup.factory.ViewModelProviderFactory
import kotlinx.android.synthetic.main.login_layout.*
import kotlinx.coroutines.*
import java.lang.NullPointerException
import javax.inject.Inject


class LoginActivity : BaseActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    @Inject
    lateinit var runsheetService: RunsheetServiceProvider
    private lateinit var remoteConfig: FirebaseRemoteConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val mLoginViewModel = ViewModelProviders.of(this, providerFactory).get(
            LoginViewModel::class.java
        )
        mLoginViewModel.returnEmailAddress().observe(this, Observer {
            username.setText(it)
        })

        Log.e("runsheetService", runsheetService.toString())


        login.setOnClickListener {
        }
    }









    //        remoteConfig = FirebaseRemoteConfig.getInstance()
//        val configSettings = FirebaseRemoteConfigSettings.Builder()
//            .setMinimumFetchIntervalInSeconds(0).setDeveloperModeEnabled(true)
//            .build()
//        remoteConfig.setConfigSettingsAsync(configSettings)
//        remoteConfig.setDefaultsAsync(R.xml.default_config_values)
//
//        remoteConfig.fetch(0).addOnCompleteListener(this, OnCompleteListener {
//            if (it.isSuccessful) {
//                remoteConfig.activateFetched()
//                val updateValue = remoteConfig.getString("androidVersionDetails")
//                Log.e("updateValue", updateValue.toString())
//
//                val isEnabled = remoteConfig.getBoolean("isEnabled")
//                setLoginBackgroundButtonColor(isEnabled)
//
//                val signIn = remoteConfig.getBoolean("sign_in")
//                val register = remoteConfig.getBoolean("register")
//                loginButtonText( signIn, register)
//            } else {
//                Log.e("firebaseConfigError", it.exception.toString())
//            }
//        })

}
