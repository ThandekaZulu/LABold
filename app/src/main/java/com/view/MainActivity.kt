package com.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mazulu.la.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //duration of splash screen appearance, 3 seconds = 3000 milliseconds
        Thread.sleep(3000L)
        setContentView(R.layout.activity_main)
    }
}