package com.example.alliancertu.models

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Event(
    @PrimaryKey val id: String,
    @ColumnInfo(name = "eventLogo") val eventLogo: Bitmap,
    @ColumnInfo(name = "eventName") val eventName: String,
    @ColumnInfo(name = "eventVkLink") val eventVkLink: String,
    @ColumnInfo(name = "eventInstLink") val eventInstLink: String,
    @ColumnInfo(name = "eventDescription") val eventDescription: String,
    @ColumnInfo(name = "eventOrganizer") val eventOrganizer: Organizer
)