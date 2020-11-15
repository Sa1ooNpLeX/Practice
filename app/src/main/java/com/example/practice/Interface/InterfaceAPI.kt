package com.example.practice.Interface

import com.example.practice.Models.APIExample
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface InterfaceAPI {

    @GET("weather")
    fun getWeather(
        @Query("q") city: String,
        @Query("units") units: String,
        @Query("lang") lang: String,
        @Query("appid") api_key: String
    ): Call<APIExample>
}