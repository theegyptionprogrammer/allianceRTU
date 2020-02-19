package com.example.alliancertu.items

import com.example.alliancertu.R
import com.example.alliancertu.models.Organizer
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_rv_organizer_event.view.*


class OrganizerItem(val organizer: Organizer) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.item_rv_organizer_event

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tv_name_organizer_event.text = organizer.organizerName
        viewHolder.itemView.tv_role_organizer_event.text = organizer.organizerRole
        viewHolder.itemView.tv_contact_organizer_event.text = organizer.organizerContact
        Picasso.get().load(R.drawable.ic_android_black_24dp)
            .into(viewHolder.itemView.pp_organizer_event)
    }
}