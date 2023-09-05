package com.example.uygulamaseansi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uygulamaseansi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this,MainActivity2::class.java)

        binding.ToplaButton.setOnClickListener{
            intent.putExtra("Sayi 1",binding.Sayi1.text.toString().toInt())
            intent.putExtra("Sayi 2",binding.Sayi2.text.toString().toInt())
            intent.putExtra("Sayi 3",binding.Sayi3.text.toString().toInt())
            intent.putExtra("Sayi 4",binding.Sayi4.text.toString().toInt())
            intent.putExtra("Sayi 5",binding.Sayi5.text.toString().toInt())
            startActivity(intent)
        }
    }
}