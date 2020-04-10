package com.example.alliancertu.Repositories

import com.example.alliancertu.database.NationalTeamDao
import com.example.alliancertu.services.RetrofitApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber

class PlayerRepository(val nationalTeamApi: RetrofitApi, val nationalTeamDao: NationalTeamDao) {

    fun getPlayers() = nationalTeamDao.getPlayers()

    suspend fun refreshUsers() {
        withContext(Dispatchers.IO) {
            try {
                nationalTeamDao.insert(nationalTeamApi.getPlayers())
            } catch (e: Exception) {
                Timber.e(e)
            }
        }
    }


}