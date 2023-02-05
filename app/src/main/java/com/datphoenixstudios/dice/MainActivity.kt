package com.datphoenixstudios.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //connecting UI with code
        val rollButton: Button = findViewById(R.id.button)
        val diceImage: ImageView = findViewById(R.id.iv_dice)

        //creating a dice
        val dice: Dice = Dice(6)

        rollButton.setOnClickListener {
            //rolling the dice and displaying the fitting image
            val rolledDice = dice.roll()

            when (rolledDice) {
                1 -> {
                    diceImage.setImageResource(R.drawable.dice_1)
                }
                2 -> {
                    diceImage.setImageResource(R.drawable.dice_2)
                }
                3 -> {
                    diceImage.setImageResource(R.drawable.dice_3)
                }
                4 -> {
                    diceImage.setImageResource(R.drawable.dice_4)
                }
                5 -> {
                    diceImage.setImageResource(R.drawable.dice_5)
                }
                6 -> {
                    diceImage.setImageResource(R.drawable.dice_6)
                }
            }
        }
    }
}