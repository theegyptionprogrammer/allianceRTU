@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.result_matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alliancertu.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_results_matches.*

class ResultsMatchesFragment : Fragment() {

    companion object {
        fun newInstance() = ResultsMatchesFragment()
    }

    private val myAdapter = GroupAdapter<ViewHolder>()

    private lateinit var viewModel: ResultsMatchesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rv_results_matches.apply {
            adapter = myAdapter
            layoutManager = LinearLayoutManager(activity)
        }
        return inflater.inflate(R.layout.fragment_results_matches, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ResultsMatchesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
