package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.ResultMatch
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_rv_results_matches.view.*

class ResultItem(val resultMatch: ResultMatch) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.item_rv_results_matches

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tv_name_our_team.text = resultMatch.ourTeam.ourTeamName
        viewHolder.itemView.tv_name_opponent_team.text = resultMatch.opponentTeam.opponenTeamName
        viewHolder.itemView.tv_result_our_team.text = resultMatch.resultOurTeam
        viewHolder.itemView.tv_result_opponent_team.text = resultMatch.resultOpponentTeam
        Picasso.get().load(R.drawable.ic_android_black_24dp).into(viewHolder.itemView.first_team_pp)
        Picasso.get().load(R.drawable.ic_android_black_24dp)
            .into(viewHolder.itemView.second_team_pp)
    }
}