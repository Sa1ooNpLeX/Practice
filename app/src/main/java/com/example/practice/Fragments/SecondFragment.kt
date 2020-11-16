package com.example.practice.Fragments

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get
import com.example.practice.BuildConfig
import com.example.practice.Models.Cities
import com.example.practice.R
import com.example.practice.Retrofit.APIServices.APIServices
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

@Suppress("DEPRECATION")
class SecondFragment : Fragment() {

    lateinit var sharedPreferences:android.content.SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            sharedPreferences.edit().putString("ID", et.text.toString()).apply()
            Toast.makeText(context,"Смотрите на первой вкладке погоду :)", Toast.LENGTH_LONG).show()
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity)
    }
}