package com.example.alliancertu.nationalTeamsUI.schedule_matches

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

class ScheduleMatchesViewModel : ViewModel() {
    private val coroutineContext: CoroutineContext get() = Dispatchers.Main + Job()
    private val scope = CoroutineScope(coroutineContext)
}
