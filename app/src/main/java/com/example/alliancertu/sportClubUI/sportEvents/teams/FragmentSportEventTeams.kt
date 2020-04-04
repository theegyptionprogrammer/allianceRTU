package com.example.alliancertu.sportClubUI.sportEvents.teams

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R

class FragmentSportEventTeams : Fragment() {

    companion object {
        fun newInstance() = FragmentSportEventTeams()
    }

    private lateinit var viewModel: SportEventTeamsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sport_event_teams, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SportEventTeamsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
