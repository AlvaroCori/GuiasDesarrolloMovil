package edu.bo.ucb.guia7k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val btnS : Button
        get() = findViewById(R.id.btnServices)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnS.setOnClickListener {
            Toast.makeText(this, "Listo!", Toast.LENGTH_LONG).show()
        }
    }

    fun selectedButton(view: View) {
        if ( view.id === R.id.btnServices) {
            val intent: Intent = Intent(view.context, R.menu.menu_main::class.java)
            startActivity(intent)

        } else {
            Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.action_search ->{
                Log.d("TEST", "ICON SEARCH")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

