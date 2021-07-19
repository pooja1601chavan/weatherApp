package com.example.mykotlinapp.model

import com.google.gson.annotations.SerializedName

class City {
    @SerializedName("id")
    val id: Int = 0
    @SerializedName("name")
    val name: String = ""
    @SerializedName("country")
    val country: String = ""
}