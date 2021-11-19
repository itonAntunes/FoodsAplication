package com.example.foodsaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Register : AppCompatActivity() {
    lateinit var nomeUsuario: EditText
    lateinit var emailUsuario: EditText
    lateinit var senhaPrincipal: EditText
    lateinit var confirmaSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}