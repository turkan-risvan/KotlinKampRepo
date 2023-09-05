package com.ubuntuyouiwe.tekrarders6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubuntuyouiwe.tekrarders6.adapter.UsersAdapter
import com.ubuntuyouiwe.tekrarders6.databinding.FragmentShowUserBinding

class ShowUserFragment : Fragment() {
    private var binding: FragmentShowUserBinding? = null
    private var userAdapter = UsersAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowUserBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userList: ArrayList<User> = arguments?.getSerializable("user_list",) as ArrayList<User>

        userAdapter.submitList(userList)

        binding?.recycler?.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding?.recycler?.adapter = userAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}