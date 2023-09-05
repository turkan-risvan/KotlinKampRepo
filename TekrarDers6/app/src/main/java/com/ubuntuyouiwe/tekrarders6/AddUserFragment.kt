package com.ubuntuyouiwe.tekrarders6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ubuntuyouiwe.tekrarders6.databinding.FragmentAddUserBinding

class AddUserFragment : Fragment() {
    private var binding: FragmentAddUserBinding? = null
    private var userList = ArrayList<User>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddUserBinding.inflate(inflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.add?.setOnClickListener {
            enter()
        }
        binding?.showUser?.setOnClickListener {
            showUser()
        }




    }
    fun showUser() {
        val bundle = Bundle().apply {
            putSerializable("user_list", userList)
        }
        findNavController().navigate(R.id.action_addUserFragment_to_showUserFragment,bundle)
    }

    fun enter() {
        val nameSurname = binding?.nameSurname?.text.toString()
        val number = binding?.number?.text.toString()
        val addedUserList = User(
            nameAndSurname = nameSurname,
            number = number
        )
        userList.add(addedUserList)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}