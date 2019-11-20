package com.ceosilvajr.appetisercoroutines.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ceosilvajr.appetisercoroutines.models.Portfolio
import com.ceosilvajr.appetisercoroutines.network.repository.ApiRepository
import kotlinx.coroutines.Dispatchers

/**
 * @author ceosilvajr@gmail.com
 */
class MainViewModel(private val repository: ApiRepository) : ViewModel() {

    fun portfolioItems(): LiveData<List<Portfolio>> {
        return liveData(Dispatchers.IO) {
            // Set's the LiveData's value to the given value.
            // Note that this function suspends until the value is set on the LiveData.
            emit(repository.getPortfolio())
        }
    }
}

