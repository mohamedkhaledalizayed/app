package com.example.daggertest.di.login

import androidx.lifecycle.ViewModel
import com.example.daggertest.di.ViewModelKey
import com.example.daggertest.ui.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LoginViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel
}