package com.okaythis.okaypoc

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.okaythis.okaypoc.di.modules.appModule

class PocApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@PocApplication)
            modules(appModule)
        }
    }
}