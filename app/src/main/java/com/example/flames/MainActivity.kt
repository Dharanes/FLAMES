package com.example.flames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name1 = findViewById<EditText>(R.id.yourName)
        val name2 = findViewById<EditText>(R.id.crushName)
        val sub = findViewById<Button>(R.id.submitBtn)
        var enterName1: String
        var enterName2: String
        sub.setOnClickListener{
            enterName1 = name1.text.toString()
            enterName2 = name2.text.toString()
            if(enterName1=="" || enterName2==""){
                Toast.makeText(
                    this@MainActivity,
                    "Enter the names",
                    Toast.LENGTH_LONG
                ).show()
            }else{
                name1.text.clear()
                name2.text.clear()
                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("yourName",enterName1)
                intent.putExtra("crushName",enterName2)
                startActivity(intent)
            }
        }
    }
}