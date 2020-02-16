package com.example.alliancertu.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Match(
     @PrimaryKey var idMatch: Int,
     @ColumnInfo(name = "opponentTeam")var opponentTeam: OpponentNationalTeam,
     @ColumnInfo(name = "ourTeamPP") var ourTeam: OurNationalTeam,
     @ColumnInfo(name = "matchTime") var matchTime: String,
     @ColumnInfo(name = "matchLocation")var matchLocation: String)