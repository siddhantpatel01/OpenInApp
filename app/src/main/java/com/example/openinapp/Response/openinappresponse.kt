package com.example.openinapp.Response

import com.example.openinapp.ui.Model.Data
import com.example.openinapp.ui.Model.OverallUrlChart
import com.google.gson.annotations.SerializedName

class openinappresponse {
    @SerializedName("results")
    var datalist = ArrayList<OverallUrlChart>()
}