package com.example.programaticrecyclerview.utils.extensions.TextView

import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

val TextView.default: TextView
    get() = TextView(context).apply {
        gravity = Gravity.CENTER
        setBackgroundColor(Color.WHITE)
        setTextColor(Color.BLACK)
        setTypeface(null, Typeface.BOLD)
    }