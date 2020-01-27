package com.okaythis.okaypoc.fcm

import android.content.Intent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.okaythis.okaypoc.MainActivity
import com.okaythis.okaypoc.data.repository.SpaStorageRepository

class FcmService : FirebaseMessagingService() {



    override fun onNewToken(token: String) {
        super.onNewToken(token)
        token.run {
            SpaStorageRepository(this@FcmService).putAppPNS(token)
        }
    }

    override fun onMessageReceived(remoteData: RemoteMessage) {

        if(remoteData.data.isNotEmpty()){
            // handle notification
            val notificationData = NotificationHandler.extractRemoteData(remoteData)
            Log.d("Firebase", "${notificationData!!.sessionId!!} ")

            // user a presenter to delegate this action
            startActivity(Intent(this, MainActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtra(ACTIVITY_WAKE_UP_KEY,  notificationData.sessionId!!.toLong() )
            })
        }
    }

    override fun onDeletedMessages() {
        super.onDeletedMessages()
    }

    companion object {
        val ACTIVITY_WAKE_UP_KEY = "wake_up_key"
    }
}