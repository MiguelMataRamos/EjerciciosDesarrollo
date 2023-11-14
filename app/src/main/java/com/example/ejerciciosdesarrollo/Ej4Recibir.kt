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
        var pais: Ejercicio4.Pais = intent.getParcelableExtra("pais")?: Ejercicio4.Pais("DEFECTO",0,"NADA")

        var nombre = findViewById<TextView>(R.id.pais)
        var habitantes = findViewById<TextView>(R.id.habitantes)
        var foto = findViewById<ImageView>(R.id.bandera)


        nombre.text = pais.nombre

        if (pais.bandera=="bandera_espana"){
            habitantes.text = "¡Numero de ESPAÑOLES!: " + pais.habitantes.toString()
            foto.setImageResource(R.drawable.bandera_espana)
        }else{
            habitantes.text = "Numero de Franchutes: " + pais.habitantes.toString()
            foto.setImageResource(R.drawable.bandera_francia)
        }

    }
}