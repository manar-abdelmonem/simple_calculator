package com.example.simple_calc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() ,View.OnClickListener{

    lateinit var num_a:EditText
    lateinit var num_b:EditText
    lateinit var add:Button
    lateinit var sub:Button
    lateinit var multiply:Button
    lateinit var div:Button
    lateinit var resultt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add= findViewById(R.id.add)
        sub =findViewById(R.id.sub)
        multiply=findViewById(R.id.multiply)
        div =findViewById(R.id.division)
        num_a =findViewById(R.id.num_a)
        num_b = findViewById(R.id.num_b)
        resultt =findViewById(R.id.resultt)
        add.setOnClickListener(this)
        sub.setOnClickListener(this)
        div.setOnClickListener(this)
        multiply.setOnClickListener(this)



    }



    override fun onClick(v: View?) {
        var a = num_a.text.toString().toDouble()
        var b = num_b.text.toString().toDouble()
        var result = 0.0
        when(v?.id) {
            R.id.add ->{
                result = a + b
            }

            R.id.sub -> {
                result = a - b
            }

            R.id.multiply -> {
                result = a * b
            }

            R.id.division -> {
                result = a / b
            }

        }
        resultt.text="Result is $result"
    }
}

