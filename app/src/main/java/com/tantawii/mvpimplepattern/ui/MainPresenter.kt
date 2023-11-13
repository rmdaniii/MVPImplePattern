package com.tantawii.mvpimplepattern.ui

import com.tantawii.mvpimplepattern.contracts.MainContract
import com.tantawii.mvpimplepattern.database.Database

class MainPresenter(private val mainView: MainContract.MainView) : MainContract.MainPresenter{

    override fun onLogin(username: String, password: String) {

        if ( username == Database.getCurrentUser().username &&
            password == Database.getCurrentUser().password ){

            mainView.onSuccess("Success")

        } else mainView.onError("Failed")

    }

}