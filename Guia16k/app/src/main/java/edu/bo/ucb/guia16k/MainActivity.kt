package edu.bo.ucb.guia16k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private val myImageView : ImageView
        get() = findViewById(R.id.my_image_view)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val picasso = Picasso.get()
        picasso.load("https://i.pinimg.com/564x/a8/6e/26/a86e26dffbcd0f8ffd0b7a6a4809ec68.jpg")
            .into(myImageView)

        ///Picasso.get().load("https://i.pinimg.com/564x/a8/6e/26/a86e26dffbcd0f8ffd0b7a6a4809ec68.jpg").resize(200, 200).into(myImageView);

        //val url = "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg"
        //Picasso.get().load(url).into(myImageView)
    }
}