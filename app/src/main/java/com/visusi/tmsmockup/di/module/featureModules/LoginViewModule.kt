package com.visusi.tmsmockup.di.module.featureModules

import androidx.lifecycle.ViewModel
import com.visusi.tmsmockup.ViewModelKey
import com.visusi.tmsmockup.features.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LoginViewModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindProfileViewModel(viewModel: LoginViewModel): ViewModel
}