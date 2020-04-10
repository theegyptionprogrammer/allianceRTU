package com.example.alliancertu.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Match(
    @PrimaryKey var idMatch: Int,
    @ColumnInfo(name = "opponentTeam") var opponentTeam: OpponentNationalTeam,
    @ColumnInfo(name = "ourTeam") var ourTeam: OurNationalTeam,
    @ColumnInfo(name = "matchTime") var matchTime: String,
    @ColumnInfo(name = "matchLocation") var matchLocation: String,
    @ColumnInfo(name = "listMatch") var listMatch: ArrayList<Match>
)