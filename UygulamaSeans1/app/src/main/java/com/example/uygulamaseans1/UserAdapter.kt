package com.example.uygulamaseans1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UserAdapter: ListAdapter<User, UserAdapter.ItemUser> (COMPARATOR) (

 

inner class ItemUser (private val binding: ItemBinding): RecyclerView.ViewHolder (binding.root) fun bind (item: User, itemView: View) ( binding.textView.text item.name val intent Intent (itemView.context,

MainActivity2::class.java)

binding.button.setOnClickListener { itemView.context.startActivity(intent)

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int):

            UserAdapter.ItemUser (

    val inflate = LayoutInflater. from (parent.context) val binding ItemBinding. inflate (inflate, parent, false)

    return ItemUser (binding)

    override fun onBindViewHolder (holder: UserAdapter.ItemUser, position:

    Int) (

    val item = getItem(position)

    item?.let ( holder.bind(it, holder.itemView)

        object COMPARATOR: Diffutil.ItemCallback<User>() { override fun areItems TheSame (

            oldItem: User, newItem: User

            ): Boolean (

            return oldItem, id newItem.id

            override fun areContentsThe Same (

            oldItem: User,

            newItem: User ): Boolean (

            return oldItem newItem