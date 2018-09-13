package com.igomezal.cursokotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.igomezal.cursokotlin.R

class ClickEventsActivity : AppCompatActivity(), View.OnLongClickListener {

    // 1) Click XML
    // 2) Click in line
    // 3) Click by ids in 'when'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_events)

        clickInLine()

        val btn1 = findViewById<Button>(R.id.btnClickMulti1)
        val btn2 = findViewById<Button>(R.id.btnClickMulti2)
        val btn3 = findViewById<Button>(R.id.btnClickMulti3)

        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)
    }

    /*
    *
    * Rules:
    *
    * The method must be public
    * Same name as in the XML
    * Only gets one parameter (View)
    *
    * */
    fun xmlClick(view: View) {
        Toast.makeText(this, "Click by XML!", Toast.LENGTH_LONG).show()
    }

    private fun clickInLine() {
        val btn = findViewById<Button>(R.id.btnClickInLine)
        btn.setOnClickListener{ Toast.makeText(this, "Click in Line!", Toast.LENGTH_LONG).show() }
    }

    override fun onLongClick(view: View): Boolean {
        when(view.id) {
            R.id.btnClickMulti1 -> Toast.makeText(this, "Click Multi 1!", Toast.LENGTH_LONG).show()
            R.id.btnClickMulti2 -> Toast.makeText(this, "Click Multi 2!", Toast.LENGTH_LONG).show()
            R.id.btnClickMulti3 -> Toast.makeText(this, "Click Multi 3!", Toast.LENGTH_LONG).show()
        }
        return true
    }
}
