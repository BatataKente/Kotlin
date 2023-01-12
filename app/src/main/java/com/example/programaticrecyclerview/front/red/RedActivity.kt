package com.example.programaticrecyclerview.front.red

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class RedActivity : AppCompatActivity() {
    private lateinit var view: ViewGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayout()
        setContentView(view)
    }
    private fun setLayout() {
        view = ConstraintLayout(this).apply {
            setBackgroundColor(Color.RED)
        }
    }
}