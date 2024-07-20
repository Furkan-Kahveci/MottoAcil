package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcil98 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil98)

        val button = findViewById<Button>(R.id.button7)

        button.setOnClickListener {

            val intent= Intent(this,MADF::class.java)

            startActivity(intent)
        }
       val button2=findViewById<Button>(R.id.button12)

      button2.setOnClickListener {

          val intent=Intent(this,MottoAcilSepet2::class.java)

          startActivity(intent)

      }


    }
}