package com.example.alliancertu.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.alliancertu.models.Match
import com.example.alliancertu.models.Player
import com.example.alliancertu.models.ResultMatch

@Dao
interface NationalTeamDao {
    @Query("SELECT * FROM Player")
    fun getPlayers(): LiveData<List<Player>>

    @Query("SELECT * FROM ResultMatch")
    fun getStatisticsNationalTeam(): LiveData<List<ResultMatch>>

    @Query("SELECT * FROM `match`")
    fun getScheduleMatchesNationalTeam(): LiveData<List<Match>>

    @get:Query("SELECT count(*) FROM player")
    val count: Int

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(vararg players: List<Player>)
}