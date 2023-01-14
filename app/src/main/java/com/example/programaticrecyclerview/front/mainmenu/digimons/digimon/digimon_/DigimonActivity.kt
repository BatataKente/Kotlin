package com.example.programaticrecyclerview.front.mainmenu.digimons.digimon.digimon_

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.programaticrecyclerview.utils.network.models.Digimon

class DigimonActivity : AppCompatActivity() {
    private lateinit var view: DigimonLinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayout()
        setContentView(view)
    }
    private fun setLayout() {
        view = DigimonLinearLayout(this)
        val digimon = intent.getSerializableExtra(Digimon::class.simpleName) as Digimon
        view.setup(digimon)
    }
}