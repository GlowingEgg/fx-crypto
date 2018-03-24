package com.glowingegg.qonzor.fx_crypto.coinlisttask

import com.glowingegg.qonzor.fx_crypto.coinlisttask.CoinListContract
import com.glowingegg.qonzor.fx_crypto.models.Coin


class CoinListPresenter(val mView : CoinListContract.View, val mViewPort : CoinListContract.ViewPort)
    : CoinListContract.Presenter {

    val mCoins : ArrayList<Coin> = ArrayList()

    /** Presenter method implementations **/

    // start doing ting
    override fun start() {

        // tell the View to bind to this Presenter
        mView.setPresenter(this)

    }

    // clean up
    override fun finish() {



    }

    // when the View tells us that a Coin has been clicked
    override fun onCoinClick(position : Int) {

        mViewPort.showCoinDetail(mCoins.get(position))

    }

}