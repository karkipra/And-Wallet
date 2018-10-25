package com.pratikkarki.andwallet

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_summary.*

class SummaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        var inc = intent.getIntExtra("KEY_INCOME", 0)
        var exp = intent.getIntExtra("KEY_EXPENSE", 0)

        incomeSummary.text = getString(R.string.currency) + inc.toString()
        expenseSummary.text = getString(R.string.currency) + exp.toString()
        balance.text = getString(R.string.currency) + (inc-exp).toString()


    }

}
