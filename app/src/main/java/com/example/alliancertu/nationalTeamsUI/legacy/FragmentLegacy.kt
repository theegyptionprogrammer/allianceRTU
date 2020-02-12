package com.example.alliancertu.nationalTeamsUI.legacy

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.alliancertu.R

class FragmentLegacy : Fragment() {

    companion object {
        fun newInstance() = FragmentLegacy()
    }

    private lateinit var viewModel: FragmentLegacyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_legacy, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentLegacyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
