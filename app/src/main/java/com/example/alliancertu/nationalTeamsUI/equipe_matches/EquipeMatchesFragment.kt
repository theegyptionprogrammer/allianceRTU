@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.equipe_matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alliancertu.R
import com.example.alliancertu.items.PlayerItem
import com.example.alliancertu.services.RetrofitApi
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_equipe.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Suppress("DEPRECATION")
class EquipeMatchesFragment : Fragment() {

    companion object {
        fun newInstance() = EquipeMatchesFragment()
    }

    private val myAdapter = GroupAdapter<ViewHolder>()
    lateinit var retrofitService: RetrofitApi

    private lateinit var viewModel: EquipeMatchesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_equipe, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EquipeMatchesViewModel::class.java)
        setUpRecyclerView()
        getScheduleMatches()
    }

    private fun setUpRecyclerView() {
        rv_our_equipe.apply {
            val linearLayout = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = myAdapter
            layoutManager = linearLayout
        }
    }

    private fun getScheduleMatches() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = retrofitService.getPlayers()
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful) {
                        myAdapter.clear()
                        response.body()?.listPlayers?.map {
                            myAdapter.add(PlayerItem(it))
                        }
                    }
                } catch (e: Error) {
                }
            }
        }
    }

}
