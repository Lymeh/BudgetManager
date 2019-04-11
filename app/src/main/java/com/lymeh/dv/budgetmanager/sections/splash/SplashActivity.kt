package com.lymeh.dv.budgetmanager.sections.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.lymeh.dv.budgetmanager.R
import com.lymeh.dv.budgetmanager.sections.transactions.TransactionsActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({ gotoTransactionActivity(); }, 1500)
    }

    private fun gotoTransactionActivity() {
        val intent = Intent(this, TransactionsActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}
