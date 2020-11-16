package com.example.practice.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Stats {
	class Main {
		@SerializedName("temp")
		@Expose
		var temp: Double? = null

		@SerializedName("pressure")
		@Expose
		var pressure: Double? = null

		@SerializedName("humidity")
		@Expose
		var humidity: Double? = null
	}
	class Weather {
		@SerializedName("description")
		@Expose
		var description: String? = null
	}

	class Clouds {
		@SerializedName("all")
		@Expose
		var all: Double? = null
	}

	class Wind{
		@SerializedName("windsp")
		@Expose
		var speed: Double? = null
	}
}
