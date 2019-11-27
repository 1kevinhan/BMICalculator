package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculate.setOnClickListener(){

            val input: String = weight.text.toString()

            val input1: String = height.text.toString()

            val value: Double = input.toDouble()

            val value1: Double = input1.toDouble()

            val result: Double = value / (value1 * value1)

            outputBMI.text = "%.2f".format(result)

            if (result <= 18.5) {
                desc.text = "(Underweight)"
                imageView.setImageResource(R.drawable.under)
            }else if (result <= 24.9) {
                desc.text = "(Normal)"
                imageView.setImageResource(R.drawable.normal)
            }else {
                desc.text = "(Overweight)"
                imageView.setImageResource(R.drawable.over)
            }
        }
        btnReset.setOnClickListener(){
            weight.text.clear()
            height.text.clear()
            outputBMI.text = ""
            desc.text = ""
            imageView.setImageResource(R.drawable.empty)
            weight.requestFocus()
//
        }
    }
}
