package com.example.viewbindingornek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.viewbindingornek2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)

        setContentView(tasarim.root)

        val Intent =Intent(this,RegiterActivity::class.java)
        val editTextText = tasarim.editTextText
        val editTextText2 = tasarim.editTextText2
        val editTextText3 = tasarim.editTextText3
        tasarim.button.setOnClickListener{
            if(!(editTextText.text.isEmpty() || editTextText2.text.isEmpty() || editTextText3.text.isEmpty())) {
               // Snackbar.make(it, "Öğrenci kaydı alındı", Snackbar.LENGTH_SHORT).show()

                startActivity(Intent)
            }
            else{
                Snackbar.make(it, "Veriler Boş", Snackbar.LENGTH_SHORT).show()
                //EditTextler dolu geldiğinde sonraki activiteye geçis işlemi

            }
        }

    }
}