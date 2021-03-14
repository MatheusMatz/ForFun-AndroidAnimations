package com.forfun.spacetravel

import android.app.Application
import com.forfun.spacetravel.home.di.home
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(home)
        }
    }
}