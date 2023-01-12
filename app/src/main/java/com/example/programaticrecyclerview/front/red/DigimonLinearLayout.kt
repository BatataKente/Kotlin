package com.example.programaticrecyclerview.front.red

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.programaticrecyclerview.utils.extensions.TextView.default

class DigimonLinearLayout(context: Context) : LinearLayout(context) {
    val textView = TextView(context).default
    init {
        this.layoutParams = ViewGroup.LayoutParams(
            LayoutParams.MATCH_PARENT,
            context.resources.displayMetrics.heightPixels / 9
        )
        this.addView(textView)
    }
}