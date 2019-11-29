package com.visusi.tmsmockup.di.module.appModules

import com.visusi.tmsmockup.MainActivity
import com.visusi.tmsmockup.di.module.featureModules.LoginViewModule
import com.visusi.tmsmockup.features.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    internal abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [LoginViewModule::class])
    internal abstract fun contributeLoginActivity(): LoginActivity
}