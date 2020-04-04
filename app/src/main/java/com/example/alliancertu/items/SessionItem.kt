package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.Session
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder

class SessionItem(private val session: Session) : Item<ViewHolder>() {
    override fun getLayout(): Int = R.layout.activity_session

    override fun bind(viewHolder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}