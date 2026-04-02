package com.example.dependecyinjection


import javax.inject.Inject

class UserViewModel @Inject constructor(
    private val repository: UserRepository
) {

    fun getUser(): String {
        return repository.getUserName()
    }
}