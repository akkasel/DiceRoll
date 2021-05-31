package com.akka.kotlinbasiccourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button_roll)

        // Reaction when the 'Roll' Button is clicked.
        rollButton.setOnClickListener { rollDice() }

        // Do a Dice roll when app starts
        rollDice()
    }

    // Processes the dice roll, when the "Roll" Button is clicked.
    private fun rollDice() {
        // Create a Dice with of 6 sides.
        val dice = Dice(6)

        // Call the 'roll()' function from the Dice Class
        val diceRoll = dice.roll()

        val resultImageView : ImageView = findViewById(R.id.diceImageView)

        // Change the ImageView of the Dice based on the number result of the diceRoll.
        // Two Way : with 'If' Statement OR with 'When' Statement

        // To change the image of the dice based on the rollDice Number, done with IF statement.
        /*
        if (diceRoll == 1) {
            resultImageView.setImageResource(R.drawable.dice_1)
        } else if (diceRoll == 2) {
            resultImageView.setImageResource(R.drawable.dice_2)
        } else if (diceRoll == 3) {
            resultImageView.setImageResource(R.drawable.dice_3)
        } else if (diceRoll == 4) {
            resultImageView.setImageResource(R.drawable.dice_4)
        } else if (diceRoll == 5) {
            resultImageView.setImageResource(R.drawable.dice_5)
        } else {
            resultImageView.setImageResource(R.drawable.dice_6)
        }
         */

        // To change the image of the dice based on the rollDice Number, done with WHEN statement.
        when (diceRoll) {
            1 -> resultImageView.setImageResource(R.drawable.dice_1)
            2 -> resultImageView.setImageResource(R.drawable.dice_2)
            3 -> resultImageView.setImageResource(R.drawable.dice_3)
            4 -> resultImageView.setImageResource(R.drawable.dice_4)
            5 -> resultImageView.setImageResource(R.drawable.dice_5)
            6 -> resultImageView.setImageResource(R.drawable.dice_6)
        }


    }

    // Create the Dice
    class Dice(val numSides : Int) {
        fun roll() : Int {
            return(1..numSides).random()
        }
    }

}

