package com.example.uygulamaseansi3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uygulamaseansi3.databinding.UserItemBinding

/*class UserAdapter(private val userList: List<Users>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.ad)
        val surnameTextView: TextView = itemView.findViewById(R.id.soyad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]
        holder.nameTextView.text = "Ad: ${user.ad}"
        holder.surnameTextView.text = "Soyad: ${user.soyad}"
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

 */