package com.example.programaticrecyclerview.front.mainmenu.digimons.digimon.digimon_

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.programaticrecyclerview.utils.extensions.Context.getScreenHeight
import com.example.programaticrecyclerview.utils.extensions.TextView.default
import com.example.programaticrecyclerview.utils.extensions.ViewGroup.addViews
import com.example.programaticrecyclerview.utils.extensions.ViewGroup.setLayoutParams
import com.example.programaticrecyclerview.utils.network.models.Digimon
import com.squareup.picasso.Picasso

class DigimonLinearLayout(context: Context) : LinearLayout(context) {
    var imageView = ImageView(context).apply {
        setLayoutParams(LayoutParams.MATCH_PARENT, context.getScreenHeight/3)
    }
    var textView = TextView(context).default.apply {
        setLayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
    }
    init {
        this.setBackgroundColor(Color.WHITE)
        this.orientation = VERTICAL
        this.addViews(
            arrayOf(
                imageView,
                textView
            )
        )
        this.gravity = Gravity.CENTER
    }
    fun setup(digimon: Digimon) {
        Picasso.get()
            .load(digimon.img)
            .into(imageView)
        textView.text = digimon.name
    }
}