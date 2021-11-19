package com.example.foodsaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class RestaurantesActivity : AppCompatActivity() {

    lateinit var fogazzaBeth: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurantes)


        fogazzaBeth = findViewById(R.id.fogazza_beth)
        fogazzaBeth.setOnClickListener {

            val intent = Intent(this, CardapioTest::class.java)

            startActivity(intent)
        }
    }
}