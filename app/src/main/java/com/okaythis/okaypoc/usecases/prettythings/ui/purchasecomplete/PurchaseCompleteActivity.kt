package com.okaythis.okaypoc.usecases.prettythings.ui.purchasecomplete

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.okaythis.okaypoc.R

import kotlinx.android.synthetic.main.activity_purchase_complete.*

class PurchaseCompleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase_complete)
        setSupportActionBar(toolbar)

    }

}
