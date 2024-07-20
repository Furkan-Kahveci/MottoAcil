package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MADF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_madf)
        val button =findViewById<Button>(R.id.button14)

        button.setOnClickListener {

            val intent= Intent(this,MottoAcilSepet55::class.java)

            startActivity(intent)

        }

        val button2=findViewById<Button>(R.id.button11)

        button2.setOnClickListener {

            val intent=Intent(this,MottoAcilSepet1905::class.java)

            startActivity(intent)
        }

    }

}