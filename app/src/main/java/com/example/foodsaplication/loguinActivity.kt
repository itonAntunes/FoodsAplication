package com.example.foodsaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class loguinActivity : AppCompatActivity() {

    private lateinit var foods: TextView
    private lateinit var nomeRegisro: TextView
    private lateinit var emailUsuario: EditText
    private lateinit var senhaPrincipal: EditText
    private lateinit var btnLoguin: Button
    private lateinit var btnRegistro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loguin_layout)

        btnRegistro = findViewById(R.id.register)
        btnRegistro.setOnClickListener {

            val intent = Intent(this, Register::class.java)
            Toast.makeText(this, "Preencha todos os Dados", Toast.LENGTH_SHORT).show()

            startActivity(intent)
        }

        btnLoguin = findViewById(R.id.log_in)
        btnLoguin.setOnClickListener {

            val intent = Intent(this, RestaurantesActivity::class.java)
            Toast.makeText(this, "Escolha um Restaurante", Toast.LENGTH_SHORT).show()

            startActivity(intent)


        }
    }
}