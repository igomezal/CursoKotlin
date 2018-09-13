package com.igomezal.cursokotlin.activities

import android.os.Bundle
import com.igomezal.cursokotlin.R

class LifeCycleActivity : LifeCycleEventsAuxiliar() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }
}
