package com.visusi.tmsmockup

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.visusi.tmsmockup.base.BaseActivity
import com.visusi.tmsmockup.database.dao.FastsDao
import com.visusi.tmsmockup.database.entity.Fasts
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences
    @Inject
    lateinit var utils: Utils
    @Inject
    lateinit var fastDao: FastsDao


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
