package edu.bo.ucb.guia4k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Formulary : AppCompatActivity() {
    private val bReturn : Button
        get() = findViewById(R.id.btnReturnFormulary)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulary)

        bReturn.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}