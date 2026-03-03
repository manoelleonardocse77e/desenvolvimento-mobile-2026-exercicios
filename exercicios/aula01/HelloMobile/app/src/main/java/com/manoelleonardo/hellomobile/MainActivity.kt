package com.example.manoelleonardo

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val layout = findViewById<LinearLayout>(R.id.main)
        val botao = findViewById<Button>(R.id.btnMudar)

        botao.setOnClickListener {
            when (contador){
                0 -> layout.setBackgroundColor(Color.parseColor("#E3F2FD"))
                1 -> layout.setBackgroundColor(Color.parseColor("#FCE4EC"))
                3 -> layout.setBackgroundColor(Color.parseColor("#E8F5E9"))
            }

            contador++
            if (contador>2){
                contador=0
            }
        }
    }
}