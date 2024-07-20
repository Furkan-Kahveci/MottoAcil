package com.bandirma.mottoacil

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilNobetci2 : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil_nobetci2)

        val button = findViewById<Button>(R.id.button10)

        button.setOnClickListener {

            val intent = Intent(this, MottoAcilSepet2::class.java)

            startActivity(intent)

        }
        val button2 = findViewById<Button>(R.id.button7)

        button2.setOnClickListener {

            val intent = Intent(this, MottoAcilDA::class.java)

            startActivity(intent)
        }

    }
}