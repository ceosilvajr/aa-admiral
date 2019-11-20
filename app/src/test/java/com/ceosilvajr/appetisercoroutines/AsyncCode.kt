package com.ceosilvajr.appetisercoroutines

const val ASYNC_DELAY = 1000L

fun fetchUserAsync(onSuccess: (data: String) -> Unit) {
    Thread.sleep(ASYNC_DELAY)
    onSuccess.invoke("Name from async.")
}

fun fetchUserPortfolioAsync(firstName: String, onSuccess: (data: List<String>) -> Unit) {
    println(firstName)
    Thread.sleep(ASYNC_DELAY)
    onSuccess.invoke(listOf("grilld", "vello", "linkU"))
}

fun main() {
    fetchUserAsync { firstName ->
        fetchUserPortfolioAsync(firstName) { items ->
            items.forEach { portfolioName ->
                println("PortfolioName: $portfolioName")
            }
        }
    }
}







