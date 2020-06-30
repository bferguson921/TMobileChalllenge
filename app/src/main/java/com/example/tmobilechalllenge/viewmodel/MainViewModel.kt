package com.example.tmobilechalllenge.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmobilechalllenge.model.Cards
import com.example.tmobilechalllenge.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    private val apiService = ApiService().createApiService()

    fun getHome(): MutableLiveData<Cards> {
        val cards = MutableLiveData<Cards>()

        apiService.getHome().enqueue(object: Callback<Cards> {
            override fun onFailure(call: Call<Cards>, t: Throwable) {
                Log.d("GET_HOME", "ERROR: FAILED TO GET HOME")
                cards.postValue(null)
            }

            override fun onResponse(call: Call<Cards>, response: Response<Cards>) {
                cards.postValue(response.body())
            }
        })

        return cards
    }
}

