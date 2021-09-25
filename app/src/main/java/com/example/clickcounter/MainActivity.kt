package com.example.clickcounter

import android.graphics.Color
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
            szam++
            textView.setText(szam.toString())
            if (checkIfPrime(szam)) {
                textView.setTextColor(Color.rgb(255, 255, 255))
            } else if (szam == 0) {
                textView.setTextColor(Color.rgb(40, 40, 255))
            } else if (szam < 0) {
                textView.setTextColor(Color.rgb(255, 40, 40))
            } else if (szam > 0) {
                textView.setTextColor(Color.rgb(40, 255, 40))
            }
        }

        buttonDown.setOnClickListener {
            szam--
            textView.setText(szam.toString())
            if (checkIfPrime(szam)) {
                textView.setTextColor(Color.rgb(255, 255, 255))
            } else if (szam == 0) {
                textView.setTextColor(Color.rgb(40, 40, 255))
            } else if (szam < 0) {
                textView.setTextColor(Color.rgb(255, 40, 40))
            } else if (szam > 0) {
                textView.setTextColor(Color.rgb(40, 255, 40))
            }
        }

        textView.setOnLongClickListener {
            szam = 0
            textView.setText(szam.toString())
            textView.setTextColor(Color.rgb(40, 40, 255))
            return@setOnLongClickListener true
        }
    }

    fun checkIfPrime(num: Int): Boolean {
        if (num < 2) return false
        else if (num < 4) return true
        var i = num - 1
        var search = true
        while (i >= Math.floor(Math.sqrt(num.toDouble())) && search) {
            if (num % i == 0) search = false
            i--
        }
        return search
    }

    fun Init() {
        textView = findViewById(R.id.tv_szam)
        textView.setText(szam.toString())
        buttonUp = findViewById(R.id.button_up)
        buttonDown = findViewById(R.id.button_down)
    }
}