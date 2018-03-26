package com.glowingegg.qonzor.fx_crypto.fxcryptotask

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * Base Activity that every Activity in the project will override
 * Exists for applying global settings to Activities
 * Implements the ViewPort part of the contract
 */

open class FxCryptoActivity : AppCompatActivity(), FxCryptoContract.ViewPort {

    /* Android framework methods */

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

    }

    override fun getContext(): Context {

        return this

    }

}
