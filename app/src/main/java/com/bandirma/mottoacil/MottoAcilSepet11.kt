package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilSepet11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil_sepet11)
        val button = findViewById<Button>(R.id.button10)

        button.setOnClickListener {

            val intent=Intent(this,MADF::class.java)

            startActivity(intent)
        }

        val button2=findViewById<Button>(R.id.button12)

        button2.setOnClickListener {

            val intent=Intent(this,MottoAcilDA::class.java)

            startActivity(intent)

        }

    }

}