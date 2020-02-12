@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.schedule_plays

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.alliancertu.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_schedule_matches.*

@Suppress("DEPRECATION")
class SchedulePlaysFragment : Fragment() {

    companion object {
        fun newInstance() = SchedulePlaysFragment()
    }

    private val adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rv_schedule_matches.adapter = adapter
    }

    private lateinit var viewModel: SchedulePlaysViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_schedule_matches, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SchedulePlaysViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
