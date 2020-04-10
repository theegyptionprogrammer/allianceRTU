package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.Post
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder

class PostItem(val post: Post) : Item<ViewHolder>() {
    override fun getLayout(): Int = R.layout.item_post

    override fun bind(viewHolder: ViewHolder, position: Int) {
    }
}