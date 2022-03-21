package edu.bo.ucb.guia6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar


/*
//deprecado
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.toolbar.*
 */

class MainActivity : AppCompatActivity() {
    ///val supportActionBar = findViewById<View>(R.id.toolbar) as Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<View>(R.id.extToolbar) as Toolbar
        //setSupportActionBar(toolbar)
        supportActionBar.let {
            setSupportActionBar(toolbar)
        }

    }
}

