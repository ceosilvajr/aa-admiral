package com.ceosilvajr.appetisercoroutines.network.repository

import com.ceosilvajr.appetisercoroutines.network.api.ApiService

/**
 * @author ceosilvajr@gmail.com
 */
class ApiRepository(private val apiService: ApiService) {

    suspend fun getPortfolio() = apiService.getPortfolio().map { it.toModel() }

}