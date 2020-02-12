package com.example.alliancertu.viewModules

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import java.time.Duration

object AllianceAppService{

    lateinit var apiKey: String

    private val authInceptor = Interceptor {chain ->
        val newUrl = chain.request().url()
            .newBuilder()
            .addQueryParameter("api_key", apiKey)
            .build()

        val newRequest = chain.request()
            .newBuilder()
            .url(newUrl)
            .build()

        chain.proceed(newRequest)
    }

    private val allianceAppClient = OkHttpClient().newBuilder()
        .addInterceptor(authInceptor)
        .build()

    fun retrofit() : Retrofit = Retrofit.Builder()
        .addConverterFactory()

}