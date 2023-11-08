package com.example.ejerciciosdesarrollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)
    }
    class Pais{
        var nombre

    }

    fun pasarPais(view: View) {
        when (view.id){
            R.id.b_españa -> {var intent = Intent(this,Ej5Recibir::class.java)


            }
            R.id.b_francia -> {

            }
        }
    }
}