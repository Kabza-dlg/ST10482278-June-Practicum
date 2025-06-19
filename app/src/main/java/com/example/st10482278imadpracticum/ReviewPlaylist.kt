package com.example.st10482278imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ReviewPlaylist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_playlist)

        val allCategorySets: MutableList<List<String>> = mutableListOf()
        val MainPage = findViewById<Button>(R.id.MainPage)
        val Exit = findViewById<Button>(R.id.Exit)
        val Average = findViewById<Button>(R.id.Average)
        val Details = findViewById<Button>(R.id.Details)

        Details.setOnClickListener {
        }

        MainPage.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        Exit.setOnClickListener {
            finishAffinity()
        }

        Average.setOnClickListener {
            val
        }
    }
}