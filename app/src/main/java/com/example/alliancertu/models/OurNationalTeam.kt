package com.example.alliancertu.models

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class OurNationalTeam (
    @PrimaryKey val ourTeamName: String,
    @ColumnInfo(name = "ourTeamLogo") val ourTeamLogo: Bitmap
)