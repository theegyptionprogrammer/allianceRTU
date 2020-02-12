package com.example.alliancertu.viewModules

import com.example.alliancertu.models.Post
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface AllianceAppApi {
    @GET("/getPosts")
    fun getPosts(@Query("group") group: String, @Query("count") count: Int, @Query("offset") offset: Int): Call<List<Post>>
}