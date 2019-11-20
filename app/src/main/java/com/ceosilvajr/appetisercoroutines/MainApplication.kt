package com.ceosilvajr.appetisercoroutines

import android.app.Application
import com.ceosilvajr.appetisercoroutines.network.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author ceosilvajr@gmail.com
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(NetworkModule.init(), MainModule.init()))
        }
    }
}