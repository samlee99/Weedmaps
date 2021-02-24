package com.ngmatt.weedmapsandroidcodechallenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

/**
 * Created by Matt Ng on 9/14/20
 */
class YelpSearchActivity: AppCompatActivity() {

    private lateinit var viewModel: YelpSearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(YelpSearchViewModel::class.java)

    }
}