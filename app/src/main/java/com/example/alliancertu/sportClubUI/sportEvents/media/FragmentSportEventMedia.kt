package com.example.alliancertu.sportClubUI.sportEvents.media

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R

class FragmentSportEventMedia : Fragment() {

    companion object {
        fun newInstance() = FragmentSportEventMedia()
    }

    private lateinit var viewModel: SportEventMediaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sport_event_media, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SportEventMediaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
