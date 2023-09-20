package com.example.moderndashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ClothingActivity::class.java)
            startActivity(intent)
        }
        val electronicCard = findViewById<CardView>(R.id.electronicCard)
        electronicCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ElectronicsActivity::class.java)
            startActivity(intent)
        }
        val homeCard = findViewById<CardView>(R.id.homeCard)
        homeCard.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }
        val BeautyCard = findViewById<CardView>(R.id.beautyCard)
        BeautyCard.setOnClickListener {
            val intent = Intent(this@MainActivity, BeautyActivity::class.java)
            startActivity(intent)
        }
        val PharmacyCard = findViewById<CardView>(R.id.pharmacyCard)
        PharmacyCard.setOnClickListener {
            val intent = Intent(this@MainActivity, PharmacyActivity::class.java)
            startActivity(intent)
        }
        val GroceriesCard = findViewById<CardView>(R.id.groceriesCard)
        GroceriesCard.setOnClickListener {
            val intent = Intent(this@MainActivity, GroceriesActivity::class.java)
            startActivity(intent)
        }
    }
}