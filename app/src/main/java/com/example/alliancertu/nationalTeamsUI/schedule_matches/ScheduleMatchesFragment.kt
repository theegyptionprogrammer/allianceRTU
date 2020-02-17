@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.schedule_matches

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
import kotlinx.android.synthetic.main.fragment_schedule_matches.*

@Suppress("DEPRECATION")
class ScheduleMatchesFragment : Fragment() {

    companion object {
        fun newInstance() = ScheduleMatchesFragment()
    }

    private val myAdapter = GroupAdapter<ViewHolder>()

    private lateinit var viewModel: ScheduleMatchesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rv_schedule_matches.apply {
            adapter = myAdapter
            layoutManager = LinearLayoutManager(activity)
        }

        return inflater.inflate(R.layout.fragment_schedule_matches, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ScheduleMatchesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
