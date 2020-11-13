package Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Stats (

	@SerializedName("Температура")
	@Expose
	val temp : Double?=null,
	@SerializedName("По ощущению")
	@Expose
	val feels_like : Int?=null,
	@SerializedName("Мин. температура")
	@Expose
	val temp_min : Double?=null,
	@SerializedName("Макс. температура")
	@Expose
	val temp_max : Double?=null,
	@SerializedName("Давление")
	@Expose
	val pressure : Int?=null,
	@SerializedName("Влажность")
	@Expose
	val humidity : Int?=null
)