package com.okaythis.okaypoc.ui.otppreview

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.okaythis.okaypoc.R

import kotlinx.android.synthetic.main.activity_otp_preview.*

class OtpPreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_preview)
        setSupportActionBar(toolbar)

    }

}
