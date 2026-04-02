package com.example.dependecyinjection

import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun getUserName(): String {
        return "Akash (Hilt)"
    }
}



