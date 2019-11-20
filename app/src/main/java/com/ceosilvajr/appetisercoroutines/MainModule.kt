package com.ceosilvajr.appetisercoroutines

import com.ceosilvajr.appetisercoroutines.main.MainViewModel
import com.ceosilvajr.appetisercoroutines.main.PortfolioAdapter
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * @author ceosilvajr@gmail.com
 */
object MainModule {

    fun init(): Module {
        return module {
            factory { PortfolioAdapter(arrayListOf()) }
            viewModel { MainViewModel(get()) }
        }
    }
}