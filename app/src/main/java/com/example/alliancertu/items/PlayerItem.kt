package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.Player
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_rv_equipe.view.*

class PlayerItem(val player: Player) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.item_rv_equipe

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.playerName.text = player.playerName
        Picasso.get().load(R.drawable.ic_android_black_24dp).into(viewHolder.itemView.playerPP)
    }
}