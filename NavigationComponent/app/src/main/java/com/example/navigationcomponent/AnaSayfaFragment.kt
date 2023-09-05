package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim : FragmentAnaSayfaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {


        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.buttonBasla.setOnClickListener {
            Navigation.findNavController(it). navigate(R.id.oyunEkraniGecis)


        }


        return tasarim.root
    }


}
// popup ile sonuca geldikten sonra geeri tuşuna basınca ana sayfaya veya oyun ekranına gelmesini isteyebiliriz