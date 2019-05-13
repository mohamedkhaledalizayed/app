package com.example.daggertest.di


import android.app.Application
import com.example.daggertest.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [AndroidSupportInjectionModule::class, ActivityBuildersModule::class,
             AppModule::class]
)
interface AppComponent : AndroidInjector<MyApp> {


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}