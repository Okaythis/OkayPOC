package com.okaythis.okaypoc.utils

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat

class PermissionHelper(private val activity: Activity) {

    val REQUEST_CODE = 204

    fun hasPermissions(ctx: Context, permission: Array<String>): Boolean = permission.all {
        ActivityCompat.checkSelfPermission(ctx, it) == PackageManager.PERMISSION_GRANTED
    }

    fun requestPermissions(permission: Array<String>) = ActivityCompat.requestPermissions(activity, permission, REQUEST_CODE)
}