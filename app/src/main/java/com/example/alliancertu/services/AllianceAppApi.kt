package com.example.alliancertu.services

import android.graphics.Bitmap
import com.example.alliancertu.models.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AllianceAppApi {
    @GET("/getPosts")
    fun getPosts(@Query("group") group: String, @Query("count") count: Int, @Query("offset") offset: Int): Call<List<Post>>

    @GET("/getPlayers")
    fun getPlayers(@Query("playerName") playerName: String, @Query("playerPP") playerPP: Bitmap): Call<List<Player>>

    @GET("/getResultsMatches")
    fun getResults(
        @Query("ourNationalTeam") ourNationalTeam: OurNationalTeam, @Query("opponentTeam") opponentNationalTeam: OpponentNationalTeam,
        @Query("ourTeamResult") ourTeamResult: Int, @Query("opponentTeamResult") opponentTeamResult: Int
    ): Call<List<Match>>

    @GET("/getScheduleMatches")
    fun getMatches(
        @Query("ourNationalTeam") ourNationalTeam: OurNationalTeam, @Query("opponentTeam") opponentNationalTeam: OpponentNationalTeam,
        @Query("timeMatch") timeMatch: Int, @Query("locationMatch") locationMatch: String
    )

}