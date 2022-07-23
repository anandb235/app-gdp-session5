package com.android.appgdpsession

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var backButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.i("MainActivity", "B Created")
        val diceCount = intent.extras?.getInt("DiceCount")

        backButton = findViewById(R.id.backButton)
        textView = findViewById(R.id.activity2Text)
        textView.text = "Dice rolled $diceCount"

        backButton.setOnClickListener{
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "2 Started")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "2 Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "2 Pause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "2 Restarted")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "2 Stopped")
    }
}