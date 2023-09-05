package com.ubuntuyouiwe.tekrarders6.adapter

import androidx.recyclerview.widget.RecyclerView
import com.ubuntuyouiwe.tekrarders6.User
import com.ubuntuyouiwe.tekrarders6.databinding.UserItemBinding

class UserViewHolder(val binding: UserItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(user: User) {
        binding.textView.text = user.nameAndSurname
        binding.textView5.text = user.number
    }
}

