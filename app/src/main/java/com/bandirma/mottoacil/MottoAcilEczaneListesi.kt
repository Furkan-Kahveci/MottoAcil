package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilEczaneListesi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil_eczane_listesi)

        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener {

            intent= Intent(this,MottoAcilNobetci::class.java)

            startActivity(intent)
        }
    }
}