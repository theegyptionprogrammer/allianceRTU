package com.example.alliancertu.modules

import kotlinx.android.parcel.Parcelize

class Match(
     var ourTeam: String,
     var opponentTeam: String,
     var ourTeamPP: String,
     var opponentTeamPP: String,
     var matchTime: Int,
     var matchLocation: String) {

    constructor():this ("", "", "", "", 0, "")
}