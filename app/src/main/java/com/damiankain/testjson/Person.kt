package com.damiankain.testjson

import com.google.gson.annotations.SerializedName

class Person (
    val id: Long,
    val name: String,
    @SerializedName ("image")
    val avatar : String,
    @SerializedName ("species")
    val species : String
        )