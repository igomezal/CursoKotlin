package com.igomezal.cursokotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.igomezal.cursokotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picasso.*

class PicassoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        buttonImageLoader.setOnClickListener { loadImages() }

        Picasso.with(this).load("https://images.pexels.com/photos/1317844/pexels-photo-1317844.jpeg").fetch()
    }

    private fun loadImages() {
        Picasso
                .with(this)
                .load("https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg")
                .transform(CircleTransform())
                .into(firstImage)

        Picasso
                .with(this)
                .load("https://images.pexels.com/photos/1317844/pexels-photo-1317844.jpeg")
                .fit()
                .into(secondImage)

        Picasso
                .with(this)
                .load("https://images.pexels.com/photos/22346/pexels-photo.jpg")
                .fit()
                .into(thirdImage)
    }
}
