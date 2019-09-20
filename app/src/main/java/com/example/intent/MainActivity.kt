package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val intnt= Intent(baseContext,Main2Activity::class.java)
            intnt.putExtra("Name","shashikant")
            intnt.putExtra("Age",22)
            intnt.putExtra("RollNo",110416111)
            startActivity(intnt)
        }


    }
}
