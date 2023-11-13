package com.tantawii.mvpimplepattern.contracts

interface MainContract {

    interface MainView{
        fun onSuccess(message: String)
        fun onError(message: String)
    }

    interface MainPresenter{
        fun onLogin(username: String, password: String)

    }

}