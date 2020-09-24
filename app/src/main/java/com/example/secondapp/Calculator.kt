package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.lifecycle.ViewModelProvider
import com.example.secondapp.viewmodel.CountViewModel
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        var resultViewModel=ViewModelProvider(this).get(CountViewModel::class.java)
        var result:Int=0
        if(result !=0) {
            ans.setText(resultViewModel.getResult().toString())
        }
        btnAdd.setOnClickListener {
            var num1:Int=num1.text.toString().toInt()
            var num2:Int=num2.text.toString().toInt()
            result=num1+num2
            resultViewModel.setResult(result)
            ans.setText(resultViewModel.getResult().toString())

        }
        btnSub.setOnClickListener {
            var num1:Int=num1.text.toString().toInt()
            var num2:Int=num2.text.toString().toInt()
            result=num1-num2
            resultViewModel.setResult(result)
            ans.setText(resultViewModel.getResult().toString())
        }
        btnMul.setOnClickListener {
            var num1:Int=num1.text.toString().toInt()
            var num2:Int=num2.text.toString().toInt()
            result=num1*num2
            resultViewModel.setResult(result)
            ans.setText(resultViewModel.getResult().toString())
        }
        btnDiv.setOnClickListener {
            var num1:Int=num1.text.toString().toInt()
            var num2:Int=num2.text.toString().toInt()
            result=num1/num2
            resultViewModel.setResult(result)
            ans.setText(resultViewModel.getResult().toString())
        }
    }
}