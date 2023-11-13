package com.tantawii.mvpimplepattern.database

import com.tantawii.mvpimplepattern.data.User

object Database {

    fun getCurrentUser() : User {
        return User("tantawii", "123456")
    }

}