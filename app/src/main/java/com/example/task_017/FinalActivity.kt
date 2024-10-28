package com.example.task_017

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class FinalActivity : AppCompatActivity() {
    private lateinit var finishBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        finishBTN = findViewById(R.id.finishBTN)

        finishBTN.setOnClickListener{
            moveTaskToBack(true);
            exitProcess(-1)
        }
    }
}