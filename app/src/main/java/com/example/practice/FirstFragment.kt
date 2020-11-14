package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.Interface.WeatherInterface
import com.example.practice.Models.Stats
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_first, container, false)

        return rootView
        val temper =
        val request = ServiceBuilder.buildService(WeatherInterface::class.java)
        val call = request.getWeather(getString(R.string.api_key))

        call.enqueue(object : Callback<Stats> {
            override fun onResponse(call: Call<Stats>, response: Response<Stats>) {
                if (response.isSuccessful){
                    temp =
                    }
                }
            }
            override fun onFailure(call: Call<Stats>, t: Throwable) {
                Toast.makeText(this@FirstFragment, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}