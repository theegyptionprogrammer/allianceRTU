package com.example.alliancertu.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Player(
    @PrimaryKey val profilePhoto: ArrayList<*>,
    @ColumnInfo(name = "playerName") val playerName: String,
    @ColumnInfo(name = "position") val position: String)
