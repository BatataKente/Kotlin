package com.example.programaticrecyclerview.utils.extensions.javaClass

import androidx.appcompat.app.AppCompatActivity

val AppCompatActivity.lastName: String
    get() = this.javaClass.name.split(".").last()