package edu.bo.ucb.guia4k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AdOdd : AppCompatActivity() {
    private val imparB: Button
        get() = findViewById(R.id.impar)

    private val parB: Button
        get() = findViewById(R.id.par)

    private val numbersText: TextView
        get() = findViewById(R.id.numeros_text)
    private val failCounter: TextView
        get() = findViewById(R.id.incorrectosn)
    private val assertCounter: TextView
        get() = findViewById(R.id.correctosn)

    private val returnButton : Button
        get() = findViewById(R.id.returnButtonAdOdd)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ad_odd)
        returnButton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var numbers = (0..20000)
        var value = 0
        numbersText.text = numbers.random().toString()
        parB.setOnClickListener{
            value = numbersText.text.toString().toInt()
            if (value % 2 == 0)
                assertCounter.text = (assertCounter.text.toString().toInt()+1).toString()
            else
                failCounter.text = (failCounter.text.toString().toInt()+1).toString()
            numbersText.text = numbers.random().toString()
        }
        imparB.setOnClickListener{
            value = numbersText.text.toString().toInt()
            if (value % 2 == 1)
                assertCounter.text = (assertCounter.text.toString().toInt()+1).toString()
            else
                failCounter.text = (failCounter.text.toString().toInt()+1).toString()
            numbersText.text = numbers.random().toString()
        }
    }
}