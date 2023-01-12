package com.example.programaticrecyclerview.front.red

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class DigimonDisplayAdapter(private val context: Context,
                            private val values: MutableList<Int>)
    : RecyclerView.Adapter<DigimonDisplayAdapter.DigimonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonViewHolder {
        val layout = DigimonLinearLayout(context)
        return DigimonViewHolder(layout)
    }
    override fun onBindViewHolder(holder: DigimonViewHolder, position: Int) {
        val itemView = holder.itemView as? DigimonLinearLayout
        itemView?.textView?.text = values[position].toString()
    }
    inner class DigimonViewHolder(layout: DigimonLinearLayout) : ViewHolder(layout)
    override fun getItemCount(): Int = values.size
}