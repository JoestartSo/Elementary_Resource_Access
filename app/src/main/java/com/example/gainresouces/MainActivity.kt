package com.example.gainresouces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewAvatar=findViewById<ImageView>(R.id.image_avatar)
        val btnMale=findViewById<Button>(R.id.btn_male)
        val btnFemale=findViewById<Button>(R.id.btn_female)

        //get resouce id and use it directly
        btnMale.setOnClickListener({v->imageViewAvatar.setImageResource(R.drawable.male)})

        //get resouce value by resouce id
        var imageFemale=applicationContext.getDrawable(R.drawable.female)
        btnFemale.setOnClickListener({v-> imageViewAvatar.setImageDrawable(imageFemale)})
    }
}