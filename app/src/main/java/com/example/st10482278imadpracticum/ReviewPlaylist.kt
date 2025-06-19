package com.example.st10482278imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class ReviewPlaylist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_playlist)

        val Back = findViewById<Button>(R.id.Back)
        val Exit = findViewById<Button>(R.id.Exit)

        Back.setOnClickListener {
            val intent = Intent( this , PlaylistDetails::class.java)
            startActivity(intent)
        }

        Exit.setOnClickListener {
            finishAffinity()
        }
    }
}