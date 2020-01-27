package com.okaythis.okaypoc.fcm

import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson
import com.okaythis.okaypoc.BuildConfig.DEBUG
import com.okaythis.okaypoc.data.models.fcm.NotificationData
import com.okaythis.okaypoc.data.models.fcm.NotificationDataContent
import com.okaythis.okaypoc.data.models.fcm.NotificationType
import java.lang.Exception

class NotificationHandler {

    companion object {
        private val gson = Gson()

        fun extractRemoteData(remoteData: RemoteMessage): NotificationDataContent? {
            val extractedData = NotificationData(
                NotificationType.creator(remoteData.data["type"]!!.toInt()),
                remoteData.data["data"]!!)
            try {
                return gson.fromJson(extractedData.data, NotificationDataContent::class.java)
            }catch (e: Exception){
                if(DEBUG) {
                    e.printStackTrace()
                }
                null
            }

            return null
        }
    }
}