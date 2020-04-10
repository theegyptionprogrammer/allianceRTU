package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.Player
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_player.view.*

class PlayerItem(val player: Player) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.item_player

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tv_fno_player.text = player.playerName
        viewHolder.itemView.tv_postion_player.text = player.playerPosition
        Picasso.get().load(R.drawable.ic_android_black_24dp)
            .into(viewHolder.itemView.profile_pic_player)
    }
}