package com.example.restauranteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnCerrar: Button
    lateinit var btnContinuar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCerrar = findViewById(R.id.btnCerrar)
        btnContinuar = findViewById(R.id.btnContinuar)

        //Eventos
        btnContinuar.setOnClickListener {
            llamarLogin()
        }

        btnCerrar.setOnClickListener {
            finish()
        }

    }

    fun llamarLogin(){
        val pantallaLogin = Intent(this, Login::class.java)
        startActivity(pantallaLogin)
    }

}