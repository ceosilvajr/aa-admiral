package com.ceosilvajr.appetisercoroutines.network

import com.ceosilvajr.appetisercoroutines.network.api.ApiService
import com.ceosilvajr.appetisercoroutines.network.repository.ApiRepository
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author ceosilvajr@gmail.com
 */
object NetworkModule {

    fun init(): Module {
        return module {
            single { createRetrofit() }
            single { createApiService(get()) }

            factory { ApiRepository(get()) }
        }
    }

    private fun createApiService(retrofit: Retrofit) = retrofit.create(ApiService::class.java)

    private fun createRetrofit() =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

}