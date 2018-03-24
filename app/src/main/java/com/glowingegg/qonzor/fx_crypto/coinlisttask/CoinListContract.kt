package com.glowingegg.qonzor.fx_crypto.coinlisttask

import com.glowingegg.qonzor.fx_crypto.fxcryptotask.FxCryptoContract
import com.glowingegg.qonzor.fx_crypto.models.Coin

interface CoinListContract : FxCryptoContract {

    interface View : FxCryptoContract.View {

        fun updateCoinList(coinList : ArrayList<Coin>)

    }

    interface Presenter : FxCryptoContract.Presenter {

        override fun start()

        fun onCoinClick(position : Int)

    }

    interface ViewPort : FxCryptoContract.ViewPort {

        fun showCoinDetail(coin : Coin)

    }

}
