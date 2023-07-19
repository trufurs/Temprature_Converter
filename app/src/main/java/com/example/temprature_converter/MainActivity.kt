package com.example.temprature_converter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val change=findViewById<Button>(R.id.button)
        val result=findViewById<Button>(R.id.button2)
        val textview = findViewById<TextView>(R.id.tv1)
        val symbol = findViewById<TextView>(R.id.textView2)
        val inp = findViewById<TextView>(R.id.inp1)
        val r1 = findViewById<TextView>(R.id.r1)
        var i = 0
        change.setOnClickListener {
            if (i == 0) {
                textview.text = getString(R.string.Text2)
                symbol.text = getString(R.string.Degree2)
                i += 1
            }
            else
            {
                textview.text = getString(R.string.Text)
                symbol.text = getString(R.string.Degree)
                i--
            }
        }
        result.setOnClickListener {
            if (i== 0) {
                var  j = inp.text.toString().toFloat()
                j = (((j*9.00)/5)+32.00).toFloat()
                r1.text = buildString {
        append(j.toString())
        append(getString(R.string.Degree2))
    }
            }
            else
            {
                var j = inp.text.toString().toFloat()
                j= ((j-32.00)*(5.00/9)).toFloat()
                r1.text = """$j${getString(R.string.Degree)}"""
            }
        }
    }
}