package com.example.practice.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class APIExample {
    @SerializedName("main")
    @Expose
    val stats:Stats.Main?=null

    @SerializedName("description")
    @Expose
    val descript:List<Stats.Description>?=null

    @SerializedName("clouds")
    @Expose
    val clouds:Stats.Clouds?=null

    @SerializedName("wind")
    @Expose
    val wind:Stats.Wind?=null
}