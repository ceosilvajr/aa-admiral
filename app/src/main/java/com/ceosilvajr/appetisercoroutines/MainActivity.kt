package com.ceosilvajr.appetisercoroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import com.ceosilvajr.appetisercoroutines.main.MainViewModel
import com.ceosilvajr.appetisercoroutines.main.PortfolioAdapter
import com.ceosilvajr.appetisercoroutines.models.Portfolio
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.koin.android.ext.android.inject

/**
 * @author ceosilvajr@gmail.com
 */
class MainActivity : AppCompatActivity(), AnkoLogger {

    private val adapter: PortfolioAdapter by inject()
    private val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter.init(this)
        rv_portfolio.adapter = adapter
        mainViewModel.portfolioItems().observe(this) {
            displayPortfolio(it as ArrayList)
        }
    }

    private fun displayPortfolio(list: ArrayList<Portfolio>) {
        adapter.updateItems(list)
    }
}

