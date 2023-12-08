package com.bustillo.ritchmarc.p1.quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlus = findViewById<Button>(R.id.btn_plus)
        val btnMinus = findViewById<Button>(R.id.btn_minus)
        val btnMulti = findViewById<Button>(R.id.btn_multi)
        val firstNumber = findViewById<EditText>(R.id.et_firstNumber)
        val secondNumber = findViewById<EditText>(R.id.et_secondNumber)
        tvResult = findViewById(R.id.tv_result)

        btnPlus.setOnClickListener {
            val num1 = firstNumber.text.toString().toIntOrNull() ?: 0
            val num2 = secondNumber.text.toString().toIntOrNull() ?: 0
            addition(num1, num2)
        }

        btnMinus.setOnClickListener {
            val num1 = firstNumber.text.toString().toIntOrNull() ?: 0
            val num2 = secondNumber.text.toString().toIntOrNull() ?: 0
            subtraction(num1,num2)
        }

        btnMulti.setOnClickListener {
            val num1 = firstNumber.text.toString().toIntOrNull() ?: 0
            val num2 = secondNumber.text.toString().toIntOrNull() ?: 0
            multi(num1,num2)
        }
    }

    private fun addition(first: Int, second: Int) {
        val added = first + second
        tvResult.text = added.toString()
    }

    private fun subtraction(first: Int, second: Int) {
        val added = first - second
        tvResult.text = added.toString()
    }

    private fun multi(first: Int, second: Int) {
        val added = first * second
        tvResult.text = added.toString()
    }

}
