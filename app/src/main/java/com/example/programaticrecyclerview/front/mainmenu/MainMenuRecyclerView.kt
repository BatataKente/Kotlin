package com.example.programaticrecyclerview.front.mainmenu

import android.content.Context
import android.graphics.Color
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainMenuRecyclerView(context: Context) : RecyclerView(context) {
    init {
        this.layoutManager = GridLayoutManager(context, 2)
        this.setHasFixedSize(true)
    }
}