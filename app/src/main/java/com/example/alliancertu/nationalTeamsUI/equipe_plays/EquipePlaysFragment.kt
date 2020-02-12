@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.equipe_plays

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

@Suppress("DEPRECATION")
class EquipePlaysFragment : Fragment() {

    companion object {
        fun newInstance() = EquipePlaysFragment()
    }

    val adapter = GroupAdapter<ViewHolder>()


    private lateinit var viewModel: EquipePlaysViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_equipe, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EquipePlaysViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}
