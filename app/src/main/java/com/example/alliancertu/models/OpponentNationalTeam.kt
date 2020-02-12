package com.example.alliancertu.models

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class OpponentNationalTeam (
    @PrimaryKey val opponenTeamName:String,
    @ColumnInfo(name = "opponentTeamLogo") val opponentNationalTeamLogo: Bitmap
)