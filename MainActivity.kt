package com.example.netologyvoiceassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "Start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        var age: Int = 37
        var height: Double = 172.2

        val output: TextView = findViewById(R.id.output)
        output.text = "name: $name \n" +
                "surname: $surname \n" +
                "age: $age \n" +
                "height: $height "

        Log.d(TAG,"end of onCreate function")
    }
}