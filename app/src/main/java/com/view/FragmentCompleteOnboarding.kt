package com.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mazulu.la.R
import com.mazulu.la.databinding.FragmentCompleteOnboardingBinding
import com.mazulu.la.databinding.FragmentGetStartedBinding
import com.mazulu.la.databinding.FragmentUserDetailsBinding

class FragmentCompleteOnboarding : Fragment() {

    lateinit var fragmentCompleteOnboardingBinding: FragmentCompleteOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentCompleteOnboardingBinding = FragmentCompleteOnboardingBinding.inflate(inflater,container,false)

        fragmentCompleteOnboardingBinding.buttonCompleteOnboarding.setOnClickListener {

        }
        // Inflate the layout for this fragment
        return fragmentCompleteOnboardingBinding.root
    }
}