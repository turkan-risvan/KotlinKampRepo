package com.example.recyclerviewornek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewornek.databinding.ActivityMainBinding
import com.example.recyclerviewornek.databinding.CardFilmTsarimBinding

class MainActivity : AppCompatActivity() {
    private lateinit var filmlerArrayList:ArrayList<Filmler>
    private lateinit var adapter: FilmAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = Filmler(1,"Keloğlan","images_bir",54.6)
        val f2 = Filmler(1,"Taş Devri","images_iki",80.6)
        val f3 = Filmler(1,"Casper","images_uc",100.6)
        val f4 = Filmler(1,"Red Kit","images_dort",20.6)
        val f5 = Filmler(1,"Garfiels","images_bes",34.6)
        val f6 = Filmler(1,"Tom ve Jerry","images_alti",51.6)
        filmlerArrayList = ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)

        adapter = FilmAdapter(this,filmlerArrayList)
        binding.rv.adapter = adapter
    }
}