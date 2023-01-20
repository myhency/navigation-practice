package com.io.play.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.io.play.navigationpractice.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        initViews()

        return view
    }

    private fun initViews() {
        binding.buttonToPlaylist.setOnClickListener {
            findNavController().navigate(R.id.action_global_playlistFragment)
        }

        binding.buttonToMarket.setOnClickListener {
            findNavController().navigate(R.id.action_global_marketFragment)
        }
    }
}