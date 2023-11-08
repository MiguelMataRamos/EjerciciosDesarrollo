package com.example.ejerciciosdesarrollo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Ej3Recibir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej3_recibir)

        var lista = intent.getStringArrayListExtra("lista")

        Log.v("lista", lista.toString())

        var texto = findViewById<TextView>(R.id.ej3_texto)

        texto.text = lista.toString()


    }
}