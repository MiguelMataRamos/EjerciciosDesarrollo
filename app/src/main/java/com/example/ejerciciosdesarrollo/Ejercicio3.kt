package com.example.ejerciciosdesarrollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)
    }

    private var lista : MutableList<String> = mutableListOf()

    fun pasar(view: View) {
        val intent = Intent(this, Ej3Recibir::class.java)

        intent.putExtra("lista", ArrayList(lista))

        startActivity(intent)
    }

    fun insertar(view: View) {
        val palabra = findViewById<EditText>(R.id.palabra)

        lista.add(palabra.text.toString())

        val texto = findViewById<TextView>(R.id.texto_muestra)

        texto.text = lista.toString()
    }
}