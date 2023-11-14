package com.example.ejerciciosdesarrollo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ej2Recibir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej2_recibir)
        val palabra = intent.getStringExtra("TEXTO")
        val numero = intent.getStringExtra("NUMERO")

        val texto = findViewById<TextView>(R.id.texto_recibido)
        val num = findViewById<TextView>(R.id.num_recibido)

        texto.text = palabra
        num.text = numero

    }
}