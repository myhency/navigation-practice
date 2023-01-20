package com.io.play.navigationpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import com.io.play.navigationpractice.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
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
        initViews(view)

        return view
    }

    private fun initViews(view: ConstraintLayout) {
        binding.buttonToPlaylist.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToPlaylistFragment()
            view.findNavController().navigate(action)
        }

        binding.buttonToMarket.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMarketFragment()
            view.findNavController().navigate(action)
        }
    }
}