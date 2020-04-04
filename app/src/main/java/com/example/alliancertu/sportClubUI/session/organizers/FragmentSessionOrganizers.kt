package com.example.alliancertu.sportClubUI.session.organizers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R

class FragmentSessionOrganizers : Fragment() {

    companion object {
        fun newInstance() = FragmentSessionOrganizers()
    }

    private lateinit var viewModel: SessionOrganizersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_session_organizers, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SessionOrganizersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
