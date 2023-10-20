package com.example.notuygulamas.odev1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.notuygulamas.R
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.DatabaseReference


class NotlarAdapter(private val mContext: Context, private val notlarListe :List<Notlar>, private val refNotlar: DatabaseReference)
    :RecyclerView.Adapter<NotlarAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: View) : RecyclerView.ViewHolder(tasarim) {


        var textViewNotBaslik: TextView
        var textViewNotAciklama: TextView
    var imageViewNokta: ImageView

    init {
        textViewNotBaslik = tasarim.findViewById(R.id.textViewBaslik)
        textViewNotAciklama = tasarim.findViewById(R.id.textViewAciklama)
        imageViewNokta = tasarim.findViewById(R.id.imageViewNokta)
    }
}
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardTasarimTutucu {
       val tasarim = LayoutInflater.from(mContext).inflate(R.layout.not_kart_tasarim,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
    return notlarListe.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val not = notlarListe.get(position)

        holder.textViewNotBaslik.text = "${not.not_baslik}"
        holder.textViewNotAciklama.text = "${not.not_aciklama}"
        holder.imageViewNokta.setOnClickListener{
            val popupMenu = PopupMenu(mContext,holder.imageViewNokta)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)

            popupMenu.setOnMenuItemClickListener {menuItem ->
            when(menuItem.itemId){
                R.id.action_sil ->{
                    Snackbar.make(holder.imageViewNokta,"${not.not_baslik} silinsin mi?",Snackbar.LENGTH_SHORT)
                        .setAction("EVET"){
                            refNotlar.child(not.not_id!!).removeValue()
                        }.show()
                    true
                }
                R.id.action_guncelle ->{
                    alertGoster(not)
                    true

                }
                else -> false
            }

            }
            popupMenu.show()
        }
    }

    fun alertGoster(not: Notlar){
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.alert_tasarim,null)
        val editTextBaslik = tasarim.findViewById(R.id.editTextBaslik) as EditText
        val editTextAciklama = tasarim.findViewById(R.id.editTextAciklama) as EditText


        editTextBaslik.setText(not.not_baslik)
        editTextAciklama.setText(not.not_aciklama)

        val note = AlertDialog.Builder(mContext)
        note.setTitle("Not Güncelle")
        note.setView(tasarim)
        note.setPositiveButton("Güncelle"){dialogInterface, i ->
            val notBaslik = editTextBaslik.text.toString().trim()
            val notAciklama = editTextAciklama.text.toString().trim()

            val bilgiler = HashMap<String,Any>()
            bilgiler.put("not_baslik",notBaslik)
            bilgiler.put("not_aciklama",notAciklama)

            refNotlar.child(not.not_id!!).updateChildren(bilgiler)

            Toast.makeText(mContext,"$notBaslik -$notAciklama",Toast.LENGTH_SHORT).show()
        }
        note.setNegativeButton("İptal"){dialogInterface, i ->

        }
        note.create().show()
    }


    }



