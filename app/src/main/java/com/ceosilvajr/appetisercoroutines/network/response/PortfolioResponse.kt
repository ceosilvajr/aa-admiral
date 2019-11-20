package com.ceosilvajr.appetisercoroutines.network.response

import com.ceosilvajr.appetisercoroutines.models.Portfolio
import com.google.gson.annotations.SerializedName

/**
 * @author ceosilvajr@gmail.com
 */
class PortfolioResponse {

    var name: String? = null
    @SerializedName("image_url")
    var imageUrl: String? = null

    fun toModel() = Portfolio(name ?: "Unknown name", imageUrl ?: "defaultImageUrl")

}