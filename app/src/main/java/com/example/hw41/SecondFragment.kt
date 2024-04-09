package com.example.hw41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.hw41.R
import com.example.hw41.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding


    private val args : SecondFragmentArgs by navArgs()

    private var  name=""
    private var  email=""
    private var  phone=""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        name= args.name
        email = args.email
        phone = args.phone



        binding.apply {
            textViewEmail.text = name
            textViewEmail.text = email
            textViewPhone.text = phone
        }
    }

}