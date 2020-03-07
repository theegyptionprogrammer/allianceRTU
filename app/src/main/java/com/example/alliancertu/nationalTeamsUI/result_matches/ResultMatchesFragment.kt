@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.result_matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alliancertu.R
import com.example.alliancertu.items.ResultItem
import com.example.alliancertu.services.RetrofitApi
import com.example.alliancertu.viewModules.RetrofitFactory
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_results_matches.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class ResultMatchesFragment : Fragment() {

    companion object {
        fun newInstance() = ResultMatchesFragment()
    }

    private val myAdapter = GroupAdapter<ViewHolder>()
    private lateinit var resultViewModel: ResultMatchesViewModel
    lateinit var retrofitClient: RetrofitFactory
    lateinit var retrofitService: RetrofitApi



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_results_matches, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        getResultMatches()
    }


    private fun getResultMatches() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = retrofitService.getResults()
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful) {
                        myAdapter.clear()
                        response.body()?.resultMatch?.map {
                            myAdapter.add(ResultItem(it))
                        }

                    } else {
                    }
                } catch (e: HttpException) {
                }
            }
        }
    }

    private fun setRecyclerView() {
        rv_results_matches.apply {
            val linearLayout = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            layoutManager = linearLayout
            adapter = myAdapter
        }
    }
}
