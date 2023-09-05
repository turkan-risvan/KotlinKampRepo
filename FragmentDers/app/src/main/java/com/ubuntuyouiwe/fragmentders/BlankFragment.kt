package com.ubuntuyouiwe.fragmentders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ubuntuyouiwe.fragmentders.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private var binding: FragmentBlankBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.enter?.setOnClickListener {
            val email =  binding?.emailEditText?.text.toString()
            val passWord =  binding?.passwordEditText?.text.toString()
            val bundle = Bundle().apply {
                putString("email",email)
                putString("password", passWord)
            }
            findNavController().navigate(R.id.action_blankFragment_to_blankFragment2, bundle)
        }



    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}