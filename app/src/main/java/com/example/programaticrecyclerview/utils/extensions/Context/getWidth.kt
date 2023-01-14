package com.example.programaticrecyclerview.utils.extensions.Context

import android.content.Context

val Context.getScreenWidth: Int
    get() = this.resources.displayMetrics.widthPixels