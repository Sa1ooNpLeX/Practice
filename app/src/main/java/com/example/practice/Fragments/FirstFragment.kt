package com.example.practice.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.practice.Interface.WeatherInterface
import com.example.practice.Models.Stats
import com.example.practice.R
import com.example.practice.ServiceBuilder
import kotlinx.android.synthetic.main.fragment_first.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragment : Fragment() {


     fun onViewCreated(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_first, container, false)
         var temp: TextView = rootView.findViewById(R.id.temperature)
         var et = "Moscow"
         var api_key = "e3750cf0488f280aa41b3c52528aea8e"
        return rootView

    }

}