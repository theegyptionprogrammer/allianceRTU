package com.example.alliancertu.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.alliancertu.models.Player
import com.example.alliancertu.viewModules.App

@Database(entities = [Player::class], version = AppDatabase.VERSION)
abstract class AppDatabase : RoomDatabase() {

    abstract fun appDao(): NationalTeamDao

    companion object {
        private const val DB_NAME = "food.db"
        const val VERSION = 1
        private val instance: AppDatabase by lazy { create(App.instance) }

        @Synchronized
        internal fun getInstance(): AppDatabase {
            return instance
        }

        private fun create(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                DB_NAME
            )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}
