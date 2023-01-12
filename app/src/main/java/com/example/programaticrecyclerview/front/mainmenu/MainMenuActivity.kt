package com.example.programaticrecyclerview.front.mainmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.programaticrecyclerview.front.red.RedActivity

class MainMenuActivity : AppCompatActivity() {
    val coisas: MutableList<Class<AppCompatActivity>> = mutableListOf(RedActivity().javaClass)
    private lateinit var view: MainMenuRecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadData()
        setContentView(view)
    }
    fun loadData() {
        view = MainMenuRecyclerView(this).apply {
            this.adapter = MainMenuDisplayAdapter(context, coisas)
        }
    }
}