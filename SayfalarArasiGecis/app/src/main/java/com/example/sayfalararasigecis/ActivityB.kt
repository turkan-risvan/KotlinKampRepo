package com.example.sayfalararasigecis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityB : AppCompatActivity() {
    private lateinit var binding:ActivityB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityB.inflate(layoutInflater)
        setContentView(binding.root)

        binding.GoToCbutton.setOn


    }
}