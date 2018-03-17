package com.glowingegg.qonzor.fx_crypto.fxcryptotask


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Base version of the Fragments that will exist in every task. Every one will override this.
 * Each will implement the View role of the contracts
 */

open class FxCryptoFragment : Fragment(), FxCryptoContract.View {

    lateinit var mPresenter : FxCryptoContract.Presenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return container

    }

    override fun setPresenter(presenter : FxCryptoContract.Presenter) {

        mPresenter = presenter

    }

}
