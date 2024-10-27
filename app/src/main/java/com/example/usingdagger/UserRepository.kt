package com.example.usingdagger

import javax.inject.Inject


//Here, we use the @Inject annotation on the constructor
// to tell Dagger that it can create instances of UserRepository.

class UserRepository @Inject constructor() {
    fun getUserName(): String {
        return "John Doe"
    }
}