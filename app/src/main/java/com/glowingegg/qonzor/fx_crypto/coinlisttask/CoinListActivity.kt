package com.glowingegg.qonzor.fx_crypto.coinlisttask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.glowingegg.qonzor.fx_crypto.R
import com.glowingegg.qonzor.fx_crypto.models.Coin
import timber.log.Timber

class CoinListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heat_map)

        setup()

    }

    fun setup() {

        val coin = Coin.makeCoin()

        Timber.d("whatup")

    }

}
