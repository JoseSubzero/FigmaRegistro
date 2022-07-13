package com.example.figmaregistro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.figmaregistro.databinding.FragmentRegisterBinding
import com.example.figmaregistro.databinding.FragmentWelcomeBackBinding


class WelcomeBackFragment : Fragment() {
    private var _binding: FragmentWelcomeBackBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBackBinding.inflate(inflater, container, false)
        return binding.root

    }


}