package com.example.alliancertu.models


data class ResultMatch(
    val idMatch: String,
    var opponentTeam: OpponentNationalTeam,
    var ourTeam: OurNationalTeam,
    val resultOurTeam: String,
    val resultOpponentTeam: String,
    val resultMatch: MutableList<ResultMatch>

)


