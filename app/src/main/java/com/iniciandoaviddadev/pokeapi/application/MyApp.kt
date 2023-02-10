package com.iniciandoaviddadev.pokeapi.application

import android.app.Application
import com.iniciandoaviddadev.pokeapi.networkModule
import com.iniciandoaviddadev.pokeapi.pokeListModule
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