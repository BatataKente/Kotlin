package com.example.programaticrecyclerview.utils.network.`interface`

import com.example.programaticrecyclerview.utils.network.models.Digimons
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface Network {
    @GET("api/digimon")
    fun toCallDigimons(): Call<Digimons>
}