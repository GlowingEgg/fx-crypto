package com.glowingegg.qonzor.fx_crypto.coinlisttask

import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.FrameLayout
import android.widget.RelativeLayout
import com.glowingegg.qonzor.fx_crypto.R
import com.glowingegg.qonzor.fx_crypto.fxcryptotask.FxCryptoActivity
import com.glowingegg.qonzor.fx_crypto.models.Coin

/**
 * Activity for the screen displaying the list of Coins.
 * Overrides FxCryptoActivity for global settings.
 * Implements ViewPort from the CoinListContract for interaction with
 * a Presenter (directly) and a View (indirectly through the Presenter)
 */

class CoinListActivity : FxCryptoActivity(), CoinListContract.ViewPort {

    lateinit var mPresenter : CoinListContract.Presenter
    lateinit var mView : CoinListContract.View

    // views
    var mMainRelativeLayout : RelativeLayout? = null
    var mFragmentFrameLayout : FrameLayout? = null

    /* Android framework methods */

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_list)

        setup()

    }

    /* Private helper methods */

    private fun setup() {

        getViews()
        insertFragment()
        setupViewAndPresenter()

    }

    // grab all the Views for this Activity
    private fun getViews() {

        mMainRelativeLayout = findViewById(R.id.coin_list_activity_relativeLayout)
        mFragmentFrameLayout = findViewById(R.id.coin_list_activity_frameLayout)

    }

    // put a CoinListFragment in the fragment frame
    private fun insertFragment() {

        val fragment = CoinListFragment()
        mView = fragment

        supportFragmentManager.beginTransaction().add(R.id.coin_list_activity_frameLayout, fragment)
                .commit()

    }

    // get the View and Presenter set up and bound
    private fun setupViewAndPresenter() {

        mPresenter = CoinListPresenter(mView, this)

    }

    /* ViewPort implementation methods */

    override fun showCoinDetail(coin : Coin) {



    }

}
