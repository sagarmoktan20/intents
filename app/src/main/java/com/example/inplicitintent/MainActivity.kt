package com.example.inplicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webbutton=findViewById<CardView>(R.id.webbtb)
        val camerabtn=findViewById<CardView>(R.id.camerabtn)

        webbutton.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.android.com/guide/components/intents-filters")
            startActivity(intent)

        }
        camerabtn.setOnClickListener{
           val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

    }
}