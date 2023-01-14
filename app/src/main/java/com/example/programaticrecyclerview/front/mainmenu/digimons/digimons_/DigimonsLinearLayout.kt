package com.example.programaticrecyclerview.front.mainmenu.digimons.digimons_

import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.programaticrecyclerview.front.mainmenu.digimons.digimon.digimon_.DigimonActivity
import com.example.programaticrecyclerview.utils.extensions.Context.getScreenHeight
import com.example.programaticrecyclerview.utils.extensions.Context.getScreenWidth
import com.example.programaticrecyclerview.utils.extensions.Intent.withExtra
import com.example.programaticrecyclerview.utils.extensions.TextView.default
import com.example.programaticrecyclerview.utils.extensions.ViewGroup.addViews
import com.example.programaticrecyclerview.utils.extensions.ViewGroup.setLayoutParams
import com.example.programaticrecyclerview.utils.network.models.Digimon
import com.squareup.picasso.Picasso

class DigimonsLinearLayout(context: Context) : LinearLayout(context) {
    val imageView = ImageView(context).apply {
        setLayoutParams(context.getScreenWidth*2/10, LayoutParams.MATCH_PARENT)
    }
    val nameTextView = TextView(context).default.apply {
        setLayoutParams(context.getScreenWidth*5/10, LayoutParams.MATCH_PARENT)
    }
    val levelTextView = TextView(context).default.apply {
        setLayoutParams(context.getScreenWidth*3/10, LayoutParams.MATCH_PARENT)
    }
    init {
        this.setLayoutParams(LayoutParams.MATCH_PARENT, context.getScreenHeight/7)
        this.addViews(
            arrayOf(imageView, nameTextView, levelTextView)
        )
    }
    fun setup(digimon: Digimon) {
        nameTextView.text = digimon.name
        levelTextView.text = digimon.level
        Picasso.get()
            .load(digimon.img)
            .into(imageView)
        this.setOnClickListener {

//            val budle = Bundle()
//            budle.putSerializable(digimon.javaClass.name, digimon)
            val intent = Intent(context, DigimonActivity().javaClass).withExtra(digimon)
//            intent.putExtras(budle)

            context.startActivity(intent)
        }
    }
}