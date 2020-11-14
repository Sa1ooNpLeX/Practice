package com.example.practice.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class City(

    @SerializedName("Город")
    @Expose
    val city : String?=null
)