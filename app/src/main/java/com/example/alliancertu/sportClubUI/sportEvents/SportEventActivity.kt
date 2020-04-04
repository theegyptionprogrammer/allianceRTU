package com.example.alliancertu.sportClubUI.sportEvents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.alliancertu.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SportEventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_event)
        val sportClubView: BottomNavigationView = findViewById(R.id.sport_club_nav_view)

        val navController = findNavController(R.id.sport_event_nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_sport_event_information,
                R.id.navigation_sport_event_media,
                R.id.navigation_sport_event_teams
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        sportClubView.setupWithNavController(navController)
    }
}