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
	}
	class Description{
		@SerializedName("description")
		@Expose
		var description: String?=null
	}
	class Clouds {

		@SerializedName("clouds")
		@Expose
		var clouds: Double? = null
	}
	class Wind{
		@SerializedName("windsp")
		@Expose
		var windsp: Double? = null
	}
}
