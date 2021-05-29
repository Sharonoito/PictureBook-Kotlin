package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var  btnHotspring:Button
    lateinit var  btnHotspring2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        castViews()
        clickBack()
        clickNext()
    }
    fun castViews() {

        btnHotspring = findViewById(R.id.btnHotspring)
        btnHotspring2 = findViewById(R.id.btnHotSpring2)
    }
    fun clickBack() {
        btnHotspring.setOnClickListener {
            val intent =  Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)

        }
    }
    fun clickNext(){
        btnHotspring2.setOnClickListener {
            val intent =  Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)

        }
    }

}



