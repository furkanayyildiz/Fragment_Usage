package com.example.fragmentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentusage.databinding.FragmentPageBBinding
import com.example.fragmentusage.databinding.FragmentPageXBinding


class PageXFragment : Fragment() {

    private lateinit var binding: FragmentPageXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageXBinding.inflate(inflater, container, false)
        binding.buttonYfromX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.actionXToY)
        }
        return binding.root
    }


}