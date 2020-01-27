package com.okaythis.okaypoc.network.retrofit

import com.okaythis.okaypoc.BuildConfig
import com.okaythis.okaypoc.network.Network
import com.okaythis.okaypoc.network.TransactionsApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitWrapper: Network {

    val BASE_URL = BuildConfig.SERVER_URL
    private fun createClient() =
        Retrofit.Builder().baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

   override fun getTransactionsApi(): TransactionsApi {
        val retrofit = this.createClient()
        return retrofit.create(TransactionsApi::class.java)
    }
}