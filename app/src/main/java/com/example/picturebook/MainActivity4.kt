package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var  btnSteamcave: Button
    lateinit var  btnSteamcave2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        castViews()
        clickBack()
        clickNext()
    }
    fun castViews() {

        btnSteamcave= findViewById(R.id.btnSteamcave)
        btnSteamcave2 = findViewById(R.id.btnSteamcave2)
    }
    fun clickBack() {
        btnSteamcave.setOnClickListener {
            val intent =  Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)

        }
    }
    fun clickNext(){
        btnSteamcave2.setOnClickListener {
            val intent =  Intent(baseContext,MainActivity5::class.java)
            startActivity(intent)

        }
    }

}

