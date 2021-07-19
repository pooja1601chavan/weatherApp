package com.example.mykotlinapp.model

import com.google.gson.annotations.SerializedName

class Coord {
    @SerializedName("lon")
    val lon: Double = 0.0
    @SerializedName("lat")
    val lat: Double = 0.0
}