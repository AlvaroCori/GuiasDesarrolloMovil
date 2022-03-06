package edu.bo.ucb.guia4k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ServiciosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.servicios)
    }

    fun selectedButton(view: View) {
        if ( view.id === R.id.btnMain) {
            Toast.makeText( view.context, "Opción de Servicios", Toast.LENGTH_LONG).show()
        }
        Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
    }
}