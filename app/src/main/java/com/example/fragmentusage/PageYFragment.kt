package com.example.fragmentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.fragmentusage.databinding.FragmentPageYBinding
import com.google.android.material.snackbar.Snackbar


class PageYFragment : Fragment() {

    private lateinit var binding: FragmentPageYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageYBinding.inflate(inflater, container, false)
        binding.buttonMainPage.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.actionYToMain)
        }
        val backButton = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textViewPageY, "Geri dönmek istiyor musun?", Snackbar.LENGTH_SHORT)
                    .setAction("Evet"){
                        isEnabled = false

                        requireActivity().onBackPressedDispatcher.onBackPressed()

                    }.show()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backButton)
        return binding.root
    }


}