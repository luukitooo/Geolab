package com.luukitoo.geolabapp

import android.os.Bundle
import android.util.Log.d
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        findViewById<ImageView>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}