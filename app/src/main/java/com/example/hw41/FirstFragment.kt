package com.example.hw41

import android.os.Bundle
import android.provider.ContactsContract
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw41.R
import com.example.hw41.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return (binding.root)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnNext.setOnClickListener{
                val direction = FragmentFirstDirections.actionFirstFragmentToSecondFragment(etName.text.toString(),
                    etEmail.text.toString(), etPhone.text.toString())
                findNavController().navigate(direction
                )

        }

        }
    }

}