package com.example.st10482278imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import java.lang.reflect.Modifier as Modifier1

class ReviewPlaylist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId" , "WrongViewCast")

    object CategoryStorage {
        val allCategorySets: MutableList<List<String>> = mutableListOf()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_playlist)

        val Back = findViewById<Button>(R.id.Back)
        val Exit = findViewById<Button>(R.id.Exit)
        val categories = findViewById<EditText>(R.id.categories)




        Back.setOnClickListener {
            val intent = Intent(this , PlaylistDetails::class.java)
            startActivity(intent)
        }

        Exit.setOnClickListener {
            finishAffinity()
        }
    }
}