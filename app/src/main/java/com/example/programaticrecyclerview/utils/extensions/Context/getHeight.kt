package com.example.programaticrecyclerview.utils.extensions.Context

import android.content.Context

val Context.getScreenHeight: Int
    get() = this.resources.displayMetrics.heightPixels