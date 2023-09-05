package com.example.uygulamaseyansiodev

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val listView = findViewById<ListView>(R.id.listView)

        // MainActivity'den verileri alın
        val veriListesi = intent.getParcelableArrayListExtra<AdSoyad>("veriListesi")

        // Verileri ListView'e bağlayın
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, veriListesi)
        listView.adapter = adapter
    }
}
