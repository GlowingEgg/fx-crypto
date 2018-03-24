package com.glowingegg.qonzor.fx_crypto.coinlisttask


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.glowingegg.qonzor.fx_crypto.R
import com.glowingegg.qonzor.fx_crypto.fxcryptotask.FxCryptoContract
import com.glowingegg.qonzor.fx_crypto.fxcryptotask.FxCryptoFragment
import com.glowingegg.qonzor.fx_crypto.models.Coin


class CoinListFragment : FxCryptoFragment(), CoinListContract.View {

    var mPresenter : CoinListContract.Presenter? = null

    /* Android framework methods */

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        super.onCreateView(inflater, container, savedInstanceState)

        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_coin_list, container, false)

    }

    /* Private helper methods */



    /* CoinListContract.View method implementations */

    override fun setPresenter(presenter: FxCryptoContract.Presenter) {

        // if we were given a CoinListContract Presenter (always will)
        if(presenter is CoinListContract.Presenter) {

            // set our local Presenter
            mPresenter = presenter

            // if it's not null tell it to start
            mPresenter?.start()

        }

    }

    // update the Adapter's data source
    override fun updateCoinList(coinList : ArrayList<Coin>) {



    }

}
