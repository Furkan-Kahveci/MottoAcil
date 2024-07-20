package com.bandirma.mottoacil

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilSepet1905 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil_sepet1905)
       val button = findViewById<Button>(R.id.button8)

        button.setOnClickListener {

            val intent=Intent(this,MottoAcilMap::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button15)

        button2.setOnClickListener {

            val intent=Intent(this,MottoAcilSaglikligunlerdiler::class.java)

            startActivity(intent)

        }
    }


}