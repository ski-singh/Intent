package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent=intent
        val name=intent.getStringExtra("Name")
        val age=intent.getIntExtra("Age",0)
        val rollNo=intent.getIntExtra("RollNo",0)
        val tv=findViewById<TextView>(R.id.tv)
        tv.setText(name.toString()+" "+rollNo.toString()+" "+age.toString())
    }
}
