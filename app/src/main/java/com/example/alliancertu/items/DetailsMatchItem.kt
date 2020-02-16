package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.Match
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.detail_item_rv_table_matches.view.*

class DetailsMatchItem(val match: Match) : Item<ViewHolder>() {
    override fun getLayout(): Int = R.layout.detail_item_rv_table_matches

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.name_first_team.text = match.ourTeam.ourTeamName
        viewHolder.itemView.name_second_team.text = match.opponentTeam.opponenTeamName
        viewHolder.itemView.time_match.text = match.matchTime
        viewHolder.itemView.location_match.text = match.matchLocation
        Picasso.get().load(R.drawable.ic_android_black_24dp)
            .into(viewHolder.itemView.logo_first_Team)
        Picasso.get().load(R.drawable.ic_android_black_24dp)
            .into(viewHolder.itemView.logo_second_team)
    }
}