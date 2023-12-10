package com.example.ecommerceapp.dataCLass

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

val base_URL="https://klinq.com/"

fun getInstance():Retrofit{
    return Retrofit.Builder().baseUrl(base_URL).addConverterFactory(GsonConverterFactory.create()).build()
}


}