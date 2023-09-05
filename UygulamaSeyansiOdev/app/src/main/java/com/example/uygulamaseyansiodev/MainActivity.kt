package com.example.uygulamaseyansiodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextAd = findViewById<EditText>(R.id.editTextAd)
        val editTextSoyad = findViewById<EditText>(R.id.editTextSoyad)
        val kaydetButton = findViewById<Button>(R.id.kaydetButton)

        val veriListesi = mutableListOf<AdSoyad>()

        kaydetButton.setOnClickListener {
            val ad = editTextAd.text.toString()
            val soyad = editTextSoyad.text.toString()

            val yeniVeri = AdSoyad(ad, soyad)
            veriListesi.add(yeniVeri)

            editTextAd.text.clear()
            editTextSoyad.text.clear()
        }
    }
}
