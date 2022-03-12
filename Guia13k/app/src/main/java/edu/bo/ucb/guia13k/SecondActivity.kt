package edu.bo.ucb.guia13k
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    private val txtUserSession : TextView
        get() = findViewById(R.id.txtUserSession)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this, session.user, Toast.LENGTH_SHORT).show()
        txtUserSession.text = session.user
    }
}