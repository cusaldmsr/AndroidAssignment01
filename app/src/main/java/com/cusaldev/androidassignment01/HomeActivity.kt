package com.cusaldev.androidassignment01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {

    lateinit var btn1: ImageButton
    lateinit var btn2: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

        btn1 = findViewById(R.id.imageButton6)
        btn2 = findViewById(R.id.imageButton2)
        val r1 = findViewById<RadioButton>(R.id.radioButton)
        val r2 = findViewById<RadioButton>(R.id.radioButton2)

        r1.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, r1.text, Toast.LENGTH_SHORT).show()
        }

        r2.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, r2.text, Toast.LENGTH_SHORT).show()
        }

        btn1.setOnClickListener {
            val intent = Intent(this, EndActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }
}