package com.example.ejerciciosdesarrollo

import android.app.Activity
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text


class Ej4Recibir : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej4_recibir)
        val pais: Ejercicio4.Pais = intent.getParcelableExtra("pais")?: Ejercicio4.Pais("DEFECTO",0,"NADA")

        val nombre = findViewById<TextView>(R.id.pais)
        val habitantes = findViewById<TextView>(R.id.habitantes)
        val foto = findViewById<ImageView>(R.id.bandera)


        nombre.text = pais.nombre

        if (pais.bandera=="bandera_espana"){
            val texto = "Numero de ¡ESPAÑOLES!: " + pais.habitantes.toString()
            habitantes.text = texto
            foto.setImageResource(R.drawable.bandera_espana)
        }else{
            val texto = "Numero de Franchutes: " + pais.habitantes.toString()
            habitantes.text = texto
            foto.setImageResource(R.drawable.bandera_francia)
        }

    }
}