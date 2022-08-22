package com.example.helloworldandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // show this layout file: activity main
        setContentView(R.layout.activity_main)


        // User can tap a button to change the text color of the label
        // 1. add a button to our layout
        // 2. set up logic to know when user has tapped on botton
        // change the color of text

        // get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            // handle button tap
            Log.i("Nancy", "Tapped on button")
            // get a reference to the text view
            // set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }


    }
}