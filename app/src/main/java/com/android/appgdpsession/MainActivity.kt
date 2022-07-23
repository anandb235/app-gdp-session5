package com.android.appgdpsession

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    private lateinit var bottomNavView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "Created")

        openFragment(DiceFragment())
        bottomNavView = findViewById(R.id.bottomNavigationView)

        bottomNavView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.rollNavItem -> {
                    openFragment(DiceFragment())
                    true
                }

                R.id.counterNavItem -> {
                    openFragment(CounterFragment())
                    true
                }
                else -> false
            }
        }

    }

    private fun openFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()

    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "Started")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "Pause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "Restarted")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "Stopped")
    }
}