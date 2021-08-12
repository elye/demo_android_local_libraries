package com.example.simpleexternallibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.easyandroidlibrary.EasyMainActivity
import com.example.simpleandroidlibrary.SimpleMainActivity
import com.example.simplekotlinlibrary.SimpleKotlinClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.my_text).text = SimpleKotlinClass().printMe(1)
        findViewById<Button>(R.id.my_easy_button).setOnClickListener {
            startActivity(Intent(this, EasyMainActivity::class.java))
        }
        findViewById<Button>(R.id.my_simple_button).setOnClickListener {
            startActivity(Intent(this, SimpleMainActivity::class.java))
        }
    }
}
