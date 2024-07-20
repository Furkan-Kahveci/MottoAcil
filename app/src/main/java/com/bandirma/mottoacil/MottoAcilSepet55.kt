package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilSepet55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil_sepet55)
        val button =findViewById<Button>(R.id.button12)

        button.setOnClickListener {

            val intent= Intent(this,MottoAcilSepet4::class.java)

            startActivity(intent)
        }
        val button2= findViewById<Button>(R.id.button10)

        button2.setOnClickListener {

            val intent=Intent(this,MottoAcilSepet4::class.java)

            startActivity(intent)


        }

    }
}