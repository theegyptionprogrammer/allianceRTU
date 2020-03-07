package com.example.alliancertu.nationalTeamsUI.result_matches

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alliancertu.models.ResultMatch
import com.example.alliancertu.viewModules.RetrofitFactory
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class ResultMatchesViewModel : ViewModel() {


    private val coroutineContext: CoroutineContext get() = Dispatchers.Main + Job()
    private val scope = CoroutineScope(coroutineContext)
    val resultMatchesLiveData = MutableLiveData<MutableList<ResultMatch>>()

    val resultMatchService = RetrofitFactory.cckApi

    fun getResultMatch() {
        scope.launch {
            //            val resultMatch = resultMatchesRepository.getResultsMatches()
//            resultMatchesLiveData.postValue(resultMatch)
        }
    }

    fun cancelRequests() = coroutineContext.cancel()
}

/*
        GlobalScope.launch(Dispatchers.Main) {
            val postRequest = service.getPosts()
            try {
                val response = postRequest.await()
                if(response.isSuccessful){
                    val posts = response.body()
                }else{
                    Log.d("MainActivity ",response.errorBody().toString())
                }

            }catch (e: Exception){

            }
        }
 */