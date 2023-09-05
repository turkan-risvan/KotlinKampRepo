package com.example.viewbindingornek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegiterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_regiter)
        val yeniIntent = Intent(this,MainActivity::class.java)
    }

}
