package com.example.alliancertu.sportClubUI.session

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.alliancertu.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SessionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_session)
        val sessionView: BottomNavigationView = findViewById(R.id.session_nav_view)

        val navController = findNavController(R.id.session_nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_session_information,
                R.id.navigation_Session_media,
                R.id.navigation_session_orgaizers
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        sessionView.setupWithNavController(navController)
    }
}