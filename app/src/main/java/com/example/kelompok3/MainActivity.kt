package com.example.kelompok3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnaksi = findViewById<Button>(R.id.button2)

        btnaksi.setOnClickListener {
            val intent = Intent(this, ActivityKetiga::class.java)
            startActivity(intent)
        }


    }
}