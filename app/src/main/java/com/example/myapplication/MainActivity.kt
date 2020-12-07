package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    companion object
    {
        fun newIntent(context : Context) : Intent
        {
            return Intent(context, MainActivity::class.java)
        }
    }

    private lateinit var button0 : Button
    private lateinit var button1 : Button
    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private lateinit var button4 : Button
    private lateinit var button5 : Button
    private lateinit var button6 : Button
    private lateinit var button7 : Button
    private lateinit var button8 : Button
    private lateinit var resetButton : Button
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0 = findViewById(R.id.button0)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        resetButton = findViewById(R.id.buttonReset)

        var chance = "X"
        var board = arrayListOf<String>("", "", "", "", "", "", "", "", "")
        button0.setOnClickListener {
            when
            {
                board[0] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button0.text = "X"
                    button0.setBackgroundColor(Color.GREEN)
                    board[0] = "X"
                    chance = "O"
                }

                else ->
                {
                    button0.text = "O"
                    button0.setBackgroundColor(Color.RED)
                    board[0] = "O"
                    chance = "X"
                }
            }
            resultOut(board)
        }
        button1.setOnClickListener {
            when
            {
                board[1] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button1.text = "X"
                    button1.setBackgroundColor(Color.GREEN)
                    board[1] = "X"
                    chance = "O"
                }

                else ->
                {
                    button1.text = "O"
                    button1.setBackgroundColor(Color.RED)
                    board[1] = "O"
                    chance = "X"
                }
            }
            resultOut(board)
        }
        button2.setOnClickListener {
            when
            {
                board[2] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button2.text = "X"
                    button2.setBackgroundColor(Color.GREEN)

                    board[2] = "X"
                    chance = "O"
                }

                else ->
                {
                    button2.text = "O"
                    button2.setBackgroundColor(Color.RED)

                    board[2] = "O"
                    chance = "X"
                }
            }
            resultOut(board)
        }
        button3.setOnClickListener {
            when
            {
                board[3] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button3.text = "X"
                    button3.setBackgroundColor(Color.GREEN)

                    board[3] = "X"
                    chance = "O"
                }

                else ->
                {
                    button3.text = "O"
                    button3.setBackgroundColor(Color.RED)
                    board[3] = "O"
                    chance = "X"
                }
            }
            resultOut(board)

        }
        button4.setOnClickListener {
            when
            {
                board[4] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button4.text = "X"
                    button4.setBackgroundColor(Color.GREEN)

                    board[4] = "X"
                    chance = "O"
                }

                else ->
                {
                    button4.text = "O"
                    button4.setBackgroundColor(Color.RED)
                    board[4] = "O"
                    chance = "X"
                }
            }
            resultOut(board)

        }
        button5.setOnClickListener {
            when
            {
                board[5] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button5.text = "X"
                    button5.setBackgroundColor(Color.GREEN)
                    board[5] = "X"
                    chance = "O"
                }

                else ->
                {
                    button5.text = "O"
                    button5.setBackgroundColor(Color.RED)
                    board[5] = "O"
                    chance = "X"
                }
            }
            resultOut(board)

        }
        button6.setOnClickListener {
            when
            {
                board[6] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button6.text = "X"
                    button6.setBackgroundColor(Color.GREEN)
                    board[6] = "X"
                    chance = "O"
                }

                else ->
                {
                    button6.text = "O"
                    button6.setBackgroundColor(Color.RED)
                    board[6] = "O"
                    chance = "X"
                }
            }
            resultOut(board)

        }
        button7.setOnClickListener {
            when
            {
                board[7] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button7.text = "X"
                    button7.setBackgroundColor(Color.GREEN)
                    board[7] = "X"
                    chance = "O"
                }

                else ->
                {
                    button7.text = "O"
                    button7.setBackgroundColor(Color.RED)
                    board[7] = "O"
                    chance = "X"
                }
            }
            resultOut(board)

        }
        button8.setOnClickListener {
            when
            {
                board[8] != "" ->
                {
                    Toast.makeText(applicationContext, "Already", Toast.LENGTH_SHORT).show()
                }

                chance == "X" ->
                {
                    button8.text = "X"
                    button8.setBackgroundColor(Color.GREEN)
                    board[8] = "X"
                    chance = "O"
                }

                else ->
                {
                    button8.text = "O"
                    button8.setBackgroundColor(Color.RED)
                    board[8] = "O"
                    chance = "X"
                }
            }
            resultOut(board)

        }
        resetButton.setOnClickListener {
            val intent = MainActivity.newIntent(applicationContext)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

    }

    private fun result(bd : ArrayList<String>, s : String) : Boolean =
            if (bd[0] == s && bd[1] == s && bd[2] == s) true
            else if (bd[3] == s && bd[4] == s && bd[5] == s) true
            else if (bd[6] == s && bd[7] == s && bd[8] == s) true
            else if (bd[0] == s && bd[3] == s && bd[6] == s) true
            else if (bd[1] == s && bd[4] == s && bd[7] == s) true
            else if (bd[2] == s && bd[5] == s && bd[8] == s) true
            else if (bd[0] == s && bd[4] == s && bd[8] == s) true
            else bd[2] == s && bd[4] == s && bd[6] == s

    private fun resultOut(board : ArrayList<String>)
    {
        if (result(board, "X"))
        {
            Toast.makeText(applicationContext, "X win", Toast.LENGTH_SHORT).show()
        }
        else if (result(board, "O"))
        {
            Toast.makeText(applicationContext, "O win", Toast.LENGTH_SHORT).show()
        }
        if (isDraw(board))
        {
            Toast.makeText(applicationContext, "Draw", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isDraw(board : ArrayList<String>) : Boolean
    {
        for (i in board)
        {
            if (i != "X" && i != "O") return false // empty string pr m pr sit tr
        }
        return true // empty string twe m pr tot yin draw
    }

}