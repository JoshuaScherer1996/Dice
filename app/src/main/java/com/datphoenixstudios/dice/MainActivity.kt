package com.datphoenixstudios.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //connecting UI with code
        val rollButton: Button = findViewById(R.id.button)
        val resultTextView: TextView = findViewById(R.id.textView)

        //creating a dice
        val dice: Dice = Dice(6)

        rollButton.setOnClickListener {
            //rolling the dice and outputting the result
            val rolledDice = dice.roll()
            resultTextView.text = rolledDice.toString()
        }
    }
}