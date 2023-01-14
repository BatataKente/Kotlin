package com.example.programaticrecyclerview.utils.extensions.Intent

import android.content.Intent
import android.os.Bundle
import com.google.gson.Gson
import java.io.Serializable

fun Intent.withExtra(serializable: Serializable): Intent {
    val budle = Bundle()
    budle.putSerializable(serializable.javaClass.simpleName, serializable)
    this.putExtras(budle)
    return this
}