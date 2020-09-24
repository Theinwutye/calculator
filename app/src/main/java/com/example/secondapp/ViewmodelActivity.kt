package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.secondapp.viewmodel.CountViewModel
import kotlinx.android.synthetic.main.activity_viewmodel.*

class ViewmodelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        var CountViewModel=ViewModelProvider(this).get(CountViewModel::class.java)
        txtVMCount.text=CountViewModel.getCount().toString()

        btnVMCount.setOnClickListener {
            var count=txtVMCount.text.toString().toInt()
            CountViewModel.setCount(count)
            txtVMCount.text=CountViewModel.getCount().toString()





        }

    }
}