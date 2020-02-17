package com.example.alliancertu.nationalTeamsUI.legacy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class LegacyFragment : Fragment() {

    companion object {
        fun newInstance() = LegacyFragment()
    }

    private lateinit var viewModel: LegacyViewModel

    private val myAdapter = GroupAdapter<ViewHolder>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_legacy, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LegacyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
