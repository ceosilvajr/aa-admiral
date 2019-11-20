package com.ceosilvajr.appetisercoroutines.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.ceosilvajr.appetisercoroutines.R
import com.ceosilvajr.appetisercoroutines.models.Portfolio
import kotlinx.android.synthetic.main.item_portfolio.view.*

/**
 * @author ceosilvajr@gmail.com
 */
class PortfolioAdapter(private val items: ArrayList<Portfolio>) :
    RecyclerView.Adapter<PortfolioAdapter.ViewHolder>() {

    private lateinit var context: Context

    fun init(context: Context) {
        this.context = context
    }

    fun updateItems(items: ArrayList<Portfolio>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_portfolio,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val portfolio = items[position]
        holder.bindView(portfolio)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image = itemView.iv_photo!!
        private val name = itemView.tv_name!!

        fun bindView(item: Portfolio) {
            image.load(item.imageUrl)
            name.text = item.name
        }
    }
}