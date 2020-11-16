package com.example.calculatorgroup19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }

    fun numberClick(view: View) {
        if (view is TextView) {

            val number: String = view.text.toString()
            var Result: String = resultTextView.text.toString()

            if(Result == "0" ) {
                Result = ""
            }

            resultTextView.text = Result + number


        }
    }
}