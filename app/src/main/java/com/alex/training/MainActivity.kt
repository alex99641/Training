package com.alex.training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe (view: View){
        val myToast = Toast.makeText(this, "Hi, I'm Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View){
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        textView.text=count.toString()
    }
    fun randomMe (view: View){
        val countString = textView.text.toString()
        val counter = Integer.parseInt(countString)
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, counter)
        startActivity(randomIntent)
    }
}
