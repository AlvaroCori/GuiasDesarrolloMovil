package edu.bo.ucb.guia8k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Snackbar.make(layout, getString(R.string.mensaje_snackbar), Snackbar.LENGTH_LONG).show()
    }
}