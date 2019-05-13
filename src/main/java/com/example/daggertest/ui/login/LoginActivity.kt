package com.example.daggertest.ui.login

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.daggertest.R
import com.example.daggertest.factory.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class LoginActivity : DaggerAppCompatActivity() {

//    @Inject
//    lateinit var factory: ViewModelProviderFactory

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        viewModel = ViewModelProviders.of(this,factory).get(LoginViewModel::class.java)


    }

    fun login(view: View){
        viewModel.loginUser(1).observe(this, Observer {
            Log.e("done", it.username)
        })
    }
}