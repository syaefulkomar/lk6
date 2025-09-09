package com.example.kelompok3

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class Activity_kedua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kedua)

        val btnklik = findViewById<Button>(R.id.button)

        btnklik.setOnClickListener {
            val intent = Intent(this, ActivityKetiga::class.java)
            startActivity(intent)
        }
    }
}