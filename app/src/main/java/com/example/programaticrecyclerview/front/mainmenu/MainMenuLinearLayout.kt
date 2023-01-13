package com.example.programaticrecyclerview.front.mainmenu

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.programaticrecyclerview.utils.extensions.TextView.default

class MainMenuLinearLayout(context: Context) : LinearLayout(context) {
    val textView = TextView(context).default.apply {
        layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT
        )
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