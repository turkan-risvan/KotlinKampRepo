package com.example.firebaserealtimekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firebaserealtimekullanimi.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = FirebaseDatabase.getInstance() //Firebase üzerine çalışmak için yetki alma

        val refKisiler = database.getReference("kisiler")



        /* //Kayıt işlemi kod Biloğu
                //Kayıt işlemi Oluşturma
                val kisi = Kisiler("Zeynep",16)

                refKisiler.push().setValue(kisi)


         */
        /* //silme işlemi kod Biloğu
        // refKisiler.child("-NdGfDViiAsuztOIbKhB").removeValue() //veri silme işlemi yapabilmemiz için Firebase


         */
        /*
                //Veri Güncelleme
                // Hashmap oluşturmamız gerekiyor hangi alana güncelleme olduğunu belirtmek için
                val updateInfo = HashMap<String,Any>() //key kısmı her zaman string, veriler değişken

                updateInfo["kisiAd"] = "Türkan"
                updateInfo["kisiYas"] = 34
                refKisiler.child("-NdGfVm_CMIOLY8nVuak").updateChildren(updateInfo)

         */

        //Veri Okuma İşlemi
        refKisiler.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                //veri değişikliği olduğunda ve verileri almak istediğimizde bu kod bloğu çalışır.
                // for döngüsüyle kayıtlar alınacak
                for (p in snapshot.children){
                    val kisi = p.getValue(Kisiler::class.java)
                    if (kisi != null){
                        val key = p.key
                        Log.e("--------------------------","Deneme")
                        Log.e("Kişi key",key.toString())
                        Log.e("Kişi ad",kisi.kisiAd.toString())
                        Log.e("Kişi yas",kisi.kisiYas.toString())
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                //Hata oluştuğunda bu metod çalışır
            }
        })


        /* //Kayıt işlemi kod Biloğu
        //Kayıt işlemi Oluşturma
        val kisi = Kisiler("Zeynep",16)

        refKisiler.push().setValue(kisi)


 */
        /* //silme işlemi kod Biloğu
        // refKisiler.child("-NdGfDViiAsuztOIbKhB").removeValue() //veri silme işlemi yapabilmemiz için Firebase


         */
        /*
                //Veri Güncelleme
                // Hashmap oluşturmamız gerekiyor hangi alana güncelleme olduğunu belirtmek için
                val updateInfo = HashMap<String,Any>() //key kısmı her zaman string, veriler değişken

                updateInfo["kisiAd"] = "Türkan"
                updateInfo["kisiYas"] = 34
                refKisiler.child("-NdGfVm_CMIOLY8nVuak").updateChildren(updateInfo)

         */

        //Sorgu oluşturma


        // 1.Sorgu biçimi
        // val sorgu = refKisiler.orderByChild("kisiAd").equalTo("Türkan")


        // 2.Sorgu biçimi
        //val sorgu = refKisiler.limitToFirst(1)// verdiğimiz değer kadar listenin başında gösterir.


        //3.Sorgu biçimi
        // val sorgu = refKisiler.limitToLast(2)//verdiğmiz değer kadar listenin sonundan eleman gösterir.


        //4.Sorgu biçimi
        val sorgu = refKisiler.orderByChild("kisiYas").startAt(18.0).endAt(100.0)// 18 ve 100 arasındaki yaşları getiriyor

        sorgu.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                //veri değişikliği olduğunda ve verileri almak istediğimizde bu kod bloğu çalışır.
                // for döngüsüyle kayıtlar alınacak
                for (p in snapshot.children){
                    val kisi = p.getValue(Kisiler::class.java)
                    if (kisi != null){
                        val key = p.key
                        Log.e("--------------------------","Deneme")
                        Log.e("Kişi key",key.toString())
                        Log.e("Kişi ad",kisi.kisiAd.toString())
                        Log.e("Kişi yas",kisi.kisiYas.toString())
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                //Hata oluştuğunda bu metod çalışır
            }
        })
     }
}