package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentGetStartedBinding

class FragmentGetStarted : Fragment() {

    lateinit var fragmentGetStartedBinding: FragmentGetStartedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGetStartedBinding = FragmentGetStartedBinding.inflate(inflater,container,false)

        fragmentGetStartedBinding.buttonGetStarted.setOnClickListener {
            val direction = FragmentGetStartedDirections.actionFragmentGetStartedToFragmentUserDetails()
            this.findNavController().navigate(direction)
        }

        // Inflate the layout for this fragment
        return fragmentGetStartedBinding.root
    }
}