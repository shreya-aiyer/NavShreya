package com.shreya.navshreya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {
    lateinit var binding : FragmentTitleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        // Inflate the layout for this fragment
//        binding.playButton.setOnClickListener {view: View ->
//            findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
//        }
        val btn = view?.findViewById<Button>(R.id.playButton)
        btn?.setOnClickListener() var binding : FragmentTitleBinding{
            findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}