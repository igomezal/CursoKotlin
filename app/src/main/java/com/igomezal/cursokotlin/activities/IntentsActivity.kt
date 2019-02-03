package com.igomezal.cursokotlin.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.igomezal.cursokotlin.R
import com.igomezal.cursokotlin.models.Student
import kotlinx.android.synthetic.main.activity_intents.*

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        buttonIntentExtras.setOnClickListener { goIntentExtras() }
        buttonIntentFlags.setOnClickListener { goIntentFlags() }
        buttonIntentObject.setOnClickListener { goIntentObject() }
    }

    private fun goIntentExtras() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        intent.putExtra("name", "Iván")
        intent.putExtra("lastName", "Gómez")
        intent.putExtra("age", 23)
        intent.putExtra("developer", true)
        startActivity(intent)
    }

    private fun goIntentFlags() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        // intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY // New activity is not stored in the stack
        // intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION // No animation
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK // Clear stack
        startActivity(intent)
        // finish() // Current activity is destroyed
    }

    private fun goIntentObject() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        val student = Student("Iván", "Gómez", 23, true)
        intent.putExtra("student", student)
        startActivity(intent)
    }
}
