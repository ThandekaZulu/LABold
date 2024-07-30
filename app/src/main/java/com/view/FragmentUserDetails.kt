package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentUserDetailsBinding

class FragmentUserDetails : Fragment() {

    lateinit var fragmentUserDetailsBinding: FragmentUserDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentUserDetailsBinding = FragmentUserDetailsBinding.inflate(inflater,container,false)

        fragmentUserDetailsBinding.buttonNextUserDetails.setOnClickListener {

            val direction = FragmentUserDetailsDirections.actionFragmentUserDetailsToFragmentAvatar()
            this.findNavController().navigate(direction)
        }

        // Inflate the layout for this fragment
        return fragmentUserDetailsBinding.root
    }
}