package com.igomezal.cursokotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.igomezal.cursokotlin.R

class LifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }
}
