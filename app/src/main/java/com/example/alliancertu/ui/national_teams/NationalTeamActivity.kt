package com.example.alliancertu.ui.national_teams

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.alliancertu.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_national_team.*

class NationalTeamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_national_team)
        val nationalTeamView : BottomNavigationView = findViewById(R.id.national_team_nav_view)

        val navController = findNavController(R.id.national_team_nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_equipe, R.id.navigation_schedule, R.id.navigation_results
            )
        )
        setupActionBarWithNavController(navController,appBarConfiguration)
        nationalTeamView.setupWithNavController(navController)
        Picasso.get()
            .load(R.drawable.cheerleading)
            .fit()
            .into(logo_national_team)
    }
}
