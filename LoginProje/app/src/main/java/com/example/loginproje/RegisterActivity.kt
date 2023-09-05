package com.example.loginproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginproje.databinding.ActivityRegisterBinding
import com.google.android.material.snackbar.Snackbar

class RegisterActivity : AppCompatActivity() {
    private lateinit var  tasarim:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val editTextAd = tasarim.editTextText
        val editTextSoyad = tasarim.editTextText2
        val editTextEmail = tasarim.editTextText3
        val editTextPassword = tasarim.editTextTextPassword

        tasarim.button.setOnClickListener {
            if(editTextAd.text.isEmpty() || editTextSoyad.text.isEmpty() || editTextEmail.text.isEmpty() || editTextPassword.text.isEmpty()){
                Snackbar.make(it,"Gerekli alanları doldurunuz.",Snackbar.LENGTH_SHORT).show()
            }else{
                //Diğer activitiye yönlendirme işlemi
                val yeniIntent = Intent(this@RegisterActivity,MainActivity::class.java)
                startActivity(yeniIntent)
            }
        }
    }
}