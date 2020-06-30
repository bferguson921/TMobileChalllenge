package com.example.tmobilechalllenge.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://private-8ce77c-tmobiletest.apiary-mock.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun createApiService(): ApiInterface {
        return retrofit.create(ApiInterface::class.java)
    }
}