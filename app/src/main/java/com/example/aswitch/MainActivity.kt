package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch1 = findViewById<Switch>(R.id.switch1)
        switch1?.setOnCheckedChangeListener { _, isChecked ->
            val message = if (isChecked) "Switch1:ON" else "Switch1:OFF"
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
        }

        val switch2 = findViewById<Switch>(R.id.switch2)
        switch2?.setOnCheckedChangeListener { _, isChecked ->
            val message = if (isChecked) "Switch2:ON" else "Switch2:OFF"
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
        }
    }
    }
