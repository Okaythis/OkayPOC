package com.okaythis.okaypoc.usecases.prettythings.ui.billingcarddetails

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.okaythis.okaypoc.R

import kotlinx.android.synthetic.main.activity_billing_card_details.*

class BillingCardDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_billing_card_details)
        setSupportActionBar(toolbar)

    }

}
