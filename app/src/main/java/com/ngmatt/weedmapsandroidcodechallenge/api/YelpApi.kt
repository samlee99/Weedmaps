package com.ngmatt.weedmapsandroidcodechallenge.api

import com.ngmatt.weedmapsandroidcodechallenge.repository.ConfigurationRepository
import okhttp3.OkHttpClient
import retrofit2.Retrofit

object YelpApi {
    val yelpDataService: YelpDataService by lazy {
        Retrofit.Builder()
            .baseUrl(ConfigurationRepository.yelpBaseApiUrl)
            .client(OkHttpClient.Builder().build())
            .build()
            .create(YelpDataService::class.java)
    }
}