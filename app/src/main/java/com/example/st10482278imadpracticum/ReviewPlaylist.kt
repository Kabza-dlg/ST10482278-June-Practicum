package com.example.st10482278imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class ReviewPlaylist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_playlist)

        val MainPage = findViewById<Button>(R.id.MainPage)
        val Exit = findViewById<Button>(R.id.Exit)
        val Details = findViewById<Button>(R.id.Details)

        Details.setOnClickListener {
            val playlist = intent.getStringArrayListExtra("category_list")

            if (playlist.isNullOrEmpty()) {
                Toast.makeText(this , "No items received" , Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val listView = findViewById<ListView>(R.id.PlaylistView)

            val adapter = ArrayAdapter(
                this ,
                android.R.layout.simple_list_item_1 ,
                playlist
            )
            listView.adapter = adapter
        }



        MainPage.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        Exit.setOnClickListener {
            finishAffinity()
        }



            }
        }

