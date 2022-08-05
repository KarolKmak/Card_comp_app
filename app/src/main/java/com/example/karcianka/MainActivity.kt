package com.example.karcianka

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonGraj: Button = findViewById(R.id.btnGraj)
        buttonGraj.setOnClickListener {
            val intent = Intent(this@MainActivity, WyborGier::class.java)
            startActivity(intent)
        }

        val buttonWczytaj:Button = findViewById(R.id.wczytaj)
        buttonWczytaj.setOnClickListener {
            val intent = Intent(this@MainActivity, Wczytaj::class.java)
            startActivity(intent)
        }


    }

    fun quitApp(view: View) {
        this@MainActivity.finishAffinity()
        exitProcess(0)
    }
}