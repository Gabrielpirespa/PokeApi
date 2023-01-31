package com.iniciandoaviddadev.pokeapi

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(networkModule)
            modules(pokeListModule)
        }
    }
}