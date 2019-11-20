package com.ceosilvajr.appetisercoroutines.network.api

import com.ceosilvajr.appetisercoroutines.network.PORTFOLIO
import com.ceosilvajr.appetisercoroutines.network.response.PortfolioResponse
import retrofit2.http.GET

/**
 * @author ceosilvajr@gmail.com
 */
interface ApiService {

    @GET(PORTFOLIO)
    suspend fun getPortfolio(): List<PortfolioResponse>

}






