package com.example.openinapp.OpenInAppApi

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val baseurl = "https://api.inopenapp.com/api/v1/"
object openinappclient {
    val retofitClient: Retrofit.Builder by lazy {

        Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
    }
    val apiinterface:openinappApi by lazy {
        retofitClient.build().create(openinappApi::class.java)
    }

}