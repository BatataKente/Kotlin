package com.example.programaticrecyclerview.front.red

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.programaticrecyclerview.utils.extensions.javaClass.lastName
import com.example.programaticrecyclerview.utils.network.`interface`.Network
import com.example.programaticrecyclerview.utils.network.`interface`.call
import com.example.programaticrecyclerview.utils.network.models.Digimon
import com.example.programaticrecyclerview.utils.network.models.Digimons
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.Console

class DigimonActivity : AppCompatActivity() {
    var digimons = Digimons()
    private lateinit var view: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayout()
        setContentView(view)
    }
    private fun setLayout() {
        view = RecyclerView(this).apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = DigimonDisplayAdapter(context, digimons)
        }
        val builder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://digimon-api.vercel.app/")
            .build()
            .create(Network::class.java)
        builder.get().call(
            onSuccess = {response ->
                response.body()?.let {digimons.addAll(it)}
                view.adapter?.notifyDataSetChanged()
            },
            onError = {error ->
                Log.d(this.lastName, "ERROR: "+error.message)
            }
        )
//        loadData()
    }
//    fun loadData() {
//        val builder = Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl("https://digimon-api.vercel.app/")
//            .build()
//            .create(Network::class.java)
//        val result = builder.get()
//        result.enqueue(
//            object : Callback<List<Digimon>?> {
//                override fun onResponse(
//                    call: Call<List<Digimon>?>,
//                    response: Response<List<Digimon>?>
//                ) {
//                    response.body()?.let {digimons.addAll(it)}
//                    view.adapter?.notifyDataSetChanged()
//                }
//                override fun onFailure(call: Call<List<Digimon>?>, t: Throwable) {
//
//                }
//            }
//        )
//    }
}