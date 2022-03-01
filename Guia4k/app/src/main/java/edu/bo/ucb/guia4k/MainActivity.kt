package edu.bo.ucb.guia4k

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private val buttons: LinearLayout
        get() = findViewById(R.id.principalbuttons)
    private val btnRed: Button
        get() = findViewById(R.id.btnRed)

    private val btnWhite: Button
        get() = findViewById(R.id.btnWhite)

    private val layoutPrincipal: LinearLayout
        get() = findViewById(R.id.layoutPrincipal)

    private val serviceB: Button
        get() = findViewById(R.id.servicio)

    private val pB: Button
        get() = findViewById(R.id.portafolio)

    private val aB: Button
        get() = findViewById(R.id.acercade)

    private val contactsB: Button
        get() = findViewById(R.id.contactos)

    private val socialNetB: Button
        get() = findViewById(R.id.redessociales)

    private val view: TextView
        get() = findViewById(R.id.eventtext)

    private val imparB: Button
        get() = findViewById(R.id.impar)

    private val parB: Button
        get() = findViewById(R.id.par)

    private val numbersText: TextView
        get() = findViewById(R.id.numeros_text)
    private val failCounter: TextView
        get() = findViewById(R.id.incorrectosn)
    private val assertCounter: TextView
        get() = findViewById(R.id.correctosn)

    private val calculateB: Button
        get() = findViewById(R.id.calcular)

    private val number1 : TextInputEditText
        get() = findViewById(R.id.number1)

    private val number2 : TextInputEditText
        get() = findViewById(R.id.number2)

    private val result: TextView
        get() = findViewById(R.id.resultado)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        setContentView(R.layout.activity_main)


        btnWhite.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }

        btnRed.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        */
        /*
        setContentView(R.layout.menuprincipal)
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
        }*/
        /*
        var numbers = (0..20000)
        var value = 0
        setContentView(R.layout.parimpar)
        numbersText.text = numbers.random().toString()
        parB.setOnClickListener{
            value = numbersText.text.toString().toInt()
            if (value % 2 == 0)
                assertCounter.text = (assertCounter.text.toString().toInt()+1).toString()
            else
                failCounter.text = (failCounter.text.toString().toInt()+1).toString()
            numbersText.text = numbers.random().toString()
        }
        imparB.setOnClickListener{
            value = numbersText.text.toString().toInt()
            if (value % 2 == 1)
                assertCounter.text = (assertCounter.text.toString().toInt()+1).toString()
            else
                failCounter.text = (failCounter.text.toString().toInt()+1).toString()
            numbersText.text = numbers.random().toString()
        }
        */
        /*
        setContentView(R.layout.suma2numeros)
        calculateB.setOnClickListener{
            result.text = (number1.text.toString().toInt() + number2.text.toString().toInt()).toString()
        }
        */
        /*
        setContentView(R.layout.cuatrobotones)
         */
        setContentView(R.layout.formulario)
    }

}



