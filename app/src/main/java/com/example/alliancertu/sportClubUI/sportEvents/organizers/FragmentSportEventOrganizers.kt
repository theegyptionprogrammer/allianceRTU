package com.example.alliancertu.sportClubUI.sportEvents.organizers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R

class FragmentSportEventOrganizers : Fragment() {

    companion object {
        fun newInstance() = FragmentSportEventOrganizers()
    }

    private lateinit var viewModel: SportEventOrganizersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sport_event_organizers, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SportEventOrganizersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
