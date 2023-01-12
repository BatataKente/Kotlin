package com.example.programaticrecyclerview.front.mainmenu

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MainMenuLinearLayout(context: Context) : LinearLayout(context) {
    val textView = TextView(context).apply {
        gravity = Gravity.CENTER
        layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT
        )
        setBackgroundColor(Color.WHITE)
        setTextColor(Color.BLACK)
        setTypeface(null, Typeface.BOLD)
    }
    init {
        this.id = generateViewId()
        this.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            context.resources.displayMetrics.widthPixels/MainMenuRecyclerView.spanCount/2
        )
        this.orientation = VERTICAL
        this.addView(textView)
    }
}