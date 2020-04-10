@file:Suppress("DEPRECATION")

package com.example.alliancertu.nationalTeamsUI.schedule_matches

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alliancertu.R
import com.example.alliancertu.services.RetrofitApi
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_schedule_matches.*


@Suppress("DEPRECATION")
class ScheduleMatchesFragment : Fragment() {

    companion object {
        fun newInstance() = ScheduleMatchesFragment()
    }

    private val myAdapter = GroupAdapter<ViewHolder>()
    lateinit var retrofitService: RetrofitApi


    private lateinit var viewModel: ScheduleMatchesViewModel


    interface OnItemClickListener {
        fun onItemClicked(position: Int, view: View)
    }

    private fun RecyclerView.addOnItemClickListener(onClickListener: OnItemClickListener) {
        this.addOnChildAttachStateChangeListener(object :
            RecyclerView.OnChildAttachStateChangeListener {

            override fun onChildViewDetachedFromWindow(view: View) {
                view.setOnClickListener(null)
            }

            override fun onChildViewAttachedToWindow(view: View) {
                view.setOnClickListener {
                    val holder = getChildViewHolder(view)
                    onClickListener.onItemClicked(holder.adapterPosition, view)
                }
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_schedule_matches, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ScheduleMatchesViewModel::class.java)
        setRecyclerView()
        //getScheduleMatches()
    }

    /*   private fun getScheduleMatches() {
           CoroutineScope(Dispatchers.IO).launch {
               val response = retrofitService.getScheduleMatches()
               withContext(Dispatchers.Main) {
                   try {
                       if (response.isSuccessful) {
                           myAdapter.clear()
                           response.body()?.match?.map {
                               myAdapter.add(MatchItem(it))
                           }
                       }
                   } catch (e: Error) {
                   }
               }
           }
       }*/

    fun listener() {
        val intent = Intent(activity, DetailItemRvScheduleMatchesActivity::class.java)
        intent.putExtra("schedule matches", view!!.id)
        startActivity(intent)
    }

    private fun setRecyclerView() {
        rv_schedule_matches.apply {
            val linearLayout = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = myAdapter
            layoutManager = linearLayout
        }
        rv_schedule_matches.addOnItemClickListener(object : OnItemClickListener {
            override fun onItemClicked(position: Int, view: View) {
                listener()
            }
        })
    }
}
