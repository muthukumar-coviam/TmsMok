package com.visusi.tmsmockup.di.module.appModules

import androidx.lifecycle.ViewModelProvider
import com.visusi.tmsmockup.factory.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}