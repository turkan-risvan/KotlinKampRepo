package com.example.notuygulamas.odev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notuygulamas.R
import com.example.notuygulamas.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var notlarListe: ArrayList<Notlar>
    private lateinit var adapter: NotlarAdapter
    private lateinit var refNotlar: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

        binding.toolbar.title = "Türkan'nın Not Uygulaması"
        setSupportActionBar(binding.toolbar)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)

        val db = FirebaseDatabase.getInstance()

        refNotlar =db.getReference("notlar")

        notlarListe = ArrayList()



        adapter = NotlarAdapter(this,notlarListe,refNotlar)
        binding.rv.adapter = adapter
        tumNotlar()

        binding.fab.setOnClickListener{
            alertGoster()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)

        val item = menu?.findItem(R.id.action_ara)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)

    }

    fun alertGoster() {
        val tasarim = LayoutInflater.from(this).inflate(R.layout.alert_tasarim, null)
        val editTextBaslik = tasarim.findViewById(R.id.editTextBaslik) as EditText
        val editTextAciklama = tasarim.findViewById(R.id.editTextAciklama) as EditText

        val note = AlertDialog.Builder(this)

        note.setTitle("Not Ekle")
        note.setView(tasarim)
        note.setPositiveButton("Ekle") { dialogInterface, i ->
            val notBaslik = editTextBaslik.text.toString().trim()
            val notAciklama = editTextAciklama.text.toString().trim()

            val not = Notlar("", notBaslik, notAciklama)


            refNotlar.push().setValue(not)// eklediğimiz notu firebase gönderdik

            Toast.makeText(applicationContext, "$notBaslik - $notAciklama", Toast.LENGTH_SHORT).show()
        }
        note.setNegativeButton("İptal") { dialogInterface, i ->

        }
        note.create().show()

    }


    fun tumNotlar(){
        refNotlar.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                notlarListe.clear()
                for (c in snapshot.children){
                    val not = c.getValue(Notlar::class.java)
                    if (not != null){
                        not.not_id = c.key
                        notlarListe.add(not)
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }
    fun aramaYap(aramaKelime:String){
        refNotlar.addValueEventListener(object :ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                notlarListe.clear()
                for (c in snapshot.children){
                    val not = c.getValue(Notlar::class.java)
                    if (not != null){
                        if(not.not_baslik!!.contains(aramaKelime)){
                            not.not_id = c.key
                            notlarListe.add(not)
                        }
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        aramaYap(query)
        Log.e("Gönderilen Arama",query.toString())
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        aramaYap(newText)
        Log.e("Harf Girdikçe",newText.toString())
        return true
    }
}