package com.example.gainresouces

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewAvatar=findViewById<ImageView>(R.id.image_avatar)
        val btnMale=findViewById<Button>(R.id.btn_male)
        val btnFemale=findViewById<Button>(R.id.btn_female)
        val btnHello=findViewById<Button>(R.id.btn_hello)

        //get resouce id and use it directly
        btnMale.setOnClickListener({v->imageViewAvatar.setImageResource(R.drawable.male)})

        //get resouce value by applicationContext property and resouce id
        var imageFemale:Drawable?=applicationContext.getDrawable(R.drawable.female)
        btnFemale.setOnClickListener({v-> imageViewAvatar.setImageDrawable(imageFemale)})

        //get resouce value by resouces property property and resouce id
        val hello:String=resources.getString(R.string.hello)
        var mToast=Toast.makeText(this,resources.getString(R.string.hello),Toast.LENGTH_SHORT)
        mToast.setGravity(Gravity.CENTER,0,0);
        btnHello.setOnClickListener({v->mToast.show() })

    }
}