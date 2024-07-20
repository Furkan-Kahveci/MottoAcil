package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilSepet2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil_sepet2)
        val button=findViewById<Button>(R.id.button11)

        button.setOnClickListener {

            val intent=Intent(this,MottoAcilSepet1905::class.java)

            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button14)

        button2.setOnClickListener {

            val intent=Intent(this,MottoAcilsepet3::class.java)

            startActivity(intent)
        }
    }
}