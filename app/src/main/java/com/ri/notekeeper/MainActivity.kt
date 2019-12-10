package com.ri.notekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPressed.setOnClickListener() {
            val originalValue = textDisplayedValue.text.toString().toInt()
            val newValue = originalValue * 2
            textDisplayedValue.text = newValue.toString()
        }
    }
}
