package com.example.navigationcomponentornek3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

import com.example.navigationcomponentornek3.databinding.FragmentIkinciBinding


class IkinciFragment : Fragment() {

    private lateinit var tasarim : FragmentIkinciBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentIkinciBinding.inflate(inflater,container,false)

        tasarim.buttonSonuc.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sonucEkraniGecis)//Nvigation Component kullanarak fragment geçiş
        }

        //veri transferi için ana sayfaya gerekli kodları yazdıktan sonra aşağıdakileri yazıyoruz:
        val bundle: IkinciFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenSoyad = bundle.soyad
        val gelenYas = bundle.yas

        val gelenNesne=bundle.nesne

        //ana sayfada butona tıklayınca aşağıdaki verileri(ana sayfada girdiğimiz verileri) logcatte görüyor olacağız
        //verileri farklı şekillerde de görebiliriz şimdilik deneme amaçlı logcatte görüyoruz:
        Log.d("deneme",gelenAd)
        Log.d("deneme",gelenSoyad)
        Log.d("deneme",gelenYas.toString())//toString gerekli
        Log.d("deneme",gelenNesne.kisiNo.toString())
        Log.d("deneme",gelenNesne.kisiAd)
        Log.d("deneme",gelenNesne.kisiYas.toString())

        return tasarim.root
    }


}
