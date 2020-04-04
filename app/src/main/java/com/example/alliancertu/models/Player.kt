package com.example.alliancertu.models

import android.graphics.Bitmap


data class Player(
    val idPlayer: Int,
    val playerPP: Bitmap,
    val playerName: String,
    val playerPosition: String,
    val playerAccount: String,
    val listPlayers: ArrayList<Player>
)
