package edu.bo.ucb.guia3k

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class MainActivity : AppCompatActivity() {
    private val blueBtn : Button
        get() =  findViewById(R.id.blue_btn)

    private val yellowBtn: Button
        get() = findViewById(R.id.yellow_btn)

    private val layoutPrincipal: LinearLayout
        get() = findViewById(R.id.layout_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        blueBtn.setOnClickListener {
            //showAlertDialog("blue")
            toast(getString(R.string.btn_blue_label))
           layoutPrincipal.setBackgroundColor(Color.BLUE)
        }

        yellowBtn.setOnClickListener {
            //showAlertDialog("yellow")
            toast(getString(R.string.btn_yellow_label))
            layoutPrincipal.setBackgroundColor(Color.YELLOW)
        }
    }
    fun showAlertDialog(message: String){
        MaterialAlertDialogBuilder(this)
        .setTitle("Alert")
            .setMessage(message)
            .setNegativeButton("No") { dialog, which -> showSnackbar("Declined")
        }
            .setPositiveButton("Yes"){ dialog, which -> showSnackbar("Brooo")
        }
            .show()
    }
    private fun showSnackbar(message : String)
    {
        var r = message
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()

}





