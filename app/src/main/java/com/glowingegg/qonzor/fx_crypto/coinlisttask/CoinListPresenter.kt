package com.glowingegg.qonzor.fx_crypto.coinlisttask

import com.glowingegg.qonzor.fx_crypto.coinlisttask.CoinListContract
import com.glowingegg.qonzor.fx_crypto.models.Coin
import com.glowingegg.qonzor.fx_crypto.tradesmen.Networker


class CoinListPresenter(val mView : CoinListContract.View, val mViewPort : CoinListContract.ViewPort)
    : CoinListContract.Presenter {

    private val mCoins : ArrayList<Coin> = ArrayList()
    private val mNetworker = Networker(mViewPort.getContext())

    /** Presenter method implementations **/

    // start doing ting
    override fun start() {

        // tell the View to bind to this Presenter
        mView.setPresenter(this)

        fetchCoins()

        mView.updateCoinList(mCoins)

    }

    // clean up
    override fun finish() {

        mNetworker.dontCallBack()

    }

    // when the View tells us that a Coin has been clicked
    override fun onCoinClick(position : Int) {

        mViewPort.showCoinDetail(mCoins.get(position))

    }

    /** Private helper methods **/

    private fun fetchCoins() {

        mNetworker.getCoinList(onSuccess = {
            mCoins.clear()
            mCoins.addAll(it)}, onFailure = {
            // display the appropriate failure message
            })

    }

}