package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btnMountainview: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        castViews()
        clickNext()
    }
    fun castViews() {

        btnMountainview= findViewById(R.id.btnMountainview)
    }
    fun clickNext(){
        btnMountainview.setOnClickListener {
            var intent =  Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)

        }
    }

}

