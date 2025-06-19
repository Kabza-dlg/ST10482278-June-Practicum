package com.example.st10482278imadpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlaylistDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist_details)

        val Add = findViewById<Button>(R.id.NextPage)
        val Nextpage = findViewById<Button>(R.id.NextPage)

        Nextpage.setOnClickListener {
            val intent = Intent( this , ReviewPlaylist::class.java)
            startActivity(intent)
        }
    }
}