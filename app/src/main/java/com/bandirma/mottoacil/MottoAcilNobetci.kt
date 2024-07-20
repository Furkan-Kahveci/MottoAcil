package com.bandirma.mottoacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MottoAcilNobetci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motto_acil_nobetci)

        val button2=findViewById<Button>(R.id.button7)

        button2.setOnClickListener {

            val intent=Intent(this,MottoAcilDideral::class.java)

            startActivity(intent)
        }

       val button3 = findViewById<Button>(R.id.button10)

      button3.setOnClickListener {

          val intent=Intent(this,MottoAcilFolbiol::class.java)

          startActivity(intent)

      }

        val button4 =findViewById<Button>(R.id.button12)

        button4.setOnClickListener {
            val intent=Intent(this,MottoAcilSepet::class.java)

            startActivity(intent)

        }

    }

}