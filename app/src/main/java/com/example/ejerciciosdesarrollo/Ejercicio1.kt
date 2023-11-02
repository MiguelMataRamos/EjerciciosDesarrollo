package com.example.ejerciciosdesarrollo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class Ejercicio1 : AppCompatActivity() {
    var tablero = mutableListOf(mutableListOf(0,0,0),
                    mutableListOf(0,0,0),
                    mutableListOf(0,0,0))

    var tablero2 = mutableListOf(0,0,0,0,0,0,0,0,0)
    var terminado = false
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

            while (jugador){
                when (view.id){
                    R.id.b1 -> {var b1 = findViewById<ImageView>(R.id.b1)
                        if (tablero2[0]==0){
                            b1.setImageResource(R.drawable.x)
                            tablero2[0] = 1
                            jugador = false
                        }


                    }

                    R.id.b2 -> {var b2 = findViewById<ImageView>(R.id.b2)
                        if (tablero2[1]==0){
                            b2.setImageResource(R.drawable.x)
                            tablero2[1] = 1
                            jugador = false
                        }


                    }

                    R.id.b3 -> {var b3 = findViewById<ImageView>(R.id.b3)
                        if (tablero2[2]==0){
                            b3.setImageResource(R.drawable.x)
                            tablero2[2] = 1
                            jugador = false
                        }


                    }

                    R.id.b4 -> {var b4 = findViewById<ImageView>(R.id.b4)
                        if (tablero2[3]==0){
                            b4.setImageResource(R.drawable.x)
                            tablero2[3] = 1
                            jugador = false
                        }


                    }

                    R.id.b5 -> { var b5 = findViewById<ImageView>(R.id.b5)
                        if (tablero2[4] == 0) {
                            b5.setImageResource(R.drawable.x)
                            tablero2[4] = 1
                            jugador = false
                        }
                    }

                    R.id.b6 -> { var b6 = findViewById<ImageView>(R.id.b6)
                        if (tablero2[5] == 0) {
                            b6.setImageResource(R.drawable.x)
                            tablero2[5] = 1
                            jugador = false
                        }
                    }

                    R.id.b7 -> { var b7 = findViewById<ImageView>(R.id.b7)
                        if (tablero2[6] == 0) {
                            b7.setImageResource(R.drawable.x)
                            tablero2[6] = 1
                            jugador = false
                        }
                    }

                    R.id.b8 -> { var b8 = findViewById<ImageView>(R.id.b8)
                        if (tablero2[7] == 0) {
                            b8.setImageResource(R.drawable.x)
                            tablero2[7] = 1
                            jugador = false
                        }
                    }

                    R.id.b9 -> { var b9 = findViewById<ImageView>(R.id.b9)
                        if (tablero2[8] == 0) {
                            b9.setImageResource(R.drawable.x)
                            tablero2[8] = 1
                            jugador = false
                        }
                    }

                }

            }


            while (maquina){
                var aleatorio = Random.nextInt(9)
                when (aleatorio){
                    0 -> { if (tablero2[0]==0){
                            var b1 = findViewById<ImageView>(R.id.b1)
                            b1.setImageResource(R.drawable.o)
                            maquina = false
                        }

                    }
                    1 -> { if (tablero2[1]==0){
                        var b2 = findViewById<ImageView>(R.id.b2)
                        b2.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }

                    2 -> { if (tablero2[2]==0){
                        var b3 = findViewById<ImageView>(R.id.b3)
                        b3.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }

                    3 -> { if (tablero2[3]==0){
                        var b4 = findViewById<ImageView>(R.id.b4)
                        b4.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }

                    4 -> { if (tablero2[4]==0){
                        var b5 = findViewById<ImageView>(R.id.b5)
                        b5.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }

                    5 -> { if (tablero2[5]==0){
                        var b6 = findViewById<ImageView>(R.id.b6)
                        b6.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }

                    6 -> { if (tablero2[6]==0){
                        var b7 = findViewById<ImageView>(R.id.b7)
                        b7.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }

                    7 -> { if (tablero2[7]==0){
                        var b8 = findViewById<ImageView>(R.id.b8)
                        b8.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }

                    8 -> { if (tablero2[8]==0){
                        var b9 = findViewById<ImageView>(R.id.b9)
                        b9.setImageResource(R.drawable.o)
                        maquina = false
                    }

                    }


                }

            }

            terminado = comprobarFin()



        }




    }

    }





