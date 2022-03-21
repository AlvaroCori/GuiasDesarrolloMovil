package edu.bo.ucb.guia7k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class scp_trap : AppCompatActivity() {
    private val btnR : Button
        get() = findViewById(R.id.returnBtn)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scp_trap)

        btnR.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}