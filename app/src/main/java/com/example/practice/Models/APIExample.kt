package com.example.practice.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class APIExample {
    @SerializedName("main")
    @Expose
    val stats:Stats.Main?=null

    @SerializedName("weather")
    @Expose
    val weather:List<Stats.Weather>?=null

    @SerializedName("clouds")
    @Expose
    val clouds: Stats.Weather?=null

    @SerializedName("wind")
    @Expose
    val wind:Stats.Wind?=null
}