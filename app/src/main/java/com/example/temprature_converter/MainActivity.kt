package com.example.temprature_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
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
                val i = (j*9/5)+32
                r1.text = i.toString() + getString(R.string.Degree2)
            }
            else
            {
                var j = inp.text.toString().toFloat()
                j=(j-32)*(5/9)
                r1.text = j.toString() + getString(R.string.Degree)
            }
        }
    }
}