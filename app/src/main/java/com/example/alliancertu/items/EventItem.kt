package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.Event
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_rv_events.view.*

class EventItem(val event: Event) : Item<ViewHolder>() {
    override fun getLayout(): Int = R.layout.item_rv_events

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tv_event_description.text = event.eventName
        viewHolder.itemView.tv_vk_link_event.text = event.eventVkLink
        viewHolder.itemView.tv_insta_link_event.text = event.eventInstLink
        viewHolder.itemView.tv_event_description.text = event.eventDescription
        Picasso.get().load(R.drawable.ic_android_black_24dp).into(viewHolder.itemView.logo_event)
    }

}