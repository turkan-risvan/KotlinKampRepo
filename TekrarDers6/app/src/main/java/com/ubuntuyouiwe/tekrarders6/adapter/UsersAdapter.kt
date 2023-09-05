package com.ubuntuyouiwe.tekrarders6.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.ubuntuyouiwe.tekrarders6.User
import com.ubuntuyouiwe.tekrarders6.databinding.UserItemBinding

class UsersAdapter: ListAdapter<User, UserViewHolder>(COMPARATOR) {
    object COMPARATOR : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(
            oldItem: User,
            newItem: User
        ): Boolean {
            return oldItem.number == newItem.number
        }
        override fun areContentsTheSame(
            oldItem: User,
            newItem: User
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = UserItemBinding.inflate(inflater, parent,false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = getItem(position)
        item?.let {
            holder.bind(it)
        }

    }
}