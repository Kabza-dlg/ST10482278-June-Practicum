package com.example.st10482278imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PlaylistDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    object CategoryStorage {
        val allCategorySets: MutableList<List<String>> = mutableListOf()
    }

    @SuppressLint("CutPasteId" , "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist_details)

        val Add = findViewById<Button>(R.id.Add)
        val reviewplaylist = findViewById<Button>(R.id.reviewplaylist)
        val editTexts = listOf<EditText>(
            findViewById(R.id.SongTitle),
            findViewById(R.id.ArtistName),
            findViewById(R.id.Rating),
            findViewById(R.id.Comment)
        )


        Add.setOnClickListener {
            val categories = editTexts.map { it.text.toString().trim() }

            if (categories.any { it.isEmpty() }) {
                Toast.makeText(this, "Please fill all categories", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            CategoryStorage.allCategorySets.add(categories)
            Toast.makeText(this, "Category Set Added", Toast.LENGTH_SHORT).show()

            // Clear input fields
            editTexts.forEach { it.text.clear() }
        }



        reviewplaylist.setOnClickListener {
            val categories = editTexts.map { it.text.toString().trim() }

            val intent = Intent(this, ReviewPlaylist::class.java)
            intent.putStringArrayListExtra("category_list", ArrayList(categories))
            startActivity(intent)
        }
    }
}