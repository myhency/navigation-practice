package com.io.play.navigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.io.play.navigationpractice.databinding.FragmentPlaylistBinding

class PlaylistFragment : Fragment() {
    private lateinit var binding: FragmentPlaylistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlaylistBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        initViews()

        return view
    }

    private fun initViews() {
        binding.buttonToSomeDetail.setOnClickListener {
            findNavController().navigate(R.id.action_playlistScreen_to_someDetailScreen)
        }

        binding.loadPlayerButton.setOnClickListener {
            val mainActivity = activity as MainActivity
            mainActivity.loadPlayer()
        }
    }
}