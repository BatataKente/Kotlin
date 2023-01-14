package com.example.programaticrecyclerview.front.mainmenu.mainmenu_

import android.content.Context
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MainMenuDisplayAdapter(private val context: Context,
                             private val activities: MutableList<AppCompatActivity>)
    : RecyclerView.Adapter<MainMenuDisplayAdapter.MainMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMenuViewHolder {
        val mainMenuLinearLayout = MainMenuLinearLayout(context)
        return MainMenuViewHolder(mainMenuLinearLayout)
    }
    override fun onBindViewHolder(holder: MainMenuViewHolder, position: Int) {
        val itemView = holder.itemView as? MainMenuLinearLayout
        itemView?.setup(activities[position])
    }
    override fun getItemCount(): Int = activities.size
    inner class MainMenuViewHolder(layout: MainMenuLinearLayout) : ViewHolder(layout)
}