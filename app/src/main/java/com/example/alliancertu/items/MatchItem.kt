package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.modules.Match
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.detail_item_rv_table_matches.view.name_first_team
import kotlinx.android.synthetic.main.detail_item_rv_table_matches.view.name_second_team
import kotlinx.android.synthetic.main.item_rv_schedule_matches.view.*

class MatchItem(private val match: Match): Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.item_rv_schedule_matches

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.name_first_team.text = match.ourTeam
        viewHolder.itemView.name_second_team.text = match.opponentTeam
        Picasso.get().load(R.drawable.ic_android_black_24dp).into(viewHolder.itemView.first_team_pp)
        Picasso.get().load(R.drawable.ic_android_black_24dp).into(viewHolder.itemView.second_team_pp)
    }
}