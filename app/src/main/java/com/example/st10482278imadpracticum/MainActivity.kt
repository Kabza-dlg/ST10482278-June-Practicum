package com.example.st10482278imadpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val PlayListPage1 = findViewById<Button>(R.id.PlayListPage1)

        PlayListPage1.setOnClickListener {
            val intent = Intent( this , PlaylistDetails::class.java)
            startActivity(intent)
        }
    }
}