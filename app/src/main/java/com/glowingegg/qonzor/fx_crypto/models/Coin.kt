package com.glowingegg.qonzor.fx_crypto.models

import java.util.Date

class Coin {

    /** VARIABLES  */

    /*STRINGS USED TO PARSE A RESPONSE FROM COINMARKETCAP*/
    private val PARAM_ID = "id"
    private val PARAM_NAME = "name"
    private val PARAM_SYMBOL = "symbol"
    private val PARAM_RANK = "rank"
    private val PARAM_PRICE_USD = "price_usd"
    private val PARAM_PRICE_BTC = "price_btc"
    private val PARAM_VOLUME_USD = "24h_volume_usd"
    private val PARAM_MARKET_CAP_USD = "market_cap_usd"
    private val PARAM_AVAILABLE_SUPPLY = "available_supply"
    private val PARAM_TOTAL_SUPPLY = "total_supply"
    private val PARAM_PERCENTAGE_CHANGE_1H = "percentage_change_1h"
    private val PARAM_PERCENT_CHANGE_24H = "percentage_change_24h"
    private val PARAM_PERCENTAGE_CHANGE_7D = "percentage_change_7d"
    private val PARAM_LAST_UPDATED = "last_updated"

    /*INSTANCE VARIABLES*/

    var id: String? = null
    var name: String? = null
    var symbol: String? = null
    var rank: Int = 0
    var priceUSD: Float = 0.toFloat()
    var priceBTC: Float = 0.toFloat()
    var volumeUSD: Float = 0.toFloat()
    var marketCapUSD: Float = 0.toFloat()
    var availableSupply: Float = 0.toFloat()
    var totalSupply: Float = 0.toFloat()
    var percentageChange1hr: Float = 0.toFloat()
    var percentageChange24hr: Float = 0.toFloat()
    var percentageChange7d: Float = 0.toFloat()
    var lastUpdated: Date? = null


    // companion object for the creation of Coins from HashMap
    companion object Factory {

        fun makeCoin(): Coin {

            val coin = Coin()

            coin.id = "bitcoin"
            coin.name = "Bitcoin"
            coin.symbol = "BTC"
            coin.rank = 1
            coin.priceUSD = 10000.toFloat()
            coin.priceBTC = 1.toFloat()
            coin.volumeUSD = 16273849.toFloat()
            coin.marketCapUSD = 93937492849.toFloat()
            coin.availableSupply = 1627384957.toFloat()
            coin.totalSupply = 8888888888.toFloat()
            coin.percentageChange1hr -1.toFloat()
            coin.percentageChange24hr -10.toFloat()
            coin.percentageChange7d = -15.toFloat()
            coin.lastUpdated = Date()

            return coin

        }

    }

}
