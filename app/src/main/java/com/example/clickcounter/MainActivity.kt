package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var buttonUp : Button
    lateinit var buttonDown : Button
    var szam = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Init()

        buttonUp.setOnClickListener {

        }
    }

    fun Init() {
        textView = findViewById(R.id.tv_szam)
        textView.setText(szam.toString())
        buttonUp = findViewById(R.id.button_up)
        buttonDown = findViewById(R.id.button_down)
    }
}