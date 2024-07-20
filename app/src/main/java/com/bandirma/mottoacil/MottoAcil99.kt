package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcil99 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil99)

        val button=findViewById<Button>(R.id.button8)

        button.setOnClickListener {

            val intent=Intent(this,MottoAcilMap::class.java)

            startActivity(intent)

        }

       val button2=findViewById<Button>(R.id.button9)

        button2.setOnClickListener {

            val intent=Intent(this,MottoAcilEczaneListesi::class.java)

            startActivity(intent)

        }
    }


}