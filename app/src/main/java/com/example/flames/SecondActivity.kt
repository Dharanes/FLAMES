package com.example.flames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var na1 = intent.getStringExtra("yourName").toString().lowercase()
        var na2 = intent.getStringExtra("crushName").toString().lowercase()
        val rem = removeSpace()
        val name1 = rem.remove(na1)
        val name2 = rem.remove(na2)
        var fR = flamesResult()
        var flameWord = fR.result(name1,name2)

        var message = "You got "
        if(flameWord=='F'){
            message+="FRIEND"
        }
        if(flameWord=='L'){
            message+="LOVE"
        }
        if(flameWord=='A'){
            message+="AFFECTION"
        }
        if(flameWord=='M'){
            message+="MARRIAGE"
        }
        if(flameWord=='E'){
            message+="ENEMY"
        }
        if(flameWord=='S'){
            message+="SISTER"
        }
        val txt = findViewById<TextView>(R.id.flameText)
        txt.text = message
        print(message)
    }
}