package com.example.navigationcomponentornek3

import java.io.Serializable


//verileri anasayfa fragmenta paramentre olarak gönderebileceğimiz ayrı bir classta da tanımyabiliriz:
//bunu yaptıktan sonra main_activity_nav kısmında add argumnets ile custom serizeable türünde nesne adlı Kisiler kısmını ekliyoruz

// ardından ana sayfa fragment kısmında :
//             val gecis =AnaSayfaFragmentDirections.ikinciEkranaGecis(nesne =Kisiler (1,"Fatma", 24),"Mehmet", "Yıldız",23)

// ardından ikinci sayfa fragment kısmında :
//     val gelenNesne=bundle.nesne
//     Log.d("deneme",gelenNesne.kisiNo.toString())
//     Log.d("deneme",gelenNesne.kisiAd)
//     Log.d("deneme",gelenNesne.kisiYas.toString())
data class Kisiler (var kisiNo:Int, var kisiAd:String, var kisiYas:Int): Serializable{
}