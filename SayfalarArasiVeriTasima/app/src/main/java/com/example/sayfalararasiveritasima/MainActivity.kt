package com.example.sayfalararasiveritasima

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasiveritasima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            val kisi = Kisiler(345006,"Ahmet",1.90)
            val yeniIntent = Intent(this@MainActivity, ActivityB::class.java)
            yeniIntent.putExtra("mesaj", "merhaba")
            yeniIntent.putExtra("yaş", 20)
            //yeniIntent.putExtra("boy", 1.80)
            yeniIntent.putExtra("nesne",kisi)

            startActivity(yeniIntent)
        }
    }}