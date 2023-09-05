package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityMainBinding

class ActivityC : AppCompatActivity() {
 private   lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            startActivity(Intent(this@ActivityC,ActivityD::class.java))
        }
    }
}