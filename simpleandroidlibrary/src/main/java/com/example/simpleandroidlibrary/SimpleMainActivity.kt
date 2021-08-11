package com.example.simpleandroidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
    }
}