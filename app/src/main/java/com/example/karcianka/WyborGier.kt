package com.example.karcianka

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WyborGier : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wybor_gier)


        val buttonGraj: Button = findViewById(R.id.btnPiecKart)
        buttonGraj.setOnClickListener {
            val intent = Intent(this@WyborGier, PiecKart::class.java)
            startActivity(intent)
        }
    }
}