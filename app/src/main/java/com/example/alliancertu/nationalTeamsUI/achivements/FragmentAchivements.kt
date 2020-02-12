package com.example.alliancertu.nationalTeamsUI.achivements

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.alliancertu.R

class FragmentAchivements : Fragment() {

    companion object {
        fun newInstance() = FragmentAchivements()
    }

    private lateinit var viewModel: FragmentAchivementsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_achivements, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentAchivementsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
