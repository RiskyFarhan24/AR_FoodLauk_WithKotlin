package com.xperiencelabs.arapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainScreen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val btnstart1:Button = findViewById(R.id.btnstart1)
        btnstart1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v!= null ) {
            when(v.id){
                R.id.btnstart1 -> {
                    val pindahIntent = Intent(this ,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}