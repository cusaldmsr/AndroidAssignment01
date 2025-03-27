package com.cusaldev.androidassignment01

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnNext: Button
    lateinit var btnPrevious : Button
    lateinit var textBox: EditText
    lateinit var emailBox: EditText
    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnNext = findViewById(R.id.button2)
        btnPrevious = findViewById(R.id.button4)
        textBox = findViewById(R.id.editTextText)
        emailBox = findViewById(R.id.editTextTextEmailAddress)
        checkBox1 = findViewById(R.id.checkBox)
        checkBox2 = findViewById(R.id.checkBox2)

        btnNext.setOnClickListener {
            hideKeyboard()
            Toast.makeText(this,textBox.text, Toast.LENGTH_SHORT).show()
            Toast.makeText(this,emailBox.text, Toast.LENGTH_SHORT).show()
            Toast.makeText(this,checkBox1.text, Toast.LENGTH_SHORT).show()
            Toast.makeText(this,checkBox2.text, Toast.LENGTH_SHORT).show()
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        btnPrevious.setOnClickListener {
            val intent = Intent(this,SplashActivity::class.java)
            startActivity(intent)
        }
    }

    private fun hideKeyboard() {
        val view: View? = this.currentFocus
        view?.let { v ->
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(v.windowToken, 0)
        }
    }
    fun showKeyboard() {
        val view: View? = this.currentFocus
        view?.let { v ->
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.showSoftInput(v, InputMethodManager.SHOW_IMPLICIT)
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onPause() {
        super.onPause()
    }
}