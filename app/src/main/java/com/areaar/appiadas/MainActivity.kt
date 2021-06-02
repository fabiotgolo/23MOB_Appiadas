package com.areaar.appiadas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var tvJoker : TextView
    lateinit var btTellJoker : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvJoker = findViewById(R.id.tvJoker)
        btTellJoker = findViewById(R.id.btTellJoker)

        showJoker()

        btTellJoker.setOnClickListener {
            showJoker()
        }

    }

    private fun showJoker() {
        val jokers = resources.getStringArray(R.array.jokers)
        val numberJoker = Random().nextInt(jokers.size)
        val joker = jokers[numberJoker]
        tvJoker.text = joker
    }
}