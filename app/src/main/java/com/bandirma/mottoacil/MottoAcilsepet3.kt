package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilsepet3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acilsepet3)
        val button=findViewById<Button>(R.id.button7)

        button.setOnClickListener {

            val intent=Intent(this,MottoAcilSepet4::class.java)

            startActivity(intent)
        }
    }
}