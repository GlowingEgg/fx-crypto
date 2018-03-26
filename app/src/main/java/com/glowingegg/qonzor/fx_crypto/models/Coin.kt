package com.glowingegg.qonzor.fx_crypto.models

import com.google.gson.annotations.SerializedName
import java.util.Date

data class Coin(
        @SerializedName("id") val id: String,
        @SerializedName("name") val name: String,
        @SerializedName("symbol") val symbol: String,
        @SerializedName("rank") val rank: Int,
        @SerializedName("price_usd") val priceUSD: Float,
        @SerializedName("price_btc") val priceBTC: Float,
        @SerializedName("24h_volume_usd") val volumeUSD: Float,
        @SerializedName("market_cap_usd") val marketCapUSD: Float,
        @SerializedName("available_supply") val availableSupply: Float,
        @SerializedName("total_supply") val totalSupply: Float,
        @SerializedName("max_supply") val maxSupply: Float,
        @SerializedName("percent_change_1h") val percentChange1hr: Float,
        @SerializedName("percent_change_24h") val percentChange24hr: Float,
        @SerializedName("percent_change_7d") val percentChange7d: Float,
        @SerializedName("last_updated") val lastUpdated: Date
)
