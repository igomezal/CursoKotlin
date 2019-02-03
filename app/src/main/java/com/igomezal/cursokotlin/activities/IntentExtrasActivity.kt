package com.igomezal.cursokotlin.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.igomezal.cursokotlin.R
import com.igomezal.cursokotlin.models.Student
import kotlinx.android.synthetic.main.activity_intent_extras.*

class IntentExtrasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)

        buttonBack.setOnClickListener { startActivity(Intent(this, IntentsActivity::class.java)) }

        val isExtraSet = setIntentExtrasFromPreviousActivity()

        val isParcelableSet = setParcelaleFromPreviousActivity()

        if(!isExtraSet && !isParcelableSet) {
            checkBoxDeveloper.visibility = View.INVISIBLE
        }
    }

    private fun setIntentExtrasFromPreviousActivity(): Boolean {
        val name: String? = intent.getStringExtra("name")
        val lastName: String? = intent.getStringExtra("lastName")
        val age: Int = intent.getIntExtra("age", -1)
        val developer: Boolean = intent.getBooleanExtra("developer", false)

        if(name != null && lastName != null && age >= 0) {
            textViewName.text = name
            textViewLastName.text = lastName
            textViewAge.text = "$age"
            checkBoxDeveloper.isChecked = developer

            return true
        }

        return false
    }

    private fun setParcelaleFromPreviousActivity(): Boolean {
        val student = intent.getParcelableExtra<Student>("student")
        student?.let {
            textViewName.text = student.name
            textViewLastName.text = student.lastName
            textViewAge.text = "${student.age}"
            checkBoxDeveloper.isChecked = student.isDeveloper

            return true
        }

        return false
    }
}
