package com.example.programaticrecyclerview.front.red

import android.content.Context
import android.graphics.Color
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.programaticrecyclerview.utils.extensions.TextView.default
import com.example.programaticrecyclerview.utils.extensions.ViewGroup.addViews

class DigimonLinearLayout(context: Context) : LinearLayout(context) {
    val imageView = ImageView(context).apply {
        setBackgroundColor(Color.RED)
        layoutParams = LayoutParams(
            context.resources.displayMetrics.widthPixels*2/10, LayoutParams.MATCH_PARENT
        )
    }
    val nameTextView = TextView(context).default.apply {
        setBackgroundColor(Color.BLUE)
        layoutParams = LayoutParams(
            context.resources.displayMetrics.widthPixels*5/10, LayoutParams.MATCH_PARENT
        )
    }
    val levelTextView = TextView(context).default.apply {
        setBackgroundColor(Color.GREEN)
        layoutParams = LayoutParams(
            context.resources.displayMetrics.widthPixels*3/10, LayoutParams.MATCH_PARENT
        )
    }
    init {
        this.layoutParams = ViewGroup.LayoutParams(
            LayoutParams.MATCH_PARENT,
            context.resources.displayMetrics.heightPixels/7
        )
        this.addViews(
            arrayOf(imageView, nameTextView, levelTextView)
        )
    }
}