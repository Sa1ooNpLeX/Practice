package com.example.practice.Retrofit.APIServices

import com.example.practice.Interface.InterfaceAPI
import com.example.practice.Retrofit.ConstClass
import com.example.practice.Retrofit.GetRetrofitClient

object APIServices {
    val retrofitServices:InterfaceAPI
    get() = GetRetrofitClient().getRetrofitClient(ConstClass.BaseUrl).create(InterfaceAPI::class.java)
}