package com.example.easyandroidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.simplekotlinlibrary.SimpleKotlinClass

class EasyMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy_main)

        findViewById<TextView>(R.id.my_bottom_text).text = SimpleKotlinClass().printMe(1)

        findViewById<Button>(R.id.my_button).setOnClickListener {
            Toast.makeText(this, SimpleKotlinClass().printOne(), Toast.LENGTH_SHORT).show()
        }
    }
}