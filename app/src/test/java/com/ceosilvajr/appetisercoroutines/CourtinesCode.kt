package com.ceosilvajr.appetisercoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

const val COROUTINES_DELAY = 1000L

suspend fun fetchUserAsyncCoroutines(): String {
    delay(COROUTINES_DELAY)
    return "Name from coroutines."
}

suspend fun fetchUserPortfolioCoroutines(firstName: String): List<String> {
    println(firstName)
    delay(COROUTINES_DELAY)
    return listOf("grilld", "vello", "linkU")
}

suspend fun main() {
    coroutineScope {
        launch {
            val firstName = fetchUserAsyncCoroutines()
            val items = fetchUserPortfolioCoroutines(firstName)
            items.forEach { portfolioName ->
                println("PortfolioName: $portfolioName")
            }
        }
    }
}



