package com.example.uygulamaseansi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uygulamaseansi2.databinding.ActivityMain2Binding
import com.example.uygulamaseansi2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent1 = this.intent.getIntExtra("Sayi 1",1)
        val intent2 = this.intent.getIntExtra("Sayi 2",2)
        val intent3 = this.intent.getIntExtra("Sayi 3",1)
        val intent4 = this.intent.getIntExtra("Sayi 4",2)
        val intent5 = this.intent.getIntExtra("Sayi 5",1)

        val ortalama = (intent1 + intent2+ intent3+ intent4+intent5)/2

        binding.OrtalamaSonuc.text = ortalama.toString()
        binding.girilenSayi1.text = intent1.toString()
        binding.GirilenSayi2.text = intent2.toString()
        binding.GirilenSayi3.text = intent3.toString()
        binding.GirilenSayi4.text = intent4.toString()
        binding.GirilenSayi5.text = intent5.toString()

    }
}