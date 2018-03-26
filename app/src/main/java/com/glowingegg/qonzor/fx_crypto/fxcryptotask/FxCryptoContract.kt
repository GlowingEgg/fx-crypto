package com.glowingegg.qonzor.fx_crypto.fxcryptotask

import android.content.Context

/**
 * Every task or screen in the app will consist of components interacting through this contract
 * Each screen has a View for enacting most small on screen view tasks
 * Each screen has a ViewPort for enacting large scale view changes like switching Activities
 * Each View and ViewPort will relay information to a Presenter, responsible for...
 * ... knowing how everything should happen and orchestrating it
 */
interface FxCryptoContract {

    // interface to be implemented by the View, a role typically filled by a Fragment
    interface View {

        // View binds itself to a Presenter
        fun setPresenter(presenter: Presenter)

    }

    // interface to be implemented by the Presenter, the
    interface Presenter {

        // kick off the Presenter functions
        fun start()

        // wrap everything up
        fun finish()

    }

    // interface to be implemented by the ViewPort, a role typically filled by an Activity
    interface ViewPort {

        fun getContext() : Context

    }

}