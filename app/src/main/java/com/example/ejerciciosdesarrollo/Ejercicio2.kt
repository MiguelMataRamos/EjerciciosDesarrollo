package com.example.ejerciciosdesarrollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

    }


    fun iniciarVista(view :View){
        val intent = Intent(this,Ej2Recibir::class.java)

        val palabra = findViewById<EditText>(R.id.palabra)
        val numero = findViewById<EditText>(R.id.num)

        val texto = palabra.text.toString()
        val n = numero.text.toString()

        intent.putExtra("NUMERO",n)
        intent.putExtra("TEXTO",texto)

        startActivity(intent)
    }
}