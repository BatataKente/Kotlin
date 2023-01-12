package com.example.programaticrecyclerview.front.mainmenu

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainMenuRecyclerView(context: Context) : RecyclerView(context) {
    companion object {val spanCount = 3}
    init {
        this.layoutManager = GridLayoutManager(context, spanCount)
        this.setHasFixedSize(true)
    }
}