package com.ceosilvajr.appetisercoroutines.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ceosilvajr.appetisercoroutines.network.repository.ApiRepository
import kotlinx.coroutines.Dispatchers

/**
 * @author ceosilvajr@gmail.com
 */
class MainViewModel(private val repository: ApiRepository) : ViewModel() {

    val portfolioItems = liveData(Dispatchers.IO) {
        emit(repository.getPortfolio())
    }

}