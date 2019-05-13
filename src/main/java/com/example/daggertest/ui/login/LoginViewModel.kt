package com.example.daggertest.ui.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.daggertest.models.User
import com.example.daggertest.network.login.LoginApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class LoginViewModel @Inject constructor(var loginApi: LoginApi): ViewModel() {

//    @Inject
//    lateinit var loginApi: LoginApi

    lateinit var mutableLiveData: MutableLiveData<User>


    fun loginUser(id: Int): LiveData<User>{
        loginApi.getUsers(id).enqueue(object : Callback<User>{
            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e("Error",t.message)
            }

            override fun onResponse(call: Call<User>, response: Response<User>) {
                mutableLiveData.value = response.body()
            }
        })

        return getUser()
    }

    private fun getUser() = mutableLiveData
}