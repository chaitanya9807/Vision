package com.mindorks.tensorflowexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashactivity)
        var handler= Handler()

        var runData= Runnable {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        handler.postDelayed(runData,3000)
    }
}
