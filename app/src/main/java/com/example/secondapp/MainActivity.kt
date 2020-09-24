package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToast.setOnClickListener {
            Toast.makeText(this,"This is a toast",Toast.LENGTH_LONG).show()

        }
        btnCount.setOnClickListener {
            var count:Int=textCount.text.toString().toInt()
            count+=1
            textCount.text=count.toString()
        }
        btnRandom.setOnClickListener {
            var randomno:Int=(0..100).random()
            textCount.text=randomno.toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifecyle:>>>>>>","Activity started......")

    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle:>>>>","Activity resumed....")

    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifecycle:>>>>","Activity paused....")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifecycle:>>>>","Activity Stop....")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifecycle:>>>>","Activity onstart....")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifecycle:>>>>","Activity destory....")
    }
}