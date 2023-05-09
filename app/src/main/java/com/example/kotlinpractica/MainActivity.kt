package com.example.kotlinpractica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var btnGreeting:Button
    private lateinit var btnClear:Button
    private lateinit var btnExit:Button
    private lateinit var txtName:EditText
    private lateinit var lblGreeting:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGreeting = findViewById(R.id.btnGreeting) as Button
        btnClear = findViewById(R.id.btnClear) as Button
        btnExit = findViewById(R.id.btnExit) as Button
        txtName = findViewById(R.id.txtName) as EditText
        lblGreeting = findViewById(R.id.lblGreeting) as TextView

        btnGreeting.setOnClickListener {

            if (txtName.text.toString().contentEquals("")){
                Toast.makeText(applicationContext, "Data capture required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val greeting:String = "Hello " + txtName.text.toString() + " How are you?"
            lblGreeting.text = greeting
        }

    }
}

