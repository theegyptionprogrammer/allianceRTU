@file:Suppress("DEPRECATION")

package com.example.alliancertu.ui.sportClub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R

class SportClubFragment : Fragment() {

    private lateinit var homeViewModel: SportClubViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(SportClubViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sport_club, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}