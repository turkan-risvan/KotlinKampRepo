package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener{

            startActivity(Intent(this@ActivityD,ActivityC::class.java))
        }
    }
}