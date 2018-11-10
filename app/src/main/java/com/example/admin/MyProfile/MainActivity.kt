package com.example.admin.MyProfile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var profilePhoto: ImageView? = null
    var EducationButton: Button? = null
    var ExpButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
        profilePhoto = findViewById(R.id.profilePhoto)
        profilePhoto?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,ProfilePhoto::class.java)
            startActivity(clickIntent)
        })

        EducationButton = findViewById(R.id.eduButton)
        EducationButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,Education::class.java)
            startActivity(clickIntent)
        })
        ExpButton = findViewById(R.id.workExpButton)
        ExpButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,WorkExperience::class.java)
            startActivity(clickIntent)
        })

    }
}
