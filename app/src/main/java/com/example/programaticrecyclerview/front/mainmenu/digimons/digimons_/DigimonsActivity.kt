package com.example.programaticrecyclerview.front.mainmenu.digimons.digimons_

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.programaticrecyclerview.utils.extensions.Call.get
import com.example.programaticrecyclerview.utils.extensions.Retrofit.prepare
import com.example.programaticrecyclerview.utils.extensions.AppCompatActivity.lastName
import com.example.programaticrecyclerview.utils.network.models.Digimons
import retrofit2.Retrofit

class DigimonsActivity : AppCompatActivity() {
    var digimons = Digimons()
    private lateinit var view: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayout()
        setContentView(view)
    }
    private fun setLayout() {
        view = RecyclerView(this).apply {
            setBackgroundColor(Color.WHITE)
            layoutManager = LinearLayoutManager(context)
        }
        Retrofit.Builder()
            .prepare("https://digimon-api.vercel.app/")
            .toCallDigimons().get(
            onSuccess = {response ->
                response.body()?.let {digimons.addAll(it)}
                view.adapter = DigimonsDisplayAdapter(this, digimons)
            },
            onError = {error ->
                Log.d(this.lastName, "ERROR: "+error.message)
            }
        )
    }
}