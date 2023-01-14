package com.example.programaticrecyclerview.utils.extensions.ViewGroup

import android.view.View
import android.view.ViewGroup

fun ViewGroup.addViews(views: Array<View>) {
    for (view in views) {
        this.addView(view)
    }
}