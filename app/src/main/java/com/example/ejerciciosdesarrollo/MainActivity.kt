package com.example.ejerciciosdesarrollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var intent : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun iniciarVista (vista : View){
        when(vista.id){
            R.id.ej1 ->  { intent = Intent(this,Ejercicio1::class.java)
                            startActivity(intent) }

        }

    }

}

