package com.example.programaticrecyclerview.front.mainmenu.digimons.digimons_

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.programaticrecyclerview.utils.network.models.Digimons

class DigimonsDisplayAdapter(private val context: Context,
                             private val digimons: Digimons
)
    : RecyclerView.Adapter<DigimonsDisplayAdapter.DigimonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonViewHolder {
        val layout = DigimonsLinearLayout(context)
        return DigimonViewHolder(layout)
    }
    override fun onBindViewHolder(holder: DigimonViewHolder, position: Int) {
        val itemView = holder.itemView as? DigimonsLinearLayout
        itemView?.setup(digimons[position])
    }
    inner class DigimonViewHolder(layout: DigimonsLinearLayout) : ViewHolder(layout)
    override fun getItemCount(): Int = digimons.size

}