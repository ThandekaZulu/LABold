package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentAvatarBinding

class FragmentAvatar : Fragment() {
    lateinit var fragmentAvatarBinding: FragmentAvatarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentAvatarBinding = FragmentAvatarBinding.inflate(inflater,container,false)

        fragmentAvatarBinding.buttonNextAvatar.setOnClickListener {
            val direction = FragmentAvatarDirections.actionFragmentAvatarToFragmentCompleteOnboarding()
            this.findNavController().navigate(direction)
        }

        // Inflate the layout for this fragment
        return fragmentAvatarBinding.root
    }
}