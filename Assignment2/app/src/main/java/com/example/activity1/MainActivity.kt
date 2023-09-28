package com.example.activity1
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity(){
    private lateinit var editText1: TextView
    private lateinit var button1: Button
    private lateinit var imageView3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 =findViewById(R.id.editText1)
        button1=findViewById(R.id.button1)
        imageView3  =findViewById(R.id.imageView3)
        button1.setOnClickListener{
            val toast1 =Toast.makeText(this,"Dice rolled",Toast.LENGTH_LONG)
            toast1.show()
            rolldice()
        }
    }
    private fun rolldice(){
        val random= java.util.Random()
        val randomNumber=random.nextInt(6)+1
        val resultText= "you rolled a $randomNumber"
        editText1.text=resultText
        if (randomNumber==1){ imageView3.setImageResource(R.drawable.dice1)}
        else if(randomNumber==2){imageView3.setImageResource(R.drawable.dice2)}
        else if(randomNumber==3){imageView3.setImageResource(R.drawable.dice3)}
        else if(randomNumber==4){imageView3.setImageResource(R.drawable.dice4)}
        else if(randomNumber==5){imageView3.setImageResource(R.drawable.dice5)}
        else{imageView3.setImageResource(R.drawable.dice6)}
    }
}
