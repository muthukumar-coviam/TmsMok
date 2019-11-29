package com.visusi.tmsmockup.di.component

import android.app.Application
import com.visusi.tmsmockup.TmsApplication
import com.visusi.tmsmockup.di.module.appModules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [AndroidSupportInjectionModule::class, AndroidInjectionModule::class,
        ActivityModule::class, FragmentModule::class, AppModule::class, DataBaseModule::class,
        ViewModelFactoryModule::class, NetworkModule::class]
)
interface AppComponent : AndroidInjector<TmsApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}