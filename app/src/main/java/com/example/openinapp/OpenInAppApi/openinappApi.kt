package com.example.openinapp.OpenInAppApi

import com.example.openinapp.ui.Model.Data
import com.example.openinapp.ui.Model.OverallUrlChart
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface openinappApi {
    @GET("dashboardNew")
    fun getdata(@Query("api_key") apiKey: String): Call<OverallUrlChart>
}