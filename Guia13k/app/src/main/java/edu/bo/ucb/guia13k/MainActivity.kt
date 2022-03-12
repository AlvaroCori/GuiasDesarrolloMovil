package edu.bo.ucb.guia13k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

///import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        session.user = "CALYR.SOFTWARE@GMAIL.COM"
    }
    fun openSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }

}