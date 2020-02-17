package com.example.alliancertu.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ResultMatch(
    @PrimaryKey val idMatch: String,
    @ColumnInfo(name = "opponentTeam") var opponentTeam: OpponentNationalTeam,
    @ColumnInfo(name = "ourTeamPP") var ourTeam: OurNationalTeam,
    @ColumnInfo(name = "resultOurTeam") val resultOurTeam: String,
    @ColumnInfo(name = "resultOpponentTeam") val resultOpponentTeam: String
)