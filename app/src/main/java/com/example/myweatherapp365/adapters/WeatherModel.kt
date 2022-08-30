package com.example.myweatherapp365.adapters

data class WeatherModel(    // data class - variable group
    val city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val imageUrl: String,
    val hours: String
)
/*

You can add more data to this group such as wind speed, etc.
Now you can open MainViewModel  can be exchanged for String - WeatherModel
val liveDataCurrent = MutableLiveData<String>()
val liveDataCurrent = MutableLiveData<WeatherModel>()
 */