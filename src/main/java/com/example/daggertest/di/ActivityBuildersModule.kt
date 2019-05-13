package com.example.daggertest.di

import com.example.daggertest.di.login.LoginModule
import com.example.daggertest.di.login.LoginViewModelModule
import com.example.daggertest.ui.login.LoginActivity
import com.example.daggertest.ui.login.LoginViewModel
import com.example.daggertest.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [LoginViewModelModule::class, LoginModule::class])
    abstract fun contributeLoginActivity(): LoginActivity

}