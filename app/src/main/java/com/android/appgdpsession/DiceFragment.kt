package com.android.appgdpsession

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class DiceFragment : Fragment() {
    lateinit var diceImage: ImageView
    lateinit var rollButton: Button
    lateinit var act2Button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.apply {
            diceImage = findViewById(R.id.diceImage)

            rollButton = findViewById(R.id.rollButton)

            act2Button = findViewById(R.id.act2Button)

            var diceImages = listOf(
                R.drawable.dice_1, //0 index
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6 //5th index
            )

            var random = 0
            rollButton.setOnClickListener {
                random = (0..5).random() + 1

                diceImage.setImageResource(diceImages[random-1])
            }

            act2Button.setOnClickListener {
                startActivity(Intent(context, MainActivity2::class.java).putExtra("DiceCount", random))
            }
        }

    }
}