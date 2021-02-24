package com.ngmatt.weedmapsandroidcodechallenge.repository

import com.ngmatt.weedmapsandroidcodechallenge.BuildConfig

object ConfigurationRepository {
    val yelpBaseApiUrl: String
        get() = BuildConfig.YELP_BASE_URL

    val yelpApiKey: String
        get() = BuildConfig.YELP_FUSION_API_KEY
}