package com.glowingegg.qonzor.fx_crypto.coinlisttask

import android.os.Bundle
import com.glowingegg.qonzor.fx_crypto.R
import com.glowingegg.qonzor.fx_crypto.fxcryptotask.FxCryptoActivity
import com.glowingegg.qonzor.fx_crypto.models.Coin
import timber.log.Timber

/**
 * Activity for the screen displaying the list of Coins.
 * Overrides FxCryptoActivity for global settings.
 * Implements ViewPort from the CoinListContract for interaction with
 * a Presenter (directly) and a View (indirectly through the Presenter)
 */

class CoinListActivity : FxCryptoActivity(), CoinListContract.ViewPort {

    /* Android framework methods */
    lateinit var mPresenter : CoinListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heat_map)

        setup()

    }

    /* Private helper methods */

    private fun setup() {

        val coin = Coin.makeCoin()

        Timber.d("whatup")

        insertFragment()
        setupViewAndPresenter()

    }

    // put a CoinListFragment in the fragment frame
    private fun insertFragment() {



    }

    // get the View and Presenter set up and bound
    private fun setupViewAndPresenter() {



    }

    /* ViewPort implementation methods */

    override fun showCoinDetail(coin : Coin) {



    }

}
