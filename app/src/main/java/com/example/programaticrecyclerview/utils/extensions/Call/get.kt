package com.example.programaticrecyclerview.utils.extensions.Call

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun <T> Call<T>.get(onSuccess: (response: Response<T>) -> Unit,
                     onError: (t: Throwable) -> Unit) {
    enqueue(object : Callback<T> {
        override fun onResponse(call: Call<T>,
                                response: Response<T>
        ) {
            onSuccess(response)
        }
        override fun onFailure(call: Call<T>,
                               t: Throwable) {
            onError(t)
        }
    })
}