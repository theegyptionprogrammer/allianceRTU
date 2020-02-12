@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.result_plays

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.alliancertu.R

class ResultPlaysFragment : Fragment() {

    companion object {
        fun newInstance() = ResultPlaysFragment()
    }

    private lateinit var viewModel: ResultPlaysViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result_matches, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ResultPlaysViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
