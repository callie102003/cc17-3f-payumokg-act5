package com.example.artapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Array of image resources, descriptions, and authors
    private val images = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5
    )

    private val descriptions = arrayOf(
        "A beautiful sunset over the ocean.",
        "A strong resemblance to many Renaissance depictions of the Virgin Mary.",
        "Symbolizes the dignity and resilience of Filipino agricultural workers.",
        "Depicts a scene in a Roman amphitheatre.",
        "Be sure you recognize and appreciate the small things."
    )

    private val authors = arrayOf(
        "Painted by latifa hachem",
        "Painted by Leonardo da Vinci",
        "Artwork by Fernando Amorsolo",
        "Painted by Juan Luna",
        "Painted by Fernando Amorsolo"
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val descriptionText: TextView = findViewById(R.id.descriptionText)
        val authorText: TextView = findViewById(R.id.authorText)

        // Initialize with the first image
        imageView.setImageResource(images[currentIndex])
        descriptionText.text = descriptions[currentIndex]
        authorText.text = authors[currentIndex]

        // Set up click listeners to switch images
        imageView.setOnClickListener {
            currentIndex = (currentIndex + 1) % images.size
            imageView.setImageResource(images[currentIndex])
            descriptionText.text = descriptions[currentIndex]
            authorText.text = authors[currentIndex]
        }
    }
}
