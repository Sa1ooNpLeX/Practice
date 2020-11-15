package com.example.practice.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GetRetrofitClient{
    private var retrofit: Retrofit?=null
    fun getRetrofitClient(baseUrl:String):Retrofit{
        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit!!
    }
}