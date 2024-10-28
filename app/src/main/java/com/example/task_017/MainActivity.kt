package com.example.task_017

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textTV: TextView
    private lateinit var beginBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTV   = findViewById(R.id.textTV)
        beginBTN = findViewById(R.id.beginBTN)

        beginBTN.setOnClickListener{
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }
    }

}