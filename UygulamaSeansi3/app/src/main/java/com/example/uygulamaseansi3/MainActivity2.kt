package com.example.uygulamaseansi3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView



class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listView = findViewById<ListView>(R.id.listView)

        // MainActivity'den verileri al
        val veriListesi = intent.getStringArrayListExtra("veriListesi")

     //  val adapter = UserAdapter(this, android.R.layout.simple_list_item_1, veriListesi)
      //  listView.adapter = adapter
    }
}
