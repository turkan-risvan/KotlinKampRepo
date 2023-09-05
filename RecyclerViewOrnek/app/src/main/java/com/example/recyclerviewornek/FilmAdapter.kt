package com.example.recyclerviewornek

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewornek.databinding.ActivityMainBinding
import com.example.recyclerviewornek.databinding.CardFilmTsarimBinding

class FilmAdapter(private val mContext: Context,private val filimlerListesi:List<Filmler>):RecyclerView.Adapter<FilmAdapter.CardTasarimNesneleriniTutucu>() {

    inner class CardTasarimNesneleriniTutucu(val binding: CardFilmTsarimBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardTasarimNesneleriniTutucu {
        val binding = CardFilmTsarimBinding.inflate(LayoutInflater.from(parent.context
        ),parent,false)
        return CardTasarimNesneleriniTutucu(binding)
    }

    override fun getItemCount(): Int {
        return filimlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {
        val film = filimlerListesi[position]
        val binding = holder.binding

        binding.textViewFilmBaslik.text =film.filmAd
        binding.textViewFilmFiyat.text = "${film.filmFiyat} TL"
         val resimId = mContext.resources.getIdentifier(film.filmResimAd,"drawable",mContext.packageName)
     binding.imageViewFilmResim.setImageResource(resimId)
        binding.buttonSepeteEkle.setOnClickListener{
            Toast.makeText(mContext,"${film.filmAd} sepete eklendi",Toast.LENGTH_SHORT).show()
        }


    }
}