package com.example.programaticrecyclerview.front.mainmenu.mainmenu_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.programaticrecyclerview.front.mainmenu.digimons.digimons_.DigimonsActivity

class MainMenuActivity : AppCompatActivity() {
    val activities: MutableList<AppCompatActivity> = mutableListOf(
        DigimonsActivity()
    )
    private lateinit var view: MainMenuRecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadData()
        setContentView(view)
    }
    fun loadData() {
        view = MainMenuRecyclerView(this).apply {
            adapter = MainMenuDisplayAdapter(context, activities)
        }
    }
}