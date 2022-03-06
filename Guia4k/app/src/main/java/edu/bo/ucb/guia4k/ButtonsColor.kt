package edu.bo.ucb.guia4k

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class ButtonsColor : AppCompatActivity() {
    private val buttons: LinearLayout
        get() = findViewById(R.id.principalbuttons)
    private val btnRed: Button
        get() = findViewById(R.id.btnRed)

    private val btnWhite: Button
        get() = findViewById(R.id.btnWhite)

    private val layoutPrincipal: LinearLayout
        get() = findViewById(R.id.layoutPrincipal)
    private val bReturn : Button
        get() = findViewById(R.id.btnReturnButtonsColor)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons_color)
        btnWhite.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.BLUE)
        }

        btnRed.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        bReturn.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}