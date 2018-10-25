package com.pratikkarki.andwallet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.income_row.view.*

class MainActivity : AppCompatActivity() {

    private var IncOrExp = true

    private var incomeAmt = 0
    private var expenseAmt = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        btnSave.setOnClickListener{
            insertTodo()
        }

        btnIncExp.setOnCheckedChangeListener { _, isChecked ->
            IncOrExp = isChecked
        }

        btnClear.setOnClickListener{
            layoutContent.removeAllViews()
            incomeAmt = 0
            expenseAmt = 0
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_summary -> {
                //Toast.makeText(this, "ABOUT", Toast.LENGTH_LONG).show()
                var intentStart = Intent()
                intentStart.setClass(this@MainActivity, SummaryActivity::class.java)

                intentStart.putExtra("KEY_INCOME", incomeAmt)
                intentStart.putExtra("KEY_EXPENSE", expenseAmt)
                startActivity(intentStart)
            }

        }
        return true
    }

    override fun onBackPressed() {
        //Toast.makeText(this, "YOU CAN NOT GO BACK", Toast.LENGTH_LONG).show()

        val intentMain = Intent(Intent.ACTION_MAIN)
        intentMain.addCategory(Intent.CATEGORY_HOME)
        intentMain.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intentMain)
    }

    private fun insertTodo() {

        if(etItem.text.isEmpty() && etAmt.text.isEmpty()){
            etItem.error = getString(R.string.empty_val)
            etAmt.error = getString(R.string.empty_val)
        } else if(etItem.text.isEmpty()){
            etItem.error = getString(R.string.empty_val)
        } else if(etAmt.text.isEmpty()){
            etAmt.error = getString(R.string.empty_val)
        } else {
            lateinit var viewTodo: View

             if (IncOrExp) {
                viewTodo = layoutInflater.inflate(
                        R.layout.income_row, null, false
                )

                incomeAmt += etAmt.text.toString().toInt()

            } else {
                 viewTodo = layoutInflater.inflate(
                         R.layout.expense_row, null, false
                 )

                 expenseAmt += etAmt.text.toString().toInt()
             }

            viewTodo.tvItem.text = etItem.text
            viewTodo.tvAmt.text = getString(R.string.currency) + etAmt.text.toString()

            etItem.setText("")
            etAmt.setText("")
            tvBal.text = getString(R.string.currency) + (incomeAmt-expenseAmt).toString()

            layoutContent.addView(viewTodo, 0)
        }

    }


}
