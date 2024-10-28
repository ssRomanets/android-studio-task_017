package com.example.task_017

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageActivity : AppCompatActivity() {

    private lateinit var imageViewTV: ImageView
    private lateinit var buttonBTN: Button

    var numPhoto:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        imageViewTV = findViewById(R.id.imageViewTV)
        imageViewTV.setImageResource(R.drawable.image1)

        buttonBTN = findViewById(R.id.buttonBTN)
        buttonBTN.setOnClickListener{
            ++numPhoto;
            when(numPhoto) {
                2 -> imageViewTV.setImageResource(R.drawable.image2)
                3 -> imageViewTV.setImageResource(R.drawable.image3)
                4 -> imageViewTV.setImageResource(R.drawable.image4)
                5 -> {
                    imageViewTV.setImageResource(R.drawable.image5)
                    buttonBTN.text = "Окончание просмотра."
                }
                else -> {
                    val intent = Intent(this, FinalActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}