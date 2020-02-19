package com.example.alliancertu.models

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Player(
    @PrimaryKey val idPlayer: Int,
    @ColumnInfo(name = "playerPP") val playerPP: Bitmap,
    @ColumnInfo(name = "playerName") val playerName: String,
    @ColumnInfo(name = "playerPosition") val playerPosition: String
)
