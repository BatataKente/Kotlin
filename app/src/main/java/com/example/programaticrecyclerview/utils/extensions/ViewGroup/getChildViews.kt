package com.example.programaticrecyclerview.utils.extensions.ViewGroup

import android.view.View
import android.view.ViewGroup

val ViewGroup.childViews: List<View>
    get() = (0 until this.childCount).map {
        this.getChildAt(it)
    }