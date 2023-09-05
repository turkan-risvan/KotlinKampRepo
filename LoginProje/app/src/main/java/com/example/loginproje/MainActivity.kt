package com.example.loginproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding = ActivityMainBinding.inflate(layoutInflater)
        R.string.app_name
        R.color.red
        val editTextKullaniciAdi = binding.editTextText
        val editTextSifre = binding.editTextTextPassword

        binding.ButtonGirisYap.setOnClickListener{
            val loginIntent = Intent(this@MainActivity,LoginActivity::class.java)
       startActivity(loginIntent)
        }
        binding.ButtonKayTOl.setOnClickListener{
val registerIntent = Intent(this@MainActivity,RegisterActivity::class.java)
        }
    }
}