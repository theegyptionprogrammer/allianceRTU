@file:Suppress("DEPRECATION")

package com.example.alliancertu.ui.sportClub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
        return inflater.inflate(R.layout.fragment_sport_club, container, false)
    }
}