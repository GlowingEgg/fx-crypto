package com.glowingegg.qonzor.fx_crypto.fxcryptotask

/**
 * Base version of the Presenters that will exist throughout the project, running shit
 * Every Presenter for every task will override this one
 */

open class FxCryptoPresenter(val mView : FxCryptoContract.View) : FxCryptoContract.Presenter {

    // initiation block
    init {

        // bind to the corresponding View
        mView.setPresenter(this)

    }

    // start going tru da motions mon
    override fun start() {



    }

    // unbind from everything and clean up
    override fun finish() {



    }

}