package com.example.alliancertu.sportClubUI.sportEvents.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R

class FragmentSportEventInformations : Fragment() {

    companion object {
        fun newInstance() =
            FragmentSportEventInformations()
    }

    private lateinit var viewModel: SportEventInformationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sport_event_informations, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SportEventInformationsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
