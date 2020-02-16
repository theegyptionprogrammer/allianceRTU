package com.example.alliancertu.viewModules

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitFactory {

    lateinit var apiKey: String

    private val authInceptor = Interceptor {chain ->
        val newUrl = chain.request().url
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
        .client(allianceAppClient)
        .baseUrl("")
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val allianceAppApi: AllianceAppApi = retrofit().create(AllianceAppApi::class.java)
}