package com.example.ejerciciosdesarrollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import kotlinx.android.parcel.Parcelize


class Ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

    }

    @Parcelize
    data class Pais(val nombre:String, val habitantes:Int, val bandera:String) : Parcelable

    fun pasarPais(view: View) {
        var intent = Intent(this,Ej4Recibir::class.java)

        when (view.id){
            R.id.b_españa -> {
                var pais = Pais("España", 400000, "bandera_espana")
                intent.putExtra("pais",pais)
                startActivity(intent)


            }
            R.id.b_francia -> {
                var pais = Pais("Francia", 200000, "bandera_francia")
                intent.putExtra("pais",pais)
                startActivity(intent)
            }
        }
    }
}