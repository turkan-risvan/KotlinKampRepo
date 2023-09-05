package com.example.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backstack.databinding.ActivityMainBinding

class ActivityD : AppCompatActivity()
      private   lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       ovveride fun onBackPressed(){
            val intent = Intent(this@ActivityD,ActivityB::class.java)
           // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}