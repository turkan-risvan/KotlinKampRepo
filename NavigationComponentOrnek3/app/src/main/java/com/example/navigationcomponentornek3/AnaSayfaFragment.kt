package com.example.navigationcomponentornek3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentornek3.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {


    private lateinit var tasarim : FragmentAnaSayfaBinding





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        tasarim =FragmentAnaSayfaBinding.inflate(inflater,container,false)


        tasarim.buttonBasla.setOnClickListener {

            //Veri transferine geçmeden önce ekran geçişleri için yazdığımız kodlar:
            // it değeri butonu temsil ediyor:
            // Navigation.findNavController(it).navigate(R.id.ikinciEkranaGecis)//main_activity_nav'daki action'ın( ekranlar arası ok) id'sini veriyoruz


            //veri transveri için:
            val gecis =AnaSayfaFragmentDirections.ikinciEkranaGecis(nesne =Kisiler (1,"Fatma", 24),"Mehmet", "Yıldız",23)
            Navigation.findNavController(it).navigate(gecis)


        }
        return tasarim.root
    }


}