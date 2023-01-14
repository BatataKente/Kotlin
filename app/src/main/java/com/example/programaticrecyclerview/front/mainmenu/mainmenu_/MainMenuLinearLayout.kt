package com.example.programaticrecyclerview.front.mainmenu.mainmenu_

import android.content.Context
import android.content.Intent
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.programaticrecyclerview.utils.extensions.Context.getScreenWidth
import com.example.programaticrecyclerview.utils.extensions.TextView.default
import com.example.programaticrecyclerview.utils.extensions.ViewGroup.setLayoutParams
import com.example.programaticrecyclerview.utils.extensions.AppCompatActivity.lastName

class MainMenuLinearLayout(context: Context) : LinearLayout(context) {
    val textView = TextView(context).default.apply {
        setLayoutParams(LayoutParams.MATCH_PARENT)
    }
    init {
        this.id = generateViewId()
        this.setLayoutParams(
            LayoutParams.MATCH_PARENT,
            context.getScreenWidth/ MainMenuRecyclerView.spanCount /2
        )
        this.orientation = VERTICAL
        this.addView(textView)
    }
    fun setup(activity: AppCompatActivity) {
        textView.text = activity.lastName
        this.setOnClickListener {
            context.startActivity(
                Intent(context, activity.javaClass)
            )
        }
    }
}