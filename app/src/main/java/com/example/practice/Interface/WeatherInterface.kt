package com.example.practice.Interface

import com.example.practice.Models.Stats
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherInterface {
    @GET("weather")
    fun getWeather(@Query("api_key") key: String): Call<Stats>
}