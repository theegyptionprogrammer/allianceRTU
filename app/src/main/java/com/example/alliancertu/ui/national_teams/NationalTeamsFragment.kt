@file:Suppress("DEPRECATION")

package com.example.alliancertu.ui.national_teams

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.alliancertu.R


class NationalTeamsFragment : Fragment() {

    private lateinit var nationalTeamViewModule: NationalTeamsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nationalTeamViewModule =
            ViewModelProviders.of(this).get(NationalTeamsViewModel::class.java)
        /*        val textView: TextView = root.findViewById(R.id.)
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        }*/

    /*    val clickListner = View.OnClickListener {
            allSportsIntent.putExtra(String(), view!!.id)
            activity!!.startActivity(allSportsIntent)
        }*/
        fun listner(){
        val intent = Intent(activity, NationalTeamActivity::class.java)
        intent.putExtra("nationalTeam", view!!.id)
        startActivity(intent)
    }
        val view : View = inflater.inflate(R.layout.fragment_national_teams, container, false)

        val footballTeam : Button = view.findViewById(R.id.btn_football_team)
        footballTeam.setOnClickListener {listner()}
        val cheerleadersTeam: Button = view.findViewById(R.id.btn_cheerleading_team)
        cheerleadersTeam.setOnClickListener { listner() }
        val volleyballTeam : Button = view.findViewById(R.id.btn_volleyball_team)
        volleyballTeam.setOnClickListener { listner()}
        val basketballTeam : Button = view.findViewById(R.id.btn_basketball_team)
        basketballTeam.setOnClickListener { listner()}
        return view
    }
}