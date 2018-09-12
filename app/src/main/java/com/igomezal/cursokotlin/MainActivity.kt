package com.igomezal.cursokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.Toast
import com.igomezal.cursokotlin.activities.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLifeCycle = findViewById<Button>(R.id.button_to_cycle)
        val btnClickEvents = findViewById<Button>(R.id.button_to_click)
        val btnAndroidExt = findViewById<Button>(R.id.button_to_android_extensions)
        val btnPicasso = findViewById<Button>(R.id.button_to_picasso)
        val btnListView = findViewById<Button>(R.id.button_to_list_view)
        val btnIntents = findViewById<Button>(R.id.button_to_intents)
        val btnPermission = findViewById<Button>(R.id.button_to_permissions)
        val btnSharedPreferences = findViewById<Button>(R.id.button_to_preferences)
        val btnExtensionFunctions = findViewById<Button>(R.id.button_to_extension_functions)

        btnLifeCycle.setOnClickListener{ goToLifeCycleActivity() }
        btnClickEvents.setOnClickListener{ goToClickEventsActivity() }
        btnAndroidExt.setOnClickListener{ goToAndroidExtActivity() }
        btnPicasso.setOnClickListener{ goToPicassoActivity() }
        btnListView.setOnClickListener{ goToListViewActivity() }
        btnIntents.setOnClickListener{ goToIntentsActivity() }
        btnPermission.setOnClickListener{ goToPermissionActivity() }
        btnSharedPreferences.setOnClickListener{ goToSharedPreferencesActivity() }
        btnExtensionFunctions.setOnClickListener{ goToExtensionFunctionsActivity() }

    }

    fun showToast() {
        Toast.makeText(this, "Hello from the Toast!", Toast.LENGTH_LONG).show()
    }

    fun showSnackBar() {
        val layout = findViewById<ConstraintLayout>(R.id.constraint)

        Snackbar.make(layout, "Hello from the SnackBar!", Snackbar.LENGTH_LONG).show()

        Snackbar.make(layout, "Hello from the SnackBar!", Snackbar.LENGTH_LONG).setAction("UNDO") {
            Snackbar.make(layout, "Operation finished!", Snackbar.LENGTH_LONG).show()
        }.show()
    }

    private fun goToLifeCycleActivity() = startActivity(Intent(this, LifeCycleActivity::class.java))
    private fun goToClickEventsActivity() = startActivity(Intent(this, ClickEventsActivity::class.java))
    private fun goToAndroidExtActivity() = startActivity(Intent(this, KotlinAndroidExtensionsActivity::class.java))
    private fun goToPicassoActivity() = startActivity(Intent(this, PicassoActivity::class.java))
    private fun goToListViewActivity() = startActivity(Intent(this, ListViewActivity::class.java))
    private fun goToIntentsActivity() = startActivity(Intent(this, IntentsActivity::class.java))
    private fun goToPermissionActivity() = startActivity(Intent(this, PermissionsActivity::class.java))
    private fun goToSharedPreferencesActivity() = startActivity(Intent(this, SharedPreferencesActivity::class.java))
    private fun goToExtensionFunctionsActivity() = startActivity(Intent(this, ExtensionFunctionsActivity::class.java))

}
