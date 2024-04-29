package com.example.petapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Code to link Activities using the Intent Class
        var Feed = findViewById<Button>(R.id.btnFeed)
        Feed.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        //Code to link Activities using the Intent Class
        var Clean = findViewById<Button>(R.id.btnClean)
        Clean.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        var play = findViewById<Button>(R.id.btnPlay)
        play.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}

