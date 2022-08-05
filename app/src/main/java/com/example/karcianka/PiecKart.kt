package com.example.karcianka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PiecKart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piec_kart)

        var faza = 0
        fun podpowiedz(x: Int){
            when (x)
            {
            0->findViewById<TextView>(R.id.HintText).text = getString(R.string.FiveCardStartingText)
            1->findViewById<TextView>(R.id.HintText).text = getString(R.string.FiveCardPhaseOneText)
            }
        }

        val btnNext = findViewById<Button>(R.id.BtnNext)
        btnNext.setOnClickListener{
            if (faza==0)
            faza++
            podpowiedz(faza)
        }

        val btnWstecz = findViewById<Button>(R.id.BtnPrevious)
        btnWstecz.setOnClickListener{
            if (faza==1)
            faza--
            podpowiedz(faza)
        }


    }


}