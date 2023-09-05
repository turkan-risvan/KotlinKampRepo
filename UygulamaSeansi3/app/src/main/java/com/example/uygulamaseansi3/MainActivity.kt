package com.example.uygulamaseansi3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import com.example.uygulamaseansi3.databinding.ActivityMain2Binding
import com.example.uygulamaseansi3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val veriListesi = mutableListOf<String>() // Ad ve soyadları saklamak için bir liste
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.kaydetButton.setOnClickListener {
            val ad = binding.editTextAd.text.toString()
            val soyad = binding.editTextSoyad.text.toString()

            val veri = "$ad $soyad" // Ad ve soyadı birleştirerek bir veri oluştur
            veriListesi.add(veri)
//içeriği temizleme işlemi yapıyor
            binding.editTextAd.setText("")
            binding.editTextSoyad.setText("")
        }


        binding.listeGosterButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putStringArrayListExtra("veriListesi", ArrayList(veriListesi))
            startActivity(intent)
        }
    }
}
