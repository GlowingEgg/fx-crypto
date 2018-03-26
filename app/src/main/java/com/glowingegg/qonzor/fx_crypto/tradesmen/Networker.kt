package com.glowingegg.qonzor.fx_crypto.tradesmen

import android.content.Context
import com.glowingegg.qonzor.fx_crypto.R
import com.glowingegg.qonzor.fx_crypto.models.Coin
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList

class Networker(val mContext : Context) {

    private var mShouldCallBack : Boolean = true

    // Strings for interacting with the API
    val HTTP_SCHEME = mContext.getString(R.string.http_scheme)
    val API_ADDRESS = mContext.getString(R.string.base_api_address)
    val API_VERSION = mContext.getString(R.string.api_version)
    val TICKER_PATH_SEGMENT = mContext.getString(R.string.ticker_path_segment)

    fun dontCallBack() {

        mShouldCallBack = false

    }

    // tries to fetch a list of Coins, sends it back in onSuccess if successful
    fun getCoinList(onSuccess: (coins : ArrayList<Coin>) -> Unit, onFailure: (NetworkFailureType) -> Unit) {

        // build the url for the request
        val httpUrl = HttpUrl.Builder()
                .scheme(mContext.getString(R.string.http_scheme))
                .host(API_ADDRESS)
                .addEncodedPathSegment(API_VERSION)
                .addEncodedPathSegment(TICKER_PATH_SEGMENT)
                .build()

        // get an HTTP client
        val client = OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .build()

        // build the request
        val request = Request.Builder()
                .url(httpUrl)
                .build()

        // make a callback to handle the response
        val callback = object : Callback {

            override fun onFailure(call: Call, exception: IOException) {

                onFailure(NetworkFailureType.NETWORK)

            }

            override fun onResponse(call: Call, response: Response) {

                // if the response was successful...
                if (response.isSuccessful) {

                    if(mShouldCallBack) {

                        val responseString : String? = response.body()?.string()

                        val gson = Gson()

                        val list = gson.fromJson(responseString, Array<Coin>::class.java)
                        val coinArrayList : ArrayList<Coin> = list.toCollection(ArrayList<Coin>())

                        // make the list of Coins
                        val coins = ArrayList<Coin>()

                        // callback with the precious Coins
                        onSuccess(coins)

                    }

                }

                else {



                }

                // close the response
                response.body()!!.close()

            }

        }

        // make the call
        client.newCall(request).enqueue(callback)

    }

}

/** enum class for designating the type of network failure **/
enum class NetworkFailureType {

    GENERIC, NETWORK, PARSING

}

