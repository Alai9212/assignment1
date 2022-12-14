package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll(){
        var randomNo = (1..6).random()
        var imageDice :Int
        when (randomNo) {
            1 -> {
                imageDice =R.drawable.dice1
            }
            2 -> {
                imageDice = R.drawable.dice2
            }
            3 -> {
                imageDice = R.drawable.dice3
            }
            4 -> {
                imageDice = R.drawable.dice4
            }
            5 -> {
                imageDice = R.drawable.dice5
            }
            else -> {
                imageDice = R.drawable.dice6
            }
        }
        dice_image.setImageResource(imageDice)

        Toast.makeText(this, "Dice is rolled", Toast.LENGTH_SHORT).show()
    }

}