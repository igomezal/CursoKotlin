package com.igomezal.cursokotlin.activities

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.igomezal.cursokotlin.R

class LifeCycleActivity : LifeCycleEventsAuxiliar() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    override fun onBackPressed() {
        if(exitEnabled) {
            super.onBackPressed()
        }
        exitEnabled = true
        Toast.makeText(this, "Press back button again to exit this screen.", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({ exitEnabled = false }, 2000)
    }
}
