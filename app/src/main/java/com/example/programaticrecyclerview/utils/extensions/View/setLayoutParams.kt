package com.example.programaticrecyclerview.utils.extensions.ViewGroup

import android.view.View
import android.view.ViewGroup

fun View.setLayoutParams(width: Int, height: Int): ViewGroup.LayoutParams {
    this.layoutParams = ViewGroup.LayoutParams(width, height)
    return this.layoutParams
}

fun View.setLayoutParams(size: Int): ViewGroup.LayoutParams {
    this.layoutParams = ViewGroup.LayoutParams(size, size)
    return this.layoutParams
}