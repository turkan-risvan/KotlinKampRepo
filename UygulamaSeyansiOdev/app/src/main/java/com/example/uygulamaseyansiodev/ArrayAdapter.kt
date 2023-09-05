package com.example.uygulamaseyansiodev

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.uygulamaseansi3.databinding.UserItemBinding

class ArrayAdapter(private val list : List<AdSoyad>) :RecyclerView.Adapter<ArrayAdapter.UserViewHolder>() {
    class UserViewHolder(private val binding: UserItemBinding):RecyclerView.ViewHolder(binding.root) {

        fun bind(item:AdSoyad) {
            binding.ad.text = item.ad.toString()
            binding.soyad.text = item.soyad.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        val binding = UserItemBinding.inflate(inflater,parent,false)
        return UserViewHolder(binding)

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])

    }

    override fun getItemCount(): Int = list.size


}