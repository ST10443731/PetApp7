package com.example.petapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //Code to link Activities using the Intent Class
        var Home = findViewById<Button>(R.id.btnHome4)
        Home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //Code to link Activities using the Intent Class
        var Feed = findViewById<Button>(R.id.btnFeed4)
        Feed.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        var Clean = findViewById<Button>(R.id.btnClean4)
        Clean.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}