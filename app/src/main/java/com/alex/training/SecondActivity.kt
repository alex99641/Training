package com.alex.training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {
    companion object{
        const val TOTAL_COUNT = "total_count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){
        val counter = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = java.util.Random()
        var randomInt = 0
        if (counter>0){
            randomInt = random.nextInt(counter+1)
        }
        textViewRandom.text = Integer.toString(randomInt)
        textTitle.text= getString(R.string.random_heading, counter)
    }

    fun createNewActivity (view: View){
        val newIntent = Intent(this, RecyclerActivity::class.java)
        startActivity(newIntent)
    }
}
