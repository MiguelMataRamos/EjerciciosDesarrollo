package com.example.ejerciciosdesarrollo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.random.Random

class Ejercicio1 : AppCompatActivity() {

    private var tablero2 = mutableListOf(0,0,0,0,0,0,0,0,0)
    private var terminado = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)


    }

    fun comprobarFin():Boolean{
        for (i in tablero2){
            if (i == 0){
                return  false
            }
        }
        return true
    }

    fun clik (view:View){
        if (!terminado){
            var jugador = true
            var maquina = true


                when (view.id){
                    R.id.b1 -> {
                        val b1 = findViewById<ImageView>(R.id.b1)
                        if (tablero2[0]==0){
                            b1.setImageResource(R.drawable.x)
                            tablero2[0] = 1
                            jugador = false
                        }


                    }

                    R.id.b2 -> {
                        val b2 = findViewById<ImageView>(R.id.b2)
                        if (tablero2[1]==0){
                            b2.setImageResource(R.drawable.x)
                            tablero2[1] = 1
                            jugador = false
                        }


                    }

                    R.id.b3 -> {
                        val b3 = findViewById<ImageView>(R.id.b3)
                        if (tablero2[2]==0){
                            b3.setImageResource(R.drawable.x)
                            tablero2[2] = 1
                            jugador = false
                        }


                    }

                    R.id.b4 -> {
                        val b4 = findViewById<ImageView>(R.id.b4)
                        if (tablero2[3]==0){
                            b4.setImageResource(R.drawable.x)
                            tablero2[3] = 1
                            jugador = false
                        }


                    }

                    R.id.b5 -> {
                        val b5 = findViewById<ImageView>(R.id.b5)
                        if (tablero2[4] == 0) {
                            b5.setImageResource(R.drawable.x)
                            tablero2[4] = 1
                            jugador = false
                        }
                    }

                    R.id.b6 -> {
                        val b6 = findViewById<ImageView>(R.id.b6)
                        if (tablero2[5] == 0) {
                            b6.setImageResource(R.drawable.x)
                            tablero2[5] = 1
                            jugador = false
                        }
                    }

                    R.id.b7 -> {
                        val b7 = findViewById<ImageView>(R.id.b7)
                        if (tablero2[6] == 0) {
                            b7.setImageResource(R.drawable.x)
                            tablero2[6] = 1
                            jugador = false
                        }
                    }

                    R.id.b8 -> {
                        val b8 = findViewById<ImageView>(R.id.b8)
                        if (tablero2[7] == 0) {
                            b8.setImageResource(R.drawable.x)
                            tablero2[7] = 1
                            jugador = false
                        }
                    }

                    R.id.b9 -> {
                        val b9 = findViewById<ImageView>(R.id.b9)
                        if (tablero2[8] == 0) {
                            b9.setImageResource(R.drawable.x)
                            tablero2[8] = 1
                            jugador = false
                        }
                    }

                    else -> jugador = false

                }



            while (maquina && !jugador){
                var aleatorio = Random.nextInt(9)
                when (aleatorio){
                    0 -> {
                        if (tablero2[0]==0){
                            val b1 = findViewById<ImageView>(R.id.b1)
                            b1.setImageResource(R.drawable.o)
                            tablero2[0] = -1
                            maquina = false
                        }
                    }

                    1 -> {
                        if (tablero2[1]==0){
                            val b2 = findViewById<ImageView>(R.id.b2)
                            b2.setImageResource(R.drawable.o)
                            tablero2[1] = -1
                            maquina = false
                        }

                    }

                    2 -> {
                        if (tablero2[2]==0){
                            val b3 = findViewById<ImageView>(R.id.b3)
                            tablero2[2] = -1
                            b3.setImageResource(R.drawable.o)
                            maquina = false
                        }

                    }

                    3 -> {
                        if (tablero2[3]==0){
                            val b4 = findViewById<ImageView>(R.id.b4)
                            b4.setImageResource(R.drawable.o)
                            tablero2[3] = -1
                            maquina = false
                        }

                    }

                    4 -> {
                        if (tablero2[4]==0){
                            val b5 = findViewById<ImageView>(R.id.b5)
                            b5.setImageResource(R.drawable.o)
                            tablero2[4] = -1
                            maquina = false
                        }
                    }

                    5 -> {
                        if (tablero2[5]==0){
                            val b6 = findViewById<ImageView>(R.id.b6)
                            b6.setImageResource(R.drawable.o)
                            tablero2[5] = -1
                            maquina = false
                        }

                    }

                    6 -> {
                        if (tablero2[6]==0){
                            val b7 = findViewById<ImageView>(R.id.b7)
                            b7.setImageResource(R.drawable.o)
                            tablero2[6] = -1
                            maquina = false
                        }

                    }

                    7 -> {
                        if (tablero2[7]==0){
                            val b8 = findViewById<ImageView>(R.id.b8)
                            b8.setImageResource(R.drawable.o)
                            tablero2[7] = -1
                            maquina = false
                        }

                    }

                    8 -> {
                        if (tablero2[8]==0){
                            val b9 = findViewById<ImageView>(R.id.b9)
                            b9.setImageResource(R.drawable.o)
                            tablero2[8] = -1
                            maquina = false
                        }

                    }

                }


            }

        }




    }

    fun reset(){
        recreate()
    }

}





