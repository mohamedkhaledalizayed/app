package com.example.daggertest.di.login

import com.example.daggertest.network.login.LoginApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class LoginModule{

    @Provides
    @Singleton
    fun provideLoginApi(retrofit: Retrofit): LoginApi{
        return retrofit.create(LoginApi::class.java)
    }
}