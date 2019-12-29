package com.example.gitcat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        try{
            Thread.sleep(3000)
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        catch(e:Exception){
            return;
        }
    }
}
