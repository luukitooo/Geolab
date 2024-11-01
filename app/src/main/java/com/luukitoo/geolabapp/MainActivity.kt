package com.luukitoo.geolabapp

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val continueButton = findViewById<Button>(R.id.continueButton)

        continueButton.setOnClickListener {
            val welcomeActivityIntent = Intent(this, WelcomeActivity::class.java)
            startActivity(welcomeActivityIntent)
        }
    }
}
