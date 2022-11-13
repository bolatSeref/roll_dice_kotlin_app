package com.creactivestudio.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.creactivestudio.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.setOnClickListener {
            rollDice();
        }


    }

    /**
     * Get a random number and than set the textview when user clicks roll button
     */
    private fun rollDice() {
        // Get a random number
        val randomInt = Random.nextInt(6)+1
        val rollImage = binding.rollImage

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        rollImage.setImageResource(drawableResource)

      }
}