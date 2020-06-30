package com.example.tmobilechalllenge.network

import com.example.tmobilechalllenge.model.Cards
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("test/home")
    fun getHome(): Call<Cards>
}