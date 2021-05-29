package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var  btnFallwater: Button
    lateinit var  btnFallwater2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        castViews()
        clickBack()
        clickNext()
    }
    fun castViews() {

        btnFallwater = findViewById(R.id.btnFallwater)
        btnFallwater2 = findViewById(R.id.btnFallwater2)
    }
    fun clickBack() {
        btnFallwater.setOnClickListener {
            val intent =  Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }
    }
    fun clickNext(){
        btnFallwater2.setOnClickListener {
            val intent =  Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)

        }
    }

}


