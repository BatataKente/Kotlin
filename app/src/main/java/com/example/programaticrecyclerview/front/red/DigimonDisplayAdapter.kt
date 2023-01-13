package com.example.programaticrecyclerview.front.red

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.programaticrecyclerview.utils.network.`interface`.Network
import com.example.programaticrecyclerview.utils.network.models.Digimon
import com.example.programaticrecyclerview.utils.network.models.Digimons
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DigimonDisplayAdapter(private val context: Context,
                            private val digimons: Digimons
)
    : RecyclerView.Adapter<DigimonDisplayAdapter.DigimonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonViewHolder {
        val layout = DigimonLinearLayout(context)
        return DigimonViewHolder(layout)
    }
    override fun onBindViewHolder(holder: DigimonViewHolder, position: Int) {
        val itemView = holder.itemView as? DigimonLinearLayout
        itemView?.nameTextView?.text = digimons[position].name
    }
    inner class DigimonViewHolder(layout: DigimonLinearLayout) : ViewHolder(layout)
    override fun getItemCount(): Int = digimons.size

}