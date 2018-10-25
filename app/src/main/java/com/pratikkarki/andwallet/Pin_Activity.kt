package com.pratikkarki.andwallet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pin_.*

class Pin_Activity : AppCompatActivity() {

    private val pass = 12345

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_)

        btnLogin.setOnClickListener{
            when {
                password.text.isEmpty() -> password.error = getString(R.string.invalid_pin)
                password.text.toString() == pass.toString() -> {
                    var intentStart = Intent()
                    intentStart.setClass(this@Pin_Activity, MainActivity::class.java)
                    startActivity(intentStart)
                }
                else -> password.error = getString(R.string.incorrect_pin)
            }
        }

    }
}
