package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPyramid: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        castViews()
        clickNext()
    }
    fun castViews() {

        btnPyramid= findViewById(R.id.btnPyramid)
    }
    fun clickNext(){
        btnPyramid.setOnClickListener {
            var intent =  Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)

        }
    }

}


