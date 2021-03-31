package com.toptek.mvvmkotlin.modle.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class RetrofitUtility @Inject constructor() {
    private val baseUrl: String = "https://api.androidhive.info/"
    public var client: APIServer

    init {
        var builder = Retrofit.Builder()
        builder.baseUrl(baseUrl)
        builder.addConverterFactory(GsonConverterFactory.create())
        var retrofit = builder.build()
        client = retrofit.create(APIServer::class.java)

    }

}