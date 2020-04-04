package com.example.alliancertu.models


data class Match(
     var idMatch: Int,
     var opponentTeam: OpponentNationalTeam,
     var ourTeam: OurNationalTeam,
     var matchTime: String,
     var matchLocation: String,
     var match: ArrayList<Match>
)