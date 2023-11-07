package com.example.ejerciciosdesarrollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var intent : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun iniciarVista (vista : View){
        when(vista.id){
            R.id.ej1 ->  { intent = Intent(this,Ejercicio1::class.java)
                            startActivity(intent)
            }
            R.id.ej2 -> { intent = Intent(this, Ejercicio2::class.java)
                            startActivity(intent)
            }
            R.id.ej3 -> {intent = Intent(this, Ejercicio3::class.java)
                            startActivity(intent)
            }

        }

    }

}

