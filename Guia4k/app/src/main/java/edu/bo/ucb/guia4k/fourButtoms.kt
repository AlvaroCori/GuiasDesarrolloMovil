package edu.bo.ucb.guia4k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourButtoms : AppCompatActivity() {
    private val returnButton : Button
        get() = findViewById(R.id.returnButton4Buttons)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_buttoms)
        returnButton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}