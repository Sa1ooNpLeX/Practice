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
import android.widget.TextView
import android.widget.Toast
import com.example.practice.BuildConfig
import com.example.practice.Interface.InterfaceAPI
import com.example.practice.Models.APIExample
import com.example.practice.Models.Stats
import com.example.practice.R
import com.example.practice.Retrofit.APIServices.APIServices
import kotlinx.android.synthetic.main.fragment_first.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

@Suppress("DEPRECATION")
class FirstFragment : Fragment() {

    lateinit var sharedPreferences: android.content.SharedPreferences
    lateinit var api: InterfaceAPI

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val shared= sharedPreferences.getString("ID","")
        if (sharedPreferences.contains("ID") && shared!="") {
            cities.text = shared
            retrofit()
        }
        else
        {
            progressBar.visibility=View.GONE
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(activity)
    }
    private fun retrofit(){
        api= APIServices.retrofitServices
        val call=api.getWeather(cities.text.toString(), "metric", "ru", BuildConfig.WEATHER_api_key)
        call.enqueue(object : Callback<APIExample> {
            override fun onFailure(call: Call<APIExample>, t: Throwable) {
                Log.d("TAG",t.message.toString())
            }
            @SuppressLint("SetTextI18n")
            override fun onResponse(call: Call<APIExample>, response: Response<APIExample>) {
                if (response.isSuccessful) {
                    stats(response.body()!!)
                }
                else{
                    Toast.makeText(context,"Проверьте корректность написания города", Toast.LENGTH_LONG).show()
                }
            }
        })
    }
    fun dataAcquisition(){
        relativeLayout.visibility=View.GONE
        val shared= sharedPreferences.getString("Elects","")
        if (sharedPreferences.contains("Elects") && shared!="") {
            cities.text = shared
            retrofit()
        }
        else
        {
            context?.let { com.example.practice.Dialog().dialogInformation(it,"Первый вход","Перейдите во вторую вкладку и выберите город") }
            progressBar.visibility=View.GONE
        }
    }
    @SuppressLint("SetTextI18n", "DefaultLocale")
    fun stats(myData:APIExample){
        val mainEx=myData.stats
        val temperat=mainEx?.temp?.toInt()
        temp.text = temperat.toString()+" °C"
        description.text=myData.weather?.get(0)?.description.toString().capitalize()
        pressure.text=(mainEx?.pressure!! /1.33307087).toInt().toString()+" мм рт.ст"
        humidity.text=mainEx.humidity?.toInt().toString()+" %"


        if(temperat!! > 15){
            advice.text="Иди на прогулку"
        }
        else{
            advice.text="Сиди дома"
        }


        progressBar.visibility=View.GONE
    }
}
////////////////////////////////////////////////////////////////////////////////Вывод городов через листвью не смог сделать, до последнего мучался, поэтому сделал выбор города как у Юдахина.