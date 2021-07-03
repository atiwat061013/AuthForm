package com.example.authform

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}