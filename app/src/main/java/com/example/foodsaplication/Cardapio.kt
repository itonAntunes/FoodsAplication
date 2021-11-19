package com.example.foodsaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Cardapio : AppCompatActivity() {
    lateinit var fogazza: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)
        fogazza = findViewById(R.id.beth)
    }
}