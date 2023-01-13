package com.example.programaticrecyclerview.utils.network.`interface`

import com.example.programaticrecyclerview.utils.network.models.Digimon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface Network {
    @GET("api/digimon")
    fun get(): Call<List<Digimon>>
}

fun <T> Call<T>.call(onSuccess: (response: Response<T>) -> Unit,
                     onError: (t: Throwable) -> Unit) {
    enqueue(object : Callback<T> {
        override fun onResponse(call: Call<T>,
                                response: Response<T>) {
            onSuccess(response)
        }
        override fun onFailure(call: Call<T>,
                               t: Throwable) {
            onError(t)
        }
    })
}