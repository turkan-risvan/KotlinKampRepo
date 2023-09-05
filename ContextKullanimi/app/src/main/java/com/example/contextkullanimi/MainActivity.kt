package com.example.contextkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contextkullanimi.databinding.ActivityMainBinding

//Context içinde bulunduğumuz activityden bir parça
//Kullanılan bazı yapılar context girmemizi bekler (yani activitymizden bir parça bekler)
//Genelde parametre
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            //1.Kullanım this
            //Toast.makeText(this,"Herhaba",Toast.LENGTH_SHORT).show()
            //2.Kullanım
            //Toast.makeText(this@MainActivity,"Herhaba",Toast.LENGTH_SHORT).show()
            //3.Kullanım
            Toast.makeText(applicationContext,"Herhaba",Toast.LENGTH_SHORT).show()
        }
    }
}