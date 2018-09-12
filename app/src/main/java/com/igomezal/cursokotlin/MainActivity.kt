package com.igomezal.cursokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Hello from the Toast!", Toast.LENGTH_LONG).show()

        val layout = findViewById<ConstraintLayout>(R.id.constraint)

        // Snackbar.make(layout, "Hello from the SnackBar!", Snackbar.LENGTH_LONG).show()

        Snackbar.make(layout, "Hello from the SnackBar!", Snackbar.LENGTH_LONG).setAction("UNDO") {
            Snackbar.make(layout, "Operation finished!", Snackbar.LENGTH_LONG).show()
        }.show()
    }
}
