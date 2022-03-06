package edu.bo.ucb.guia4k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainMenu : AppCompatActivity() {
    private val pB: Button
        get() = findViewById(R.id.portafolio)

    private val aB: Button
        get() = findViewById(R.id.acercade)

    private val contactsB: Button
        get() = findViewById(R.id.contactos)

    private val socialNetB: Button
        get() = findViewById(R.id.redessociales)
    private val serviceB: Button
        get() = findViewById(R.id.servicio)

    private val returnButton : Button
        get() = findViewById(R.id.returnButtonMainMenu)


    private val view: TextView
        get() = findViewById(R.id.eventtext)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        serviceB.setOnClickListener{
            view.text = serviceB.text
        }
        pB.setOnClickListener{
            view.text = pB.text
        }
        aB.setOnClickListener{
            view.text = aB.text
        }
        contactsB.setOnClickListener{
            view.text = contactsB.text
        }
        socialNetB.setOnClickListener{
            view.text = socialNetB.text
        }
        returnButton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}