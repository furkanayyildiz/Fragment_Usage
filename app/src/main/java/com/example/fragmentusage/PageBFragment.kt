package com.example.fragmentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentusage.databinding.FragmentMainPageBinding
import com.example.fragmentusage.databinding.FragmentPageBBinding


class PageBFragment : Fragment() {

    private lateinit var binding: FragmentPageBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.buttonYfromB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.actionBtoY)
        }
        return binding.root
    }


}