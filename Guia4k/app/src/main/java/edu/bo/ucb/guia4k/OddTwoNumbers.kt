package edu.bo.ucb.guia4k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class OddTwoNumbers : AppCompatActivity() {
    private val returnButton : Button
        get() = findViewById(R.id.returnButtonOdTwoNumbers)
    private val calculateB: Button
        get() = findViewById(R.id.calcular)
    private val number1 : TextInputEditText
        get() = findViewById(R.id.number1)

    private val number2 : TextInputEditText
        get() = findViewById(R.id.number2)

    private val result: TextView
        get() = findViewById(R.id.resultado)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odd_two_numbers)
        returnButton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        calculateB.setOnClickListener{
            result.text = (number1.text.toString().toInt() + number2.text.toString().toInt()).toString()
        }
    }
}