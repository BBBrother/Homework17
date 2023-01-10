package com.example.homework17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val increaseButton = findViewById<Button>(R.id.button_increase)
        increaseButton.setOnClickListener { increment() }
        val resetButton = findViewById<Button>(R.id.button_reset)
        resetButton.setOnClickListener { reset() }
    }

    fun increment() {
        val counterView = findViewById<TextView>(R.id.counter)
        var counter = counterView.text.toString().toInt()
        counter++
        counterView.text = counter.toString()
    }

    fun reset() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("count", findViewById<TextView>(R.id.counter).text.toString())
        startActivity(intent)
    }
}