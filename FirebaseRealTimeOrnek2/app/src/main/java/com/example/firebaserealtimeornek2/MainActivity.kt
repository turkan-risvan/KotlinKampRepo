package com.example.firebaserealtimeornek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firebaserealtimeornek2.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


////Firebase
//Gerçek zamanlı çalışan veritabanı
// veritabanı üzerinde oluşan değişkenler anlık çalışır
//Json formatındadır
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

 val database = FirebaseDatabase.getInstance()//Yetki Aldım

 val refNesneler = database.getReference("nesneler")


 //Kayıt İşlemi

 //val nesne = Nesneler("Kalem",5,"Kırtasiye Ürünü")
 //refNesneler.push().setValue(nesne)

// Kayıt Silme
//refNesneler.child("-NdH-irDnyiyPRSidkr5").removeValue()


 //Kayıt Güncelleme
  /*
  val updateInfo = HashMap<String,Any>()


        updateInfo["nesneAd"] = "Pasta"
        updateInfo["nesneAdet"] = "12"
        updateInfo["nesneAlani"] = "Tatlı"

        refNesneler.child("-NdH0uF1fY3mKXlbUPp1").updateChildren(updateInfo)



   */
        
        refNesneler.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                 for(deger in snapshot.children){
                     val nesne = deger.getValue(Nesneler::class.java)
                     if (nesne != null){
                         Log.d("****************","Deneme")
                         Log.d("Nesne Ad",nesne.nesneAd.toString())
                         Log.d("Nesne Adet",nesne.nesneAdet.toString())
                         Log.d("Nesne Alanı",nesne.nesneAlani.toString())
                     }
                }
            }
            override fun onCancelled(error: DatabaseError) {

            }
        })
    }
}