package edu.bo.ucb.guia4k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    private val bFourButtoms : Button
        get() = findViewById(R.id.btn4Buttons)
    private val bFormulary : Button
        get() = findViewById(R.id.btnFormulary)
    private val bOddTwoNumbers : Button
        get() = findViewById(R.id.btnTwoNumbers)
    private val bAdOdd : Button
        get() = findViewById(R.id.btnAdOdd)
    private val bMain : Button
        get() = findViewById(R.id.btnMain)

    private val bButtonsColor: Button
        get() = findViewById(R.id.btnButtonsColor)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.servicios)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        val intent: Intent = Intent(this, MainActivity::class.java)

        bFourButtoms.setOnClickListener{
            val intent = Intent(this, fourButtoms::class.java)
            startActivity(intent)
            //redirectToActivity(this, fourButtoms::class.java)
        }

        bFormulary.setOnClickListener{
            val intent: Intent = Intent(this, Formulary::class.java)
            startActivity(intent)
        }

        bOddTwoNumbers.setOnClickListener{
            val intent: Intent = Intent(this, OddTwoNumbers::class.java)
            startActivity(intent)
        }
        bAdOdd.setOnClickListener{
            val intent: Intent = Intent(this, AdOdd::class.java)
            startActivity(intent)
        }
        bMain.setOnClickListener{
            val intent: Intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
        bButtonsColor.setOnClickListener{
            val intent: Intent = Intent(this, ButtonsColor::class.java)
            startActivity(intent)
        }
    }
}



