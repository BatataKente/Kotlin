package com.example.programaticrecyclerview.utils.extensions.Retrofit

import com.example.programaticrecyclerview.utils.network.`interface`.Network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun Retrofit.Builder.prepare(baseURL: String): Network {
    return this
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseURL)
        .build()
        .create(Network::class.java)
}