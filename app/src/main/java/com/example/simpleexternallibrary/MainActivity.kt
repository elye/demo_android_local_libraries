package com.example.simpleexternallibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.simpleandroidlibrary.SimpleMainActivity
import com.example.simplekotlinlibrary.SimpleKotlinClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.my_text).text = SimpleKotlinClass().getMeAnything(1)
        findViewById<Button>(R.id.my_button).setOnClickListener {
            startActivity(Intent(this, SimpleMainActivity::class.java))
        }
    }
}
