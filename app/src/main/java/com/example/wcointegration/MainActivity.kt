package com.example.wcointegration

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Entry point for the sample app.
 */
class MainActivity : AppCompatActivity() {

    private val checkoutLauncherButton: Button by lazy {
        findViewById(R.id.btn_checkout_launcher)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkoutLauncherButton.setOnClickListener {
            // start new activity to simulate an app with activity stack
            startActivity(Intent(this, WcoLauncherActivity::class.java))
        }
    }
}
