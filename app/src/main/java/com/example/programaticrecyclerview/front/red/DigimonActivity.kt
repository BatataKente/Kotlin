package com.example.programaticrecyclerview.front.red

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DigimonActivity : AppCompatActivity() {
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
            setHasFixedSize(true)
            adapter = DigimonDisplayAdapter(context, mutableListOf(1,2,3,4,5,6,7,8,9))
        }
    }
}