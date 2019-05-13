package com.example.daggertest.network.login

import com.example.daggertest.models.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LoginApi {
    @GET("users/{id}")
    fun getUsers(@Path("id") id: Int): Call<User>
}
