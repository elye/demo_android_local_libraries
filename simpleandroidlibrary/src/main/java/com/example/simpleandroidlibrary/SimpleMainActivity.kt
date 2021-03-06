package com.example.simpleandroidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.simplekotlinlibrary.SimpleKotlinClass

/**
 * <h1>Simple Main Activity</h1>
 * Testing as activity from another library
 *
 * @author  Elye
 * @version 1.0
 * @since   11-08-21
 */
class SimpleMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_main)

        findViewById<TextView>(R.id.my_bottom_text).text = SimpleKotlinClass().printMe(1)

        findViewById<Button>(R.id.my_button).setOnClickListener {
            Toast.makeText(this, SimpleKotlinClass().printOne(), Toast.LENGTH_SHORT).show()
        }

    }
}