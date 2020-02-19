package com.example.alliancertu.models

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Organizer(
    @PrimaryKey val idOrganizer: String,
    @ColumnInfo(name = "organizerPP") val organizerPP: Bitmap,
    @ColumnInfo(name = "organizerName") val organizerName: String,
    @ColumnInfo(name = "organizerRole") val organizerRole: String,
    @ColumnInfo(name = "organizerContact") val organizerContact: String
)