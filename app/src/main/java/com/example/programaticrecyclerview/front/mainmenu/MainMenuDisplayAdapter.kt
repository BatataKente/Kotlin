package com.example.programaticrecyclerview.front.mainmenu

import android.content.Context
import android.content.Intent
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.programaticrecyclerview.utils.extensions.javaClass.lastName

class MainMenuDisplayAdapter(private val context: Context,
                             private val values: MutableList<AppCompatActivity>)
    : RecyclerView.Adapter<MainMenuDisplayAdapter.MainMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMenuViewHolder {
        val mainMenuLinearLayout = MainMenuLinearLayout(context)
        return MainMenuViewHolder(mainMenuLinearLayout)
    }
    override fun onBindViewHolder(holder: MainMenuViewHolder, position: Int) {
        val itemView = holder.itemView as? MainMenuLinearLayout
        itemView?.textView?.text = values[position].lastName
        itemView?.textView?.setOnClickListener {
            context.startActivity(
                Intent(context, values[position].javaClass)
            )
        }
    }
    override fun getItemCount(): Int = values.size
    inner class MainMenuViewHolder(layout: MainMenuLinearLayout) : ViewHolder(layout)
}